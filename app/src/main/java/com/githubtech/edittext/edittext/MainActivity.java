/* change EditText line color with animation */
package com.githubtech.edittext.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    View view_password;
    View view_username;
    Animation anim;
    EditText edt_password;
    EditText edt_username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);

        view_password = (View) findViewById(R.id.second_view_password);
        view_username = (View) findViewById(R.id.second_view_username);

        edt_password = (EditText) findViewById(R.id.edt_password);
        edt_username = (EditText) findViewById(R.id.edt_username);

        edt_password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    view_password.setVisibility(View.VISIBLE);
                    view_password.startAnimation(anim);
                } else {
                    view_password.setVisibility(View.GONE);
                }
            }
        });

        edt_username.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    view_username.setVisibility(View.VISIBLE);
                    view_username.startAnimation(anim);
                } else {
                    view_username.setVisibility(View.GONE);
                }
            }
        });
    }
}
