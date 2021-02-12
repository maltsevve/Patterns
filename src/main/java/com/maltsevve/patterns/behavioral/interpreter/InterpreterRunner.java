package com.maltsevve.patterns.behavioral.interpreter;

class InterpreterRunner {
    public static void main(String[] args) {
        Expression tastes = getSomeParam();

        System.out.println(tastes.interpret("Bitter"));
        System.out.println(tastes.interpret("Sweet"));
    }

    public static Expression getSomeParam() {
        Expression param1 = new TerminalExpression("Bitter");
        Expression param2 = new TerminalExpression("Sweet");

        return new SomeExpression(param1, param2);
    }
}
