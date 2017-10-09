package com.example.omar.cofee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

   Integer price=0;
    Integer ncof=0;
String name =null;
    String s =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void add(View view) {
        String sncof="null";
        if(ncof<100){
            ncof=ncof+1;
            sncof=ncof.toString();
            TextView t1=(TextView)findViewById(R.id.ncof);
            t1.setText(sncof);}else{
            Toast.makeText(this,"cant order over 100 cofee", Toast.LENGTH_LONG).show();

        }

    }

    public void sub(View view) {

        String sncof="null";
        if(ncof>1){
        ncof=ncof-1;
        sncof=ncof.toString();
        TextView t1=(TextView)findViewById(R.id.ncof);
        t1.setText(sncof);}else{
Toast.makeText(this,"enter valid value", Toast.LENGTH_LONG).show();

    }}



    public void calc(View view) {

        TextView t1=(TextView)findViewById(R.id.value);


        price=ncof*5;
            boolean ch1=checkchoclate(findViewById(R.id.addchoclate));
            boolean ch2 =checkcream(findViewById(R.id.addcream));
            getName(findViewById(R.id.editn));
        s= "name :"+name+"\n"+"you ordererd :"+ncof+ "\nchoclate :"+ch1+"\ncream :"+ch2+"\nprice is  "+price.toString();
        t1.setText(s);

    }

    public void getName(View view) {

        EditText e=(EditText)findViewById(R.id.editn);
        name=e.getText().toString();

    }

    public boolean checkchoclate(View view) {

        CheckBox ch=(CheckBox)findViewById(R.id.addchoclate);
        if (ch.isChecked()==true){
        price=price+2*ncof;}
    return ch.isChecked();
    }

    public boolean checkcream(View view) {

        CheckBox ch=(CheckBox)findViewById(R.id.addcream);
        if (ch.isChecked()==true){
            price=price+2*ncof;}
        return ch.isChecked();
    }

    public void email(View view) {

    Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_SUBJECT, "order");
        intent.putExtra(Intent.EXTRA_TEXT, s);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
