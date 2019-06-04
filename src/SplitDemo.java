
public class SplitDemo {

    public static void main(String[] args) {

        String s = "java,oracle,python,linux,dotnet,php";
        String ar[]=s.split(",");
        
        for(int i=0; i<ar.length; i++){
            System.out.println(ar[i]);
        }
        
    }

}
