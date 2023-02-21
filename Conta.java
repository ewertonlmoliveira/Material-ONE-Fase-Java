import java.security.AlgorithmParameterGenerator;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta (int agencia, int numero) {
        Conta.total++;
        if (agencia > 0 && numero > 0) {
            this.agencia = agencia;
            this.numero = numero;
            System.out.println("Conta criada com sucesso, agência " + agencia + " número " + numero);
        } else {
            System.out.println("Informações inválidas");
        }
    }

    public boolean deposita(double valor) {
        if(valor > 0) {
            saldo += valor;
            return true;
        } else {
           return false;
        }
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor && valor > 0) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }

    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor && valor > 0) {
            this.saldo -= valor;
            //destino.saldo = saldo + valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("Número informado inválido");
            return; // return serve para parar a execução, como é void, não precisa retornar nada, apenas PARAR.
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Agência informada inválida");
            return; // return serve para parar a execução, como é void, não precisa retornar nada, apenas PARAR.
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
