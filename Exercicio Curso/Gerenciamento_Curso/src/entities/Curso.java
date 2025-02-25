package entities;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nome;
	private String codigo;
	List<Aluno> alunos;

	public Curso(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
		this.alunos = new ArrayList<>();
	}

	public Curso(String nome, String codigo, List<Aluno> alunos) {
		this.nome = nome;
		this.codigo = codigo;
		this.alunos = new ArrayList<>(alunos);
	}

	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public void removerAluno(String matricula) {
		alunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
	}

	public void exibirAlunos() {
		if (alunos.isEmpty()) {
	        System.out.println("Nenhum aluno matriculado neste curso.");
	        return; 
	    }    
	    for (Aluno aluno : alunos) {
	        aluno.infoAluno(); 
	        System.out.println(); 
	    }

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
