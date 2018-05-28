package com.wolf.compras;


import com.wolf.compras.Cartao;
import com.wolf.compras.Compra;
import com.wolf.impressoras.Impressora;
import com.wolf.interfaces.pagamento.Operadora;


public class Checkout {
    
    private Operadora operadora;
    private Impressora impressora;

    public Checkout(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }
    
    public void fecharComprar(Compra compra, Cartao cartao){
        boolean autorizado = this.operadora.autorizar(compra, cartao);
        
        if(autorizado){
            this.impressora.imprimir(compra);
        }else{
            System.out.println("O Pagamento não foi autorizado!");
        }
    }
    
}
