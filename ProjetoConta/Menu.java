package ProjetoConta;
import javax.swing.JOptionPane;
public class Menu {
    private int opcao;
    private String mensagemMenu;
    
    
    public void executar() {
    	
    }
    //Mexi aqui
    protected void executarMenu() {
    	try {
    		if(opcao == -1) {
    			throw new IllegalArgumentException();
    		}
    	}catch(IllegalArgumentException e) {
    		JOptionPane.showMessageDialog(null, "ERRO: OPÇÃO INVÁLIDA", "ERRO", JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    protected void avaliarOpcaoEscolhida() {
    	mensagemMenu = "ERRO: Opção inválida";
    	JOptionPane.showMessageDialog(null, mensagemMenu, "ERRO", JOptionPane.ERROR_MESSAGE);
    }
    
    public int getOpcao() {
    	return this.opcao;
    }
    
    public void setOpcao(int opcaoV) {
    	this.opcao = opcaoV;
    }
    
    public int getexecutarMenu() {
    	return this.opcao;
    }
    
    public void setexecutarMenu(int menuP) {
    	 this.opcao = menuP;
    }
    
}


