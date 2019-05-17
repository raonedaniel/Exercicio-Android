package com.cursoandroid.raone.exercicio.DAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.cursoandroid.raone.exercicio.dbHelper.ConexaoSQLite;
import com.cursoandroid.raone.exercicio.model.Produto;

public class ProdutoDAO {
    private final ConexaoSQLite conexaoSQLite;

    public ProdutoDAO(ConexaoSQLite conexaoSQLite) {
        this.conexaoSQLite = conexaoSQLite;
    }
    public long salvarProdutoDAO(Produto pProduto){
        SQLiteDatabase db = conexaoSQLite.getWritableDatabase();

        try{

            ContentValues values = new ContentValues();
            values.put("id", pProduto.getId());
            values.put("nome", pProduto.getNome());
            values.put("quantidade_em_estoque", pProduto.getQuantidadeEmEstoque());
            values.put("preco" , pProduto.getPreco());

            long idProdutoInserido = db.insert("produto", null, values);

            return idProdutoInserido;

        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
