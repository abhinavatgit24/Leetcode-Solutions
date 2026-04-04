class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if (rows == 0) return "";

        int n = encodedText.length();
        int cols = n / rows;

        StringBuilder res = new StringBuilder();

        for (int startCol = 0; startCol < cols; startCol++) {
            int i = 0, j = startCol;

            while (i < rows && j < cols) {
                res.append(encodedText.charAt(i * cols + j));
                i++;
                j++;
            }
        }

        // remove trailing spaces
        int end = res.length() - 1;
        while (end >= 0 && res.charAt(end) == ' ') {
            end--;
        }

        return res.substring(0, end + 1);
    }
}