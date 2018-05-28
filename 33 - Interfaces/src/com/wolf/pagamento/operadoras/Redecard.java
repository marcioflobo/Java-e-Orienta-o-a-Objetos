/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wolf.pagamento.operadoras;

import com.wolf.compras.Cartao;
import com.wolf.interfaces.pagamento.Autorizavel;
import com.wolf.interfaces.pagamento.Operadora;

/**
 *
 * @author marci
 */
public class Redecard implements Operadora {

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("456")
                && autorizavel.getValorTotal() < 200;
    }

}
