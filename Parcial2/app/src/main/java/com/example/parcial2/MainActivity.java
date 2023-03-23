package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Personas> listapersonas;
   private ArrayList<Cargo> listacargo;
    private ArrayList<Compania> listacompania;
    ListView lv1,lv2;
    Integer[]ImgPpersonas={
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listapersonas=new ArrayList<Personas>();
        listacargo=new ArrayList<Cargo>();
        listacompania=new ArrayList<Compania>();

        listapersonas.add(new Personas("Alexander Pierrot",'m'));
        listapersonas.add(new Personas("Carlos Lopez    ",'m'));
        listapersonas.add(new Personas("Sara Bonz",'f'));
        listapersonas.add(new Personas("Liliana Clarence",'f'));
        listapersonas.add(new Personas("Benito Peralta",'m'));
        listapersonas.add(new Personas("Juan Jaramillo", 'm'));
        listapersonas.add(new Personas("Christian Steps",'m'));
        listapersonas.add(new Personas("Alexa Giraldo",'f'));
        listapersonas.add(new Personas("Linda Murillo",'f'));
        listapersonas.add(new Personas("Lizeth Astrada",'f'));

        listacargo.add(new Cargo("CEO",'f'));
        listacargo.add(new Cargo("Asistente",'m'));
        listacargo.add(new Cargo("Directora de Marketing",'f'));
        listacargo.add(new Cargo("Diseñadora de Producto",'m'));
        listacargo.add(new Cargo("Supervisor de ventas",'m'));
        listacargo.add(new Cargo("CEO", 'm'));
        listacargo.add(new Cargo("CTO",'f'));
        listacargo.add(new Cargo("Lead Programmer",'m'));
        listacargo.add(new Cargo("Directora de Marketing    ",'f'));
        listacargo.add(new Cargo("CEO",'f'));

        listacompania.add(new Compania("Insures S.O.",'f'));
        listacompania.add(new Compania("Hospital Blue",'m'));
        listacompania.add(new Compania("Electrical Parts Itd",'f'));
        listacompania.add(new Compania("Creativa App",'m'));
        listacompania.add(new Compania("Neumaticos Press",'m'));
        listacompania.add(new Compania("Banco National", 'm'));
        listacompania.add(new Compania("Coperativa Verde",'f'));
        listacompania.add(new Compania("Frutisofy",'m'));
        listacompania.add(new Compania("Seguros Boliver",'f'));
        listacompania.add(new Compania("Consesionario  Motolox",'f'));

        AdaptadorPersonas adaptador = new AdaptadorPersonas(this);
        lv1 = findViewById(R.id.lsvPersonas);
        lv1.setAdapter(adaptador);

       AdaptadorCargo adaptadorC = new AdaptadorCargo(this);
        lv2 = findViewById(R.id.lsvCargo);
        lv2.setAdapter(adaptadorC);

        AdaptadorCompania adaptadorCo = new AdaptadorCompania(this);
        lv1 = findViewById(R.id.lsvCompania);
        lv1.setAdapter(adaptadorCo);
    }
    class AdaptadorPersonas extends ArrayAdapter<Personas> {
        AppCompatActivity appCompatActivity;
        AdaptadorPersonas(AppCompatActivity context) {
            super(context, R.layout.persona, listapersonas);
            appCompatActivity = context;
        }
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.persona, null);

            TextView textView1 = item.findViewById(R.id.tvNombre);
            textView1.setText(listapersonas.get(position).getNombre());

            ImageView imageView1 = item.findViewById(R.id.imvFoto);
            imageView1.setImageResource(ImgPpersonas[position]);
            return(item);
        }
    }
    class AdaptadorCargo extends ArrayAdapter<Cargo> {
        AppCompatActivity appCompatActivity;
        AdaptadorCargo(AppCompatActivity context) {
            super(context, R.layout.persona, listacargo);
            appCompatActivity = context;
        }
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.persona, null);
            TextView textView1 = item.findViewById(R.id.tvCargo);
            textView1.setText(listacargo.get(position).getNombre());
            ImageView imageView1 = item.findViewById(R.id.imvFoto);
            imageView1.setImageResource(ImgPpersonas[position]);
            return(item);
        }
    }
    class AdaptadorCompania extends ArrayAdapter<Compania> {
        AppCompatActivity appCompatActivity;
        AdaptadorCompania(AppCompatActivity context) {
            super(context, R.layout.persona, listacompania);
            appCompatActivity = context;
        }
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.persona, null);
            TextView textView1 = item.findViewById(R.id.tvCompania);
            textView1.setText(listacompania.get(position).getNombre());
            ImageView imageView1 = item.findViewById(R.id.imvFoto);
            imageView1.setImageResource(ImgPpersonas[position]);
            return(item);
        }
    }

}
