package PACOTE1;

import java.util.List;

public class Disciplina {
	
	int id;
	String nome;
	List<String> comentarios;
	int likes;
	double nota;
	
	public Disciplina(int id, String nome, List<String> comentarios, int likes, double nota) {
		this.id = id;
		this.nome = nome;
		this.comentarios = comentarios;
		this.likes = likes;
		this.nota = nota;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<String> comentarios) {
		this.comentarios = comentarios;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
}