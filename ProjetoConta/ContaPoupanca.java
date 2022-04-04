package ProjetoConta;

public class ContaPoupanca extends Conta {
    private double reajusteMensal;
    // %3 -> 0.03 
    
    
    public ContaPoupanca(double saldoV, double reajusteV) {
    	this.setSaldo(saldoV);
    	reajusteMensal = reajusteV;
    }
    
    public void atualizarSaldo() {
    	
    }                       
    
    
                                //PORCENTAGEM
    public void atualizarSaldo(double reajuste) {
    	try {
    	    if(reajuste <= 0) {
    	    	throw new IllegalArgumentException("asf");
    	    }
    	    reajusteMensal = reajuste;
    	    
    	    this.setSaldo(this.getSaldo() + (this.getSaldo() * (reajuste / 100)));
    	
    	}catch(IllegalArgumentException e) {
    		System.out.println("Erro45");
    	}
    }
    
    public String toString() {
    	return "Saldo: " + this.getSaldo() + "\nPorcentagem de reajuste mensal: " + reajusteMensal + "%";
    }
}
