package com.amshotzz.tablerecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.amshotzz.tablerecyclerview.R;
import com.amshotzz.tablerecyclerview.databinding.ItemHeaderLayoutBinding;
import com.amshotzz.tablerecyclerview.model.TableModel;

import java.util.ArrayList;

public class TableAdapter extends RecyclerView.Adapter<TableAdapter.ViewHolder> {

    private ArrayList<TableModel> list;
    private Context context;

    public TableAdapter(ArrayList<TableModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public TableAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemHeaderLayoutBinding mBinding;
        mBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_header_layout, parent, false);
        return new ViewHolder(mBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull TableAdapter.ViewHolder holder, int position) {
        TableModel tableModel = list.get(position);
        if (tableModel.getItemType() == 0) {
            holder.mBinding.mainContainer.setBackgroundColor(ContextCompat.getColor(context, R.color.lightgray4));
        } else {
            holder.mBinding.mainContainer.setBackgroundColor(ContextCompat.getColor(context, android.R.color.transparent));
        }

        holder.mBinding.tvAnnually.setText(tableModel.getTextAnnually());
        holder.mBinding.tvBiannually.setText(tableModel.getTextBiannually());
        holder.mBinding.tvMonthly.setText(tableModel.getTextMonthly());
        holder.mBinding.tvQuarterly.setText(tableModel.getTextQuaterly());
        holder.mBinding.tvSinkingFund.setText(tableModel.getTextArea());

        if (position == list.size() - 1) {
            holder.mBinding.viewBottomLine.setVisibility(View.GONE);
        } else {
            holder.mBinding.viewBottomLine.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemHeaderLayoutBinding mBinding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }
    }
}
