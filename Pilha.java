package abner.com.Pilha_Validador_Expressao;

public class Pilha {

    private int topo;
    private char dado[];


    public Pilha(int MAX) {
        this.topo = -1;
        this.dado = new char[MAX];
    }

    public char topo() {
        return this.dado[this.topo];
    }

    public boolean vazia() {
        return topo == -1;
    }

    public boolean cheia() {
        return topo == dado.length - 1;
    }

    public void empilha(char elemento) {
        if (cheia()) {
            System.out.println("cheia");

        } else {
            topo += 1;
            dado[topo] = elemento;
        }
    }

    public char desempilhar() {
        if (vazia()) {
            System.out.println("False");
            System.exit(0);
            return 'n';
        }
        char e = dado[topo];
        topo -= 1;
        return e;
    }


}
