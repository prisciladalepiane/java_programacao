package Exemplo1;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int[4][5];
		Random random = new Random(100);
		for (int i = 0; i<4;i++) {
			for(int j = 0; j <5; j++) {
				matriz[i][j] = random.nextInt(9);
				System.out.print(matriz[i][j]);
			}
			System.out.print("\n");
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(matriz[1][i]);
		}
	}
	
	
}
