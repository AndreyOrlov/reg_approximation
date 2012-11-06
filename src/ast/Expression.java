package ast;

/**
 * Created with IntelliJ IDEA.
 * User: db
 * Date: 06.11.12
 * Time: 21:13
 * To change this template use File | Settings | File Templates.
 */
public interface Expression {

    public interface Binary extends Expression {
        Expression getLeft();
        Expression getRight();
    }

    public interface Concat extends Binary {
    }

    public interface Literal extends Expression {
        String getValue();
    }

    public interface Variable extends Expression {
        String getName();
    }

}
