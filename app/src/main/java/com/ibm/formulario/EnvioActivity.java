package com.ibm.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EnvioActivity extends AppCompatActivity {

public static final String CLAVE_NOMBRE = "NOMBRE";
public final static String CLAVE_APELLIDO = "APELLIDO";
public final static String CLAVE_EDAD = "EDAD";
public final static String CLAVE_CARRERA = "CARRERA";
public final static String CLAVE_EMAIL = "EMAIL";
public final static String CLAVE_ASADOS = "CHORIPANYMORZILLA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envio);

        Intent unIntent = getIntent();

        Bundle bundle = unIntent.getExtras();

        TextView setNombre = findViewById(R.id.text_view_set_nombre);
        TextView setApellido = findViewById(R.id.text_view_set_apellido);
        TextView setEdad = findViewById(R.id.text_view_set_edad);
        TextView setCarrera = findViewById(R.id.text_view_set_carrera);
        TextView setEmail = findViewById(R.id.text_view_set_email);
        TextView setElecciones = findViewById(R.id.text_view_checkboxElegidos);


        setNombre.setText(bundle.get(CLAVE_NOMBRE).toString());
        setApellido.setText(bundle.get(CLAVE_APELLIDO).toString());
        setEdad.setText(bundle.get(CLAVE_EDAD).toString());
        setCarrera.setText(bundle.get(CLAVE_CARRERA).toString());
        setEmail.setText(bundle.get(CLAVE_EMAIL).toString());
        setElecciones.setText(bundle.get(CLAVE_ASADOS).toString());

    }
}
