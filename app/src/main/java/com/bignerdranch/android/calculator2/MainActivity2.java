package com.bignerdranch.android.calculator2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzz;

import org.w3c.dom.Text;


public class MainActivity2 extends AppCompatActivity {
    private Button mDesignerButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient mClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mDesignerButton = (Button) findViewById(R.id.design_button);
        mDesignerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, DesignerActivity.class);
                startActivity(i);
            }

        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        mClient = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }




    public void onAddClick(View v) {

        EditText zzz = (EditText) findViewById(R.id.num1);
        EditText aaa = (EditText) findViewById(R.id.num2);
        if (zzz.getText().toString().equals("")) {
            Toast.makeText(MainActivity2.this, R.string.invalid_entry, Toast.LENGTH_SHORT).show();
        } else {
            if (aaa.getText().toString().equals("")) {
                Toast.makeText(MainActivity2.this, R.string.invalid_entry, Toast.LENGTH_SHORT).show();
            } else {

                double n1, n2, s1;
                EditText a1 = (EditText) findViewById(R.id.num1);
                EditText a2 = (EditText) findViewById(R.id.num2);
                TextView z1 = (TextView) findViewById(R.id.sum);
                n1 = Double.parseDouble(a1.getText().toString());
                n2 = Double.parseDouble(a2.getText().toString());
                s1 = n1 + n2;
                z1.setText(Double.toString(s1));
            }
        }
    }
    public void onSubtractClick(View v) {
        EditText yyy = (EditText) findViewById(R.id.num1);
        EditText bbb = (EditText) findViewById(R.id.num2);
        if (yyy.getText().toString().equals("")) {
            Toast.makeText(MainActivity2.this, R.string.invalid_entry, Toast.LENGTH_SHORT).show();
        } else {
            if (bbb.getText().toString().equals("")) {
                Toast.makeText(MainActivity2.this, R.string.invalid_entry, Toast.LENGTH_SHORT).show();
            } else {
                double m1, m2, t1;
                EditText b1 = (EditText) findViewById(R.id.num1);
                EditText b2 = (EditText) findViewById(R.id.num2);
                TextView y1 = (TextView) findViewById(R.id.sum);
                m1 = Double.parseDouble(b1.getText().toString());
                m2 = Double.parseDouble(b2.getText().toString());
                t1 = m1 - m2;
                y1.setText(Double.toString(t1));

            }
        }
    }

    public void onMultiplyClick(View v) {
        EditText xxx = (EditText) findViewById(R.id.num1);
        EditText ccc = (EditText) findViewById(R.id.num2);
        if (xxx.getText().toString().equals("")) {
            Toast.makeText(MainActivity2.this, R.string.invalid_entry, Toast.LENGTH_SHORT).show();
        } else {
            if (ccc.getText().toString().equals("")) {
                Toast.makeText(MainActivity2.this, R.string.invalid_entry, Toast.LENGTH_SHORT).show();
            } else {

                double o1, o2, u1;
                EditText c1 = (EditText) findViewById(R.id.num1);
                EditText c2 = (EditText) findViewById(R.id.num2);
                TextView x1 = (TextView) findViewById(R.id.sum);
                o1 = Double.parseDouble(c1.getText().toString());
                o2 = Double.parseDouble(c2.getText().toString());
                u1 = o1 * o2;
                x1.setText(Double.toString(u1));
            }
        }
    }
    public void onDivideClick(View v) {
        EditText www = (EditText) findViewById(R.id.num1);
        EditText ddd = (EditText) findViewById(R.id.num2);
        if (www.getText().toString().equals("")) {
            Toast.makeText(MainActivity2.this, R.string.invalid_entry, Toast.LENGTH_SHORT).show();
        } else {
            if (ddd.getText().toString().equals("")) {
                Toast.makeText(MainActivity2.this, R.string.invalid_entry, Toast.LENGTH_SHORT).show();
            } else {

                double p1, p2, w1;
                EditText d1 = (EditText) findViewById(R.id.num1);
                EditText d2 = (EditText) findViewById(R.id.num2);
                TextView g1 = (TextView) findViewById(R.id.sum);
                p1 = Double.parseDouble(d1.getText().toString());
                p2 = Double.parseDouble(d2.getText().toString());
                w1 = p1 / p2;
                g1.setText(Double.toString(w1));
            }
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        mClient.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "MainActivity2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.bignerdranch.android.calculator2/http/host/path")
        );
        AppIndex.AppIndexApi.start(mClient, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "MainActivity2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.bignerdranch.android.calculator2/http/host/path")
        );
        AppIndex.AppIndexApi.end(mClient, viewAction);
        mClient.disconnect();
    }
}


