package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements IView {

    private Presenter presenter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        presenter= new Presenter(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void imageClick(View view) {
        int viewId = view.getId();
        String stringId = getResources().getResourceEntryName(viewId);
        //טור
        char lastChar = stringId.charAt(stringId.length() - 1);
        int intValueT = Character.getNumericValue(lastChar);
        //שורה
        char firstChar = stringId.charAt(stringId.length() - 2);
        int intValueS = Character.getNumericValue(lastChar);



    }

    @Override
    public void updateCell(int row, int col, int player) {

    }

    @Override
    public void displayMessage(String message) {

    }
}