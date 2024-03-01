package com.example.a6aimplicitintent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openweb(View view) {
               Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(i1);
 }
    public void opendial(View view) {
             Intent i2=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:767889908908"));
                startActivity(i2);}
                public void openmap(View view) {
                Intent i3=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:20.593,78.9629"));
                startActivity(i3);       
        }    
}
