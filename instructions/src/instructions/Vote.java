package instructions;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		System.out.println("entrez votre age svp : ");
		Scanner sc = new Scanner(System.in);
		int age =sc.nextInt();
		if 	(age>=18) {
			System.out.println("vous pouvez voter");
		}else {
			System.out.println("vous �tes trop jeune revenez dans quelques ann�es");
			sc.close();
			
		}


	}
}
