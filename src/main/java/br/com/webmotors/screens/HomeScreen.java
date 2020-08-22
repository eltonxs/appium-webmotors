package br.com.webmotors.screens;

import br.com.webmotors.driver.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen extends BaseScreen {

	@AndroidFindBy(id = "hands.android.webmotors:id/btSkipLogin")
	MobileElement btnPularLogin;

	@AndroidFindBy(id = "hands.android.webmotors:id/checkbox_dialog")
	MobileElement btncheckbox;

	@AndroidFindBy(id = "hands.android.webmotors:id/button_dialog")
	MobileElement btndialog;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Buscar\"]/android.view.ViewGroup/android.widget.TextView")
	MobileElement buscarAqui;

	public MobileElement getBtnPularLogin() {
		return btnPularLogin;
	}

	public MobileElement getBtncheckbox() {
		return btncheckbox;
	}

	public MobileElement getBtndialog() {
		return btndialog;
	}

	public MobileElement getBuscarAqui() {
		return buscarAqui;
	}
}
