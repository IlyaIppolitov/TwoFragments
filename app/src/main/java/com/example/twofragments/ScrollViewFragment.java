package com.example.twofragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ScrollViewFragment extends Fragment {

    public ScrollViewFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scroll_view, container, false);

        ScrollView scrollView = view.findViewById(R.id.scroll_view);
        TextView textView = view.findViewById(R.id.text_view);
        ImageView imageView = view.findViewById(R.id.image_view);

        // Пример заполнения данными
        textView.setText(getString(R.string.lorem_ipsum));
        imageView.setImageResource(R.drawable.placeholder_image);

        return view;
    }
}
