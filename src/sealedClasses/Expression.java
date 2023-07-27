package sealedClasses;

public sealed interface Expression {

    int eval();
}

record Constant(int value) implements Expression {
    public int eval() {
        return value;
    }
}

record Add(Expression lval, Expression rval) implements Expression {
    public int eval() {
        return lval.eval() + rval.eval();
    }
}

record Mul(Expression lval, Expression rval) implements Expression {
    public int eval() {
        return lval.eval() * rval().eval();
    }
}
