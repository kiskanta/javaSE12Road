package com.ksh.decision;

/**
 * 2 selective Statements are if, switch<br/>
 * <b>If</b> </br>
 * <b>switch : </b> Switch statement is java's multiway branch statement. It
 * provides an easy way to dispatch execution to different part of your code
 * based on the value of an expression
 * 
 * @author KingShore
 *
 */

public interface DecisionMakingFacotry {
	/**
	 * 
	 */
	void ifStatement();

	void ifElseStatement();

	void ifElseIfStatement();

	/**
	 * prior JDk7 expression must be byte, short, int, char or an enumeration.
	 * 
	 * @param expression
	 */
	void switchUseCase(int expression);

	/**
	 * With JDK7 expression can also be of type String<br/>
	 * Note: Duplicate case values are not allowed.
	 * 
	 * @param expression
	 */
	void switch7useCase(String expression);

}
