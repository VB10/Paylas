package com.vb.paylas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et= (EditText) findViewById(R.id.editText);
    }

    public void paylas(View view) {
        Intent paylasim = new Intent(Intent.ACTION_SEND);
        paylasim.setType("text/plain");
        paylasim.putExtra(Intent.EXTRA_TEXT,et.getText());
        startActivity(Intent.createChooser(paylasim ,"HardwareAndro"));

    }
}
