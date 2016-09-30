package richmj.com.daggerdemo;

import android.app.Application;

/**
 * Created by zhanglei-account on 2016/9/28.
 */

public class MyApplication extends Application {

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        netComponent = DaggerNetComponent.builder().
                netModule(new NetModule("http://139.196.154.104:9001/")).
                appModule(new AppModule(this)).build();
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }
}
