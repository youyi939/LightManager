package com.example.youyi.lightmanager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Road> {

    private int resourId;
    private List<Road> roads;

    public ListViewAdapter( Context context, int resource, List<Road> objects) {
        super(context, resource, objects);
        resourId = resource;
        roads = objects;
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        final Road road = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourId,parent,false);

        final TextView num = view.findViewById(R.id.num);
        final TextView red = view.findViewById(R.id.red);
        final TextView yel = view.findViewById(R.id.yel);
        final TextView gre = view.findViewById(R.id.gre);
        final Button change = view.findViewById(R.id.change);

        num.setText(String.valueOf(roads.get(position).getNumber()));
        red.setText(String.valueOf(roads.get(position).getRed()));
        yel.setText(String.valueOf(roads.get(position).getYellow()));
        gre.setText(String.valueOf(roads.get(position).getGreen()));

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        return view;
    }
}