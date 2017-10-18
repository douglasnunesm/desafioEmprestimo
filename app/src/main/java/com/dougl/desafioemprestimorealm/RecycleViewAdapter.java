package com.dougl.desafioemprestimorealm;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dougl.desafioemprestimorealm.entity.Emprestimo;

import java.util.List;

/**
 * Created by dougl on 17/10/2017.
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {
    List<Emprestimo> emprestimos;

    public RecycleViewAdapter(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(View v) {
            super(v);
            mTextView = v.findViewById(R.id.objeto);
            mTextView.setTypeface(null, Typeface.BOLD);

        }
    }


    @Override
    public RecycleViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecycleViewAdapter.ViewHolder holder, int position) {
        holder.mTextView.setText(emprestimos.get(position).getObjeto());
    }

    @Override
    public int getItemCount() {
        return emprestimos.size();
    }
}
