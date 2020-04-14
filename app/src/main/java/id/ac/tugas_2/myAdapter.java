package id.ac.tugas_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;

    public myAdapter(Context ct, String s1[], String s2[], int gambar[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = gambar;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.logo_universitas.setText(data1[position]);
        holder.daerah.setText(data2[position]);
        holder.gambar.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView logo_universitas, daerah;
        ImageView gambar;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            logo_universitas = itemView.findViewById(R.id.logo_universitas_txt);
            daerah = itemView.findViewById(R.id.daerah_txt);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }
}
