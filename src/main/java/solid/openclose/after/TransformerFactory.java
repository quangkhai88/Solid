package solid.openclose.after;

/**
 * @author Quang-Khai TRAN
 * @date 15/09/2024
 */

public class TransformerFactory {

    public static IMessageTransformer getTransformer(TransformType transformType) {
        switch (transformType) {
            case UPPER_CASE:
                return new UpperCaseMessageTransformer();
            case LOWER_CASE:
                return new LowerCaseMessageTransformer();
            case TRIM:
                return new TrimMessageTransformer();
            default:
                throw new IllegalArgumentException("Unknown transform type");
        }
    }

}
