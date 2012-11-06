package impl;

import ast.Expression;
import ast.Statement;

/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 03.11.12
 * Time: 17:36
 * To change this template use File | Settings | File Templates.
 */
public class StatementImpl implements Statement {
    public String toString() {
        return "<generic>";
    }

    public static class Assign extends StatementImpl implements Statement.Assign {
        private final Expression.Variable myDst;
        private final Expression mySrc;

        public Assign(final Expression.Variable dst, final Expression src) {
            myDst = dst;
            mySrc = src;
        }

        public Expression.Variable getDst() {
            return myDst;
        }

        public Expression getSrc() {
            return mySrc;
        }

        public String toString() {
            return myDst.toString() + " := " + mySrc.toString();
        }
    }

    public static class Alt extends StatementImpl implements Statement.Alt {
        private final Statement myLeft;
        private final Statement myRight;

        public Alt(final Statement left, final Statement right) {
            myLeft = left;
            myRight = right;
        }

        public Statement getLeft() {
            return myLeft;
        }

        public Statement getRight() {
            return myRight;
        }

        public String toString() {
            return myLeft.toString() + " | " + myRight.toString();
        }
    }

    public static class Seq extends StatementImpl implements Statement.Seq {
        private final Statement myFirst;
        private final Statement mySecond;

        public Seq(final Statement first, final Statement second) {
            myFirst = first;
            mySecond = second;
        }

        public Statement getFirst() {
            return myFirst;
        }

        public Statement getSecond() {
            return mySecond;
        }

        public String toString() {
            return myFirst.toString() + "; " + mySecond.toString();
        }
    }

    public static class While extends StatementImpl implements Statement.While {
        private final Statement myStmt;

        public While(final Statement stmt) {
            myStmt = stmt;
        }

        public Statement getStatement() {
            return myStmt;
        }

        public String toString() {
            return "do " + myStmt.toString();
        }
    }

    public static class Read extends StatementImpl implements Statement.Read {
        private final Expression.Variable myVar;

        public Read(final Expression.Variable var) {
            myVar = var;
        }

        public Expression.Variable getValue() {
            return myVar;
        }

        public String toString() {
            return "Read (" + myVar.toString() + ")";
        }
    }

    public static class Write extends StatementImpl implements Statement.Write {
        private final Expression myExpr;

        public Write (final Expression expr) {
            myExpr = expr;
        }

        public Expression getExpression() {
            return myExpr;
        }

        public String toString() {
            return "Write (" + myExpr.toString() + ")";
        }
    }

    public static class Skip extends StatementImpl implements Statement.Skip {

    }
}
