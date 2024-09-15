package solid.openclose.after;

/**
 * @author Quang-Khai TRAN
 * @date 15/09/2024
 */

public class LowerCaseMessageTransformer implements IMessageTransformer{
    @Override
    public String transform(String message) {
        return message.toLowerCase();
    }
}
