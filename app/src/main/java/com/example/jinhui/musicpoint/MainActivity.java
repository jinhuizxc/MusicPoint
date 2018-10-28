package com.example.jinhui.musicpoint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *
 * https://github.com/LiuStangMing/MusicPoint
 * 仿网易云的唱片UI
 */
public class MainActivity extends AppCompatActivity {

    private MusicPoint musicPoint;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musicPoint = findViewById(R.id.id_music);
        btn = findViewById(R.id.id_start);

        musicPoint.setImageResource(R.drawable.beaufy);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (musicPoint.isStart()){
                    btn.setText("停止");
                    musicPoint.pause();
                }else{
                    btn.setText("播放");
                    musicPoint.start();
                }
            }
        });

    }
}
