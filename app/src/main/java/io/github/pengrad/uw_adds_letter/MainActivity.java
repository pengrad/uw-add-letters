package io.github.pengrad.uw_adds_letter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editSource = (EditText) findViewById(R.id.editSource);
        final EditText editDest = (EditText) findViewById(R.id.editDest);

        findViewById(R.id.buttonChange).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String src = editSource.getText().toString();
                String dest = "";
                for (int i = 0; i < src.length(); i++) {
                    char c = src.charAt(i);
                    if (c != ' ') {
                        for (int j = 0; j < 4; j++) {
                            dest += c;
                        }
                    } else {
                        dest += c;
                    }
                }
                editDest.setText(dest);
            }
        });
    }
}
