package sg.edu.rp.c346.id19046224.demodialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button demobtn1, demobtn2;
    TextView tvDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        demobtn1 = findViewById(R.id.buttonDemo1);
        demobtn2 = findViewById(R.id.buttonDemo2);
        tvDemo = findViewById(R.id.textView);

        demobtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create the dialog builder
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                //Set the dialog details
                /*myBuilder.setTitle("Demo 1 - Simple Dialog");
                myBuilder.setMessage("I can develop Android App");
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("Close",null);*/

                //New code for dialog details here
                myBuilder.setTitle("Congratulations");
                myBuilder.setMessage("You have completed a simple Dialog box");
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("Dimiss", null);


                AlertDialog myDialog = myBuilder.create();
                myDialog.show();

            }
        });

        demobtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create the dialog builder
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                //New code for dialog details here
                myBuilder.setTitle("Congratulations");
                myBuilder.setMessage("You have completed a simple Dialog box");
                myBuilder.setCancelable(false);

                //configure positive button
                myBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tvDemo.setText("You have selected Positive");
                    }
                });

                //configure negative button
                myBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tvDemo.setText("You have selected Negative");
                    }
                });

                //configure neutral button
                myBuilder.setNeutralButton("Cancel", null);

                //Build and show dialog
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();

            }
        });
    }
}
