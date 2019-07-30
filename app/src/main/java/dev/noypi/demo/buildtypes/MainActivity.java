package dev.noypi.demo.buildtypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView urlTextView = findViewById(R.id.baseUrlTextView);
        urlTextView.setText(AppConfig.BASE_URL);

        if (AppConfig.IS_LOGGING_ENABLED) {
            urlTextView.setTextColor(getColor(R.color.colorAccent));
        } else {
            urlTextView.setTextColor(getColor(R.color.colorPrimaryDark));
        }
    }
}
