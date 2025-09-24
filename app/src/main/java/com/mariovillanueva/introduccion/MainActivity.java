package com.mariovillanueva.introduccion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.mariovillanueva.introduccion.modelos.UsuarioModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //variables de interfaz
    private TextView lblVeces;
    private Button btnAprietame;
    private EditText txtEmail;
    private EditText txtPassword;
    private Button btnRegistrarse;

    private int contador;
    private ArrayList<UsuarioModel> listausuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables de logica
        contador = 0;
        listausuarios = new ArrayList<>();

        btnAprietame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Le has dado al botón", Toast.LENGTH_SHORT).show();
                contador++;
                lblVeces.setText(contador + " veces");
            }
        });

      btnRegistrarse.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String email = txtEmail.getText().toString();
              String password = txtPassword.getText().toString();
              UsuarioModel usuario = new UsuarioModel(email, password);
              listausuarios.add(usuario);
              Toast.makeText(MainActivity.this, usuario.toString(), Toast.LENGTH_LONG).show();
              txtEmail.setText("");
              txtPassword.setText("");
          }
      });

    }

    private void inicializarVistas() {
        lblVeces =findViewById(R.id.lblVecesMain);
        btnAprietame =findViewById(R.id.btnAprietameMain);
        txtEmail=findViewById(R.id.txtEmailMain);
        txtPassword=findViewById(R.id.txtPasswordMain);
        btnRegistrarse =findViewById(R.id.btnRegistrarseMain);
    }

    /*public void BtnAprietameClick(View vista){
        contador++;
        lblVeces.setText(contador + " veces");
    }*/

    }