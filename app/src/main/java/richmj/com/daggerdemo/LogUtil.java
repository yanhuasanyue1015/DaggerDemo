package richmj.com.daggerdemo;

/**
 * Created by 张磊 on 2016/9/27.
 */
public class LogUtil implements ILogUtil {
    private Object object;
    private String className;

    public LogUtil(Object object) {
        this.object = object;
        this.className = object.getClass().getName();
    }

    @Override
    public void i(String mes) {

    }

    @Override
    public void e(String mes) {

    }

    @Override
    public void d(String mes) {

    }

    @Override
    public void w(String mes) {

    }
}
