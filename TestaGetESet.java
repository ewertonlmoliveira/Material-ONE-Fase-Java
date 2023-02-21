public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 827654);
        //conta.numero(1337) Forma impossibilitada, pois o atributo é privado.
        //conta.setNumero(1337); Com o construtor, não foi necessário invocar o set.
        System.out.println(conta.getNumero());

        Cliente ewerton = new Cliente();
        //conta.titular = ewerton Forma impossibilitada, pois o atributo é privado.
        conta.setTitular(ewerton);

        ewerton.setNome("Ewerton Oliveira");

        System.out.println(conta.getTitular().getNome()); //Forma de imprimir dentro da referência após gets e sets
        conta.getTitular().setProfissao("auditor");
        System.out.println(conta.getTitular().getProfissao());
        conta.deposita(100);
        System.out.println(conta.getSaldo());
        boolean teste = (conta.deposita(1));
        System.out.println(teste);
        System.out.println(conta.getSaldo());

        conta.setNumero(-1923);
    }
}
