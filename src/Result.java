import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    static class Node
    {

        int x, y, dist;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node node = (Node) o;

            if (x != node.x) return false;
            if (y != node.y) return false;
            return dist == node.dist;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            result = 31 * result + dist;
            return result;
        }
    }

    /*
     * Complete the 'minMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER startRow
     *  3. INTEGER startCol
     *  4. INTEGER endRow
     *  5. INTEGER endCol
     */
    private static boolean valid(int x, int y, int N)
    {
        if (x < 0 || y < 0 || x >= N || y >= N)
            return false;

        return true;
    }
    public static int minMoves(int n, int startRow, int startCol, int endRow, int endCol) {


        Node src = new Node(startRow ,startCol);

        Node dest = new Node(endRow, endCol);
        // Write your code here
        int[] row = { 2, 2, -2, -2, 1, 1, -1, -1 };
        int[] col = { -1, 1, 1, -1, 2, -2, 2, -2 };

        Set<Node> visited = new HashSet<>();

        Queue<Node> q = new ArrayDeque<>();
        q.add(src);


        while (!q.isEmpty())
        {
            Node node = q.poll();

            int x = node.x;
            int y = node.y;
            int dist = node.dist;


            if (x == dest.x && y == dest.y)
                return dist;


            if (!visited.contains(node))
            {

                visited.add(node);


                for (int i = 0; i < 8; ++i)
                {

                    int x1 = x + row[i];
                    int y1 = y + col[i];

                    if (valid(x1, y1, n))
                        q.add(new Node(x1, y1, dist + 1));
                }
            }
        }


        return -1;

    }

}
class Solution {
    public static void main(String[] args) throws IOException {

        int n = 6;

        int startRow =5;

        int startCol = 1;

        int endRow = 0;

        int endCol = 5;

        int result = Result.minMoves(n, startRow, startCol, endRow, endCol);

        System.out.println(result);
    }
}
