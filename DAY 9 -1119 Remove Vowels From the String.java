        public class Main {
    public static void main(String[] args) {

        String s = "leetcodeisacommunityforcoders";

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c != 'a' &&
                c != 'e' &&
                c != 'i' &&
                c != 'o' &&
                c != 'u') {

                sb.append(c);
            }
        }

        System.out.println("Input : " + s);
        System.out.println("Output: " + sb.toString());
    }
}
