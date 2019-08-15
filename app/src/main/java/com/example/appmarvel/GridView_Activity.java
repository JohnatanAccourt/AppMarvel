
package com.example.appmarvel;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.MenuItem;
        import android.widget.ImageView;
        import android.widget.TextView;

public class GridView_Activity extends AppCompatActivity {

    TextView lstPersonagens;
    ImageView imgPersonagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view_layout);

        lstPersonagens = (TextView) findViewById(R.id.IDNome);
        imgPersonagens = (ImageView) findViewById(R.id.IDImagem);

        Intent intent = getIntent();
        String nomeRetorno = intent.getStringExtra("name");
        int imageRetorno = intent.getIntExtra("imagem", 0);

        lstPersonagens.setText(nomeRetorno);
        imgPersonagens.setImageResource(imageRetorno);

        //getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}


