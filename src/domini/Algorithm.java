package domini;

import java.util.*;
import java.util.ArrayList;

import static java.util.Collections.binarySearch;

public class Algorithm {


}


//---------ALGORITH IN C++ --------------


#include <algorithm>
#include <climits>
#include <cstdlib>
#include <iostream>
#include <queue>
#include <vector>

using namespace std;

// an integer on a priority queue
class IntPQ {
  int i, r;

public:
  IntPQ(const int index, const int rank)
    : i(index),
      r(rank) {
  }

  int index(void) const {
    return i;
  }

  int rank(void) const {
    return r;
  }

  bool operator< (const IntPQ& other) const {
    return r < other.r;
  }
};

void findPath(const vector<vector<int> >& CapGraph,
              const vector<vector<int> >& CostGraph,
              vector<vector<int> >& FlowGraph,
              vector<int>& AugmentPred) {
  const int N = CapGraph.size();

  // reset the augmenting path
  for (int i = 0; i < N; i++)
    AugmentPred[i] = -1;

  // need distance for each node
  vector<int> dist(N, INT_MAX);

  // each node has a rank that is the negative distance
  // want the shortest distance to be at the top of the max-heap
  priority_queue<IntPQ> PQ;

  // start at the source
  dist[0] = 0;
  PQ.push(IntPQ(0, -dist[0]));

  while (!PQ.empty()) {
    int u;

    // lazy decrease key when drawing from priority queue
    while (true) {
      u = PQ.top().index();
      const int rank = PQ.top().rank();
      PQ.pop();
      if (rank == -dist[u])
        break;
      PQ.push(IntPQ(u, -dist[u]));
    }

    // check if reached sink node
    if (N - 1 == u)
      break;

    // forward flows
    for (int v = 0; v < N; v++) {
      const int f = CapGraph[u][v] - FlowGraph[u][v];
      if (f > 0) {
        const int w = f * CostGraph[u][v],
                  newDist = dist[u] + w;
        if (newDist < dist[v]) {
          dist[v] = newDist;
          AugmentPred[v] = u;
          PQ.push(IntPQ(v, -newDist));
        }
      }
    }

    // backward flows
    for (int v = 0; v < N; v++) {
      if (CapGraph[v][u] && FlowGraph[v][u]) {
        const int w = FlowGraph[v][u] * CostGraph[v][u],
                  newDist = dist[u] + w;
        if (newDist < dist[v]) {
          dist[v] = newDist;
          AugmentPred[v] = u;
          PQ.push(IntPQ(v, -newDist));
        }
      }
    }
  }
}

int applyPath(const vector<vector<int> >& CapGraph,
              vector<vector<int> >& FlowGraph,
              vector<int>& AugmentPred) {
  const int N = CapGraph.size();
  int u, v = N - 1, minFlow = INT_MAX;

  // stop when source node is reached
  while (v != 0) {
    // arc is (u, v)
    u = AugmentPred[v];

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
    u = AugmentPred[v];

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
}
