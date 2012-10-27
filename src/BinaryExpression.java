/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 22.10.12
 * Time: 20:52
 * To change this template use File | Settings | File Templates.
 */
public interface BinaryExpression extends Expression {
    Expression getLeft();
    Expression getRight();
}
