import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.*;

public class MainClass {
	
	public static void print(int x) {
		System.out.println("From method ref. : "+ x);
	}

	public static void main(String[] args) {
//		
//		PracticaLamda plam = a-> a+100;
//		
//		System.out.println(plam.num(5));
//		
//		System.out.println(fromInterface(a->a*200, 100));
		
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		List<Integer> iist = Arrays.asList(2,4,6,4,12,33,1);
		
		System.out.println(iist.stream().map(p-> p+5).filter(p-> p%2==0).collect(Collectors.toList())); // stream API
		
		iist.forEach(x-> System.out.println("number is: "+ x)); // forEach 
		iist.forEach(MainClass::print);   // Method Reference
		

		
	}
	
//	public static int fromInterface(PracticaLamda p, int a) {
//		
//		return p.num(a)+25000;
//		
//	}

}
