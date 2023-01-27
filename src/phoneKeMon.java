import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class phoneKeMon {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        int N = nums.length;
        int answer = 0;

        // 배열 -> Set
        Set<Integer> set_nums = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        if(set_nums.size() < (N/2)){
            answer = set_nums.size();
        } else {
            answer = N/2;
        }

        System.out.println(answer);

    }
}
