package richmj.com.daggerdemo;

import android.view.View;

/**
 * Created by zhanglei-account on 2016/9/28.
 */

public interface IViewUtil {
    void setViewsOnClickListener(View.OnClickListener onClickListener,View ... views);
}
