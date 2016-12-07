package com.zouyingjun.samonkey.interpolator;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tvInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInput = (TextView) findViewById(R.id.tv_main_input);
    }
    public void onClick(View v){
        //循环插补器
        if(TextUtils.isEmpty(tvInput.getText().toString())){
            Animation shake = AnimationUtils.
                    loadAnimation(this, R.anim.shake);
            tvInput.startAnimation(shake);
        }
    }
}
