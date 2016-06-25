package frsf.cidici.faia.simulator;

import frsf.cidici.faia.chatBot.ChatbotAgent;
import frsf.cidici.faia.solver.productionsystem.ProductionSystemAction;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;
import frsf.cidisi.faia.simulator.events.EventType;
import frsf.cidisi.faia.simulator.events.SimulatorEventNotifier;

public class ChatbotKnowledgeSimulator extends KnowledgeBasedAgentSimulator{

	public ChatbotKnowledgeSimulator(Environment environment, Agent agent) {
		super(environment, agent);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void start() {

        System.out.println("----------------------------------------------------");
        System.out.println("--- " + this.getSimulatorName() + " ---");
        System.out.println("----------------------------------------------------");
        System.out.println();

        Perception perception;
        Action action;
        //TODO Futuro: Esta hecho para el ChatBot pero debería incluirse el método learn en la clase agente.
        ChatbotAgent agent;

        agent = (ChatbotAgent) this.getAgents().firstElement();

        System.out.println("------------------------------------");

        System.out.println("Sending perception to agent...");
        perception = this.getPercept();
        //agent.see(perception);
        System.out.println("Perception: " + perception);

         //   System.out.println("Agent State: " + agent.getAgentState());
           // System.out.println("Environment: " + environment);
        System.out.println("Asking the agent that start the learning process...");
        action = agent.learn();

        if (action == null){
         	System.out.println("\nNo entiendo.");
        }
        else
        {
          	ProductionSystemAction act = (ProductionSystemAction) action;
           	System.out.println("\nRule to execute: " + act.getPeerRuleData().getRule().getId());
        }
        System.out.println();

        this.ruleReturned(agent, action);

        
        // Leave a blank line
        System.out.println();

        // This call can be moved to the Simulator class
        this.environment.close();

        // Launch simulationFinished event
        SimulatorEventNotifier.runEventHandlers(EventType.SimulationFinished, null);
		
	}

}
