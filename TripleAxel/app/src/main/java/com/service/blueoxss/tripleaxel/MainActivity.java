package com.service.blueoxss.tripleaxel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Basically add tv,btn,ch for test.
        TextView tv_result = (TextView) findViewById(R.id.result);
        tv_result.setText(stringFromJNI());
        Button btn_upload= (Button) findViewById(R.id.upload);
        btn_upload.setText(stringFromJNI());// Example of a call to a native method
        CheckBox ch_exit = (CheckBox) findViewById(R.id.exit);
        ch_exit.setText(stringFromJNI());

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}
