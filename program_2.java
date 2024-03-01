package com.example.aProgram2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
TextView tv;
Button bt;
@Override protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
tv=(TextView) findViewById(R.id.t1);
bt=(Button) findViewById(R.id.b1);
bt.setOnClickListener(this);
}
@Override public void onClick(View view) {
tv.setText("You clicked Button 1");
}
public void dosomething(View view) {
tv.setText("You Clicked Button 2");
}
}