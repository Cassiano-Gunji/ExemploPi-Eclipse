import javax.swing.JOptionPane;

public class Exercicio {

	// Atributos
	private String nome;
	private int series;
	private int repeticoes;
	
	// Getters e Setters - Servem para garantir a integridade dos dados
	// armazenados nos atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSeries() {
		return series;
	}
	public void setSeries(int series) {
		// Garante que apenas valores sensatos sejam armazenados
		if (series >= 2 && series <= 5) {
			this.series = series;
		}
	}
	public int getRepeticoes() {
		return repeticoes;
	}
	public void setRepeticoes(int repeticoes) {
		// Garante que apenas valores sensatos sejam armazenados
		if (repeticoes >= 5 && repeticoes <= 30) {
			this.repeticoes = repeticoes;
		}
	}
	
	// Construtores
	public Exercicio() {
		// Chama o construtor com parâmetros
		this("Exercício indefinido", 3, 15);
	}
	
	// Métodos
	public Exercicio(String nome, int series, int repeticoes) {
		setNome(nome);
		setSeries(series);
		setRepeticoes(repeticoes);
	}
	public void leiaExercicio() {
		setNome(JOptionPane.showInputDialog(null, "Qual o nome do exercício?", "Criação de exercício", 
				JOptionPane.QUESTION_MESSAGE));
		setSeries(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas séries de " + getNome() + "?", 
				"Criação de exercício", JOptionPane.QUESTION_MESSAGE)));
		setRepeticoes(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas repetições por série de " + getNome() + "?", 
				"Criação de exercício", JOptionPane.QUESTION_MESSAGE)));
	}
	public String escrevaExercicio() {
		return "Exercicio: " + getNome() + "\nSéries: " + getSeries() + "\nRepetições: " + getRepeticoes();
	}
	public void imprimeExercicio() {
		JOptionPane.showMessageDialog(null, escrevaExercicio(), "Exercício", JOptionPane.INFORMATION_MESSAGE);
	}
	public void orienteExercicio() {
		for(int i = 1; i <= getSeries(); i++) {
			JOptionPane.showMessageDialog(null, escrevaExercicio() + "\n\nFaça a série " + i + ".", getNome(), 
					JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Descanse.", getNome(), JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
