import java.util.*;

public class Conta implements Comparable<Conta>{
    private String nome;
    private int numero;
    private String cpf;
    private double saldo;
    private String agencia;

    public int compareTo(Conta outraConta) {
        int agenciaComp = this.getAgencia().compareTo(outraConta.getAgencia());
        if (agenciaComp == 0) {
            if (this.getNumero() == outraConta.getNumero()){
                return 0; 
            } else if (this.getNumero() < outraConta.getNumero()) {
                return -1;
            } else {
                return 1;
            }
        }
        return agenciaComp;
    }    
    // public	void	ordenaLista(EventObject	evento) {
    //     List<Conta>	contas	=	evento.
    //     Collection.sort(contas);
    // }



    public Conta(String nome, int numero, String cpf, double saldo, String agencia) {
        this.nome = nome;
        this.numero = numero;
        this.cpf = cpf;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Conta [cpf=" + cpf + ", nome=" + nome + ", numero=" + numero + ", saldo=" + saldo + "]";
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public void deposita(double d) {
    }


}