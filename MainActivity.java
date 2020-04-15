package id.nufa.aplikasidaftarbelanja;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvGroceries;
    private BelanjaRecyclerViewAdapter belanjaRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGroceries = findViewById(R.id.rvGroceries);
        rvGroceries.setLayoutManager(new LinearLayoutManager(this));

        belanjaRecyclerViewAdapter = new BelanjaRecyclerViewAdapter();
        rvGroceries.setAdapter(belanjaRecyclerViewAdapter);

        setData();
    }

    private void setData() {
        List<Belanja> dummyData = DummyBelanjaData.groceryList();
        belanjaRecyclerViewAdapter.updateData(dummyData);
    }
}
