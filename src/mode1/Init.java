package mode1;

public class Init extends AbstractStateM1 {
	
	// Events g�n�ral

	@ Override
	public AbstractStateM1 startVITIPI() {
		return this;
	}
	
	@ Override
	public AbstractStateM1 clickMenu() {
		return new MenuOuvertSansBo();
	}
}
