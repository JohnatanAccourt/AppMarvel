package com.example.appmarvel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class GridView_Activity extends AppCompatActivity {

    GridView gridView;

    String[] nomePersonagens = {"Capitã Marvel"};

    int[] imagePersonagens = {R.drawable.capita_marvel_thumb};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view_layout);

        gridView = (GridView) findViewById(R.id.GridView);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), Personagem_Activity.class);
                intent.putExtra("name", nomePersonagens[position]);
                intent.putExtra("imagem", imagePersonagens[position]);
                startActivity(intent);
            }
        });
        }

    public class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() { return imagePersonagens.length;} {

        }

        @Override
        public Object getItem(int position){ return null;} {
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = getLayoutInflater().inflate(R.layout.data_view, null);

            TextView name = (TextView) view.findViewById(R.id.IDNome);
            ImageView image = (ImageView) view.findViewById(R.id.IDImagem);

            name.setText(nomePersonagens[position]);
            image.setImageResource(imagePersonagens[position]);

            return view;
        }
    }
}

