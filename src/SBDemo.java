
public class SBDemo {

    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer("abcdefgh");
        System.out.println(sb);
        //sb.append("XYZ");
        //sb.insert(0, "XYZ");
        //sb.replace(1, 4, "PQRS");
        //sb.setCharAt(3, 'Z');
        //sb.deleteCharAt(3);
        //sb.delete(1,4);
        sb.reverse();
        System.out.println(sb);
        
        
        
    }
}
/*
    StringBuffer(String)

    Methods

    1) append
        can add more characters at the end

    2) insert
        can add new chars on the desired position

    3) replace
        can replace a range with new contents

    4) setCharAt
        replacing a single char

    5) deleteCharAt
        deleting a single char

    6) delete
        deletes a range

    7) reverse
        reverse the string

    8) toString
        converts a StringBuffer to String
*/
