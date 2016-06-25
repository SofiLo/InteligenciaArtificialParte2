package frsf.cidici.faia.chatBot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import frsf.cidici.faia.simulator.ChatbotKnowledgeSimulator;
import frsf.cidici.faia.simulator.KnowledgeBasedAgentSimulator;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.environment.Environment;

public class ChatbotInicial {

	public static void main(String[] args) throws Exception{
		
		//-----------------------------Simulador---------------------------------------
		ChatbotAgent agente = new ChatbotAgent();
		AmbienteChatbot ambienteAgente = new AmbienteChatbot();
		ChatbotEnvironmentState estadoAgente = new ChatbotEnvironmentState();
		Preprocesamiento pre = new Preprocesamiento();
				
		System.out.println("Comenzar conversación aqui: ");
		System.out.println();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		//obtengo la conversacion ingresada por el usuario
		String original = br.readLine();
	
		//se la mando al estado del agente
		estadoAgente.setConversacion(pre.procesamiento(original));
		
		//seteo el estado del agente al ambiente
		ambienteAgente.setEnvironmentState(estadoAgente);
		
		//empezar el simulador
		ChatbotKnowledgeSimulator simulador = new ChatbotKnowledgeSimulator(ambienteAgente, agente);
		simulador.start();

		//----------------------------------------------------------------------------
			
		/*accion.execute(ChatbotInicial.chatbot.getAgentState(), estadoAgente);
		System.out.println();
		System.out.println(">>"+ estadoAgente.respuestaAgente);	*/
	}
}
