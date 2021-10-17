import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num_funcionario, horas;
		double vl_hora, salario;
		
		
		System.out.println("Informe seu numero: ");
		num_funcionario = sc.nextInt();
		
	    System.out.println("Informe suas horas trabalhadas: ");
	    horas = sc.nextInt();
	    
	    System.out.println("Informe o valor que recebe por hora trabalhada: ");
		vl_hora = sc.nextDouble();

		
		salario = horas * vl_hora;
		
		System.out.println("O seu numero é: " + num_funcionario);
		System.out.printf("O seu salario é: %.2f%n", salario);
		
		
		
		
		sc.close();
	}

}
