package frsf.cidici.faia.chatBot;

import java.util.ArrayList;

import frsf.cidisi.exercise.diagrama.search.EstadoAmbiente;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class AmbienteChatbot extends Environment {
	
	public AmbienteChatbot(){
		
		// Create the chatbot environment state
		environmentState = new ChatbotEnvironmentState();
		environmentState.initState();
		
	}
	
	@Override
	public Perception getPercept() {
		// TODO Auto-generated method stub
		ChatbotPercepcion percepcion = new ChatbotPercepcion();
		percepcion.setConversacion(((ChatbotEnvironmentState) environmentState).getConversacion());
		return percepcion;
	}

}
