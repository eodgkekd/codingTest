import java.util.*;

public class getReport {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

        /*String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};*/
        int k = 2;
        //System.out.println(report);

        //report = Arrays.stream(report).distinct().toArray(String[]::new);

        HashMap<String, Integer> resultMap = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        report = hashSet.toArray(new String[hashSet.size()]);
        //System.out.println(report);

        //System.out.println(resultMap);

        String tmp;

        for(int i=0; i < report.length; i++){
            tmp = report[i].split(" ")[1];
            if(resultMap.containsKey(tmp)){
                resultMap.put(tmp, resultMap.get(tmp) + 1);
            } else {
                resultMap.put(tmp, 1);
            }
        }

        int[] answer = new int[id_list.length];

        /*ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=0; i < id_list.length; i++){
            answer.add(0);
        }*/

        for (int i=0; i < report.length; i++){
            String[] tmp_r = report[i].split(" ");
            if(resultMap.getOrDefault(tmp_r[1], 0) >= k){
                System.out.println(resultMap.get(tmp_r[1]));
                answer[Arrays.asList(id_list).indexOf(tmp_r[0])] = answer[Arrays.asList(id_list).indexOf(tmp_r[0])] + 1;
            }
        }
        System.out.println(Arrays.toString(answer));


        /*for(Map.Entry<String, Integer> entrySet : resultMap.entrySet()) {
            if(entrySet.getValue() >= k){
                for(int i=0; i < report.length; i++){
                    tmp_one = report[i].split(" ")[0];
                    tmp_two = report[i].split(" ")[1];
                    if(tmp_two.equals(entrySet.getKey())){
                        answer[Arrays.asList(id_list).indexOf(tmp_one)] = answer[Arrays.asList(id_list).indexOf(tmp_one)] + 1;
                        //answer.set(Arrays.asList(id_list).indexOf(tmp_one), answer.get(Arrays.asList(id_list).indexOf(tmp_one)) + 1);
                        //answer[Arrays.asList(id_list).indexOf(tmp_one)] = answer[Arrays.asList(id_list).indexOf(tmp_one)] + 1;
                    }
                }
            }
        }*/



        //System.out.println(Arrays.toString(answer));

        /*for(Map.Entry<String, Integer> entrySet : resultMap.entrySet()) {
            if(entrySet.getValue() >= k){
                for(int i=0; i < report.length; i++){
                    String tmp_one = report[i].split(" ")[0];
                    String tmp_two = report[i].split(" ")[1];
                    if(tmp_two.equals(entrySet.getKey())){
                        answer.set(Arrays.asList(id_list).indexOf(tmp_one), answer.get(Arrays.asList(id_list).indexOf(tmp_one)) + 1);
                    }
                }
            }
        }*/


        //int[] result = answer.stream().mapToInt(i -> i).toArray();

        /*System.out.println(Arrays.asList(answer).toString());
        System.out.println(Arrays.toString(result));*/
    }
}
