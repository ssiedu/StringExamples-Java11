public class StringMethodsOne {
    public static void main(String args[]){
        
        String s1=new String("indore");
        String s2=new String("Indore(MP)");
        
        boolean b1=s1.equals(s2);
        System.out.println(b1);
        
        boolean b2=s1.equalsIgnoreCase(s2);
        System.out.println(b2);
        
        String s3="indoreonline";
        
        boolean b3=s3.startsWith("indo");
        System.out.println(b3);
        
        boolean b4=s3.endsWith("line");
        System.out.println(b4);
        

        String s4="indore";
        String s5="Indore";
        int n=s5.compareTo(s4);
        
        System.out.println(n);

        
        
    }
}
/*
    Non-Static of String class
    -----------------------------
    boolean equals(String)
        compares the contents of two objects.
        (case sensitive comparison)

    boolean equalsIgnoreCase(String)
        it is same as equals but the only difference
        is : this method performs a case insensitive comparison

    boolean startsWith(String)
        matches the begining of a string

    boolean endsWith(String)
        matches the end of a string

    int compareTo(String)
        compares two strings and returns a number

        int n=s1.compareTo(s2);
            
        if s1>s2        method returns +ve value
            (calling object is greater)

        if s1<s2        method returns -ve value
            (calling object is small)

        if s1=s2        method return 0











    
*/
