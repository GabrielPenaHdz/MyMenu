package com.example.myoptionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        boolean flag = false;
        MenuInflater menuInflater;
        flag = super.onCreateOptionsMenu(menu);
        menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.mi_menu, menu);
        return flag;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String seleccion = null;
        switch (item.getItemId())
        {
            case R.id.menuNuevoId:
            case R.id.menuCopiarId:
            case R.id.menuAyudaId:
            case R.id.menuPegarId:
                seleccion = String.format("opción %s", item.getTitle().toString());
                break;
            default:
                seleccion = "Sin opción";
                break;
        }
        Toast.makeText(getBaseContext(), seleccion, Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);

    }
}