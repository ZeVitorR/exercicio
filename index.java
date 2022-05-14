import java.util.*;
public class index {
    public static void main(String[] argc){
        List<ContaCorrente> contaCorente = new ArrayList<>();
        //List<TipoConta> contapoupanca = new ArrayList<>();
        ContaCorrente c = new ContaCorrente("teste", 0,"123456789",0,"12");
        contaCorente.add(c);
        ContaCorrente c2 = new ContaCorrente("test", 0,"123456788",0,"13");
        contaCorente.add(c2);
        System.out.println(contaCorente.get(0).compareTo(contaCorente.get(1)));
        Collections.sort(contaCorente);
        System.out.println(contaCorente.get(0).getNome()+" "+contaCorente.get(1).getNome());
        /*Exercicio 3
        O	que	teria	acontecido	se	a	classe		Conta		não	implementasse		Comparable<Conta>	,	mas	tivesse	o
        método		compareTo	?
        Ocorre o erro pois uma vez que não foi implementado a interface  dando o erro : 
        Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        Syntax error on token "}", delete this token

        at Conta.<init>(Conta.java:27)
        at ContaCorrente.<init>(ContaCorrente.java:3)        at index.main(index.java:6)
        não basta ter so o metodo precisamos da interface
        */ 
        /*Exercicio 4
        Para inverter a lista é usado o reverse(list)
        */
        System.out.println(contaCorente.get(0).getNome()+" "+contaCorente.get(1).getNome());
        Collections.reverse(contaCorente);
        System.out.println(contaCorente.get(0).getNome()+" "+contaCorente.get(1).getNome());
        //como podemos ver ao executar a ordem foi alterada
        
    }


}