package com.example.aluno.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnFalse;
    private Button btnTrue;
    private Button btnNxt;
    private TextView txtQuestion;
    private ListQuestions listQuestion;
    private Question questionAtual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFalse = (Button) findViewById(R.id.button_false);
        btnTrue = (Button) findViewById(R.id.button_true);
        btnNxt = (Button) findViewById(R.id.button_nxt);
        txtQuestion = (TextView) findViewById(R.id.text_question);
        btnFalse.setOnClickListener(this);
        btnTrue.setOnClickListener(this);
        btnNxt.setOnClickListener(this);
        listQuestion = new ListQuestions();
        getPerg();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_false:
                if(!questionAtual.getResp()){
                    Toast.makeText(this, R.string.certo,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, R.string.errado,Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button_true:
                if(questionAtual.getResp()){
                    Toast.makeText(this, R.string.certo,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, R.string.errado,Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button_nxt:
                getPerg();
                break;
            default:
                Toast.makeText(this, R.string.no_imple,Toast.LENGTH_SHORT).show();
                break;
        }

    }

    public void getPerg() {
        if(listQuestion.getQuestions().size() > 0){
            Collections.shuffle(listQuestion.getQuestions());
            questionAtual = listQuestion.getQuestions().remove(0);
            txtQuestion.setText(questionAtual.getPerg());
        } else {
            listQuestion = new ListQuestions();
        }

    }
}
