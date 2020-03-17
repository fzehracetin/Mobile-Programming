package com.example.myfirstfinalapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    ArrayList<Person> personList;
    LayoutInflater inflater;

    public ProductAdapter(Context context, ArrayList<Person> personList) {
        inflater = LayoutInflater.from(context);
        this.personList = personList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_product_card, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Product selectedProduct = personList.get(position);
        holder.setData(selectedProduct, position);
    }

    @Override
    public int getItemCount() {
        return ProductList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView productName, productDescription;
        ImageView productImage;
    }
}
