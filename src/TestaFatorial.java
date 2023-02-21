public class TestaFatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for(int contador = 1; contador < 11; contador++) {
                fatorial = fatorial * contador;
            System.out.println("Fatorial de " + contador + " = " + fatorial);
            }

        }
}
