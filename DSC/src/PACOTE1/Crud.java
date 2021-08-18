package PACOTE1;

import java.util.HashMap;

public class Crud {
	
	HashMap<Integer, Usuario> users;
	
	private Crud() {
		this.users = new HashMap<Integer, Usuario>();
	}
	
	private void createUser(int id, String nome, String email, String senha) {
		Usuario u = new Usuario(id,nome,email,senha);
		this.users.put(id,u);
	}
	
	private Usuario readUser(int id) {
		return this.users.get(id);
	}
	
	private void updateUserNome(int id, String novoNome) {
		this.users.get(id).setNome(novoNome);
	}
	
	private void updateUserEmail(int id, String novoEmail) {
		this.users.get(id).setEmail(novoEmail);
	}
	
	private void updateUserSenha(int id, String novaSenha) {
		this.users.get(id).setSenha(novaSenha);
	}
	
	private void deleteUser(int id) {
		this.users.remove(id);
	}
	
}
