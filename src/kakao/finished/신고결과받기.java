package kakao.finished;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

// https://youtu.be/ncCUNOJUn9Q
//https://programmers.co.kr/learn/courses/30/lessons/92334
public class 신고결과받기 {

    private int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 1.중복 제거
        HashSet<String> reportSet = new HashSet<>();
        for (String rep : report) reportSet.add(rep); //  reportSet에는 중복이 없다.

        // 2. notifyListHash 만들기
        HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
        for (String rep : reportSet) {
            int blankIdx = rep.indexOf(" ");
            String reporter = rep.substring(0, blankIdx); // 신고한 사람
            String reportee = rep.substring(blankIdx+1); // 신고 당한 사람

            ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee, null);
             if (reporterList == null) reporterList = new ArrayList<>();

            reporterList.add(reporter);
            notifyListHash.put(reportee, reporterList);

        }

        // 3. notifyListHash를 기반으로 reporterHash 만들기
        HashMap<String, Integer> reporterHash = new HashMap<>();
        for (ArrayList<String> notifyList : notifyListHash.values())
            if (notifyList.size() >= k)
                for (String reporter : notifyList)
                    reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0) + 1);


        // 4. reporterHash를 기반으로 answer 배열을 채운다.
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reporterHash.getOrDefault(id_list[i], 0);
        }



        return answer;
    }

    public static void main(String[] args) {
        신고결과받기 T = new 신고결과받기();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo nexo", "muzi neo", "apeach muzi"};

        int k = 2;
        System.out.println(Arrays.toString(T.solution(id_list, report, k)));

    }


}
