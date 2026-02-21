class Solution {
    public int totalNumbers(int[] digits) {

        int[] freq = new int[10];

        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

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

            if (valid) count++;
        }

        return count;
    }
}