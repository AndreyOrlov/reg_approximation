/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 03.11.12
 * Time: 18:14
 * To change this template use File | Settings | File Templates.
 */
public class VariableImpl extends ExpressionImpl implements Variable{
    String m_name;

    public VariableImpl(String name) {
        m_name = name;
    }

    public String getName() {
        return m_name;
    }

    public String toString() {
        return  getName();
    }
}
