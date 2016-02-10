package com.sourceit.task2.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sourceit.task2.R;
import com.sourceit.task2.model.Product;

import java.util.LinkedList;

/**
 * Created by User on 08.02.2016.
 */
public class MyAdapter extends ArrayAdapter<Product> {
    public MyAdapter(Context context, LinkedList<Product> objects) {
        super(context, R.layout.product_case, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        View rowView = convertView;
        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.product_case, parent, false);
            holder = new ViewHolder();
            holder.count = (TextView) rowView.findViewById(R.id.count);
            holder.product = (TextView) rowView.findViewById(R.id.product);
            rowView.setTag(holder);
        } else {
            holder = (ViewHolder) rowView.getTag();
        }

        Product product = getItem(position);
        holder.product.setText(product.getTitle());
        holder.count.setText(String.valueOf(product.getCount()));

        return rowView;
    }

    class ViewHolder {
        public TextView product;
        public TextView count;
    }
}
