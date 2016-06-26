package frsf.cidici.faia.chatBot;

import java.util.ArrayList;
import java.util.LinkedList;

import frsf.cidici.faia.solver.productionsystem.PeerRuleData;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class ChatbotEnvironmentState extends EnvironmentState {
	
	public static ArrayList<String> conversacionProcesada;
	public static LinkedList<Regla> listaReglas;
	String respuestaAgente;
	
	Regla r1 = new Regla();
	Regla r2 = new Regla();
	Regla r3 = new Regla();
	Regla r4 = new Regla();
	Regla r5 = new Regla();
	Regla r6 = new Regla();
		
	@Override
	public void initState() {

		conversacionProcesada = new ArrayList<String>();
		listaReglas = new LinkedList<Regla>();
		respuestaAgente = "Benvenuto";	
		
		r1.setId(1);
		r1.setCondition("[hola]");
		r1.setThen("Hola, en que puedo ayudarlo?");
		r1.setType(0);
		r1.setNovelty(1);
		r1.setPriority(1);
		r1.setSpecificity(1);
		listaReglas.add(r1);
		
		r2.setId(2);
		r2.setCondition("[chau]");
		r2.setThen("Chau");
		r2.setType(0);
		r2.setNovelty(0);
		r2.setPriority(0);
		r2.setSpecificity(0);
		listaReglas.add(r2);
		
		r3.setId(3);
		r3.setCondition("[como, estar]");
		r3.setThen("Bárbaro y vos?");
		r3.setType(0);
		r3.setNovelty(1);
		r3.setPriority(1);
		r3.setSpecificity(1);
		listaReglas.add(r3);
		
		r4.setId(4);
		r4.setCondition("[como, llamar]");
		r4.setThen("Agente 07. pium pium");
		r4.setType(0);
		r4.setNovelty(1);
		r4.setPriority(1);
		r4.setSpecificity(1);
		listaReglas.add(r4);
		
		r5.setId(5);
		r5.setCondition("[hola, como, estar]");
		r5.setThen("Hola! bien, en que puedo ayudar?");
		r5.setType(0);
		r5.setNovelty(1);
		r5.setPriority(1);
		r5.setSpecificity(1);
		listaReglas.add(r5);
		

		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(AgentState ast, PeerRuleData rule) {
		// TODO Auto-generated method stub
		respuestaAgente = rule.getRule().getThen();
		
		
		System.out.println(">> "+respuestaAgente);
	}

	public ArrayList<String> getConversacion() {
		// TODO Auto-generated method stub
		return conversacionProcesada;
	}
	
    public void setConversacion(ArrayList<String> conversacionProcesada){
    	
    	ChatbotEnvironmentState.conversacionProcesada = conversacionProcesada;
    }
    
    public void setListaReglas(LinkedList<Regla> reglas){
    	ChatbotEnvironmentState.listaReglas = reglas;
    }

}
