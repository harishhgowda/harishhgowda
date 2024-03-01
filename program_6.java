package com.example.loginform;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uname,password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname= (EditText) findViewById(R.id.etName) ;
        password=(EditText) findViewById(R.id.etPassword);

    }
    public void Login(View view) {
        if(uname.getText().toString().equals("Admin")&&password.getText().toString().equals("1234"))
        {
            Intent i=new Intent(this,Second.class);
            startActivity(i);
            Toast.makeText(this, " Login Successful", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this, "Login Failure", Toast.LENGTH_SHORT).show();
        }

    }
}
