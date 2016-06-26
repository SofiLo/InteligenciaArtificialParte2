package frsf.cidici.faia.chatBot;

import java.util.ArrayList;
import java.util.LinkedList;

import frsf.cidici.faia.chatBot.ui.Messenger;
import frsf.cidici.faia.solver.productionsystem.PeerRuleData;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class ChatbotEnvironmentState extends EnvironmentState {
	
	public static ArrayList<String> conversacionProcesada;
	public static LinkedList<Regla> listaReglas;
	String respuestaAgente;
	
	@Override
	public void initState() {

		conversacionProcesada = new ArrayList<String>();
		listaReglas = new LinkedList<Regla>();
		respuestaAgente = "Benvenuto";	
		
		listaReglas.add(setRules(1, "[SaludoBienv]", "Hola, en que puedo ayudarlo?", 0, 1, 1, 1));
		listaReglas.add(setRules(1, "[SaludoBienv]", "Hola", 0, 0, 0, 0));
		
		
		listaReglas.add(setRules(2, "[SaludoDesp]", "Chau", 0, 1, 1, 1));
		listaReglas.add(setRules(3, "[ComoAndar]", "Bárbaro y vos?", 0, 1, 1, 1));
		listaReglas.add(setRules(4, "[SaludoBienv, ComoAndar]", "Hola! Bárbaro y vos?", 0, 1, 1, 1));
		
		listaReglas.add(setRules(5, "[DondeEstar, Milagros]", "En las islas canarias", 0, 1, 1, 1));
		listaReglas.add(setRules(6, "[DondeEstar, Susana]", "En la oficina con los becarios", 0, 1, 1, 1));
		listaReglas.add(setRules(7, "[DondeEstar, Jorge]", "En el Anexo", 0, 1, 1, 1));
		listaReglas.add(setRules(8, "[DondeEstar, Ignacio]", "En el CIDISI", 0, 1, 1, 1));
		listaReglas.add(setRules(9, "[DondeEstar, Laura]", "En la Secretaria de Relaciones Internacionales", 0, 1, 1, 1));
		listaReglas.add(setRules(10, "[DondeEstar, Alfonso]", "En la Secretaría Académica", 0, 1, 1, 1));
		listaReglas.add(setRules(11, "[DondeEstar, Ramos]", "En TICs", 0, 1, 1, 1));
		listaReglas.add(setRules(12, "[DondeEstar, Villarreal]", "En el CIDISI", 0, 1, 1, 1));
		listaReglas.add(setRules(13, "[DondeEstar, Taravini]", "En la Secretaría de Deportes", 0, 1, 1, 1));
		listaReglas.add(setRules(14, "[DondeEstar, Pastorelli]", "En el Departamento de Materias Básicas", 0, 1, 1, 1));
		
		listaReglas.add(setRules(15, "[DondeRindo, SistemasGestion]", "En el Aula MM5 (Multimedios 5)", 0, 1, 1, 1));
		listaReglas.add(setRules(16, "[DondeRindo, Inteligencia]", "En el Laboratorio 4", 0, 1, 1, 1));
		listaReglas.add(setRules(17, "[DondeRindo, AnalisisMatematicoII]", "En el Aula 22", 0, 1, 1, 1));
		listaReglas.add(setRules(18, "[DondeRindo, Redes]", "En el Laboratorio de Conectividad. 3er Piso", 0, 1, 1, 1));
		listaReglas.add(setRules(19, "[DondeRindo, Ontologias]", "En el Aula MM5 (Multimedios 5)", 0, 1, 1, 1));
		
		listaReglas.add(setRules(20, "[DondeCurso, SistemasGestion]", "En el Laboratorio 2", 0, 1, 1, 1));
		listaReglas.add(setRules(21, "[DondeCurso, Inteligencia]", "En el Aula E03", 0, 1, 1, 1));
		listaReglas.add(setRules(22, "[DondeCurso, AnalisisMatematicoII]", "En el Aula 21", 0, 1, 1, 1));
		listaReglas.add(setRules(23, "[DondeCurso, Redes]", "En el Aula 20", 0, 1, 1, 1));
		listaReglas.add(setRules(24, "[DondeCurso, Ontologias]", "En el Aula MM5 (Multimedios 5)", 0, 1, 1, 1));
		
		listaReglas.add(setRules(24, "[ComoTeLlamas]", "Mi nombre es Wall-E :) En que puedo ayudar?", 0, 1, 1, 1));
	//	listaReglas.add(setRules(24, "[ComoLlegar, ]", "poner aca el algoritmo", 0, 1, 1, 1));
		
		listaReglas.add(setRules(24, "[Gracias]", "De nada, que tengas un buen día!", 0, 1, 1, 1));
		listaReglas.add(setRules(24, "[Bien]", "En que puedo ayudarlo?", 0, 1, 1, 1));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	public Regla setRules (int id, String condition, String then, int type, int novelty, int priority, int specificity) {
		// TODO Auto-generated method stub
		Regla r = new Regla();
		r.setId(id);
		r.setCondition(condition);
		r.setThen(then);
		r.setType(type);
		r.setNovelty(novelty);
		r.setPriority(priority);
		r.setSpecificity(specificity);
		
		return r;
	}

	public void update(AgentState ast, PeerRuleData rule) {
		// TODO Auto-generated method stub
		respuestaAgente = rule.getRule().getThen();
		
		
//		System.out.println(">> "+respuestaAgente);
		Messenger.respuesta(respuestaAgente);
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
