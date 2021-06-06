package com.example.uts_ilham_10118311;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    /* Tanggal Pengerjaan 5 juni 2021
    *  Nama = Ilham Pahrul Anam
    * Nim = 10118311
    * Kelas = IF8*/
    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected( MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()){
                case R.id.menu_home:
                    f = new FragmentHome();
                    break;
                case R.id.menu_person:
                    f = new FragmentPerson();
                    break;
                case R.id.menu_activity:
                    f = new FragmentActivity();
                    break;
                case R.id.menu_other:
                    f = new FragmentOther();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,f).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
    }
}