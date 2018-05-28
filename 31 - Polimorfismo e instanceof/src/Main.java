
import com.wolf.contas.Conta;
import com.wolf.contas.ContaCorrente;
import com.wolf.contas.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(4000);
        imprimirSaldo(conta);
        
        System.out.println();
        Conta contaCorrente =  new ContaCorrente();
        contaCorrente.setSaldo(3500);
        
        imprimirSaldo(contaCorrente);
        System.out.println();
        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(5000);
        imprimirSaldo(contaPoupanca);
        
    }

    public static void imprimirSaldo(Conta conta) {
        System.out.println("Saldo da conta: R$" + conta.getSaldo());
        
        if(conta instanceof ContaCorrente){
            ContaCorrente cc = (ContaCorrente) conta;
            System.out.println("O  Limite da cc é R$ "+cc.getLimite());
        }
        
        if(conta instanceof ContaPoupanca){
            ContaPoupanca cp = (ContaPoupanca) conta;
            System.out.println("O Rendimento da CP é R$"+cp.getRendimentos());
        }
        
        
    }

}
