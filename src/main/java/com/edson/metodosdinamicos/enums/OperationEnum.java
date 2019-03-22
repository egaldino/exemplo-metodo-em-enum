package com.edson.metodosdinamicos.enums;

import com.edson.metodosdinamicos.interfaces.ParameterOperationInterface;
import com.edson.metodosdinamicos.operacoes.Operacoes;

public enum OperationEnum {

	
	SUM(Operacoes::soma),
	DIV(Operacoes::divisao);
	
	
	private ParameterOperationInterface metodo;

	OperationEnum(ParameterOperationInterface metodo){
		this.metodo = metodo;
	}

	public ParameterOperationInterface getMetodo() {
		return metodo;
	}
	
}
