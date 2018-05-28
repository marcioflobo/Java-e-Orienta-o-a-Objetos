
package com.wolf.pagamento.operadoras;

import com.wolf.compras.Cartao;
import com.wolf.interfaces.pagamento.Autorizavel;
import com.wolf.interfaces.pagamento.Operadora;


public class Cielo implements Operadora{

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
  
        return cartao.getNumeroCartao().startsWith("123") && autorizavel.getValorTotal() <100;
    }
    
}
