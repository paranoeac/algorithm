package programmers.level1;

import java.util.*;

public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {

        // 중복 리포트 제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        int[] answer = new int[id_list.length];

        // 신고자 리스트
        Map<String, Integer> idAndIndexMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idAndIndexMap.put(id_list[i], i);
        }

        // report 분석 <악플러, 신고횟수>
        Map<String, Integer> reportMap = new HashMap<>();

        // report 분석2 <악플러, 신고자>
        Map<String, List<String>> reportMap2 = new HashMap<>();

        Object[] reportSetArr = reportSet.toArray();
        for (int i = 0; i < reportSetArr.length; i++) {
            String[] reportArr = reportSetArr[i].toString().split(" ");
            String reporterId = reportArr[0];
            String badguyId = reportArr[1];

            if (reportMap.get(badguyId) == null) {
                reportMap.put(badguyId, 1);
            } else {
                int passiveCount = reportMap.get(badguyId).intValue() + 1;
                reportMap.put(badguyId, passiveCount);
            }

            if (reportMap2.get(badguyId) == null) {
                List<String> reporterList = new ArrayList<>();
                reporterList.add(reporterId);
                reportMap2.put(badguyId, reporterList);
            } else {
                List<String> reporterList = reportMap2.get(badguyId);
                reporterList.add(reporterId);
                reportMap2.put(badguyId, reporterList);
            }
        }

        Set<String> keys = reportMap.keySet();
        for (String key : keys) {
            if (reportMap.get(key).intValue() >= k) {
                for (String reporter : reportMap2.get(key)) {
                    int index = idAndIndexMap.get(reporter).intValue();
                    answer[index] = answer[index] + 1;
                }
            }
        }

        return answer;
    }

    public int[] solutionFail2(String[] id_list, String[] report, int k) {

        // 중복 리포트 제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        int[] answer = new int[id_list.length];

        // 신고자 리스트
        Map<String, Integer> idAndIndexMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idAndIndexMap.put(id_list[i], i);
        }

        // 악플러 리스트
        List<String> badGuyList = new ArrayList<>();
        for (String rep : reportSet) {
            badGuyList.add(rep);
        }

        for (String reportStr : reportSet) {
            int numberOfReport = 0;
            String[] temp = reportStr.split(" ");
            String disReporter = temp[1];

            List<String> rcveMailTarget = new ArrayList<>();
            List<String> removeReportList = new ArrayList<>();
            Iterator<String> badGuyIter = badGuyList.iterator();

            while (badGuyIter.hasNext()) {
                String badGuy = badGuyIter.next();
                String[] tmp = badGuy.split(" ");
                String reporter = tmp[0];
                String badGuyName = tmp[1];

                if (disReporter.equals(badGuyName)) {
                    ++numberOfReport;

                    // 메일 대상자 저장
                    rcveMailTarget.add(reporter);

                    // 순회 요소를 삭제해서 성능 최적화
                    removeReportList.add(badGuy);
                }
            }

            if (numberOfReport >= k) {
                for (int i = 0; i < rcveMailTarget.size(); i++) {
                    int index = idAndIndexMap.get(rcveMailTarget.get(i)).intValue();
                    answer[index] = answer[index] + 1;
                }
            }

            badGuyList.removeAll(removeReportList);
        }

        return answer;
    }

    public int[] solutionFail1(String[] id_list, String[] report, int k) {

        // 중복 리포트 제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        int[] answer = new int[id_list.length];

        // 신고자 리스트
        Set<String> rcveMailTarget = new HashSet<>();
        int numberOfReport = 0;

        for (String reportStr : reportSet) {
            String[] temp = reportStr.split(" ");
            String reporter = temp[0];
            String disReporter = temp[1];

            for (String reportStr2 : reportSet) {
                String[] temp2 = reportStr2.split(" ");
                String disReporter2 = temp2[1];

                rcveMailTarget.add(reporter);

                if (disReporter.equals(disReporter2)) {
                    ++numberOfReport;
                }
            }

            if (numberOfReport >= k) {
                for (int i = 0; i < id_list.length; i++) {
                    for (String target : rcveMailTarget) {
                        if (id_list[i].equals(target)) {
                            answer[i]++;
                        }
                    }
                }
            }

            rcveMailTarget.removeAll(rcveMailTarget);
            numberOfReport = 0;
        }

        return answer;
    }
}
