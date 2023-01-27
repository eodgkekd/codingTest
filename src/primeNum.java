public class primeNum {
    static int result = 0;
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        boolean[] visited = new boolean[nums.length];

        combination(nums, visited, 0, nums.length, 3);

    }

    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        int tmp = 0;
        if(r == 0){
            for(int i = 0; i < n; i++) {
                if(visited[i]){
                    tmp += arr[i];
                }

            }

            if(isPrime(tmp)){
                result += 1;
            }
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    static boolean isPrime(int num){
        if( num == 1 ) return false;
        else if( num == 2 ) return true;
        else if( num % 2 == 0 ) return false;

        int count = 0;
        for(int i = 3; i <= Math.sqrt(num); i += 2){
            if( num % i == 0 ){
                count++;
                // break를 걸거나, return false로 빠져나와도 된다.
            }
        }
        return count == 0;

    }
}
