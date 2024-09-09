import java.util.LinkedList;
import java.util.Queue;

/**
 * Moksha Patam
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *
 * Completed by: [YOUR NAME HERE]
 *
 */

public class MokshaPatam {

    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        boolean[] visited = new boolean[boardsize+1];
        int[] snakeAndLadders = new int[boardsize+1];
        int[] rollsToNode = new int[boardsize+1];

        Queue<Integer> nodesToVisit = new LinkedList<>();

        // Adds first node to the queue of nodes to be visited
        nodesToVisit.add(1);
        visited[1] = true;

        // Add ladders into map
        for (int i = 0; i < ladders.length; i++){
            snakeAndLadders[ladders[i][0]] = ladders[i][1];
        }

        // Add snakes into map
        for (int i = 0; i < snakes.length; i++){
            snakeAndLadders[snakes[i][0]] = snakes[i][1];
        }

        // Will continue to loop through until there are no more nodes to visit
        while (!nodesToVisit.isEmpty()) {
            // Pops off the first node in the queue
            int currentNode = nodesToVisit.remove();

            // Checks if you have reached the end of the board, and if so, returns the number of rolls
            if (currentNode == boardsize){
                return rollsToNode[currentNode];
            }

            // Loops through each possible roll
            for(int i = 1; i <= 6; i++){
                int nextNode = currentNode + i;

                // Ensures the node we are checking is within the range of the board
                if (nextNode <= boardsize){
                    // Checks if this node is connected to a snake/ladder
                    if(snakeAndLadders[nextNode] != 0){
                        // If it is connected to one, automatically go to the corresponding node
                        nextNode = snakeAndLadders[nextNode];
                    }

                    // Checks if the node has been visited already
                    if (!visited[nextNode]){
                        // Sets the number of rolls for the next node
                        rollsToNode[nextNode] = rollsToNode[currentNode] + 1;
                        // Marks the current node as visited
                        visited[nextNode] = true;
                        // Adds next node to the queue
                        nodesToVisit.add(nextNode);
                    }
                }
            }
        }
        return -1;
    }
}
