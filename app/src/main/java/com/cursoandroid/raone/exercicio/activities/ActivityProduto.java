package com.cursoandroid.raone.exercicio.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.cursoandroid.raone.exercicio.R;
import com.cursoandroid.raone.exercicio.model.Produto;

public class ActivityProduto extends AppCompatActivity {

    private EditText edtNomeProduto;
    private EditText edtQuantidadeProduto;
    private EditText edtPrecoProduto;

    private Button btnSalvarProduto;

    private Produto produto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        edtNomeProduto = (EditText) findViewById(R.id.edtNomeProduto);
        edtQuantidadeProduto = (EditText) findViewById(R.id.edtQuantidadeProduto);
        edtPrecoProduto = (EditText) findViewById(R.id.edtPrecoProduto);

        btnSalvarProduto = (Button) findViewById(R.id.btnSalvarProduto);
    }

    private Produto getDadosProdutoDoFormulario(){

        this.produto = new Produto();

        if(this.edtNomeProduto.getText().toString().isEmpty() == false){
            this.produto.setNome(this.edtNomeProduto.getText().toString());
        }else{
            return null;
        }

        if(edtQuantidadeProduto.getText().toString().isEmpty() == false){

            int quantidadeProduto = Integer.parseInt(this.edtQuantidadeProduto.getText().toString());
            this.produto.setQuantidadeEmEstoque(quantidadeProduto);
        }else {
            return null;
        }

        if(edtPrecoProduto.getText().toString().isEmpty() == false){
            double precoProduto = Double.parseDouble(this.edtPrecoProduto.getText().toString());
            this.produto.setPreco(precoProduto);
        }else {
            return null;
        }

        return produto;

    }
}

