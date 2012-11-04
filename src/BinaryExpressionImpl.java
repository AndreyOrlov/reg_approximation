/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 27.10.12
 * Time: 22:58
 * To change this template use File | Settings | File Templates.
 */
public class BinaryExpressionImpl extends ExpressionImpl implements  BinaryExpression{
    Expression m_left;
    Expression m_right;
    String m_op;

    public BinaryExpressionImpl(Expression left, Expression right, String op) {
        m_left = left;
        m_right = right;
        m_op = op;
    }

    public Expression getLeft(){
        return m_left;
    }

    public Expression getRight() {
        return m_right;
    }

    public String toString() {
        return m_left.toString() + m_op + m_right.toString();
    }
}
