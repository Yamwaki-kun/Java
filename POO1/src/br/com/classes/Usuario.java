package br.com.classes;

public class Usuario {
	// Declara��o dos atributos do usu�rio
public String login;
public String senha;

	// Declara��o do m�todos da classe Usu�rio
public String cadastrar() {
		return ("Cadastro Realizado com sucesso!");

	}

	// Declara��o do m�todo logar para permitir o acesso ao sistema
public String logar() {
	String msg="";
		if (login.equals("adm") && senha.equals("123")) {
			msg = "Bem Vindo";
		} else {
			msg = "Login ou senha incorreto";
		}
		return msg;
	}

	// Declara��o do m�todo logout
public String logout() {
		return ("voc� saiu do aplicativo");
	}
}
