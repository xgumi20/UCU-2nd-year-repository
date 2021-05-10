package com.example.ucudashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    public TextView tv;
    public EditText username;
    public EditText password;
    public Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.incorrect);
        login = findViewById(R.id.Login);//
        username = findViewById(R.id.username);// CONFIGURING ID OF ELEMENTS
        password =  findViewById(R.id.password);//

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String uname = username.getText().toString();//CATCH EDITTEXT VALUE
                String pword = password.getText().toString();//
               if (uname.equals("20190209") && pword.equals("xinjin")){//
                   Intent intent = new Intent(MainActivity.this,Dashboard.class);//IF TRUE IT WILL TRANSFER TO THE DASHBOARD INFO
                   intent.putExtra("idnumber",uname);//
                   intent.putExtra("sname", "Mariñas, Ian Eleazar B.");// PASSING VALUE TO OTHER FILE
                   intent.putExtra("profile", R.drawable.ianphoto);// PASSING IMAGE VALUE TO OTHER FILE
                   startActivity(intent);//
                   finish();//

               }else if(uname.equals("20190112") && pword.equals("12151994")){
                   Intent intent = new Intent(MainActivity.this,Dashboard.class);//IF TRUE IT WILL TRANSFER TO THE DASHBOARD INFO
                   intent.putExtra("idnumber",uname);//
                   intent.putExtra("sname", "Vinluan, Wendy DL. ");// PASSING VALUE TO OTHER FILE
                   intent.putExtra("profile", R.drawable.atewende);// PASSING IMAGE VALUE TO OTHER FILE
                   startActivity(intent);//
                   finish();//

               }else if(uname.equals("20190129") && pword.equals("140102")){
                   Intent intent = new Intent(MainActivity.this,Dashboard.class);//IF TRUE IT WILL TRANSFER TO THE DASHBOARD INFO
                   intent.putExtra("idnumber",uname);//
                   intent.putExtra("sname", "Navalta, Niel Angelo I.");// PASSING VALUE TO OTHER FILE
                   intent.putExtra("profile", R.drawable.niel);// PASSING IMAGE VALUE TO OTHER FILE
                   startActivity(intent);//
                   finish();//
               }else if(uname.equals("20192625") && pword.equals("14150919")){
                   Intent intent = new Intent(MainActivity.this,Dashboard.class);//IF TRUE IT WILL TRANSFER TO THE DASHBOARD INFO
                   intent.putExtra("idnumber",uname);//
                   intent.putExtra("sname", "Laluan, Don-Don");// PASSING VALUE TO OTHER FILE
                   intent.putExtra("profile", R.drawable.dondon);// PASSING IMAGE VALUE TO OTHER FILE
                   startActivity(intent);//
                   finish();//
                }else{
                   username.setText("");
                	password.setText("");
                   tv.setVisibility(View.VISIBLE);

               }
        }});

    }
}


//