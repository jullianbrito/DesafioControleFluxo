import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro:");
            int parametro_01 = ler.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int parametro_02 = ler.nextInt();

            try {

            	contar(parametro_01, parametro_02);   //chamando o método contendo a lógica de contagem
            
            }catch (ParametrosInvalidosException e) {
            	System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
            }
        }
	}

	static void contar(int parametro_01, int parametro_02)  throws ParametrosInvalidosException {
		if(parametro_01 > parametro_02) {   //validar se parametro_01 é MAIOR que parametro_02 e lançar a exceção
            throw new ParametrosInvalidosException();
        }

        int contagem = parametro_02 - parametro_01;
        
        for(int i = 1; i <= contagem; i++) {    //realizar o for para imprimir os números com base na variável contagem
            System.out.println("Parametro " + i);
        }
    }
}