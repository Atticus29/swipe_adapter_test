package com.example.guest.swipeviewtest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.chauthai.swipereveallayout.ViewBinderHelper;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Guest on 6/12/17.
 */

public class SwipeAdapter extends RecyclerView.Adapter<SwipeAdapter.SwipeViewHolder>{
    private final ViewBinderHelper viewBinderHelper = new ViewBinderHelper();
    private  String [] data = {"a", "b", "c", "d", "e", "f"};

    public SwipeAdapter(){}

    @Override
    public SwipeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_item, parent,false);
        SwipeViewHolder viewHolder = new SwipeViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder (SwipeViewHolder holder, int position){

        String currentString = data[position];
        viewBinderHelper.bind(holder.swipeRevealLayout, currentString);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class SwipeViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.swipeReveal) SwipeRevealLayout swipeRevealLayout;

        public SwipeViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
