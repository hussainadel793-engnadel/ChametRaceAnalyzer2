
package com.chametrace.analyzer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Chamet Race Analyzer is running");
        text.setTextSize(24);
        text.setPadding(30, 60, 30, 60);

        setContentView(text);
    }
}
