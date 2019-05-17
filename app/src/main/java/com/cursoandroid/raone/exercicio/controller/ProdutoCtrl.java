package com.cursoandroid.raone.exercicio.controller;

import com.cursoandroid.raone.exercicio.DAO.ProdutoDAO;
import com.cursoandroid.raone.exercicio.dbHelper.ConexaoSQLite;
import com.cursoandroid.raone.exercicio.model.Produto;

public class ProdutoCtrl {
    private final ProdutoDAO produtoDAO;

    public ProdutoCtrl(ConexaoSQLite pConexaoSQLite){
        produtoDAO = new ProdutoDAO(pConexaoSQLite);
    }

    public long salvarProdutoCtrl(Produto pProduto){
       return this.produtoDAO.salvarProdutoDAO(pProduto);
    }
}