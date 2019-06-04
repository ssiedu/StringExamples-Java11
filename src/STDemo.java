
import java.util.StringTokenizer;

public class STDemo {
    public static void main(String[] args) {

        String s="indore,bhopal;delhi,mumbai,pune;nagpur";
        //StringTokenizer st=new StringTokenizer(s);
        
        StringTokenizer st=new StringTokenizer(s,",;",true);
        

        System.out.println(st.countTokens());
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        
        System.out.println(st.countTokens());
        
    }
}
/*
    StringTokenizer
    ------------------

    StringTokenizer(String) //tokens on white spaces
    StringTokenizer(String,String)
    StringTokenizer(String,String,boolean)

    third parameter accepts a boolean value
    if you pass true
        delimeter will also be considered as a token.

    false
        delimiter will not be taken as token


    methods
    ---------

    String nextToken()
    -----------------------
        can be used to obtain the next token

        1st call it gives 1st token
        2nd call it gives 2nd token
        3rd call it gives 3rd token

    boolean hasMoreTokens()
    ---------------------------

        checks for the availability of next token.
it any more token is available it gives you true
otherwise it gives you false.

    int countTokens()

        will returns number of tokens
        still we have to fetch.






















*/
