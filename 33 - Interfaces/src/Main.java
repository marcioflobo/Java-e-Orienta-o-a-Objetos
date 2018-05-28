
import com.wolf.impressoras.Epson;
import com.wolf.compras.Checkout;
import com.wolf.compras.Cartao;
import com.wolf.pagamento.operadoras.Cielo;
import com.wolf.compras.Compra;
import com.wolf.impressoras.Impressora;
import com.wolf.interfaces.pagamento.Operadora;


public class Main {

    public static void main(String[] args) {
        Operadora operadora = new Cielo();
        Impressora impressora =new Epson();
        
        Cartao cartao = new Cartao();
        cartao.setNomeTitular("Joao");
        cartao.setNumeroCartao("1234");
        
        Compra compra = new Compra();
        compra.setNomeCliente(cartao.getNomeTitular());
        compra.setProduto("Sabão");
        compra.setValorTotal(4.5);
        
        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharComprar(compra, cartao);
        
    }

}
