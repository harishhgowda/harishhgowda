package com.example.a6aexplicitintent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
EditText e;
@Override protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); e=(EditText) findViewById(R.id.edit);
}
public void dosomething(View view) {
Intent i1=new Intent(this,Second.class);
i1.putExtra("user",e.getText().toString()); startActivity(i1);
}
}