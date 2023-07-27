package sealedClasses;

public class Main {

    public static void main(String[] args) {
        Expression expression = new Add(
                new Constant(1),
                new Mul(new Constant(7), new Constant(2))
        );
        System.out.println(expression + " = " + expression.eval());
        // Add[lval=Constant[value=1], rval=Mul[lval=Constant[value=7], rval=Constant[value=2]]] = 15
    }
}

//this doesn't compile
//Negate is not allowed in the sealed hierarchy
//the declaration of the seled interface does not have a permits class that includes Negate
//record Negate(Expression expression) implements Expression {
//    @Override
//    public int eval() {
//        return -expression.eval();
//    }
//}
