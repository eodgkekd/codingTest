import java.util.Arrays;

public class lottos {
    public static void main(String[] args) {
        int[] lottos = {1,2,3,4,5,6};
        int[] win_nums = {7,8,9,10,11,12};

        int zero_cnt = 0;
        int result = 0;
        int min_ranking = 0;
        int max_ranking = 0;

        for(int i=0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zero_cnt++;
            } else {
                for(int num : win_nums){
                    if(num == lottos[i]){
                        result++;
                    }
                }
            }
        }

        if(zero_cnt == 6){
            min_ranking = 6;
            max_ranking = 1;
        } else {
            switch(result) {
                case 0: min_ranking= 6;
                    max_ranking = 6;
                    break;
                case 1: min_ranking = 6;
                    max_ranking = min_ranking - zero_cnt;
                    break;
                case 2: min_ranking = 5;
                    max_ranking = min_ranking - zero_cnt;
                    break;
                case 3: min_ranking = 4;
                    max_ranking = min_ranking - zero_cnt;
                    break;
                case 4: min_ranking = 3;
                    max_ranking = min_ranking - zero_cnt;
                    break;
                case 5: min_ranking = 2;
                    max_ranking = min_ranking - zero_cnt;
                    break;
                case 6: min_ranking = 1;
                    max_ranking = 1;
                    break;
            }
        }



        int[] answer = {max_ranking, min_ranking};

        System.out.println(Arrays.toString(answer));

    }
}
