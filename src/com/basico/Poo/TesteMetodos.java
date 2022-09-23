package com.basico.Poo;

public class TesteMetodos {
    public static void main(String[] args) {
        Conta contaDoIsaac = new Conta();// a classe e a variavel
        contaDoIsaac.saldo = 100;
        contaDoIsaac.deposita(50);

        System.out.println(contaDoIsaac.saldo);
        boolean conseguiuRetirar =  contaDoIsaac.saca(20);
        System.out.println(contaDoIsaac.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoIsaac);
           if(sucessoTransferencia){
               System.out.println("transferencia feita com sucesso");
           } else {
               System.out.println("faltou dinheiro");
           }
                System.out.println(contaDaMarcela.saldo);
                System.out.println(contaDoIsaac.saldo);

                  contaDoIsaac.titular = "Isaac Maciel";
                System.out.println(contaDoIsaac.titular);

    }
}
