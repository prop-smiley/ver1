package domini;

import java.util.*;
import java.util.ArrayList;

import static java.util.Collections.binarySearch;



public class Algorithm {
    
    //Posible basura. Carlos pruebalo con las compartidas antes del push
    //ADAPTED FROM http://equilibriumofnothing.wordpress.com/2013/10/03/algorithm-minimum-cost-network-flow/
    //LACKS GRAPH IMPLEMENTATION OR A CLASS TO IMPLEMENT NETFLOW. USED GRAPH.
    // an integer on a priority queue


    public void findPath(Mapa CapGraph,
                  Mapa CostGraph,
                  Mapa FlowGraph,
                  ArrayList<Integer>AugmentPred) {
      int N = CapGraph.size();

      // reset the augmenting path
      for (int i = 0; i < N; i++)
        AugmentPred.set(i, -1);

      // need distance for each node
      ArrayList<Integer> dist = new ArrayList<Integer>(Collections.nCopies(N, 999999999));

      // each node has a rank that is the negative distance
      // want the shortest distance to be at the top of the max-heap

      PriorityQueue<IntPQ> PQ = new PriorityQueue<IntPQ>();
      
      // start at the source
      dist.set(0, 0);
      IntPQ aux = new IntPQ(0, -dist.get(0));
      PQ.add(aux);

      while (!PQ.isEmpty()) {
        int u;

        // lazy decrease key when drawing from priority queue
        while (true) {
          u = PQ.peek().index();
          int rank = PQ.poll().rank();
          // el poll() ja fa el PQ.pop();
          if (rank == -dist.get(u))
            break;
          aux = new IntPQ(u, -dist.get(u));
          PQ.add(aux);
        }

        // check if reached sink node
        if (N - 1 == u)
          break;

        // forward flows
        for (int v = 0; v < N; v++) {
          int f = CapGraph[u][v] - FlowGraph[u][v];
          if (f > 0) {
            int w = f * CostGraph[u][v];
            int newDist = dist.get(u) + w;
            if (newDist < dist.get(v)) {
              dist.set(v, newDist);
              AugmentPred.set(v, u);
              aux = new IntPQ(v, -newDist);
              PQ.add(aux);
            }
          }
        }

        // backward flows
        for (int v = 0; v < N; v++) {
          if (CapGraph[v][u] && FlowGraph[v][u]) {
            int w = FlowGraph[v][u] * CostGraph[v][u];
            int newDist = dist.get(u) + w;
            if (newDist < dist.get(v)) {
              dist.set(v, newDist);
              AugmentPred.set(v, u);
              aux = new IntPQ(v, -newDist);
              PQ.add(aux);
            }
          }
        }
      }
    }

    int applyPath(Mapa CapGraph,
                  Mapa FlowGraph,
                  ArrayList<Integer>AugmentPred) {
      int N = CapGraph.size();
      int u, v = N - 1, minFlow = 999999999;

      // stop when source node is reached
      while (v != 0) {
        // arc is (u, v)
        u = AugmentPred.get(v);

        // check for forward edge
        if (CapGraph[u][v])
          minFlow = min(minFlow, CapGraph[u][v] - FlowGraph[u][v]);
        else
          // must be backward edge
          minFlow = min(minFlow, FlowGraph[v][u]);

        v = u;
      }

      // apply the augmenting flow
      v = N - 1;
      while (v != 0) {
        // arc is (u, v)
        u = AugmentPred.get(v);

        // check for forward edge
        if (CapGraph[u][v])
          FlowGraph[u][v] += minFlow;
        else
          // must be backward edge
          FlowGraph[v][u] -= minFlow;

        v = u;
      }

      return minFlow;
    }
    /*       
    //////////////////////MAIN DEL PROG EN C++
    //////////////////////--------------------
    int main(int argc, char *argv[]) {
      // input number of nodes and edges
      cout << "input number of nodes and edges in graph" << endl;
      int N, E;
      cin >> N >> E;

      // maximum possible number of edges is N*(N-1)/2
      if (E > N*(N - 1)/2) {
        E = N*(N - 1)/2;
        cout << "warning, too many edges specified, setting to "
             << E << endl;
      }

      // need graphs for capacity, cost, and flow
      vector<vector<int> > CapGraph(N, vector<int>(N, 0)),
                           CostGraph(N, vector<int>(N, 0)),
                           FlowGraph(N, vector<int>(N, 0));
      for (int i = 0; i < E; i++) {
        while (true) {
          const int u = rand() % N,
                    v = rand() % N;

          // disallow self-loops
          if (u != v)
            // disallow anti-parallel edges, check for backwards direction too
            if (0 == CapGraph[v][u] && 0 == CapGraph[u][v]) {
              CapGraph[u][v] = 1 + rand() % 9; // 1, 2,..., 9
              CostGraph[u][v] = rand() % 3;    // 0, 1, 2

              // successfully added edge, don't retry in while loop
              break;
            }
        }
      }

      // augmenting path
      vector<int> AugmentPred(N, 0);

      // nice to keep track of total flow, not really necessary
      int totalFlow = 0;

      // augmentation loop
      while (true) {
        findPath(CapGraph, CostGraph, FlowGraph, AugmentPred);
        if (-1 == AugmentPred[N - 1])
          // no augmenting path found, that's it
          break;
        totalFlow += applyPath(CapGraph, FlowGraph, AugmentPred);
      }

      cout << "total flow is " << totalFlow << endl;

      // print combined capacity and flow graph in GraphViz format
      cout << endl
           << "To generate a GraphViz graph from the following, do:" << endl
           << endl
           << "  dot -Tpng file_with_graph_G -o graph.png" << endl
           << endl
           << "-----file_with_graph_G begins here-----" << endl
           << "digraph G {" << endl
           << "  node [shape=circle]" << endl
           << "  {node [style=filled] 0 " << (N-1) << "}" << endl
           << "  {rank=source; 0;}" << endl
           << "  {rank=sink; " << (N-1) << ";}" << endl;
      for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
          if (CapGraph[i][j]) {
            cout << "  " << i << " -> " << j
                 << " [label=\""
                 << FlowGraph[i][j] << "/" << CapGraph[i][j]
                 << "@" << CostGraph[i][j] << "\"";
            if (FlowGraph[i][j])
              cout << ",color=red";
            cout << "];" << endl;
          }
      cout << "}" << endl;

      exit(0);
    }*/
}