package com.digitcreativestudio.berhitung;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

/**
 * Created by Eko
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**
         * This button below is used to move into another activity
         */
        Button m_tambah = (Button) findViewById(R.id.b_tambah);
        m_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(MainActivity.this,MenuTambahActivity.class);
                startActivity(i);
            }
        });
        Button m_kurang = (Button) findViewById(R.id.b_kurang);
        m_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(MainActivity.this,MenuKurangActivity.class);
                startActivity(i);
            }
        });
        Button m_kali = (Button) findViewById(R.id.b_kali);
        m_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(MainActivity.this,MenuKaliActivity.class);
                startActivity(i);
            }
        });
        Button m_bagi = (Button) findViewById(R.id.b_bagi);
        m_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(MainActivity.this,MenuBagiActivity.class);
                startActivity(i);
            }
        });
        Button m_operasi_hitung = (Button) findViewById(R.id.b_operasi_hitung);
        m_operasi_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(MainActivity.this,MenuOperasiHitungActivity.class);
                startActivity(i);
            }
        });
    }

}
