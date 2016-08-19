package org.mefistofele.hikari.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.button;
import static android.R.attr.data;
import static org.mefistofele.hikari.appportfolio.R.string.app_name;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button firstButton = (Button) findViewById(R.id.button_first_project);
        final Button secondButton = (Button) findViewById(R.id.button_second_project);
        final Button thirdButton = (Button) findViewById(R.id.button_third_project);
        final Button forthButton = (Button) findViewById(R.id.button_forth_project);
        final Button fifthButton = (Button) findViewById(R.id.button_fifth_project);
        final Button sixthButton = (Button) findViewById(R.id.button_sixth_project);

        firstButton.setOnTouchListener(this);
        secondButton.setOnTouchListener(this);
        thirdButton.setOnTouchListener(this);
        forthButton.setOnTouchListener(this);
        fifthButton.setOnTouchListener(this);
        sixthButton.setOnTouchListener(this);
    }

    private void display_message(String appName) {
        String message = "This button will launch my \"" + appName + "\" application";
        Toast.makeText(this, message,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Button button = (Button) v;
        String appName = button.getText().toString();

        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                display_message(appName);
                break;
        }

        return true;
    }
}
