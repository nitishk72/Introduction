package com.companyname.introduction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
        Button btn_Rtry ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btn_Rtry = (Button) findViewById(R.id.btn_Rtry);
        btn_Rtry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==btn_Rtry){
                    finish();
                    Intent i= new Intent(Welcome.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}
