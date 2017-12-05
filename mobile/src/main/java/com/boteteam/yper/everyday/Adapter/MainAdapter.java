package com.boteteam.yper.everyday.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;

import com.boteteam.yper.everyday.Module.EverDayModel;
import com.boteteam.yper.everyday.R;

import java.util.List;

/**
 * Created by Feng Jiang on 2017/10/21.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    List<EverDayModel> everDayModels;


    public MainAdapter(List<EverDayModel> ems) {
        this.everDayModels=ems;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.everydayitem,parent,false);
        ViewHolder vh=new ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtItemzdjt.setText(everDayModels.get(position).getZdjt());
        holder.txtItemzlzs.setText(everDayModels.get(position).getZlzs());
        holder.txtItemryqk.setText(everDayModels.get(position).getRyqk());
        holder.txtItemsjgc.setText(everDayModels.get(position).getSjgc());
        holder.txtItemxsxc.setText(everDayModels.get(position).getXsxc());
        holder.txtItemjhjc.setText(everDayModels.get(position).getJhjc());
        holder.txtItemgjxq.setText(everDayModels.get(position).getGjxq());

    }

    @Override
    public int getItemCount() {
        return everDayModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        EditText txtItemzdjt;
        EditText txtItemzlzs;
        EditText txtItemryqk;
        EditText txtItemsjgc;
        EditText txtItemxsxc;
        EditText txtItemjhjc;
        EditText txtItemgjxq;
        public ViewHolder(View itemView) {
            super(itemView);
            txtItemzdjt= itemView.findViewById(R.id.txtItemzdjt);
            txtItemzlzs=itemView.findViewById(R.id.txtItemzlzs);
            txtItemryqk=itemView.findViewById(R.id.txtItemryqk);
            txtItemsjgc=itemView.findViewById(R.id.txtItemsjgc);
            txtItemxsxc=itemView.findViewById(R.id.txtItemxsxc);
            txtItemjhjc=itemView.findViewById(R.id.txtItemjhjc);
            txtItemgjxq=itemView.findViewById(R.id.txtItemgjxq);
        }
    }
}
