package com.cursoandroid.raone.exercicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cursoandroid.raone.exercicio.activities.ActivityProduto;
import com.cursoandroid.raone.exercicio.activities.ListarProdutosActivity;
import com.cursoandroid.raone.exercicio.controller.ProdutoCtrl;
import com.cursoandroid.raone.exercicio.dbHelper.ConexaoSQLite;
import com.cursoandroid.raone.exercicio.model.Produto;

public class MainActivity extends AppCompatActivity {

    private Button btnCadastroProdutos;
    private Button btnListarProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ConexaoSQLite.getInstancia(this);


        this.btnCadastroProdutos = (Button) findViewById(R.id.btnCadastroProdutos);

        this.btnListarProdutos = (Button) findViewById(R.id.btnListarProdutos);

        this.btnCadastroProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ActivityProduto.class);
                startActivity(intent);

            }
        });
        this.btnListarProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListarProdutosActivity.class);
                startActivity(intent);
            }
        });
    }
}
