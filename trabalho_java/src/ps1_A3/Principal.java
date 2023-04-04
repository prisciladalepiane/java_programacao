package ps1_A3;
import java.util.Scanner;

/** Unicesumar - Engenharia de software - Programação de Sistemas I
 * Atividade 3
 * Código para ler o salario e numero de dependentes de um funcionario e retornar o valor 
 * do salario final com o acrescimo baseado no numero de dependentes. 
 * @author Priscila Dalepiane   
 */

public class Principal {

	public static void main(String[] args) {
		
		float salarioFinal, salarioFamilia;
		float acrescimoP = 0.03f;
		float acrescimoFixo = 134.98f;
		Scanner input = new Scanner(System.in);
		
        System.out.println("Informe o salario:");
        float salario = input.nextFloat();

        System.out.println("Informe a quantidade de dependentes:");
        int dependentes = input.nextInt();
        
                
        salarioFinal = salario*(1+acrescimoP*dependentes) + acrescimoFixo*dependentes;
        salarioFamilia = salario*(acrescimoP*dependentes) + acrescimoFixo*dependentes;
        
        System.out.println("Salario: " + salario + "\n" +
        "Dependentes: " + dependentes+ "\n" +
        "Salario Familia: " + salarioFamilia + "\n" +
        "Salario Final: " + salarioFinal
        );
						
	}

}
