package id.co.myproject.tugasmobile2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.CategoryViewHolder>{
    private Context context;
    private ArrayList<TVShow> tvShowArrayList;
    private View.OnClickListener onClick;


    public ListAdapter(Context context) {
        this.context = context;

    }

    private ArrayList<TVShow> getTvShowArrayList() {
        return tvShowArrayList;
    }

    void setTvShowArrayList(ArrayList<TVShow> tvShowArrayList) {
        this.tvShowArrayList = tvShowArrayList;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, final int position) {
        categoryViewHolder.tvName.setText(getTvShowArrayList().get(position).getTitle());

        Glide.with(context)
                .load(getTvShowArrayList().get(position).getGambar())
                .into(categoryViewHolder.imgPhoto);

        categoryViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, ""+tvShowArrayList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return getTvShowArrayList().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView imgPhoto;


        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
