package com.codebabes.pickupline;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);
        final Button button = findViewById(R.id.cb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LineActivity.this.finish();
            }
        });
    }

}
