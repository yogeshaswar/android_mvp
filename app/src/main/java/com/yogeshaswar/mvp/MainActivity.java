package com.yogeshaswar.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.yogeshaswar.mvp.models.MyModel;

public class MainActivity extends AppCompatActivity {
Button btn, btnReset;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiateUI();
        btn.setOnClickListener((v) -> {
            showAppInData();
        });
        btnReset.setOnClickListener((v) -> {
            txt.setText("click btn below");
        });

    }

    private void showAppInData() {
        MyModel model = getAppFromMyModel();
        txt.setText("App Name: " + model.getAppName() + "\nDownloads: " + model.getAppDownloads()
        + "\n Ratinng: " + model.getAppRating());
    }

    private void initiateUI() {
        txt = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);
        btnReset = findViewById(R.id.btnReset);
    }

    public MyModel getAppFromMyModel() {
        return new MyModel("dhghdg",563658, "472546");
    }
}