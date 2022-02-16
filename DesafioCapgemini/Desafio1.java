import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = n-1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j < q) {
					System.out.print(" ");
					
				}else {
					System.out.print("*");
				}
				
			}
			q--;
			System.out.println();
		}
		
		sc.close();
	}

}
