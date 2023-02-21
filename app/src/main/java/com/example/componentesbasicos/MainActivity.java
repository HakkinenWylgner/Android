package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkPreto, checkVermelho, checkRosa;
    //RadioButton
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);

        //checkBox
        checkVermelho = findViewById(R.id.checkVermelho);
        checkPreto = findViewById(R.id.checkPreto);
        checkRosa = findViewById(R.id.checkRosa);

        //RadioButton
        sexoFeminino = findViewById(R.id.radioButtonFemenino);
        sexoMasculino = findViewById(R.id.radioButtonMasculino);
        opcaoSexo     = findViewById(R.id.radioGroupSexo);
        radiobutton();
    }

/*    public void checkBox() {
 method .isChecked does the boolean check, the last selected value gets the addition in String text.
if a statement is true it is checked
when the user receive a selection box, the object checkBox receive a event click

        String texto = "";
        if (checkVermelho.isChecked()) {
            String corSelecionada = checkVermelho.getText().toString();
             texto = corSelecionada;
            texto = texto +  "Vermelho selecionado - ";
        }

        if (checkPreto.isChecked()) {
            texto = texto + "Preto selecionado - ";
        }

        if (checkRosa.isChecked()) {
            texto = texto + "Rosa selecionado - ";
        }

            textoResultado.setText(texto );

    }*/

    public void radiobutton() {

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged (RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonMasculino){
                    textoResultado.setText("Masculino");
                }else if ( checkedId == R.id.radioButtonFemenino) {
                    textoResultado.setText("Feminino");
                }
            }
        });
        /*if (sexoMasculino.isChecked()) {
        textoResultado.setText("Masculino");
        } else if (sexoFeminino.isChecked()) {
        textoResultado.setText("Feminino");
        }*/
    }

        public void enviar (View view){
        textoResultado.setText("");
        radiobutton();
            //checkBox();

       /*String nome = campoNome.getText().toString();
         String email = campoEmail.getText().toString();
         textoResultado.setText( "nome: " + nome + " email: " + email );*/

        }

        public void limpar (View view){

            campoNome.setText("");
            campoEmail.setText("");

        }

    }
