package com.digitcreativestudio.berhitung;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class KurangActivity extends AppCompatActivity {

    int nilai_a = 0;
    int nilai_b = 0;
    int nilai_c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurang);

        /**
         * Reset the radio button when device is rotated
         */
        RadioGroup rg = (RadioGroup) findViewById(R.id.rg_jawaban);
        rg.clearCheck();
    }

    /**
     * This method is used to randomize the true answer
     *
     * @param v for the acak soal button when it's clicked
     */
    public void acakSoal(View v) {
        RadioGroup rg = (RadioGroup) findViewById(R.id.rg_jawaban);
        rg.clearCheck();
        int ra = (int)(20 * Math.random() + 1);
        int rb = (int)(20 * Math.random() + 1);
        nilai_a = ra;
        nilai_b = rb;
        displayKurangA(nilai_a);
        displayKurangB(nilai_b);
        displayHasilC("");
        int hasil = cekJawaban();
        int jawaban_benar = hasil;
        int jawaban_salah1 = hasil + 1;
        int jawaban_salah2 = hasil - 1;
        int jawaban_salah3 = hasil + 2;
        int acak_jawaban = (int)(4 * Math.random() + 1);
        if(acak_jawaban == 1) {
            this.displayJawabanA(jawaban_benar);
            this.displayJawabanB(jawaban_salah1);
            this.displayJawabanC(jawaban_salah2);
            this.displayJawabanD(jawaban_salah3);
        } else if(acak_jawaban == 2) {
            this.displayJawabanA(jawaban_salah2);
            this.displayJawabanB(jawaban_benar);
            this.displayJawabanC(jawaban_salah3);
            this.displayJawabanD(jawaban_salah1);
        } else if(acak_jawaban == 3) {
            this.displayJawabanA(jawaban_salah2);
            this.displayJawabanB(jawaban_salah1);
            this.displayJawabanC(jawaban_benar);
            this.displayJawabanD(jawaban_salah3);
        } else {
            this.displayJawabanA(jawaban_salah3);
            this.displayJawabanB(jawaban_salah2);
            this.displayJawabanC(jawaban_salah3);
            this.displayJawabanD(jawaban_benar);
        }

    }

    /**
     * This method is used to find the answer from users
     *
     * @param v for the answer from radio button
     */
    public void jawabSoal(View v) {
        int j_a = 0;
        int j_b = 0;
        int j_c = 0;
        int j_d = 0;
        String hasil = null;
        RadioButton r_1 = (RadioButton) findViewById(R.id.r_jawaban_a);
        boolean b_1 = r_1.isChecked();
        RadioButton r_2 = (RadioButton) findViewById(R.id.r_jawaban_b);
        boolean b_2 = r_2.isChecked();
        RadioButton r_3 = (RadioButton) findViewById(R.id.r_jawaban_c);
        boolean b_3 = r_3.isChecked();
        RadioButton r_4 = (RadioButton) findViewById(R.id.r_jawaban_d);
        boolean b_4 = r_4.isChecked();
        j_a = Integer.valueOf(r_1.getText().toString());
        j_b = Integer.valueOf(r_2.getText().toString());
        j_c = Integer.valueOf(r_3.getText().toString());
        j_d = Integer.valueOf(r_4.getText().toString());
        if(b_1) {
            if(nilai_c == j_a) {
                hasil = "Benar";
            } else {
                hasil = "Salah";
            }
        } else if(b_2) {
            if(nilai_c == j_b) {
                hasil = "Benar";
            } else {
                hasil = "Salah";
            }
        } else if(b_3) {
            if(nilai_c == j_c) {
                hasil = "Benar";
            } else {
                hasil = "Salah";
            }
        } else if(b_4) {
            if(nilai_c == j_d) {
                hasil = "Benar";
            } else {
                hasil = "Salah";
            }
        } else {
            hasil = "Tidak ada hasil";
        }

        this.displayHasilC(hasil);
    }

    /**
     * Display the result
     *
     * @param c for the result in string
     */
    private void displayHasilC(String c) {
        TextView hasilCTextView = (TextView) findViewById(R.id.t_hasil);
        hasilCTextView.setText(c);
    }

    /**
     * Display question A
     *
     * @param a for a value of question A
     */
    private void displayKurangA(int a) {
        TextView soalATextView = (TextView) findViewById(R.id.t_soal_a);
        soalATextView.setText("" + a);
    }

    /**
     * Display question B
     *
     * @param b for b value of question B
     */
    private void displayKurangB(int b) {
        TextView soalBTextView = (TextView) findViewById(R.id.t_soal_c);
        soalBTextView.setText("" + b);
    }

    /**
     * Display answer A
     *
     * @param a for the answer A
     */
    private void displayJawabanA(int a) {
        TextView jawabanATextView = (TextView) findViewById(R.id.r_jawaban_a);
        jawabanATextView.setText("" + a);
    }

    /**
     * Display answer B
     *
     * @param b for the answer B
     */
    private void displayJawabanB(int b) {
        TextView jawabanBTextView = (TextView) findViewById(R.id.r_jawaban_b);
        jawabanBTextView.setText("" + b);
    }

    /**
     * Display answer C
     *
     * @param c for the answer C
     */
    private void displayJawabanC(int c) {
        TextView jawabanCTextView = (TextView) findViewById(R.id.r_jawaban_c);
        jawabanCTextView.setText("" + c);
    }

    /**
     * Display answer D
     *
     * @param d for the answer D
     */
    private void displayJawabanD(int d) {
        TextView jawabanCTextView = (TextView) findViewById(R.id.r_jawaban_d);
        jawabanCTextView.setText("" + d);
    }

    /**
     * Calculate the true answer
     *
     * @return true answer
     */
    private int cekJawaban() {
        nilai_c = nilai_a - nilai_b;
        return nilai_c;
    }
}
