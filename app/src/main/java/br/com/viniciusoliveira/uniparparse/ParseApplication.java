package br.com.viniciusoliveira.uniparparse;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by user on 07/06/15.
 */
public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        //inicio permite salvar os dados localmente
        Parse.enableLocalDatastore(this);

        //inicia o projeto
        Parse.initialize(this, "qeeu00FyhMMvCyD0Kiq9diT21URAbuEs8aZKFhMP", "ZEaRDpv7CRzrO0ZsiqMcVFZIDrtvQdje8fabZ1If");
    }
}
