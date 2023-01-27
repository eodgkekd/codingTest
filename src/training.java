import java.util.Arrays;

public class training {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int answer = 0;
        answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            if (lost[i] == 50){
                continue;
            }
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == 50){
                    continue;
                } else if(lost[i] == 50 && reserve[j] == 50){
                    break;
                }

                if(lost[i] == reserve[j]){
                    lost[i] = 50;
                    reserve[j] = 50;
                    answer++;
                    break;
                } else if(Math.abs(lost[i] - reserve[j]) == 1){
                    lost[i] = 50;
                    reserve[j] = 50;
                    answer++;
                    break;
                }
            }
        }


        System.out.println(Arrays.toString(lost));
        System.out.println(Arrays.toString(reserve));
        System.out.println(answer);
    }

}
