package ProjetoConta;

public class ContaCorrente extends Conta {
	
    
   /* public ContaCorrente() {
    	
    }*/
	private double limiteEspecial;
	// R$ 500
	public ContaCorrente(double limiteS, double saldo) {
	    this.setSaldo(saldo);
	    limiteEspecial = limiteS;
	   // limiteEspecial *= -1;
	}
	
	
	public void sacar(double valor) {
		double saldoTotal = this.getSaldo() + limiteEspecial;
		try {
		    if(valor <= 0 || valor > saldoTotal) {
		      throw new IllegalArgumentException("erro");    
		    }
		
		    this.setSaldo(getSaldo() - valor);
		}catch(IllegalArgumentException e) {
			System.out.println("erro3");
		}
	}
	
	public String toString() {
		return "Saldo: " + this.getSaldo() + "\nLimite especial: " + limiteEspecial;
	}
    
}
