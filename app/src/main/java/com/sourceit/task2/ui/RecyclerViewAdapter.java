package com.sourceit.task2.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sourceit.task2.R;
import com.sourceit.task2.model.Product;

import java.util.LinkedList;

/**
 * Created by User on 11.02.2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private LinkedList<Product> products;

    public RecyclerViewAdapter(LinkedList<Product> contacts) {
        this.products = contacts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_case, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.title.setText(products.get(position).title);
        holder.count.setText(String.valueOf(products.get(position).count));
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView count;

        public ViewHolder(View item) {
            super(item);
            count = (TextView) item.findViewById(R.id.count);
            title = (TextView) item.findViewById(R.id.product);
        }
    }
}
