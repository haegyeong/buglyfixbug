package bugly.haegyeong.com.testbugly;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Button fix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = ((TextView) findViewById(R.id.text));

        fix = ((Button) findViewById(R.id.fix));

        fix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                int result = 9 / 0;
//                tv.setText("9 / 0=" + result + "");
                tv.setText("你数学是体育老师教的么？");
            }
        });

    }
}
