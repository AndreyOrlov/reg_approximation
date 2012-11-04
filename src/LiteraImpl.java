/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 27.10.12
 * Time: 22:27
 * To change this template use File | Settings | File Templates.
 */
public class LiteraImpl extends ExpressionImpl implements Litera {
    private  String m_value;

    public LiteraImpl(String value){
        m_value = value;
    }

    public String getValue() {
        return m_value;
    }

    public String toString() {
        return "\""+getValue()+"\"";
    }
}
