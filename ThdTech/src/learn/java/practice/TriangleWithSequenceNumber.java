package learn.java.practice;

public class TriangleWithSequenceNumber {

	public static void main(String[] args) {
		// 1 
		// 2 3 
		// 4 5 6 
		// 7 8 9 10 
		// 11 12 13 14 15 
		
		
		int printNumber=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j<=i) {
				System.out.print('*' +" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		

	}

}
