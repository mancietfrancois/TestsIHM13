package state.mode2;

public abstract class AbstractStateM2 {
	
	// Déplacements internes
	
	public AbstractStateM2 clickDicoParam() {
		return new Dico();
	}
	
	public AbstractStateM2 clickClavierParam() {
		return new Clavier();
	}
	
	public AbstractStateM2 clickCorrectionsParam() {
		return new Corrections();
	}
	
	public AbstractStateM2 clickBarreOutilsParam() {
		return new BarreOutilsParam();
	}
	
	public AbstractStateM2 clickProfilsParam() {
		return new Profils();
	}
	
	public AbstractStateM2 clickRetoursParam() {
		return new Retours();
	}
	
	// Validation
	
	public AbstractStateM2 valider() {
		//goToM1();
		return new Dico();
	}
	
	public AbstractStateM2 annuler() {
		//goToM1();
		return new Dico();
	}
}
