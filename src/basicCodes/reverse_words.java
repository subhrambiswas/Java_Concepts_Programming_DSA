package basicCodes;

public class reverse_words {
    public static void main(String args[]) {
        String str = "Hp Laptop Inventory";

        String reverseWord = "";
        String words[] = str.split(" ");
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb+ " ";
        }


        System.out.println(reverseWord);
    }
}
