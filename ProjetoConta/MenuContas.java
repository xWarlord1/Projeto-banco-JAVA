package ProjetoConta;

import javax.swing.JOptionPane;

public class MenuContas extends Menu {
	
	// Isaac esteve aqui B)
	
    
    private ContaCorrente contaCC = new ContaCorrente(1000, 500);
    private ContaPoupanca contaCP = new ContaPoupanca(5000, 1);
    
    String[] opc = {"SAIR", "CONTA CORRENTE", "CONTA POUPANÇA"};
    
    String[] opcCC = {"Voltar", "Consultar Saldo", "Depositar", "Sacar", "Atualizar Saldo"};
    
    protected void executarMenu() {
    	//asoufaof
    	
        super.setOpcao(JOptionPane.showOptionDialog(null, "Escolha um tipo de conta", "teste", 0, JOptionPane.PLAIN_MESSAGE,null, opc, opc[0]));
        super.executarMenu();
        avaliarOpcaoEscolhida();
       	//System.out.println(super.getOpcao());
    }
    
    private void operarContaCP() {
    	
    }
    // Verificar se a retirada do super resultará em erro
    protected void avaliarOpcaoEscolhida() {
    	switch(super.getOpcao()) {
    		case 0:
    		    
    		break;
    	
    		case 1:
    		    operarContaCC();
    		break;
    	
    		case 2:
    		    operarContaCP();
    		break;
    		
    		default:
    			
    		break;
    	}
    	
    	
    }
    private void operarContaCC() {
    	
    	
    // String valorS = "";
   	 super.setOpcao(JOptionPane.showOptionDialog(null, "Escolha o que deseja fazer", "Menu Principal",0, JOptionPane.PLAIN_MESSAGE,null ,opcCC, opcCC [0]));
   	 super.executarMenu(); // do while
   	switch (getOpcao()) {
   	case 0:
   		
   		break;
   	case 1:
   		 
   		JOptionPane.showMessageDialog(null, contaCC.toString(), "Dados Conta", JOptionPane.WARNING_MESSAGE);
   		
   		break;
   	case 2:
   		
   		// DEPÓSITO		
   		
   		// BLOCO DE VERIFICAÇÃO DE ERROS****************************
   		String valorS = "";
   		double valor = 0;
   		try {
   			  valorS = JOptionPane.showInputDialog(null, "Digite o valor que deseja depositar:");
   			 
   			 if(valorS == null) {
   		        throw new IllegalArgumentException();
   			 }
   	         valor = Double.parseDouble(valorS);
   	         
   		} catch(NumberFormatException e) {
   			if(valorS.equals("")) {
   				//Se o usuário não digitar nada
   				JOptionPane.showMessageDialog(null, "ERRO: Valor de depósito não informado.", "ERRO", JOptionPane.ERROR_MESSAGE);
   			}else {
   				// Se o usuário digitar um caracter inválido
   			    JOptionPane.showMessageDialog(null, "ERRO: Valor de depósito inválido.", "ERRO", JOptionPane.ERROR_MESSAGE);
   			}
   		} catch(IllegalArgumentException e) {
   			
   			JOptionPane.showMessageDialog(null, "ERRO: Valor de depósito não informado.", "ERRO", JOptionPane.ERROR_MESSAGE);
   		}
   		//***********************************************
   		
   		contaCC.depositar(valor);
   		
   		break;
   	case 3:
   		
   		break;
   	case 4:
   		
   		break;
   	case 5:
   		
   		break;
   		
   	
   	}
   }

	public ContaCorrente getContaCC() {
		return contaCC;
	}

	public void setContaCC(ContaCorrente contaCC) {
		this.contaCC = contaCC;
	}

	public ContaPoupanca getContaCP() {
		return contaCP;
	}

	public void setContaCP(ContaPoupanca contaCP) {
		this.contaCP = contaCP;
	}
   
    
    
    
}
