public class Conta {

    private int number;

    private int agencia;

    private  String nameClient;

    private double saldo;

    public int getAgencia() {
        return agencia;
    }

    public String getNameClient() {
        return nameClient;
    }

    public int getNumber() {
        return number;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



}
