package practice1;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class DummyTicker extends TickerBehaviour {

	public DummyTicker(Agent a, long period) {
		super(a, period);
	}

	@Override
	protected void onTick() {
		// TODO Auto-generated method stub
		System.err.println("tick!");
	}

}
