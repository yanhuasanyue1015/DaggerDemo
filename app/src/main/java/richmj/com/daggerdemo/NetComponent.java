package richmj.com.daggerdemo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zhanglei-account on 2016/9/28.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
void inject(MainActivity mainActivity);
}
