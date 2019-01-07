import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
	public static int revFact(BigInteger num){
		BigInteger fact = BigInteger.valueOf(1);
		int i = 2;
		while(!fact.equals(num)){
			fact = fact.multiply(BigInteger.valueOf(i));
			i++;
		}
		return i-1;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger nfact = sc.nextBigInteger();
		System.out.print(revFact(nfact));	
	}
}