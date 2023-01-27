import java.util.Arrays;

public class marathon {
    public static void main(String[] args) {
        String answer = "";
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Arrays.sort(participant);
        Arrays.sort(completion);
        System.out.println(participant[participant.length-1]);

        for (int i = 0; i < completion.length; i++) {
            System.out.println(i);
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            } else {
                answer = participant[participant.length-1];
            }
        }
        System.out.println(answer);
    }

}



/*

    def solution(participant, completion):
        answer = ''
        #tmp_participant = participant
        participant.sort()
        completion.sort()

        for i in range(len(completion)):
        if participant[i] != completion[i]:
        answer = participant[i]
        break
        else:
        answer = participant[-1]


        #answer = tmp_participant[0]
        return answer*/
