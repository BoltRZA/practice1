package practice1;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class AgentSmith extends Agent {
	public void setup() {
		System.out.println("Hello i'm Smith");
//		addBehaviour(new TickerBehaviour(this,1000) {
//			
//			@Override
//			protected void onTick() {
//				System.err.println("tick");
//			}
//		});
		addBehaviour(new DummyTicker(this, 1000));
		
		
			
	}
}
