import java.util.ArrayList;

public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Calculator().calculate("32+54*27*4/13"));// Should produce 480.61538

	}

	public double calculate(String expression) {
		ArrayList<String> operators = new ArrayList<String>();
		ArrayList<Double> operands = new ArrayList<Double>();
		int lastOperatorIndex = 0; // Spot last operator position for extracting integers from string
		int priorityOperationCount = 0; // Check how many * or / included in the expression
		// Start reading expression
		for (int i = 0; i < expression.length(); i++) {
			String currentChar = String.valueOf(expression.charAt(i));
			if (isOperator(currentChar) && i != 0) { // Check if its an operator
				operators.add(currentChar);
				if (isPriortyOperator(currentChar))// Check if its an priorty operator like * or /
					priorityOperationCount++;
				// Extract the integers between two operators i.e; in 2+23/43 '23' should be
				// extracted
				int startIndex = lastOperatorIndex == 0 ? 0 : lastOperatorIndex + 1;
				String operand = expression.substring(startIndex, i);
				operands.add(Double.parseDouble(operand));
				lastOperatorIndex = i;
			} else if (i == expression.length() - 1) {// If its the last integer on the expression
				String operand = lastOperatorIndex == 0 ? (expression.substring(lastOperatorIndex))
						: (expression.substring(lastOperatorIndex + 1));// Subtract the last operand
				operands.add(Double.parseDouble(operand));
			}
		}
		// Start evaluating expression
		int i = 0;
		while (!operators.isEmpty()) // Loop through until there are no operators left on the expression
		{
			String currentOperator = operators.get(i);
			double leftOperand = operands.get(i);
			double rightOperand = operands.get(i + 1);
			if ((currentOperator.equals("+") || currentOperator.equals("-")) && (priorityOperationCount == 0))// If
																												// current
																												// operator
																												// is +
																												// or -
																												// and
																												// there
																												// are
																												// no
																												// priority
																												// operators
																												// on
																												// the
																												// expression
																												// then
																												// simply
																												// evaluate
																												// the
																												// expression
			{
				operands.remove(i);
				double result = currentOperator.equals("+") ? leftOperand + rightOperand : leftOperand - rightOperand;
				operands.set(i, result);
				operators.remove(i);
			} else if (currentOperator.equals("*") || currentOperator.equals("/")) // If current operator is * or /
																					// evaluate the expression
			{
				operands.remove(i);
				double result = currentOperator.equals("*") ? leftOperand * rightOperand : leftOperand / rightOperand;
				operands.set(i, result);
				operators.remove(i);
				priorityOperationCount--;
				i--;
			}
			i = (operators.size() > 0 && i >= operators.size() - 1) || (priorityOperationCount == 0) ? 0 : i + 1;// Go
																													// back
																													// to
																													// first
																													// operator
																													// if
																													// its
																													// the
																													// end
																													// of
																													// operators
																													// array
																													// or
																													// there
																													// are
																													// no
																													// priority
																													// operators
																													// left
		}
		return operands.size() > 0 ? operands.get(0) : 0; // Return 0 if there are no operands
	}

	public boolean isOperator(String chr) {
		return (((chr.equals("+")) || (chr.equals("-")) || (chr.equals("*")) || (chr.equals("/"))));
	}

	public boolean isPriortyOperator(String chr) {
		return ((chr.equals("*")) || (chr.equals("/")));
	}
}