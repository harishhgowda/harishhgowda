package com.example.aProgram3;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
}
@Override
protected void onStart() {
super.onStart();
Toast.makeText(this, "onstart", Toast.LENGTH_LONG).show();
}
@Override
protected void onResume() {
super.onResume();
Toast.makeText(this, "onresume", Toast.LENGTH_LONG).show();
}
@Override
protected void onPause() {
super.onPause();
Toast.makeText(this, "onpause", Toast.LENGTH_LONG).show();
}
@Override
protected void onStop() {
super.onStop();
Toast.makeText(this, "onstop", Toast.LENGTH_LONG).show();
}
@Override
protected void onRestart() {
super.onRestart();
Toast.makeText(this, "onrestart", Toast.LENGTH_LONG).show();
}
@Override
protected void onDestroy() {
super.onDestroy();
Toast.makeText(this, "ondestroy", Toast.LENGTH_LONG).show();
}
}