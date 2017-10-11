


package com.example.omar.miwalk;

import android.app.LauncherActivity;
import android.content.Context;
import android.provider.MediaStore;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by omar on 04/10/17.
 */

public class WordAdabter extends ArrayAdapter <Words>{

    private int back=0;

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View ListItemView =convertView;
        if (ListItemView==null){

            ListItemView= LayoutInflater.from(getContext()).inflate(R.layout.listltem,parent,false);

        }
Words current = getItem(position);
        TextView t1=(TextView)ListItemView.findViewById(R.id.eng);
        TextView t2=(TextView)ListItemView.findViewById(R.id.miw);
        ImageView i=(ImageView)ListItemView.findViewById(R.id.imageView);

t1.setText(current.getEngword());
        t2.setText(current.getMiword());

        if(current.getImage()==-1){

            i.setVisibility(View.GONE);
        }else {
            i.setImageResource(current.getImage());
            i.setVisibility(View.VISIBLE);
        }

        return ListItemView;
    }

    public WordAdabter(@NonNull Context context, @LayoutRes int resource, @NonNull List objects) {
        super(context, 0, objects);
    }


    public int getBack() {
        return back;
    }

    public void setBack(int back) {
        this.back = back;
    }
}
