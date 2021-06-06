package com.example.uts_ilham_10118311;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentPerson extends Fragment {
    /* Tanggal Pengerjaan 5 juni 2021
     *  Nama = Ilham Pahrul Anam
     * Nim = 10118311
     * Kelas = IF8*/
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_person, container, false);
    }
}
