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
		
	@Override
	public void initState() {
		// TODO Auto-generated method stub
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
