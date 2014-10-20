package org.dongyf.szbus.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import org.dongyf.szbus.R;

public class MyActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    private EditText stationEt = null;
    private EditText buslineEt = null;
    private Button queryBtn = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        stationEt = (EditText) findViewById(R.id.stationEt);
        buslineEt = (EditText) findViewById(R.id.buslineEt);
        queryBtn = (Button) findViewById(R.id.query);
        queryBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.query:

                break;
        }
    }
}
