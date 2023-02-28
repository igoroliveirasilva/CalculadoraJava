import java.util.Scanner;

public class CalculadoraJava {

    static Scanner leitor = new Scanner(System.in);

    double numero1;
    double numero2;
    double resultado;
    

    public double somar (double numero1 , double numero2) {  //cria o método de somar
        resultado = numero1 + numero2;
        return resultado;
    }

    public double subtrair (double numero1 , double numero2) {  //cria o método de subtrair
        resultado = numero1 - numero2;
        return resultado;
    }
    public double multiplicar (double numero1 , double numero2) {  //cria o método de multiplicar
        resultado = numero1 * numero2;
        return resultado;
    }

    public double dividir (double numero1 , double numero2) {  //cria o método de dividir
        resultado = numero1 / numero2;
        return resultado;
    }

    public static void main(String[] args) {


        // Essa linha cria um objeto da classe Calculadora e atribui a ele uma referência chamada calculadora. Isso é feito usando a palavra-chave new, que aloca espaço na memória para o novo objeto e chama o construtor da classe Calculadora para inicializar suas variáveis.
        // Depois que o objeto é criado, podemos usar a referência calculadora para chamar os métodos e acessar as variáveis da instância de Calculadora. Isso permite que usemos os métodos de soma, subtração, multiplicação e divisão que foram definidos na classe Calculadora, passando os parâmetros adequados para eles.


        CalculadoraJava calculadora = new CalculadoraJava();

        System.out.println("Digite o primeiro número: ");
        calculadora.numero1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: ");
        calculadora.numero2 = leitor.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcao = leitor.nextInt();


        // Código usa a estrutura switch para selecionar a operação que o usuário deseja realizar na calculadora e chama o método correspondente da instância da classe Calculadora criada anteriormente, passando os números inseridos pelo usuário como parâmetros.

        switch (opcao) {
            case 1 :
                calculadora.somar(calculadora.numero1, calculadora.numero2);
                break;
            
            case 2 :
                calculadora.subtrair(calculadora.numero1, calculadora.numero2);
                break;

            case 3 :
                calculadora.multiplicar(calculadora.numero1, calculadora.numero2);
                break;

            case 4 :
                calculadora.multiplicar(calculadora.numero1, calculadora.numero2);
                break;

            default :
                System.out.println("Opção inválida!");

        }

        System.out.println("Resultado: " + calculadora.resultado);

    }

}
