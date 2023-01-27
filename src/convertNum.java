public class convertNum {
    public static void main(String[] args) {
        String s = "one4seveneight";
        String[][] word_list = {{"0", "zero"}, {"1", "one"}, {"2", "two"}, {"3", "three"}, {"4", "four"},
                {"5", "five"}, {"6", "six"}, {"7", "seven"}, {"8", "eight"}, {"9", "nine"}};
        int answer = 0;
        try {
             answer = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            for(int i=0; i< word_list.length; i++){
                s = s.replaceAll(word_list[i][1], word_list[i][0]);
            }
            answer = Integer.parseInt(s);
        }

        System.out.println(answer);
    }
}
