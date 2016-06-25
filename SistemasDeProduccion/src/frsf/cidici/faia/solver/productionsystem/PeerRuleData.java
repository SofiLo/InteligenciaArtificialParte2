package frsf.cidici.faia.solver.productionsystem;

/**
 * Clase que implementa los pares que resultan de la ejecucion del match.
 * @author Grupo 12: Blas,María Julia / Diaz Ferreyra,Nicolas/ Sarli, Juan Leonardo.
 */
public class PeerRuleData {
	
	Rule rule;
	String data;
	
	public PeerRuleData(Rule r,String d){
		rule = r;
		data = d;
	}
	
	public Rule getRule(){
		return rule;
	}
	
	public void setRule(Rule r){
		rule = r;
	}
	
	public String getData(){
		return data;
	}
	
	public void setData(String d){
		data = d;
	}
	
}
