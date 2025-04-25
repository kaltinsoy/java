public class Postfix {
    public static String convertToPostfix(String infix) {
        StackInterface<Character> operatorStack = new LinkedStack<>();
        char[] postfixArray = new char[infix.length()]; // Max possible size
        int postfixIndex = 0;
        int index = 0;
        char nextCharacter = ' ';
        char topOperator = ' ';
        
        while (index < infix.length()) {
            nextCharacter = infix.charAt(index);
            switch (nextCharacter) {
                case 'a': case 'b': case 'c': case 'd': case 'e': case 'f': case 'g': case 'h':
                    postfixArray[postfixIndex++] = nextCharacter; 
                    break;
                case '^':
                    operatorStack.push(nextCharacter);
                    break;
                case '+': case '-': case '*': case '/':
                    while (!operatorStack.isEmpty() && 
                          !isBigger(nextCharacter, operatorStack.peek())) {
                        postfixArray[postfixIndex++] = operatorStack.pop();
                    }
                    operatorStack.push(nextCharacter);
                    break;
                case '(':
                    operatorStack.push(nextCharacter);
                    break;
                case ')':
                    topOperator = operatorStack.pop();
                    while (topOperator != '(') {
                        postfixArray[postfixIndex++] = topOperator;
                        topOperator = operatorStack.pop();
                    }
                    break;
                default:
                    break;
            }
            index++;
        }
        
        while (!operatorStack.isEmpty()) {
            postfixArray[postfixIndex++] = operatorStack.pop();
        }
       
        // Create string only from the used portion of the array
        return new String(postfixArray, 0, postfixIndex);
    }

    // Rest of the class remains the same (isBigger, precedenceLevel, evaluatePostfix, etc.)
    private static boolean isBigger(char ch1, char ch2) {
        return precedenceLevel(ch1) > precedenceLevel(ch2);
    }    
    
    private static int precedenceLevel(char op) {
        switch (op) {
            case '(': return 0;
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
            default: throw new IllegalArgumentException("Operator unknown: " + op);
        }
    }
    
    public static int evaluatePostfix(String postfix) {
        StackInterface<Integer> valueStack = new LinkedStack<>();
        int index = 0;
        char nextCharacter = ' ';
        Integer operandTwo, operandOne;
        int result;
        while (index < postfix.length()) {
            nextCharacter = postfix.charAt(index);
            switch (nextCharacter) {
                case 'a': case 'b': case 'c': case 'd': case 'e': case 'f': case 'g': case 'h':
                    valueStack.push(getValue(nextCharacter));
                    break;
                case '+': case '-': case '*': case '/': case '^':
                    operandTwo = valueStack.pop();
                    operandOne = valueStack.pop();
                    result = calculate(operandOne,operandTwo,nextCharacter);
                    valueStack.push(result);
                    break;
                default: break;
            }
            index++;
        }
        return valueStack.peek();
    }
    
    private static Integer getValue(char op) {
        Integer[] values = {2, 3, 4, 5, 6}; // a, b, c, d, e
        return values[op-97];        
    }
    
    private static Integer calculate(Integer opd1, Integer opd2, char opr) {
        Integer intObj = 0;
        switch (opr) {
            case '+': intObj = opd1 + opd2; break;
            case '-': intObj = opd1 - opd2; break;
            case '*': intObj = opd1 * opd2; break;
            case '/':
                if (opd2.equals(0))
                    throw new ArithmeticException("Division by zero");
                else
                    intObj = opd1 / opd2;
                break;
            case '^': intObj = (int) Math.pow(opd1, opd2); break;
            default: break;
        }
        return intObj;
    }

    public static int evaluateInfix(String infix) {
        StackInterface<Character> operatorStack = new LinkedStack<>();
        StackInterface<Integer> valueStack = new LinkedStack<>();
        int index = 0;
        char nextCharacter = ' ';
        char topOperator = ' ';
        Integer operandTwo, operandOne;
        int result;
        while (index < infix.length()) {
            nextCharacter = infix.charAt(index);
            switch (nextCharacter) {
                case 'a': case 'b': case 'c': case 'd': case 'e': case 'f': case 'g': case 'h':
                    valueStack.push(getValue(nextCharacter));
                    break;
                case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':                    
                    valueStack.push(Character.getNumericValue(nextCharacter));
                    break;
                case '^':
                    operatorStack.push(nextCharacter);
                    break;
                case '+': case '-': case '*': case '/': 
                    while (!operatorStack.isEmpty() && 
                           !isBigger(nextCharacter, operatorStack.peek())) {
                        topOperator = operatorStack.pop();
                        operandTwo = valueStack.pop();
                        operandOne = valueStack.pop();
                        result = calculate(operandOne,operandTwo,topOperator);
                        valueStack.push(result);
                    }
                    operatorStack.push(nextCharacter);
                    break;
                case '(':
                    operatorStack.push(nextCharacter);
                    break;
                case ')':
                    topOperator = operatorStack.pop();
                    while (topOperator != '(') {
                        operandTwo = valueStack.pop();
                        operandOne = valueStack.pop();
                        result = calculate(operandOne,operandTwo,topOperator);
                        valueStack.push(result); 
                        topOperator = operatorStack.pop();
                    }
                    break;
                default: break;
            }
            index++;
        }        
        while (!operatorStack.isEmpty()) {
            topOperator = operatorStack.pop();
            operandTwo = valueStack.pop();
            operandOne = valueStack.pop();
            result = calculate(operandOne,operandTwo,topOperator);
            valueStack.push(result);              
        }        
        return valueStack.peek();
    }
}
