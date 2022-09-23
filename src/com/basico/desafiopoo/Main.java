package com.basico.desafiopoo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws ExceptionDoSaldo {
        try {

            ContaCorrente contaCorrenteDoJõao = new ContaCorrente(); // criando a conta do cliente

            contaCorrenteDoJõao.setCliente("João"); // nome do cliente

            contaCorrenteDoJõao.setSaldo(new BigDecimal (1000.00)); // saldo atual do cliente

            CaixaEletronico caixaEletronicoDoJoão = new CaixaEletronico();

            caixaEletronicoDoJoão.sacarSaldo(contaCorrenteDoJõao,new BigDecimal(600.00)); // valor a ser sacado da conta do cliente

            caixaEletronicoDoJoão.deposito(contaCorrenteDoJõao, new BigDecimal(1000.00)); // quero depositar na conta do cliente

            contaCorrenteDoJõao.logarSaldoAtual();

            //HashMap<String, BigDecimal> valoresExatos = new HashMap<String, BigDecimal>();
           // valoresExatos.put(contaCorrenteDoJõao.getCliente(), contaCorrenteDoJõao.getSaldo());
            //System.out.println(valoresExatos);

        } catch (ExceptionDoSaldo e){
            System.out.println(e.getMessage());
        } catch (ExceptionDoDeposito e) {
            System.out.println(e.getMessage());
        }
    }
}
