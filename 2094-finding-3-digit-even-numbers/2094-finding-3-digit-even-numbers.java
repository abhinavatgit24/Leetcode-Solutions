class Solution {
    public int[] findEvenNumbers(int[] digits) {

        int[] freq = new int[10];

        for (int d : digits) {
            freq[d]++;
        }

        List<Integer> list = new ArrayList<>();

        for (int num = 100; num <= 998; num += 2) {

            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            int[] temp = new int[10];
            temp[a]++;
            temp[b]++;
            temp[c]++;

            boolean valid = true;

            for (int i = 0; i < 10; i++) {
                if (temp[i] > freq[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) list.add(num);
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}