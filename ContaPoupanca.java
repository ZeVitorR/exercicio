public class ContaPoupanca extends Conta{

    

    public String toString() {
        return "ContaPoupanca []";
    }
    public void depositar(double n){
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