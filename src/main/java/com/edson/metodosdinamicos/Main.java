package com.edson.metodosdinamicos;

import com.edson.metodosdinamicos.enums.OperationEnum;
import com.edson.metodosdinamicos.interfaces.ParameterOperationInterface;

public class Main {

	public static void main(String[] args) {
		ParameterOperationInterface somaOperation = OperationEnum.SUM.getMetodo();
		ParameterOperationInterface divisaoOperation = OperationEnum.DIV.getMetodo();
		Double resultSoma = somaOperation.doOperation(1d, 2d);
		Double resultDivisao = divisaoOperation.doOperation(10d, 2d);
		System.out.println(resultSoma);
		System.out.println(resultDivisao);
	}
	
	
}