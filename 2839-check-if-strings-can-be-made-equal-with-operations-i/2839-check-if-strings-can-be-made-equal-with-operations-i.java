class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] a = new char[]{s1.charAt(0), s1.charAt(2)};
        char[] b = new char[]{s2.charAt(0), s2.charAt(2)};

        char[] c = new char[]{s1.charAt(1), s1.charAt(3)};
        char[] d = new char[]{s2.charAt(1), s2.charAt(3)};

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        Arrays.sort(d);

        return Arrays.equals(a, b) && Arrays.equals(c, d);
    }
}