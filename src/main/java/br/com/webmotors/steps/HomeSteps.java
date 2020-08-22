package br.com.webmotors.steps;

import br.com.webmotors.funcionalidade.HomeFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class HomeSteps {
	HomeFuncionalidade home = new HomeFuncionalidade();
     
	
	@Dado("que entro no app")
	public void que_entro_no_app() {
		home.esperarPorElementoVisivel();
		home.clicarPularLogin();
        home.clicarCheckbox();
        home.clicarDialog();
	}

	@Quando("visito a tela home")
	public void visito_a_tela_home() {
        
	}

	
	@Entao("a home e apresentada com sucesso")
	public void a_home_e_apresentada_com_sucesso() {
	
	}

}
