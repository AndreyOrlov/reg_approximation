/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 22.10.12
 * Time: 21:12
 * To change this template use File | Settings | File Templates.
 */
public interface SeqStatement extends Statement{
    Statement getFirst();
    Statement getLeft();
}
