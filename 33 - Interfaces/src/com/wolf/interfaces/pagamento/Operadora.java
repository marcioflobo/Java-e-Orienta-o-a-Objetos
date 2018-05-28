
package com.wolf.interfaces.pagamento;

import com.wolf.compras.Cartao;


public interface Operadora {
    
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
