package guanabara;

public class Conta_Banco {
    private int numConta;
    protected String tipo;
    public String dono;
    public double saldo;
    public boolean status;

    public Conta_Banco() {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    public void estadoAtual() {
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.saldo);
        System.out.println("Status " + this.status);
    }

    public void abrirConta(String tipo) {
        status = true;
        if (tipo == "cc") {
            saldo = 50.0;
            System.out.println("\nConta aberta com sucesso!");
        } else if (tipo == "cp") {
            saldo = 100.0;
            System.out.println("Conta aberta com sucesso!");
        }
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com dinheiro. ");
            System.out.println("Para fechar a conta é necessário sacar todo dinheiro. ");
        } else if (saldo < 0) {
            System.out.println("Conta em débito. ");
            System.out.println("Favor liquidar o débito da conta. ");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(double valor) {
        if (status == true) {
            saldo = saldo + valor; //setSaldo((getSaldo() + valor));
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Conta inexistente.");
        }
    }

    public void sacar(double valor) {
        if (status) {

            if (saldo >= valor) {
                saldo = saldo - valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        }else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        double tarifa = 0;

        if (tipo == "cc") {
            tarifa = 15;
        } else if (tipo == "cp") {
            tarifa = 20;
        }

        if (status == true) {
            saldo = saldo - tarifa;
            System.out.println("Mensalidade paga com sucesso " + dono);
        } else {
            System.out.println("Impossível pagar com uma conta fechada.");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
