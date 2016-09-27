package richmj.com.daggerdemo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 张磊 on 2016/9/27.
 */
@Module
public class UtilsProvider {
    @Provides
    ILogUtil providerILogUtil(Object object) {
        return new LogUtil(object);
    }
}
