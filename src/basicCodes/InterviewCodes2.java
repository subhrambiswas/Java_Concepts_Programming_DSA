package basicCodes;

public class InterviewCodes2 {

    public static void main(String [] args){
        String str = "aaaabbccdeefgh";
        String felemnt=null;
        StringBuilder flist = new StringBuilder(" ");
        int count = 0;
//        Set<String> flist = new HashSet<>();
        int len = str.length();
        for(int i=0;i<len;i++)
        {
            char ch = str.charAt(i);
            for(int j = 0;j<len;j++)
            {
                if(ch == str.charAt(j))
                {
                    count++;

                }
            }
            felemnt = String.valueOf(count)+ch;
            flist.append(felemnt);
            count=0;

        }

        System.out.println(flist);
    }
}
