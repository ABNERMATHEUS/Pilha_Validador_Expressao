package abner.com.Pilha_Validador_Expressao;

public class Main {

    public static void main(String[] args) {

        Expressao expressao = new Expressao("[{(3+2)+(3+1)}+{(2*5)+7}]");
        System.out.println(expressao.valida());


	// write your code here
    }
}
