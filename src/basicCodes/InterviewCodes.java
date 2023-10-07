package basicCodes;

public class InterviewCodes {
    public static void main(String [] args)
    {
        String str = " Subhram     Biswas   kolkata ";
        char ch[] = new char[str.length()];
        int count =0;
        for(int i=0; i<str.length(); i++)
        {
            ch[i] = str.charAt(i);
                if(i > 0 && ch[i] != ' ' && ch[i - 1] == ' ')
                    count++;
        }
        System.out.println(count);
        
        
    }
}
