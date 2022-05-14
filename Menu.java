import java.util.*;
public class Menu implements InterfaceMenu{
    Scanner ler = new Scanner(System.in);
    

    public int opcoes(){
        System.out.println("Opção 1: Criar Conta");
        System.out.println("Opção 2: Ver saldo");
        System.out.println("Opção 3: Depositar");
        System.out.println("Opção 4: Sacar");
        System.out.println("Opção 0: Sair");
        System.out.print("O numero da sua Opção:");
        int x = ler.nextInt();
        return x; 
    }
}
