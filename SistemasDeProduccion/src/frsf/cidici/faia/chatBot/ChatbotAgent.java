package frsf.cidici.faia.chatBot;

import java.util.ArrayList;
import java.util.LinkedList;

import frsf.cidici.faia.solver.productionsystem.Criteria;
import frsf.cidici.faia.solver.productionsystem.NoDuplication;
import frsf.cidici.faia.solver.productionsystem.Novelty;
import frsf.cidici.faia.solver.productionsystem.Priority;
import frsf.cidici.faia.solver.productionsystem.ProductionSystemAction;
import frsf.cidici.faia.solver.productionsystem.Specificity;
import frsf.cidisi.exercise.diagrama.search.Agente;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.state.AgentState;
import frsf.ia.tp.chatbot.solver.productionsystem.ChatbotProductionSystem;

public class ChatbotAgent extends Agente {
	
	AgentState state;

	Priority prioridad = new Priority();
	Novelty novedad = new Novelty();
	NoDuplication noduplicidad = new NoDuplication();
	Specificity especificidad = new Specificity();
		
	public Action learn(){
			
		LinkedList<Criteria> listaCriterios = new LinkedList<Criteria>(); 
		
		//ordenar esto
		listaCriterios.add(prioridad);
		listaCriterios.add(novedad);
		listaCriterios.add(noduplicidad);
		listaCriterios.add(especificidad);
		
		//System.out.println("oracionUsuario = "+ChatbotPercepcion.oracionUsuario);
		//System.out.println("listareglas esta vacio? = "+ChatbotEnvironmentState.listaReglas.isEmpty());
		
		ChatbotProductionSystem prodSystem = new ChatbotProductionSystem(listaCriterios, ChatbotEnvironmentState.listaReglas, 
																			ChatbotPercepcion.oracionUsuario);
		Object[] o = null;
		Action accion = prodSystem.solve(o);
		
		return accion;
	}
}
