package programmers.level2;

import java.util.*;

public class 두큐합같게만들기 {

    private static Long CQ1_TOTAL, CQ2_TOTAL = 0L;

    public int solution(int[] queue1, int[] queue2) {

        CustomQueue cq1 = new CustomQueue(queue1);
        CustomQueue cq2 = new CustomQueue(queue2);

        CQ1_TOTAL = cq1.getSumResult();
        CQ2_TOTAL = cq2.getSumResult();
        LinkedList<Long> cqList1 = cq1.getList();
        LinkedList<Long> cqList2 = cq2.getList();

        int answer = -1;
        Long total = CQ1_TOTAL + CQ2_TOTAL;

        // 홀수는 -1 로 종료
        if (total % 2 != 0) return answer;

        Long average = total / 2;
        long limitCnt = 2 * (cqList1.size() + cqList2.size()) - 1 ;

        int cnt = 0;

        while (cnt != limitCnt && (CQ1_TOTAL != average && CQ2_TOTAL != average)) {
            this.exchangeElement(cqList1, cqList2);
            cnt++;
        }

        return cnt == limitCnt ? answer : cnt;
    }


    public void exchangeElement(LinkedList<Long> cq1, LinkedList<Long> cq2) {
        if (CQ1_TOTAL > CQ2_TOTAL) {
            Long value = cq1.poll();
            CQ1_TOTAL = CQ1_TOTAL - value;
            CQ2_TOTAL = CQ2_TOTAL + value;
            cq2.offer(value);
        } else {
            Long value = cq2.poll();
            CQ1_TOTAL = CQ1_TOTAL + value;
            CQ2_TOTAL = CQ2_TOTAL - value;
            cq1.offer(value);
        }
    }

    static class CustomQueue {
        private long SUM_RESULT = 0L;
        private LinkedList<Long> que = new LinkedList<>();

        public CustomQueue(int[] ints) {
            for (int i : ints) {
                Long val = new Long(i);
                SUM_RESULT += val;
                this.que.add(val);
            }
        }

        public long getSumResult() {
            return this.SUM_RESULT;
        }

        public LinkedList<Long> getList() {
            return this.que;
        }
    }
}
