package id.ac.tugas_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView reycylerView;

    String s1[], s2[];
    int images[] = {R.drawable.universitas_udayana, R.drawable.universitas_indonesia, R.drawable.institut_teknologi_bandung,
                    R.drawable.universitas_buddhi_dharma, R.drawable.universitas_negeri_malang, R.drawable.universitas_negeri_semarang,
                    R.drawable.universitas_riau, R.drawable.universitas_undiksha};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reycylerView = findViewById(R.id.reycycerView);

        s1 = getResources().getStringArray(R.array.logo_universitas);
        s2 = getResources().getStringArray(R.array.daerah);

        myAdapter myAdapter = new myAdapter(this, s1, s2, images);
        reycylerView.setAdapter(myAdapter);
        reycylerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
