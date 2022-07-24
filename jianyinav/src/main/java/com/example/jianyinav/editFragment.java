package com.example.jianyinav;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class editFragment extends androidx.fragment.app.Fragment {
    private int content;

    private ImageView tv_content;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.edit_view, container, false);
        return view;
    }

    public void setContent(int content) {
        this.content = content;
        tv_content.setImageResource(content);
    }
}
