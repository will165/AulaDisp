package com.example.aluno.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnFalse;
    private Button btnTrue;
    private TextView txtQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFalse = (Button) findViewById(R.id.button_false);
        btnTrue = (Button) findViewById(R.id.button_true);
        txtQuestion = (TextView) findViewById(R.id.text_question);
        btnFalse.setOnClickListener(this);
        btnTrue.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_false:
                Toast.makeText(this, R.string.errado,Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_true:
                Toast.makeText(this, R.string.certo,Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, R.string.no_imple,Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
