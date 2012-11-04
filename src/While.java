/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 04.11.12
 * Time: 18:41
 * To change this template use File | Settings | File Templates.
 */
public interface While extends Statement{
    Expression getCondition();
    Statement getStatement();
}
