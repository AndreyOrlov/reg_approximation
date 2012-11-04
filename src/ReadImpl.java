/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 04.11.12
 * Time: 18:06
 * To change this template use File | Settings | File Templates.
 */
public class ReadImpl extends StatementImpl implements Read {
    Variable m_var;

    public ReadImpl(Variable var) {
        m_var = var;
    }

    public Variable getValue() {
        return m_var;
    }

    public String toString() {
        return "Read("+m_var.getName()+")";
    }
}
