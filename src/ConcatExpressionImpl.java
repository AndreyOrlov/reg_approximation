/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 03.11.12
 * Time: 14:28
 * To change this template use File | Settings | File Templates.
 */
public class ConcatExpressionImpl extends BinaryExpressionImpl implements ConcatExpression{

    public ConcatExpressionImpl(Expression ex1, Expression ex2) {
        super(ex1, ex2, "+");
    }
}
