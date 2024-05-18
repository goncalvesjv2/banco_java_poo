package banco_poo_java;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
    
    @Override
    public void imprimirExtrato(){
        System.out.println("Extrato conta poupança");
        super.imprimirInfos();
    }
}