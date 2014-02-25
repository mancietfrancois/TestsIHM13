package state.mode1;

public class Stop extends AbstractStateM1{

	@ Override
	public AbstractStateM1 clickStop() {
		return new BarreOutils();
	}
}
