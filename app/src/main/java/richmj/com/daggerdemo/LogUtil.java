package richmj.com.daggerdemo;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by zhanglei-account on 2016/9/28.
 */

public class LogUtil implements ILogUtil {
    private String Tag;

    @Inject
    public LogUtil(String tag) {
        Tag = tag;
    }

    @Override
    public void i(String mes) {

    }

    @Override
    public void d(String mes) {

    }
}
