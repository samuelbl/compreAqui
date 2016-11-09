package br.com.compreAqui.modelo;

import java.util.List;

import br.com.compreAqui.dao.UsuarioDAO;

public class teste {

		public static void main (String[]args){
			Usuario usuario = new Usuario("bristot@gmail.com","teste");
			UsuarioDAO.getInstance().adiciona(usuario);
			//Usuario usuario2 = new Usuario("bristot@gmail.com","teste");
			List<Usuario> usuario3 = UsuarioDAO.getInstance().listaTodos();
			for (Usuario usuario4 : usuario3) {
				System.out.println(usuario4.getEmail() + " - " + usuario4.getId());
			}
			
		}
}
