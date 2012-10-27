/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 26.10.12
 * Time: 22:12
 * To change this template use File | Settings | File Templates.
 */
public interface AlStatement extends Statement {
    Statement getLeft();
    Statement getRight();
}
