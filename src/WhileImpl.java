/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 04.11.12
 * Time: 18:43
 * To change this template use File | Settings | File Templates.
 */
public class WhileImpl extends StatementImpl implements While {
    Expression m_condition;
    Statement m_stmt;

    public WhileImpl(Expression expr, Statement stmt) {
        m_condition = expr;
        m_stmt = stmt;
    }

    public Expression getCondition() {
        return m_condition;
    }

    public Statement getStatement() {
        return m_stmt;
    }

    public String toString() {
        return "while " + m_condition.toString() + " do " + m_stmt.toString();
    }
}
