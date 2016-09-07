package it.eng.helloword;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

public class IsplayMessageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("IsplayMessageActivity","onStart");
        setContentView(R.layout.activity_isplay_message);
        Intent intent = getIntent();
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(intent.getStringExtra(MainActivity.MESSAGGIO));
        ViewGroup layout = (ViewGroup)findViewById(R.id.activity_display_message);
        layout.addView(textView);


    }

    @Override
    protected void onResume() {
        Log.v("CallBaco","onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.v("CallBaco","onStart");
        super.onStart();
    }
}
