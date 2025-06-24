import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Dono da conta: ");
        String dono =  sc.nextLine();
        System.out.printf("Tipo da conta: ");
        String tipo = sc.next();      // CC ou CP


        Conta minhaConta = new Conta(tipo,dono);       // tipo String que recebe o valor cc ou cp -> try cacth dando erro?
        minhaConta.abrirConta();
        minhaConta.fecharConta();

        minhaConta.getNumConta();
        System.out.println(minhaConta.getNumConta());
        System.out.println(minhaConta.getSaldo());

        minhaConta.pagarMensal();

        System.out.println(minhaConta.getSaldo());

        minhaConta.depositar(200);
        System.out.println(minhaConta.getSaldo());

    }
}