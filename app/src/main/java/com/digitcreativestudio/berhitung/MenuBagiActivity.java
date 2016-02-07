package com.digitcreativestudio.berhitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuBagiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bagi);

        /**
         * This button below is used to move into bagi activity
         */
        Button latihan_bagi = (Button) findViewById(R.id.latihan_bagi);
        latihan_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(MenuBagiActivity.this, BagiActivity.class);
                startActivity(i);
            }
        });
        loadMateri();
    }

    /**
     * This method is used to load the materials from strings.xml
     */
    private void loadMateri() {
        TextView materi = (TextView) findViewById(R.id.materi);
        materi.setMovementMethod(new ScrollingMovementMethod());
        materi.setText(getString(R.string.materi_bagi));
    }
}
