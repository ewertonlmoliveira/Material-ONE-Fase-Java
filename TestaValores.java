public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 827654);

        System.out.println(conta.getAgencia());

        conta.setAgencia(827675);

        Conta conta2 = new Conta(1337, 867543);
        Conta conta3 = new Conta(3343, 766524);

        System.out.println(Conta.getTotal());

    }
}
