package creationaldesignpatterns.factory.uifactory;

public class UIfactoryfactory {
    public static UIfactory getUIfactory(SupportedPlatforms supportedPlatforms)
    {
        return switch (supportedPlatforms){
            case ANDROID -> new Androiduifactory();
            case IOS ->new Iosfactory();
        };
    }
}
