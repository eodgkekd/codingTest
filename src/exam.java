import java.util.ArrayList;
import java.util.Arrays;

public class exam {
    public static void main(String[] args) {
        int[] answer = {1,3,2,4,2};

        int[][] supoza = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        int max_score = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < supoza.length; i++) {
            int score = 0;
            int tmp = 0;
            boolean chk = true;

            while(true) {

                if (chk == false) {
                    break;
                }
                for (int j = 0; j < supoza[i].length; j++) {

                    if (tmp == answer.length){
                        chk = false;
                        break;
                    }
                    if(answer[tmp] == supoza[i][j]){
                        score ++;

                    }
                    tmp ++;
                }


            }

            if(score > max_score){
                max_score = score;
                result.clear();
                result.add(i+1);
            } else if(score == max_score) {
                result.add(i+1);
            }

        }

        int[] result2 = result.stream().mapToInt(i -> i).toArray();

        Arrays.sort(result2);

        System.out.println(result2);

/*
        while (true){
            for (int i = 0; i < answer.length; i++) {
                System.out.println(answer[i]);
                tmp ++;
            }

            if(tmp==100){
                break;
            }
        }*/

    }
}
