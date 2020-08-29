package br.com.webmotors.funcionalidade;

import br.com.webmotors.screens.HomeScreen;

public class HomeFuncionalidade {

	HomeScreen home = new HomeScreen();

	public HomeFuncionalidade() {
		home = new HomeScreen();
	}

	public void esperarPorElementoVisivel() {
		home.esperarPorElementoVisivel();
	}

	public void clicarPularLogin() {
		home.getBtnPularLogin().click();
	}

	public void clicarCheckbox() {
		home.getBtncheckbox().click();
	}

	public void clicarDialog() {
		home.getBtndialog().click();
	}

	public void clicarbuscar() {
		home.getBuscarAqui().click();
	}

	public void buscarMarca() {
		home.getbuscarMarca().click();
	}

	public void selecionarMarca() {
		home.getselecionarMarca().click();
	}

	public void verAnuncio() {
		home.getverAnuncio().click();
	}

}
