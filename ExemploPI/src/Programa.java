import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		String [] opcoes = {"Criar treino", "Fazer treino", "Sair"};
		Treino treino = new Treino();
		int resposta = JOptionPane.showOptionDialog(null, "O que você deseja fazer?", 
				"Assistente de Treino", 0, JOptionPane.QUESTION_MESSAGE, 
				null, opcoes, opcoes[1]);
		while(resposta != 2) {
			switch (resposta) {
			case 0:
				treino.crieTreino();
				break;
			case 1:
				treino.orienteTreino();
				break;
			}
			resposta = JOptionPane.showOptionDialog(null, "O que você deseja fazer?", 
					"Assistente de Treino", 0, JOptionPane.QUESTION_MESSAGE, 
					null, opcoes, opcoes[1]);
		}

	}

}
