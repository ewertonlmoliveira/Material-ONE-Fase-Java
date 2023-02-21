import javax.management.PersistentMBean;

public class TestaWhile {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
               //contador = contador + 1;
               //contador += 1;
                 contador++;
        }
        System.out.println(contador);
        //System.out.println(contador); Este devolve o valor 11 também, não há incremento.

    }
}
