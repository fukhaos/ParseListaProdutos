package br.com.viniciusoliveira.uniparparse;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;


public class CadastroActivity extends ActionBarActivity {

    private EditText nome;
    private EditText categoria;
    private EditText estoque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = (EditText) findViewById(R.id.nome);
        categoria = (EditText) findViewById(R.id.categoria);
        estoque = (EditText) findViewById(R.id.estoque);
     }

    public void salvar(View view) {

        ParseObject produto = new ParseObject("Produto");
        produto.put("nome", nome.getText().toString());
        produto.put("categoria", categoria.getText().toString());
        produto.put("estoque", Integer.parseInt(estoque.getText().toString()));

        produto.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Toast.makeText(CadastroActivity.this, "Produto salvo", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(CadastroActivity.this, "Erro no cadastro", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
