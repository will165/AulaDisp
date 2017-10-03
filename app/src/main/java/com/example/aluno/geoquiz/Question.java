package com.example.aluno.geoquiz;

/**
 * Created by William on 03/10/17.
 * Classe java para a
 */

public class Question {
    private String perg;
    private Boolean resp;

    public Question(String perg, Boolean resp) {
        this.perg = perg;
        this.resp = resp;
    }

    public String getPerg() {
        return perg;
    }

    public void setPerg(String perg) {
        this.perg = perg;
    }

    public Boolean getResp() {
        return resp;
    }

    public void setResp(Boolean resp) {
        this.resp = resp;
    }
}
