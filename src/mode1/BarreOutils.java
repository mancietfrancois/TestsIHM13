package mode1;

public class BarreOutils extends AbstractStateM1 {
	
	BarreOutils() {
		
	}
	
	// Events général
	@ Override
	public AbstractStateM1 clickMenu() {
		return new MenuOuvertBo();
	}
	
	// Events item

	@ Override
	public AbstractStateM1 eventProfils() {
		return this;
	}

	@ Override
	public AbstractStateM1 eventGomme() {
		return this;
	}

	@ Override
	public AbstractStateM1 eventVoice() {
		return this;
	}

	@ Override
	public AbstractStateM1 eventDico() {
		return this;
	}
	
	public AbstractStateM1 eventChargerDico() {
		//goToMode2();
		return this;
	}

	@ Override
	public AbstractStateM1 eventSaveProfile() {
		return this;
	}

	@ Override
	public AbstractStateM1 eventClavier() {
		return this;
	}

	@ Override
	public AbstractStateM1 eventMoveBarre() {
		return this;
	}

	@ Override
	public AbstractStateM1 eventRelecture() {
		return this;
	}

	@ Override
	public AbstractStateM1 clickStop() {
		return new Stop();
	}

}
