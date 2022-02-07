package com.example.listacompra;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdaptadorProductos extends ArrayAdapter<Producto> {
    Context ctx;
    int template;
    List<Producto> listaProductos
    public AdaptadorProductos(@NonNull Context context, int resource, @NonNull List<Producto> objects) {
        super(context, resource, objects);
        this.ctx = context;
        this.template = resource;
        this.listaProductos = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}

