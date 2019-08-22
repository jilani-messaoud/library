package com.example.library.data.model;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.library.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class AfficherFragment extends Fragment {

    private AfficherViewModel mViewModel;
PDFView  pdfView ;
    public static AfficherFragment newInstance() {
        return new AfficherFragment();
    }

    @Nullable

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.afficher_fragment, container, false);
        pdfView= view.findViewById(R.id.pdfview);
        pdfView.fromAsset("doc.pdf").load();


    return view ;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mViewModel = ViewModelProviders.of(this).get(AfficherViewModel.class);
        // TODO: Use the ViewModel

    }


}
