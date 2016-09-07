package it.eng.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CallBackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_back);
    }

    @Override
    protected void onStart() {
        Log.v("CallBaco","onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.v("CallBaco","onResume");
        super.onResume();
    }
}
