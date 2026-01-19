package com.example.project07;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public ImageView image;
    public Button text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.image);
        text = findViewById(R.id.button);
    }
    public void go(View view) {
        int num = (int) (Math.random() * 3);
        if (num == 2){
            image.setImageResource(R.drawable.image3);
            text.setText("3");
        }
        else if (num == 1){
            image.setImageResource(R.drawable.image2);
            text.setText("2");
        }
        else{
            image.setImageResource(R.drawable.image1);
            text.setText("1");
        }
    }
}