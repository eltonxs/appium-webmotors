package br.com.webmotors.steps;

import br.com.webmotors.funcionalidade.HomeFuncionalidade;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class BuscarSteps {
	HomeFuncionalidade home = new HomeFuncionalidade();

	@Quando("que estou na tela de busca")
	public void que_estou_na_tela_de_busca() {
		home.clicarbuscar();
	}

	@Entao("realizo pesquisa")
	public void realizo_pesquisa() {

	}
}
