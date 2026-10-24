class Solution {

    private int getDays(String date) {
        int[] days = {0, 31, 28, 31, 30, 31, 30,
                      31, 31, 30, 31, 30, 31};

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int total = day;

        for (int i = 1; i < month; i++) {
            total += days[i];
        }

        return total;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {

        int aliceStart = getDays(arriveAlice);
        int aliceEnd = getDays(leaveAlice);

        int bobStart = getDays(arriveBob);
        int bobEnd = getDays(leaveBob);

        int start = Math.max(aliceStart, bobStart);
        int end = Math.min(aliceEnd, bobEnd);

        return Math.max(0, end - start + 1);
    }
}
