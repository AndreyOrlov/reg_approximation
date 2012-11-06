package impl;

import ast.Expression;

/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 27.10.12
 * Time: 22:51
 * To change this template use File | Settings | File Templates.
 */
public class ExpressionImpl implements Expression {
    public String toString () {
        return "<generic>";
    }

    public static class Literal extends ExpressionImpl implements Expression.Literal {
        private final String myValue;

        public Literal(final String value) {
            myValue = value;
        }

        public String getValue() {
            return myValue;
        }

        public String toString() {
            return "\"" + getValue() + "\"";
        }
    }

    public static class Binary extends ExpressionImpl implements Expression.Binary {
        private final Expression myLeft;
        private final Expression myRight;

        public Binary(final Expression left, final Expression right) {
            myLeft = left;
            myRight = right;
        }

        public Expression getLeft(){
            return myLeft;
        }

        public Expression getRight() {
            return myRight;
        }

        public String toString() {
            return myLeft.toString() + "?" + myRight.toString();
        }
    }

    public static class Concat extends Binary implements Expression.Concat {
        public Concat(final Expression left, final Expression right) {
            super(left, right);
        }

        public String toString () {
            return getLeft().toString() + " + " + getRight().toString();
        }
    }

    public static class Variable extends ExpressionImpl implements Expression.Variable{
        private final String myName;

        public Variable (final String name) {
            myName = name;
        }

        public String getName() {
            return myName;
        }

        public String toString() {
            return  getName();
        }
    }
}
