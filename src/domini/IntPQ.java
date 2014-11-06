package domini;

import java.util.*;
import java.util.ArrayList;

import static java.util.Collections.binarySearch;

public class IntPQ {
    final int i, r;
    
    /**
     * Constructor per defecte.
     * @param index integer que indica l index
     * @param rank integer que indica el rang
     */
    public IntPQ(int index, int rank){
        this.i = index;
        this.r = rank;
    }

    public int index() {
      return this.i;
    }

    public int rank() {
      return this.r;
    }

//    boolean operator <(IntPQ other) {
//      return this.r < other.rank();
//    }
      

    public int compareTo(IntPQ compareFruit) {

            int compareRank = ((IntPQ) compareFruit).rank(); 

            //ascending order
            return this.r - compareRank;

            //descending order
            //return compareRank - this.r;

    }

    public static Comparator<IntPQ> IntPQComparator 
                      = new Comparator<IntPQ>() {

        @Override
        public int compare(IntPQ i1, IntPQ i2) {
          
          //ascending order
          return i1.compareTo(i2);

          //descending order
          //return fruitName2.compareTo(fruitName1);
        }

    };
}