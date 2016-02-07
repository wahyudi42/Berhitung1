package com.digitcreativestudio.berhitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuKaliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kali);

        /**
         * This button below is used to move into kali activity
         */
        Button latihan_kali = (Button) findViewById(R.id.latihan_kali);
        latihan_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(MenuKaliActivity.this, KaliActivity.class);
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
        materi.setText(getString(R.string.materi_kali));
    }
}
