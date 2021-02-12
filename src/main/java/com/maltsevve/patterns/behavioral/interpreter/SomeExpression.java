package com.maltsevve.patterns.behavioral.interpreter;

class SomeExpression implements Expression{
    Expression expression1;
    Expression expression2;

    public SomeExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context); // Тут может быть любой логический оператор
    }
}
