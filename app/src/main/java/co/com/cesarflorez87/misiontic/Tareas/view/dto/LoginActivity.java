package co.com.cesarflorez87.misiontic.Tareas.view.dto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import co.com.cesarflorez87.misiontic.Tareas.R;
import co.com.cesarflorez87.misiontic.Tareas.view.MainActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void irTareas(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}