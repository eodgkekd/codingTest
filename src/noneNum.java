import java.util.Arrays;

public class noneNum {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        int answer = 0;

        boolean tmp = false;
        for(int i = 0; i < 10; i++){
            for(int num : numbers){
                if(i==num){
                    tmp = true;
                }
            }
            if(tmp== false){
                answer += i;
            } else {
                tmp = false;
            }
        }

        System.out.println(answer);


    }
}
