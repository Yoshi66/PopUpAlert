package com.popuptutorial.app;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener, DialogInterface.OnClickListener {

    Button btn;
    TextView tx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.openbtn);
        tx = (TextView) findViewById(R.id.tx);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        AlertDialog ad = new AlertDialog.Builder(this)
                .setTitle("this is it")
                .setMessage("this is it")
                .setPositiveButton("yes", this)
                .setNegativeButton("no", this)
                .setNeutralButton("cancel", this)
                .setCancelable(false)
                .create();
        ad.show();
    }



    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which) {
            case DialogInterface.BUTTON_POSITIVE:
                tx.setText("hello");
                break;
            case DialogInterface.BUTTON_NEUTRAL:
                tx.setText("okay");
                break;
            case DialogInterface.BUTTON_NEGATIVE:
                tx.setText("okaokay");
                break;
            default:
                break;
        }
    }


}


