import java.util.Arrays;
import java.util.List;

public class App1 { // App sınıfı 
     
    public static void main(String[] args) throws Exception { //Java programının başlangıç noktasıdır
        List<Integer> numbers = Arrays.asList(12,4,5,42,6,4);
        for (Integer integer : numbers) {
            System.out.println(integer);
            
        }
    } 
}
