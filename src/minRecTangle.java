import java.util.Arrays;
import java.util.Comparator;

public class minRecTangle {

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        solution(sizes);
    }

    public static int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        for(int i=0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
            if(sizes[i][0] > maxW){
                maxW = sizes[i][0];
            }
            if(sizes[i][1] > maxH){
                maxH = sizes[i][1];
            }
        }

        int answer = maxW * maxH;
        return answer;
    }

}
