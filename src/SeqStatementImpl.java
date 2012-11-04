/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 28.10.12
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */
public class SeqStatementImpl implements SeqStatement {
    Statement m_first;
    Statement m_second;

    public SeqStatementImpl(Statement stmt1, Statement stmt2) {
        m_first = stmt1;
        m_second = stmt2;
    }

    public Statement getFirst() {
        return m_first;
    }

    public Statement getSecond() {
        return m_second;
    }

    public String toString() {
        return m_first.toString() + ";" + m_second.toString();
    }
}
