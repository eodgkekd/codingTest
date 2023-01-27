import java.util.Arrays;
import java.util.Stack;

public class crane {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        int doll = 0;
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(int num : moves){
            for(int i = 0; i < board[0].length; i++){
                doll = board[i][num-1];
                if(doll != 0){
                    board[i][num-1] = 0;
                    if(stack.empty()){
                        stack.push(doll);
                    } else {
                        if(stack.peek() == doll){
                            stack.pop();
                            answer +=2;
                        } else {
                            stack.push(doll);
                        }
                    }
                    break;
                }
            }
        }
        System.out.println(stack);
        for(int[] arr: board){
            System.out.println(Arrays.toString(arr));
        }

        System.out.println(answer);

    }
}
