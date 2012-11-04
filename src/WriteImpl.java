/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 03.11.12
 * Time: 17:34
 * To change this template use File | Settings | File Templates.
 */
public class WriteImpl extends StatementImpl implements Write {
    Expression m_expr;

    public WriteImpl(Expression expr) {
        m_expr = expr;
    }

    public Expression getExpression() {
        return m_expr;
    }

    public String toString() {
        return "Write("+m_expr.toString()+")";
    }
}
