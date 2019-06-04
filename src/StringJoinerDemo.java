
import java.util.StringJoiner;


public class StringJoinerDemo {
    public static void main(String[] args) {

        String s1="Amit";
        String s2="Rajeev";
        String s3="Priya";
        String s4="Manish";
        
        //String result=s1+","+s2+","+s3+","+s4;
        //System.out.println(result);
        
        //StringJoiner sj=new StringJoiner("@");
        StringJoiner sj=new StringJoiner("-#","[","]");
        sj.add(s1);sj.add(s2);sj.add(s3); sj.add(s4);
        String result=sj.toString();
        System.out.println(result);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
