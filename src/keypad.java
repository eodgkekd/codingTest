import java.util.ArrayList;

class keypad {


    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        solution(numbers, hand);
    }
    public static String solution(int[] numbers, String hand) {

        String result = "";

        int tmp_l = -1;
        int tmp_r = -2;
        int dis_l = 0;
        int dis_r = 0;

        for(int num : numbers){
            if(num==1 || num==4 || num==7){
                tmp_l = num;
                result = result + "L";
            } else if(num==3 || num==6 || num==9){
                tmp_r = num;
                result = result + "R";
            } else {
                dis_l = getDistance(num, tmp_l);
                dis_r = getDistance(num, tmp_r);
                if(dis_l < dis_r){
                    tmp_l = num;
                    result = result + "L";
                } else if(dis_r < dis_l){
                    tmp_r = num;
                    result = result + "R";
                } else if(dis_l==dis_r){
                    if(hand.equals("right")){
                        tmp_r = num;
                        result = result + "R";
                    } else {
                        tmp_l = num;
                        result = result + "L";
                    }
                }
            }
        }

        return result;
    }

    public static int getDistance(int num, int tmp){
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}, {-1,0,-2}};
        int distance = 0;
        ArrayList<Integer> tmp_n = new ArrayList<Integer>(2);
        ArrayList<Integer> tmp_t = new ArrayList<Integer>(2);

        for(int i=0; i < arr.length; i++){
            if(tmp_n.size() != 0 && tmp_t.size() != 0){
                break;
            }
            for(int j=0; j < arr[0].length; j++){
                if(tmp_n.size() != 0 && tmp_t.size() != 0){
                    break;
                }

                if(arr[i][j] == num){
                    tmp_n.add(i);
                    tmp_n.add(j);
                } else if(arr[i][j] == tmp){
                    tmp_t.add(i);
                    tmp_t.add(j);
                }
            }
        }

        for(int i=0; i < tmp_t.size(); i++){
            distance += Math.abs(tmp_n.get(i) - tmp_t.get(i));
        }

        return distance;
    }

}
