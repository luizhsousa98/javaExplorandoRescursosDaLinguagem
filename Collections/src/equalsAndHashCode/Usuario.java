package equalsAndHashCode;

public class Usuario {
	private String nome;
	private String email;

	public Usuario(final String nome, final String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			return super.equals(outro);
		} else {
			return false;
		}
	}
}
