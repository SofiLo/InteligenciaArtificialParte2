package frsf.cidici.faia.chatBot;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import frsf.cidici.faia.simulator.ChatbotKnowledgeSimulator;

public class ChatbotInicial {

	public Util util = new Util();
	
	public static void inicio(String oracion) {
		
		ChatbotAgent agente = new ChatbotAgent();
		AmbienteChatbot ambienteAgente = new AmbienteChatbot();
		ChatbotEnvironmentState estadoAgente = new ChatbotEnvironmentState();
		Preprocess pre = new Preprocess();
				
		System.out.println();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		//obtengo la conversacion ingresada por el usuario
		do{
			
			String original = oracion;
//			try {
//				original = br.readLine();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
	
		//se la mando al estado del agente
		estadoAgente.setConversacion(pre.procesar(original));
		
		//seteo el estado del agente al ambiente
		ambienteAgente.setEnvironmentState(estadoAgente);
		
		//empezar el simulador
		ChatbotKnowledgeSimulator simulador = new ChatbotKnowledgeSimulator(ambienteAgente, agente);
		simulador.start();

			
		/*accion.execute(ChatbotInicial.chatbot.getAgentState(), estadoAgente);
		System.out.println();
		System.out.println(">>"+ estadoAgente.respuestaAgente);	*/
		}while(false);
		
//		System.out.println("salio del dowhile");
	}
}
