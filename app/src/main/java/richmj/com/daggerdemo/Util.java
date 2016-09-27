package richmj.com.daggerdemo;

import dagger.Component;

/**
 * Created by 张磊 on 2016/9/27.
 */
@Component
public interface Util {
    void inject(MainActivity mainActivity);
}
