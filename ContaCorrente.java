public class ContaCorrente  extends Conta{
    public ContaCorrente(String nome, int numero, String cpf, double saldo, String agencia) {
        super(nome, numero, cpf, saldo, agencia);
        //TODO Auto-generated constructor stub
    }

    public void deposita(double n){
        double x = this.getSaldo() + n ;
        this.setSaldo(x);
    }
    
    public void sacar(double n){
        if(this.getSaldo() >=n){
            double x = this.getSaldo() - n ;
            this.setSaldo(x);
        }else{
            System.out.println("Infelizmente você não pode sacar esse dinheiro");
        }
    }
    
}
