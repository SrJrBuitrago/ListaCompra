package com.example.listacompra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    List<Producto> listaProductos;
    ImageView imagenProducto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.listViewProductos);
        listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Ambientador Frescor Ropa Limpia","Campero","Ambientador de la marca campero que garantiza un olor al frescor de la ropa limpia",400.0, 2.50, 2));
        AdaptadorProductos adaptadorProductos = new AdaptadorProductos(this, R.layout.producto, listaProductos);
        lista.setAdapter(AdaptadorProductos);
        imagenProducto = (ImageView) findViewById(R.id.imageViewProducto);
    }
}