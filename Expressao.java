package abner.com.Pilha_Validador_Expressao;

public class Expressao {

    char expressao[];
    Pilha pilha;

    public Expressao(String expressao) {
        this.expressao = expressao.toCharArray();
        pilha = new Pilha(this.expressao.length);
    }

    public boolean valida() {

        for (int i = 0; i < expressao.length; i++) {

            if (expressao[i] == '(' || expressao[i] == '{' || expressao[i] == '[') {
                pilha.empilha(expressao[i]);
            }

            if (pilha.vazia() == true) {
                return false;
            } else {
                if (expressao[i] == ')') {

                    if (pilha.topo() == '(') {
                        pilha.desempilhar();
                    }

                } else if (expressao[i] == '}') {

                    if (pilha.topo() == '{') {
                        pilha.desempilhar();
                    }

                } else if (expressao[i] == ']') {

                    if (pilha.topo() == '[') {
                        pilha.desempilhar();
                    }

                }
            }
        }

        if (pilha.vazia()) {
            return true;
        } else {

            return false;
        }
    }


}
