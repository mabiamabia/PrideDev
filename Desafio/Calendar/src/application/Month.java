package application;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
	
		System.out.println("Digite o num�ro do m�s: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String mes = null;    

		switch (x) {
		
		case 1:
			mes = " Janeiro";
			break;
		case 2:
			mes = " Fevereiro";
			break;
		case 3:
			mes = " Mar�o";
			break;
		case 4:
			mes = " Abril";
			break;
		case 5:
			mes = " Maio";
			break;
		case 6:
			mes = " Junho";
			break;
		case 7:
			mes = " Julho";
			break;
		case 8:
			mes = " Agosto";
			break;
		case 9:
			mes = " Setembro";
			break;
		case 10:
			mes = " Outubro";
			break;
		case 11:
			mes = " Novembro";
			break;
		case 12:
			mes = " Dezemmbro";
			break;
		}

		System.out.println("M�s: " + mes);		
		sc.close();	
			
}
}	

	