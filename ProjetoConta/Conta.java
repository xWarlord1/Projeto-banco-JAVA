package ProjetoConta;
import javax.swing.JOptionPane;
public class Conta {
	
    private double saldo;
    
    // Setter getter
    
    /*
    public Conta(double saldoV) {
    	saldo = saldoV;
    }*/
    
    
    
    public void depositar(double valor) {
    	try {
    	    if(valor <= 0) {
    		    throw new IllegalArgumentException("Valor menor ou igual a 0");
    	    }
    	    saldo =+ valor;
    	}
    	catch(IllegalArgumentException e) {
    		JOptionPane.showMessageDialog(null, "ERRO: Impossível depositar valor negativo.", "ERRO", JOptionPane.ERROR_MESSAGE);
    	}
    	// Criar exceção se valor for menor ou igual a 0
    	
    }
    
    
    
    public void sacar(double valor) {
    	try {
    	    if(valor > saldo || valor <= 0) {
    		//Erro aqui
    	    	throw new IllegalArgumentException("Valor menor ou igual a 0 OU valor maior que o saldo");
    	    }
    	    saldo =- valor;
    	}
    	catch(IllegalArgumentException e) {
    		System.out.println("erro2");
    	}
    	// Criar exceção se valor for menor ou igual a 0
    }
    
    
    public void atualizarSaldo() { // TESTA ********************************
    	// 8% --> 0.08
    	if(saldo < 0) {
    	   saldo =+ saldo * 0.08;
    	}
    	
    }
    
    // GETTERS E SETTERS
    public double getSaldo() {
    	return saldo;
    }
    public void setSaldo(double saldoV) {
    	saldo = saldoV;
    }
}
