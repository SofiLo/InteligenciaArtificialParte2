package frsf.cidici.faia.chatBot;

import java.util.ArrayList;

import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class ChatbotPercepcion extends Perception{

	public static String oracionUsuario;
	public ChatbotPercepcion(){
		
	}
	
    public ChatbotPercepcion(Agent agent, Environment environment) {
        super(agent, environment);
    }
    
       
    
	@Override
	public void initPerception(Agent agent, Environment environment) {
		// TODO Auto-generated method stub
		
	}

	public void setConversacion(ArrayList<String> conversacion) {
		// TODO Auto-generated method stub
		oracionUsuario = conversacion.toString();
	}

}
