package com.example.ucudashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {

    public ImageView img;
    public Button logout;
    public TextView name;
    public TextView idno;
    String n;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        img = (ImageView) findViewById(R.id.dbimg);
        Bundle rimg = getIntent().getExtras();            //
        if (rimg!=null){                                  //
            int resimage = rimg.getInt("profile");   // FOR IMAGE CATCH FROM MAIN JAVA/XML
            img.setImageResource(resimage);               //
        }                                                 //
        logout = (Button) findViewById(R.id.logout);//
        name = findViewById(R.id.name);//CONFIGURING ID OF ELEMENTS
        idno = findViewById(R.id.idno);//
        id="ID No: "+getIntent().getExtras().getString("idnumber");// CATCH ID NUMBER/USERNAME FROM MAIN
        n="Name: "+getIntent().getExtras().getString("sname");//GETS THE NAME OF STUDENT/ID OWNER FROM MAIN
        idno.setText(id);//SETS TEXTVIEW
        name.setText(n);//

        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Dashboard.this,MainActivity.class); //RETURN TO MAIN (LOGOUT)
                startActivity(intent);
                finish();
            }
        });
    }
}