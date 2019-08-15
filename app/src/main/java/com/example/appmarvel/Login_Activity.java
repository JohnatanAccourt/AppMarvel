package com.example.appmarvel;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class Login_Activity extends AppCompatActivity {

    EditText txtUsuario, txtSenha;
    Button btnEntrar, btnSair;

    public static final String EXTRA_MESSAGE = "br.sp.senac.appvalidausuario.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_layout);

        txtUsuario = (EditText) findViewById(R.id.txtEmail);
        txtSenha = (EditText) findViewById(R.id.txtSenha);

        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        btnSair = (Button) findViewById(R.id.btnSair);

        txtUsuario.requestFocus();

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario, senha;

                usuario = txtUsuario.getText().toString();
                senha = txtSenha.getText().toString();

                if (usuario.equals("johnatan") && senha.equals("senac")){
                    Intent intent = new Intent(getApplicationContext(), Personagem_Activity.class);
                    String message = txtUsuario.getText().toString();
                    intent.putExtra(EXTRA_MESSAGE, message);

                    startActivity(intent);
                    finish();
                } else{
                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show();
                    txtUsuario.setText("");
                    txtSenha.setText("");

                }
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
