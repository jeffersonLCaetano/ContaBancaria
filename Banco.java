package guanabara;

public class Banco {
    public static void main(String[] args) {
        Conta_Banco p1 = new Conta_Banco();
        p1.setNumConta(111);
        p1.setTipo("cc");
        p1.setDono("Jeffim");
        p1.abrirConta("cc");

        Conta_Banco p2 = new Conta_Banco();
        p2.setNumConta(222);
        p2.setTipo("cp");
        p2.setDono("João");
        p2.abrirConta("cp");

        p1.depositar(100);
        p2.depositar(200);
        p1.sacar(150);
        p2.sacar(300);
        p1.fecharConta();
        p2.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();

    }
}
