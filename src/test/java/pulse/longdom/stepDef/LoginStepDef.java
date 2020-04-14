package pulse.longdom.stepDef;

import io.cucumber.java.en.Given;
import pulse.longdom.LoginPage;

public class LoginStepDef {

	LoginPage login = new LoginPage();
	@Given("^Launch application$")
	public void launchApp() throws Exception{
		login.loginToApp();
	}

}
