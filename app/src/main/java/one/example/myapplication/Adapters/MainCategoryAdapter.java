package one.example.myapplication.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import one.example.myapplication.Model.MainCategoryModel;
import one.example.myapplication.R;

public class MainCategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<MainCategoryModel> mainCategoryArrayList;
    Context context;

    public MainCategoryAdapter(Context context, ArrayList<MainCategoryModel> mainCategoryArrayList) {
        this.context = context;
        this.mainCategoryArrayList = mainCategoryArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_main_category, parent, false));

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        Glide.with(context).load(mainCategoryArrayList.get(position).getIconImage()).into(myViewHolder.IconCategory);
        myViewHolder.tvCategory.setText(mainCategoryArrayList.get(position).getImageText());
    }

    @Override
    public int getItemCount() {
        if (mainCategoryArrayList != null && mainCategoryArrayList.size() > 0) {
            return mainCategoryArrayList.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvCategory;
        ImageView IconCategory;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            IconCategory = itemView.findViewById(R.id.IconCategory);
            tvCategory = itemView.findViewById(R.id.tvCategory);
        }
    }


}