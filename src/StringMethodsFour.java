
public class StringMethodsFour {
    public static void main(String[] args) {
        
        String s1="indore";
        String s2=s1.toUpperCase();
        
        System.out.println(s1);
        System.out.println(s2);
        
        String s3="  java code  ";
        System.out.println(s3.length());
        
        String s4=s3.trim();
        System.out.println(s4.length());
        String s5="indore,bhopal,delhi,chennai,mumbai";
        //String s6=s5.replace(',', ';');
        String s6=s5.replace("mumbai", "bombay");
        System.out.println(s5);
        System.out.println(s6);
        
        String s7="java programming";
        String s8=s7.substring(5);
        String s9=s7.substring(5,12);
        System.out.println(s8);
        System.out.println(s9);
        
        
        
    }
}
/*
    String toUpperCase()
        converts the lowercase String to uppercase.
        
    String toLowerCase()
        converts the uppercase String to lowercase

    String trim()
        it trucates all the leading and trailing 
        whitespaces.

    String replace(char,char)

    String concat(String)   

    String s1="ab";
    String s2="cd";
    String s3=s1.concat(s2);    //"abcd"
    String s3=s1+s2;

    String substring(int)
        will create a new string using part of an invoking
        string.

    String substring(int,int)



        






*/