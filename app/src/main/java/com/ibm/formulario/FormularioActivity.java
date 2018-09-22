package com.ibm.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        Button botonSend = findViewById(R.id.button_enviar);

botonSend.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        EditText unnombre = findViewById(R.id.edit_text_nombre);
        EditText unapellido = findViewById(R.id.edit_text_apellido);
        EditText unedad = findViewById(R.id.edit_text_edad);
        EditText unemail = findViewById(R.id.edit_text_email);
        EditText uncarrera = findViewById(R.id.edit_text_carrera);

        String nombre = unnombre.getText().toString();
        String apellido = unapellido.getText().toString();
        String edad = unedad.getText().toString();
        String email = unemail.getText().toString();
        String carrera = uncarrera.getText().toString();

        CheckBox meetups = findViewById(R.id.checkbox_meetups);
        CheckBox asado = findViewById(R.id.checkbox_asados);
        CheckBox torneos = findViewById(R.id.checkbox_torneos);

        String checkMeetUps = meetups.getText().toString();
        String checkAsado = asado.getText().toString();
        String checkTorneos = torneos.getText().toString();

        Bundle allData = new Bundle();

        allData.putString(EnvioActivity.CLAVE_NOMBRE, nombre);
        allData.putString(EnvioActivity.CLAVE_APELLIDO, apellido);
        allData.putString(EnvioActivity.CLAVE_EDAD, edad);
        allData.putString(EnvioActivity.CLAVE_CARRERA, carrera);
        allData.putString(EnvioActivity.CLAVE_EMAIL, email);

        ArrayList<String> unArray = new ArrayList<>();
        if (asado.isChecked())unArray.add(checkAsado);
        if (torneos.isChecked())unArray.add(checkTorneos);
        if(meetups.isChecked())unArray.add(checkMeetUps);

        allData.putStringArrayList(EnvioActivity.CLAVE_ASADOS, unArray);
        Intent unIntentFormulario = new Intent(FormularioActivity.this, EnvioActivity.class );

        unIntentFormulario.putExtras(allData);

        startActivity(unIntentFormulario);


    }
});


    }
}
