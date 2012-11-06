package ast;

/**
 * Created with IntelliJ IDEA.
 * User: db
 * Date: 06.11.12
 * Time: 21:16
 * To change this template use File | Settings | File Templates.
 */
public interface Statement {
    public interface Seq extends Statement{
        Statement getFirst();
        Statement getSecond();
    }

    public interface Alt extends Statement {
        Statement getLeft();
        Statement getRight();
    }

    public interface Write extends Statement{
        Expression getExpression();
    }

    public interface Assign extends Statement{
        Expression.Variable getDst();
        Expression getSrc();
    }

    public interface Read extends Statement {
        Expression.Variable getValue();
    }

    public interface Skip extends Statement {
    }

    public interface While extends Statement {
        Statement getStatement();
    }
}
