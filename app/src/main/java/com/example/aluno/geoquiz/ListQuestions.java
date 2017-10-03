package com.example.aluno.geoquiz;

import android.content.res.Resources;

import java.util.ArrayList;

/**
 * Created by William on 03/10/17.
 * Classe java para a
 */

public class ListQuestions {
    private ArrayList<Question> questions;

    public ListQuestions() {
        questions = new ArrayList<>();
        Question question = new Question("Android > IOS",true);
        questions.add(question);
        questions.add(new Question("Bill Gates fundou a Apple e se tornou o homem mais rico do mundo.",false));
        questions.add(new Question("Coca-cola faz muito bem para saúde se tomar 2 litros por dia.",false));
        questions.add(new Question("Tonga é um país da África.",false));
        questions.add(new Question("LOL > DOTA",true));
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
