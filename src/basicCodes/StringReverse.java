package basicCodes;

public class StringReverse {
    public static void main(String args[]) {
        String name = "Subhram Biswas";
        char ch;
        String revname = "";
        int len = name.length();
        for (int i = len - 1; i >= 0; i--) {
            ch = name.charAt(i);
            revname = revname + ch;
        }
        System.out.println(revname);
    }
}
