package com.example.twofragments;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProfileViewHolder extends RecyclerView.ViewHolder {
    ImageView profileImage;
    TextView nameTextView;
    TextView phoneTextView;

    ProfileViewHolder(@NonNull View itemView) {
        super(itemView);
        profileImage = itemView.findViewById(R.id.profile_image);
        nameTextView = itemView.findViewById(R.id.name_text_view);
        phoneTextView = itemView.findViewById(R.id.phone_text_view);
    }
}