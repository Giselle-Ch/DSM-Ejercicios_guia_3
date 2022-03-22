package sv.edu.udb.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFrame(View view){
        Intent llamar = new Intent(this, ejemplo_frame_layout.class);
        startActivity(llamar);
    }

    public void onClickLinear(View view){
        Intent llamar = new Intent(this, ejemplo_linear_layout.class);
        startActivity(llamar);
    }

    public void onClickRelative(View view){
        Intent llamar = new Intent(this, ejemplo_relative_layout.class);
        startActivity(llamar);
    }

    public void onClickTable(View view){
        Intent llamar = new Intent(this, ejemplo_table_layout.class);
        startActivity(llamar);
    }

    public void onClickGrid(View view){
        Intent llamar = new Intent(this, ejemplo_grid_layout.class);
        startActivity(llamar);
    }

    public void onClickEjercicio1(View view){
        Intent llamar = new Intent(this, ejercicio_relative_layout.class);
        startActivity(llamar);
    }

    public void onClickEjercicio2(View view){
        Intent llamar = new Intent(this, ejercicio_constraint_layout.class);
        startActivity(llamar);
    }
}