package com.amshotzz.tablerecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.amshotzz.tablerecyclerview.adapter.TableAdapter;
import com.amshotzz.tablerecyclerview.databinding.ActivityMainBinding;
import com.amshotzz.tablerecyclerview.model.TableModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ArrayList<TableModel> list = new ArrayList<>();
        list.add(new TableModel("Areas", "Monthly", "Quarterly", "Biannually", "Annually", 0));
        list.add(new TableModel("1200 sq. ft.", "₹ 2,400", "₹ 9,600", "₹ 14,400", "₹ 28,800", 1));
        list.add(new TableModel("1230 sq. ft.", "₹ 2,460", "₹ 9,840", "₹ 14,760", "₹ 29,520", 1));
        list.add(new TableModel("1250 sq. ft.", "₹ 2,500", "₹ 10,000", "₹ 15,000", "₹ 30,000", 1));
        list.add(new TableModel("1270 sq. ft.", "₹ 2,740", "₹ 10,960", "₹ 16,440", "₹ 32,880", 1));
        mainBinding.rvTable.setAdapter(new TableAdapter(list, this));
    }
}

