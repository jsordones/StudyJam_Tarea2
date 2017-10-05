package com.example.jsordones.calculadorasimple;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings)
            return true;


        return super.onOptionsItemSelected(item);
    }



    public void suma(View vista){

        EditText v1 = (EditText)findViewById(R.id.editText);

        EditText v2 = (EditText)findViewById(R.id.editText2);

        if(v1.getText().toString().equals("") || v2.getText().toString().equals(""))
            Toast.makeText(this,"Ambos espacios deben tener datos",Toast.LENGTH_SHORT).show();

        else {

            int x = Integer.parseInt(v1.getText().toString());

            int y = Integer.parseInt(v2.getText().toString());

            EditText v3 = (EditText) findViewById(R.id.editText3);

            v3.setText(x + y + "");
        }
    }

    public void resta(View vista){

        EditText v1 = (EditText) findViewById(R.id.editText);

        EditText v2 = (EditText) findViewById(R.id.editText2);

        if(v1.getText().toString().equals("") || v2.getText().toString().equals(""))
            Toast.makeText(this,"Ambos espacios deben tener datos",Toast.LENGTH_SHORT).show();

        else {

            int x = Integer.parseInt(v1.getText().toString());

            int y = Integer.parseInt(v2.getText().toString());

            EditText v3 = (EditText) findViewById(R.id.editText3);

            v3.setText(x - y + "");

        }

    }

    public void multiplica(View vista){

        EditText v1 = (EditText) findViewById(R.id.editText);

        EditText v2 = (EditText) findViewById(R.id.editText2);

        if(v1.getText().toString().equals("") || v2.getText().toString().equals(""))
            Toast.makeText(this,"Ambos espacios deben tener datos",Toast.LENGTH_SHORT).show();

        else {

            int x = Integer.parseInt(v1.getText().toString());

            int y = Integer.parseInt(v2.getText().toString());

            EditText v3 = (EditText) findViewById(R.id.editText3);

            v3.setText(x * y + "");

        }

    }

    public void divide(View vista){

        EditText v1 = (EditText)findViewById(R.id.editText);

        EditText v2 = (EditText)findViewById(R.id.editText2);

        if(v1.getText().toString().equals("") || v2.getText().toString().equals(""))
            Toast.makeText(this,"Ambos espacios deben tener datos",Toast.LENGTH_SHORT).show();

        else {

            int x = Integer.parseInt(v1.getText().toString());

            int y = Integer.parseInt(v2.getText().toString());

            EditText v3 = (EditText) findViewById(R.id.editText3);

            if (y != 0)
                v3.setText((double)x / y + "");

            else
                Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_SHORT).show();

        }

    }

    public void limpia(View vista){

        EditText v1 = (EditText)findViewById(R.id.editText);

        v1.setText("");

        EditText v2 = (EditText)findViewById(R.id.editText2);

        v2.setText("");

        EditText v3 = (EditText)findViewById(R.id.editText3);

        v3.setText("");

    }

}