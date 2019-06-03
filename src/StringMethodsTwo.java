
public class StringMethodsTwo {
    public static void main(String[] args) {
        String s="this is java and java is object oriented";
        
        
        int lastIdx1=s.lastIndexOf("java");
        System.out.println("Last Index of java "+lastIdx1);
        
        int idx=s.indexOf("java");//it starts search from 0
        System.out.println("Index of java "+idx);
        
        int idx1=s.indexOf('i', 20);
        System.out.println(idx1);
        
        int idx2=s.indexOf("java");
        System.out.println(idx2);
        
        int idx3=s.indexOf("java", 10);
        System.out.println(idx3);
        
    }
}
/*
    Searching Methods
    -------------------

    //last indexOf searchs for the last occurence

    String s="java"

    1st offurence of 'a' is => 1
    last occurence of 'a' is => 

    int lastIndexOf(char)
    int lastIndexOf(char,int)
    int lastIndexOf(String)
    int lastIndexOf(String,int)

    //indexOf searchs for the first occurence

    int indexOf(char)
        can be used for searching a character in the
        invoking String.
        it gives you the first occurence of the character
        we are looking for.
        it starts searching from index 0.
        if search is fail then this method returns -1.

    int indexOf(char,int)
        its also same as above method but only one change
        it starts the search from given index.
        (you can pass start of search in 2nd parameter)

        below two method swill search a string in another one

    int indexOf(String)

    int indexOf(String,int)



 */
