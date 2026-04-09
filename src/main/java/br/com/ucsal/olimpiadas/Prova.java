package br.com.ucsal.olimpiadas;

public class Prova {

	private long id;
	private String titulo;

	public Prova(long id, String titulo) {
    this.id = id;
    setTitulo(titulo);
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
    if (titulo == null || titulo.isBlank()) {
        throw new IllegalArgumentException("Título obrigatório");
    }
    this.titulo = titulo;
}
}