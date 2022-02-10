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

import one.example.myapplication.Model.SubCategoryModel;
import one.example.myapplication.Model.UserModel;
import one.example.myapplication.R;

public class SubCategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<SubCategoryModel> subCategoryModelArrayList;
    Context context;

    public SubCategoryAdapter(Context context, ArrayList<SubCategoryModel> subCategoryModelArrayList) {
        this.context = context;
        this.subCategoryModelArrayList = subCategoryModelArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_subcat, parent, false));

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        SubCategoryModel subCategoryModel = subCategoryModelArrayList.get(position);
        Glide.with(context).load(subCategoryModel.getIconImage()).into(myViewHolder.IconSubCat);
        myViewHolder.tvSubCatText.setText(subCategoryModel.getCategoryName());
    }

    @Override
    public int getItemCount() {
        if (subCategoryModelArrayList != null && subCategoryModelArrayList.size() > 0) {
            return subCategoryModelArrayList.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvSubCatText;
        ImageView IconSubCat;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            IconSubCat = itemView.findViewById(R.id.IconSubCat);
            tvSubCatText = itemView.findViewById(R.id.tvSubCatText);
        }
    }


}