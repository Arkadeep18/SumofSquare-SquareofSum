public class Home_assgn1 {

	public static void main(String[] args) {
		int sumSquare = 0;
		int squareSum = 0;
		
		//difference between sum of square and square of sum of first 10 natural number;
		
		for(int a=1;a<=10;a++) {
			sumSquare = sumSquare+ a*a; 
			squareSum = squareSum+a;
		}
		squareSum = squareSum*squareSum;
		int difference = sumSquare-squareSum;
		System.out.println(difference);
	}

}
