/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 03.11.12
 * Time: 17:52
 * To change this template use File | Settings | File Templates.
 */
public class AlStatementImpl extends StatementImpl implements AlStatement {
    Statement m_stmt_left;
    Statement m_stmt_right;

    public AlStatementImpl(Statement stmt1, Statement stmt2) {
        m_stmt_left = stmt1;
        m_stmt_right = stmt2;
    }

    public Statement getLeft() {
        return m_stmt_left;
    }

    public Statement getRight() {
        return m_stmt_right;
    }

    public String toString() {
        return m_stmt_left.toString() + "|" + m_stmt_right.toString();
    }
}
