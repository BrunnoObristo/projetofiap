
public class Curso {
	private String nome;
	private String cargaHoraria;
	private Disciplina disciplina;
	private String tipo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setTudo(String pNome, String pCargaHoraria, Disciplina pDisciplina, String pTipo) {
		this.nome = pNome;
		this.cargaHoraria = pCargaHoraria;
		this.disciplina = pDisciplina;
		this.tipo = pTipo;
	}
	
	public String getTudo() {
		return "Nome:" + nome + "Carga horaria:" + cargaHoraria + "Disciplina:" + disciplina + "Tipo:" + tipo;
	}
	
}
