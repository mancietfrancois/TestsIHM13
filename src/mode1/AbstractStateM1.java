package mode1;

public abstract class AbstractStateM1 {

	// --------------------- Mode 1 --------------------
	
	// Events général
	
	public AbstractStateM1 startVITIPI() {
		return this;
	}
	
	public AbstractStateM1 clickMenu() {
		return this;
	}
	
	public AbstractStateM1 clickOut() {
		return this;
	}
	
	// Events menu & barre item
	
	public AbstractStateM1 eventProfils() {
		return this;
	}
	
	public AbstractStateM1 eventGomme() {
		return this;
	}
	
	public AbstractStateM1 eventVoice() {
		return this;
	}
	
	public AbstractStateM1 eventDico() {
		return this;
	}
	
	public AbstractStateM1 eventChargerDico() {
		return this;
	}

	// Events menu item
	
	public AbstractStateM1 eventBarreOutils() {
		return this;
	}
	
	public AbstractStateM1 clickEteindre() {
		return this;
	}
	
	// Events barre item
	
	public AbstractStateM1 eventSaveProfile() {
		return this;
	}
	
	public AbstractStateM1 eventClavier() {
		return this;
	}
	
	public AbstractStateM1 eventMoveBarre() {
		return this;
	}

	public AbstractStateM1 eventRelecture() {
		return this;
	}
	
	public AbstractStateM1 clickStop() {
		return this;
	}
	
}
