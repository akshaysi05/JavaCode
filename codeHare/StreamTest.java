import java.util.ArrayList;

public class StreamTest {
    public static void main(String[] args) {
        //Count Number of Names Start With A and Print The Count for Java 
        ArrayList<String> names= new ArrayList<String>();
        names.add("Akshay");
        names.add("Jay");
        names.add("Ankush");
        names.add("Anshu");
        names.add("Suraj");
        names.add("Amar");
        int count=0;
        for(int i=0;i<names.size();i++){
            String actual=names.get(i);
            if (actual.startsWith("A")) {
                count++;
             
            }
        }
        System.out.println(count);
        Stream();
    }
    public static void Stream(){
        //Count Number of Names Start With A and Print The Count for Stream 
        ArrayList<String> names= new ArrayList<String>();
        names.add("Akshay");
        names.add("Jay");
        names.add("Ankush");
        names.add("Anshu");
        names.add("Suraj");
        Long number=names.stream().filter(n->n.startsWith("A")).count();
        System.out.println(number);
        
    }
}
