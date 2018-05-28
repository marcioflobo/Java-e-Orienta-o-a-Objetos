/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marci
 */
public class ProdutoPerecivel extends Produto{

    
    String dataValidade;
  
    @Override
    public void imprimirDescricao() {
        System.out.println("Descrição: "+super.getDescricao()+"\nVencimento:"+dataValidade);
    }
    
}
