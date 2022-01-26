public class Tcs {
    public static void main(String[] args) {

        String str = "aamitt";

        int count = 0;

            for (char c = 'a'; c < 'z'; c++) {

                for (int i = 0; i < str.length(); i++) {

                   // char temp= str.charAt(i);
                if (str.charAt(i) == c) {
                    count++;

                }
                    System.out.println(c + ":"  + count);
            }

        }
    }


}
