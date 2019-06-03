public class StringMethodsThree {
    public static void main(String args[]){

        String city="indore";
        char ch[]=city.toCharArray();
        
        for(int i=0; i<city.length(); i++){
            System.out.println(ch[i]);
        }
        System.out.println("_________________________");
        byte b[]=city.getBytes();
        
        for(int i=0; i<b.length;i++){
            System.out.println(b[i]);
        }
        
        /*
        String s="this is java and java is powerful";
        
        for(int i=13;i<=18;i++){
        char ch=s.charAt(i);
        System.out.println(ch);
        }
        */
        
    }
}
/*
    Non-Static Methods of String
    ------------------------------

    int length()
    length method gives you no of characters
    in invoking string

    char charAt(int)
        is giving you the char on the given index

    char[] toCharArray();
        convert a string to char array

    byte[] getBytes()
        converts a string to bytes.


*/
