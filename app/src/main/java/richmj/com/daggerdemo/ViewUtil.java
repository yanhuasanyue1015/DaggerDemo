package richmj.com.daggerdemo;

import android.view.View;

import javax.inject.Inject;

/**
 * Created by zhanglei-account on 2016/9/28.
 */

public class ViewUtil implements IViewUtil {
    @Inject
    public ViewUtil() {
    }

    @Override
    public void setViewsOnClickListener(View.OnClickListener onClickListener, View... views) {
        for (View iteamView : views) {
            iteamView.setOnClickListener(onClickListener);
        }
    }
}
