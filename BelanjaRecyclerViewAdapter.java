package id.nufa.aplikasidaftarbelanja;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BelanjaRecyclerViewAdapter extends RecyclerView.Adapter<BelanjaRecyclerViewAdapter.BelanjaViewHolder> {
    private List<Belanja> groceryList = new ArrayList<>();

    @Override
    public BelanjaViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return new BelanjaViewHolder(view);
    }

    @Override
    public void onBindViewHolder( BelanjaViewHolder belanjaViewHolder, int i) {
        Belanja belanja = groceryList.get(i);

        belanjaViewHolder.tvGroceryName.setText(belanja.getName());
        belanjaViewHolder.tvGroceryQuantity.setText(String.valueOf(belanja.getQuantity()));
    }

    @Override
    public int getItemCount() {
        return groceryList.size();
    }

    public void updateData(List<Belanja> groceryList) {
        this.groceryList = groceryList;
        notifyDataSetChanged();
    }

    static class BelanjaViewHolder extends RecyclerView.ViewHolder {

        private TextView tvGroceryName;
        private TextView tvGroceryQuantity;

        public BelanjaViewHolder( View itemView) {
            super(itemView);
            tvGroceryName = itemView.findViewById(R.id.tvGroceryName);
            tvGroceryQuantity = itemView.findViewById(R.id.tvGroceryQuantity);
        }
    }
}
