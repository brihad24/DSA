import java.util.Arrays;

public class allPath {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                            {true, true, true},
                            {true, true, true}};
        int[][] path = new int[maze.length][maze[0].length];
        pathPrint("", maze, 0, 0, path, 1);
    }

    static void path(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1)
        {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false; // setting the cell as already visited

        if(r < maze.length - 1){
            path(p + 'D', maze, r+1, c); // goes down
        }

        if(c < maze[0].length - 1){
            path(p + 'R', maze, r, c+1); // goes right
        }

        if(r > 0){
            path(p + 'U', maze, r-1, c); // goes up
        }

        if(c > 0){
            path(p + 'L', maze, r, c-1); // goes left
        }

        maze[r][c] = true; // reseting the cell
    }

    static void pathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false; // setting the cell as already visited
        path[r][c] = step;

        if(r < maze.length - 1){
            pathPrint(p + 'D', maze, r+1, c, path, step+1); // goes down
        }

        if(c < maze[0].length - 1){
            pathPrint(p + 'R', maze, r, c+1, path, step+1); // goes right
        }

        if(r > 0){
            pathPrint(p + 'U', maze, r-1, c, path, step+1); // goes up
        }

        if(c > 0){
            pathPrint(p + 'L', maze, r, c-1, path, step+1); // goes left
        }

        maze[r][c] = true; // reseting the cell
        path[r][c] = 0;
        // System.out.println();
    }
}