package com.sunny.countingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";
    private EditText ptResult;
    private Button btn[] = new Button[16];
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initListener();
    }

    private void initListener(){
        for (i = 0; i < 14; i++){
            btn[i].setOnClickListener((View view)->{
                Button btn = (Button)view;
                ptResult.append(btn.getText().toString());
            });
        }
        btn[14].setOnClickListener((View view)->{
            ptResult.setText("");
        });
        btn[15].setOnClickListener((View view)->{
            //연산 (eval)
            String result = ptResult.getText().toString();
            ptResult.setText(Eval.cal(result));
            Log.d(TAG, "initListener: result" +result);

        });
    }

    private void init(){
        btn[0] = findViewById(R.id.num0);
        btn[1] = findViewById(R.id.num1);
        btn[2] = findViewById(R.id.num2);
        btn[3] = findViewById(R.id.num3);
        btn[4] = findViewById(R.id.num4);
        btn[5] = findViewById(R.id.num5);
        btn[6] = findViewById(R.id.num6);
        btn[7] = findViewById(R.id.num7);
        btn[8] = findViewById(R.id.num8);
        btn[9] = findViewById(R.id.num9);
        btn[10] = findViewById(R.id.btn_add);
        btn[11] = findViewById(R.id.btn_minus);
        btn[12] = findViewById(R.id.btn_multi);
        btn[13] = findViewById(R.id.btn_divide);
        btn[14] = findViewById(R.id.btn_reset);
        btn[15] = findViewById(R.id.btn_cal);
        ptResult = findViewById(R.id.pt_result);
    }
}