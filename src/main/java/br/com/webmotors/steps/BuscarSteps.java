package br.com.webmotors.steps;

import br.com.webmotors.funcionalidade.HomeFuncionalidade;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class BuscarSteps {
	HomeFuncionalidade home = new HomeFuncionalidade();
	private String comments;

	@Quando("que estou na tela de busca")
	public void que_estou_na_tela_de_busca() {
		home.clicarbuscar();
		home.buscarMarca();
		home.selecionarMarca();
		home.verAnuncio();

	}

	@Entao("realizo pesquisa")
	public void realizo_pesquisa() {

	}
}
