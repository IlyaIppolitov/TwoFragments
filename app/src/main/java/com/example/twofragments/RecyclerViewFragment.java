package com.example.twofragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewFragment extends Fragment {

    private RecyclerView recyclerView;
    private ProfileAdapter adapter;

    public RecyclerViewFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        adapter = new ProfileAdapter(generateProfileData());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<ProfileItem> generateProfileData() {
        List<ProfileItem> data = new ArrayList<>();
        data.add(new ProfileItem(R.drawable.profile_placeholder, "Мастер", "Иванов", "+79106666666"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "Маргарита", "Иванова", "+79107777777"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "яяяяяяяяя", "ххххххх", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "ыыыыыыыыы", "yyyyyyy", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "яяяяяяяяя", "ххххххх", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "ыыыыыыыыы", "yyyyyyy", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "яяяяяяяяя", "ххххххх", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "ыыыыыыыыы", "yyyyyyy", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "яяяяяяяяя", "ххххххх", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "ыыыыыыыыы", "yyyyyyy", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "яяяяяяяяя", "ххххххх", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "ыыыыыыыыы", "yyyyyyy", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "яяяяяяяяя", "ххххххх", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "ыыыыыыыыы", "yyyyyyy", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "яяяяяяяяя", "ххххххх", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "ыыыыыыыыы", "yyyyyyy", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "яяяяяяяяя", "ххххххх", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "ыыыыыыыыы", "yyyyyyy", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "яяяяяяяяя", "ххххххх", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "ыыыыыыыыы", "yyyyyyy", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "яяяяяяяяя", "ххххххх", "+79101111111"));
        data.add(new ProfileItem(R.drawable.profile_placeholder, "ыыыыыыыыы", "yyyyyyy", "+79101111111"));
        return data;
    }

    public static class ProfileItem {
        int imageResource;
        String firstName;
        String lastName;
        String phoneNumber;

        ProfileItem(int imageResource, String firstName, String lastName, String phoneNumber) {
            this.imageResource = imageResource;
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
        }
    }
}
