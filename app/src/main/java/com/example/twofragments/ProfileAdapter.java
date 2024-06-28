package com.example.twofragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileViewHolder> {

    private final List<RecyclerViewFragment.ProfileItem> data;

    public ProfileAdapter(List<RecyclerViewFragment.ProfileItem> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_item, parent, false);
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        RecyclerViewFragment.ProfileItem item = data.get(position);
        holder.profileImage.setImageResource(item.imageResource);
        holder.nameTextView.setText(String.format("%s %s", item.firstName, item.lastName));
        holder.phoneTextView.setText(item.phoneNumber);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
