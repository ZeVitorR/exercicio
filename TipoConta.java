
public class TipoConta {
    ContaPoupanca cp;
    ContaCorrente cc;
    public ContaPoupanca getCp() {
        return cp;
    }
    public void setCp(ContaPoupanca cp) {
        this.cp = cp;
    }
    public ContaCorrente getCc() {
        return cc;
    }
    public void setCc(ContaCorrente cc) {
        this.cc = cc;
    }

    public void imprimeConta(){
        if(cc.getNumero() < 1000){
            System.out.println(cc.toString());
        }else{
            System.out.println(cp.toString());
        }
    }
   
}
