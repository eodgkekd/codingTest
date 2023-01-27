public class abs {
    public static void main(String[] args) {
        int[] absolutes = {1,2,3};
        boolean[] signs = {false,false,true};
        int answer = 0;

        for(int i=0; i < absolutes.length; i++){
            if(signs[i]==false){
                answer += absolutes[i] * -1;
            } else {
                answer += absolutes[i];
            }
        }


        System.out.println(answer);

    }
}
