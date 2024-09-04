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

    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        // so far I think the best way to do this will be some sort of recursive BFS

        // make an array that tracks if a space has been visited or not
        // or a queue?

        //while (something that tracks if we're done) is not true
        // if currentPosition = boardsize {
            // return numRolls }

        // go through each possible dice roll
        // for (int roll = 1; roll <= 6; roll++){
            // currentPosition =+ roll
            // numRolls++

            //if currentPosition > boardsize
                // base case?
                // should this be recursive??? I think so??

            // if currentPosition has a snake
                //return

            // if currentPosition has a ladder
                // currentPosition == ladder[][] <-- value of second space
                // recursive call


        return 0;
    }
}
