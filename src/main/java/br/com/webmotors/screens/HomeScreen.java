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

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.TextView[2]")
	MobileElement buscarMarca;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView")
	MobileElement selecionarMarca;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[10]/android.widget.TextView[1]")
	MobileElement verAnuncio;

	public MobileElement geverAnuncio() {
		return verAnuncio;
	}

	public void setBtnPularLogin(MobileElement btnPularLogin) {
		this.btnPularLogin = btnPularLogin;
	}

	public void setBtncheckbox(MobileElement btncheckbox) {
		this.btncheckbox = btncheckbox;
	}

	public void setBtndialog(MobileElement btndialog) {
		this.btndialog = btndialog;
	}

	public void setBuscarAqui(MobileElement buscarAqui) {
		this.buscarAqui = buscarAqui;
	}

	public void setBuscarMarca(MobileElement buscarMarca) {
		this.buscarMarca = buscarMarca;
	}

	public void setSelecionarMarca(MobileElement selecionarMarca) {
		this.selecionarMarca = selecionarMarca;
	}

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

	public MobileElement getbuscarMarca() {
		return buscarMarca;
	}

	public MobileElement getselecionarMarca() {
		return selecionarMarca;
	}

	public MobileElement getverAnuncio() {
		return verAnuncio;
	}

}
