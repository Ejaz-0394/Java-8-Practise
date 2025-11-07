import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class JavaOne {
    public static void main(String[] args) {
       List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
	List<Integer> n=num.stream().filter(l -> l%2==0).collect(Collectors.toList());			
	System.out.println(n);
	//System.out.println(flist.stream().count());

	
    }
}