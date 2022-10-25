import javax.swing.JOptionPane;

public class Treino {
	
	// Atributos
	private Exercicio[] segunda = new Exercicio[10];
	private Exercicio[] terca = new Exercicio[10];
	private Exercicio[] quarta = new Exercicio[10];
	private Exercicio[] quinta = new Exercicio[10];
	private Exercicio[] sexta = new Exercicio[10];
	
	// Getters e Setters
	public Exercicio[] getSegunda() {
		return segunda;
	}
	public void setSegunda(Exercicio[] segunda) {
		this.segunda = segunda;
	}
	public Exercicio[] getTerca() {
		return terca;
	}
	public void setTerca(Exercicio[] terca) {
		this.terca = terca;
	}
	public Exercicio[] getQuarta() {
		return quarta;
	}
	public void setQuarta(Exercicio[] quarta) {
		this.quarta = quarta;
	}
	public Exercicio[] getQuinta() {
		return quinta;
	}
	public void setQuinta(Exercicio[] quinta) {
		this.quinta = quinta;
	}
	public Exercicio[] getSexta() {
		return sexta;
	}
	public void setSexta(Exercicio[] sexta) {
		this.sexta = sexta;
	}
	
	// Métodos
	public void crieTreino() {
		int resposta;
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja criar treino para a segunda-feira?", 
				"Criar Treino", JOptionPane.YES_NO_OPTION);
		if(resposta == JOptionPane.YES_OPTION) {
			for(int i = 0; i < 10 && resposta == JOptionPane.YES_OPTION; i++) {
				segunda[i] = new Exercicio();
				segunda[i].leiaExercicio();
				resposta = JOptionPane.showConfirmDialog(null, "Deseja acrescentar um exercício para a segunda-feira?", 
						"Criar novo exercicio", JOptionPane.YES_NO_OPTION);
			}
		}
		resposta = JOptionPane.showConfirmDialog(null, "Deseja criar treino para a terça-feira?", 
				"Criar Treino", JOptionPane.YES_NO_OPTION);
		if(resposta == JOptionPane.YES_OPTION) {
			for(int i = 0; i < 10 && resposta == JOptionPane.YES_OPTION; i++) {
				terca[i] = new Exercicio();
				terca[i].leiaExercicio();
				resposta = JOptionPane.showConfirmDialog(null, "Deseja acrescentar um exercício para a terça-feira?", 
						"Criar novo exercicio", JOptionPane.YES_NO_OPTION);
			}
		}
		resposta = JOptionPane.showConfirmDialog(null, "Deseja criar treino para a quarta-feira?", 
				"Criar Treino", JOptionPane.YES_NO_OPTION);
		if(resposta == JOptionPane.YES_OPTION) {
			for(int i = 0; i < 10 && resposta == JOptionPane.YES_OPTION; i++) {
				quarta[i] = new Exercicio();
				quarta[i].leiaExercicio();
				resposta = JOptionPane.showConfirmDialog(null, "Deseja acrescentar um exercício para a quarta-feira?", 
						"Criar novo exercicio", JOptionPane.YES_NO_OPTION);
			}
		}
		resposta = JOptionPane.showConfirmDialog(null, "Deseja criar treino para a quinta-feira?", 
				"Criar Treino", JOptionPane.YES_NO_OPTION);
		if(resposta == JOptionPane.YES_OPTION) {
			for(int i = 0; i < 10 && resposta == JOptionPane.YES_OPTION; i++) {
				quinta[i] = new Exercicio();
				quinta[i].leiaExercicio();
				resposta = JOptionPane.showConfirmDialog(null, "Deseja acrescentar um exercício para a quinta-feira?", 
						"Criar novo exercicio", JOptionPane.YES_NO_OPTION);
			}
		}
		resposta = JOptionPane.showConfirmDialog(null, "Deseja criar treino para a sexta-feira?", 
				"Criar Treino", JOptionPane.YES_NO_OPTION);
		if(resposta == JOptionPane.YES_OPTION) {
			for(int i = 0; i < 10 && resposta == JOptionPane.YES_OPTION; i++) {
				sexta[i] = new Exercicio();
				sexta[i].leiaExercicio();
				resposta = JOptionPane.showConfirmDialog(null, "Deseja acrescentar um exercício para a sexta-feira?", 
						"Criar novo exercicio", JOptionPane.YES_NO_OPTION);
			}
		}
	}
	public void orienteTreino() {
		String [] dias = {"segunda",  "terça", "quarta", "quinta", "sexta"};
		int resposta = JOptionPane.showOptionDialog(null, "Que dia é hoje?", "Iniciar treino", 0, 
				JOptionPane.QUESTION_MESSAGE, null, dias, "segunda");
		switch(resposta) {
		case 0:
			for (int i = 0; i < 10 && segunda[i] != null; i++) {
				segunda[i].orienteExercicio();
			}
			break;
		case 1:
			for (int i = 0; i < 10 && terca[i] != null; i++) {
				terca[i].orienteExercicio();
			}
			break;
		case 2:
			for (int i = 0; i < 10 && quarta[i] != null; i++) {
				quarta[i].orienteExercicio();
			}
			break;
		case 3:
			for (int i = 0; i < 10 && quinta[i] != null; i++) {
				quinta[i].orienteExercicio();
			}
			break;
		case 4:
			for (int i = 0; i < 10 && sexta[i] != null; i++) {
				sexta[i].orienteExercicio();
			}
			break;
		}
	}
}
