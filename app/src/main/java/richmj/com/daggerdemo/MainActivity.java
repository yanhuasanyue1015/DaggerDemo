package richmj.com.daggerdemo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    @Inject
    SharedPreferences sharedPreferences;
    @Inject
    Retrofit retrofit;
    @Inject
    IViewUtil viewUtil;
    private android.widget.TextView btn1;
    private android.widget.TextView btn2;
    private android.widget.TextView btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btn3 = (TextView) findViewById(R.id.btn3);
        this.btn2 = (TextView) findViewById(R.id.btn2);
        this.btn1 = (TextView) findViewById(R.id.btn1);
        ((MyApplication) getApplication()).getNetComponent().inject(this);
        viewUtil.setViewsOnClickListener(onClickListener, btn1, btn2, btn3);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn1:
                    break;
                case R.id.btn2:
                    break;
                case R.id.btn3:
                    break;
            }
        }
    };
}
