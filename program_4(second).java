package com.example.a6aexplicitintent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class Second extends AppCompatActivity {
TextView t;
@Override protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState); setContentView(R.layout.activity_second);
t=(TextView) findViewById(R.id.result);
Bundle b1= getIntent().getExtras();
String s1=b1.getString("user");
t.setText(s1);
}
}