package com.example.a98102458796.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnIrMenu;
    private EditText edUserName;
    String nombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombreUsuario = "NA";

        //oli esto esta prro
        btnIrMenu =findViewById(R.id.btn_ir_menu);
        btnIrMenu.setOnClickListener(new View.OnClickListener(){
            public void OnClick(View view){
                Intent intento = new Intent(getApplicationContext(), Menu.class);
                intento.putExtra(name: "usuario", nombreUsuario);
                startActivity(intento);
            }
        });
    }
}
