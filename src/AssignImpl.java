/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 28.10.12
 * Time: 14:39
 * To change this template use File | Settings | File Templates.
 */
public class AssignImpl extends StatementImpl implements Assign {
    Variable m_var;
    Expression m_expr;

    public AssignImpl(Variable var, Expression expr) {
        m_var = var;
        m_expr = expr;
    }

    public String getDst() {
        return m_var.getName();
    }

    public Expression getSrc() {
        return m_expr;
    }

    public String toString() {
        return m_var.toString() + ":=" + m_expr.toString();
    }
}
