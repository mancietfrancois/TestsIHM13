package mode1;

public class MenuOuvertSansBo extends AbstractStateM1 {
	
	// Events général

	@ Override
	public AbstractStateM1 clickOut() {
		return new Init();
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
		//goToMode2(Dico);
		return this;
	}

	@ Override
	public AbstractStateM1 eventBarreOutils() {
		return new BarreOutils();
	}

	@ Override
	public AbstractStateM1 clickEteindre() {
		return null;
	}
}
