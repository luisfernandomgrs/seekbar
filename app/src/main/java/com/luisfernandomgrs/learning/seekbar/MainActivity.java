package com.luisfernandomgrs.learning.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBarQuestion;
    private TextView lblResponseViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize my settings
        setTitle(R.string.TitleApllication);

        seekBarQuestion = findViewById(R.id.seekBarQuestion);
        lblResponseViewMessage = findViewById(R.id.lblResponseViewMessage);

        lblResponseViewMessage.setText("");
        seekBarQuestion.setProgress(0);
        seekBarQuestion.setMax(10);
        seekBarQuestion.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lblResponseViewMessage.setText("Progresso: " + progress + " / " + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void recuperarProgreesso(View view) {
        lblResponseViewMessage.setText("Escolhido: " + seekBarQuestion.getProgress());
    }
}