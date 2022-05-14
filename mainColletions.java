import java.util.*;

public class mainColletions {
    public static void main(String[] args){
        List<Integer> testeArrayList = new ArrayList<>();
        List<Integer> testeLinkedList = new LinkedList<>();

        long tempInicio1 = System.currentTimeMillis();
        int total = 30000;
        for (int i = 0; i < total; i++) {
            testeArrayList.add(i);
        }
        long tempfim1 = System.currentTimeMillis();

        long tempinicio2 = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            testeArrayList.contains(i);
        }
        long tempfim2 = System.currentTimeMillis();
        long tempo1 = tempfim1 - tempInicio1;
        long tempo2 = tempfim2 - tempinicio2;

        System.out.println("Tempo gasto inserção ArrayList: " + tempo1 + " ms");
        System.out.println("Tempo gasto busca ArrayList: " + tempo2 + " ms");

        long tempInicio3 = System.currentTimeMillis();
        int totalL = 30000;
        for (int i = 0; i < totalL; i++) {
            testeLinkedList.add(i);
        }
        long tempfim3 = System.currentTimeMillis();

        long tempinicio4 = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            testeLinkedList.contains(i);
        }
        long tempfim4 = System.currentTimeMillis();
        long tempo3 = tempfim3 - tempInicio3;
        long tempo4 = tempfim4 - tempinicio4;

        System.out.println("Tempo gasto inserção LinkedList: " + tempo3 + " ms");
        System.out.println("Tempo gasto busca LinkedList: " + tempo4 + " ms");
    
    //}
    /*exe 1
    é mais lemto a buscar 30mil  uma vez que tem que percorrer a lista até encontrar o elemento
    trocando pelo hashe o tempo diminui
    */
    ContaCorrente	c1	=	new	ContaCorrente("teste", 0,"123456789",0,"12");
    c1.deposita(1000.00);

	ContaCorrente	c2	=	new	ContaCorrente("teste2", 0,"123456789",0,"12");
	c2.deposita(3000.00);
	//	cria	o	mapa
	Map<String, Conta> mapaDeContas = new HashMap<>();

	//	adiciona	duas	chaves	e	seus	valores
	mapaDeContas.put("diretor",	c1);
	mapaDeContas.put("gerente",	c2);
	//	qual	a	conta	do	diretor?
	Conta	contaDoDiretor	=	(Conta)	mapaDeContas.get("diretor");
	System.out.println(contaDoDiretor.getSaldo());


        }
    }
