package com.dougl.desafioemprestimorealm;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import com.dougl.desafioemprestimorealm.entity.Emprestimo;

import java.util.Date;
import java.util.List;

public class MainActivity extends Activity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Emprestimo> emprestimos = Emprestimo.listAll(Emprestimo.class);
        recyclerView = findViewById(R.id.listaEmprestimos);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecycleViewAdapter(emprestimos);
        recyclerView.setAdapter(adapter);


    }
}
