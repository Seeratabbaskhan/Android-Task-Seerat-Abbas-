package one.example.myapplication.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import one.example.myapplication.Model.TitleCategoryModel;
import one.example.myapplication.R;

public class TitleBotimCategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<TitleCategoryModel> titleCategoryModelArrayList;
    Context context;

    public TitleBotimCategoryAdapter(Context context, ArrayList<TitleCategoryModel> titleCategoryModelArrayList) {
        this.context = context;
        this.titleCategoryModelArrayList = titleCategoryModelArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_sub_category, parent, false));

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        MyViewHolder myViewHolder = (MyViewHolder) holder;
        TitleCategoryModel titleCategoryModel = titleCategoryModelArrayList.get(position);
        Glide.with(context).load(titleCategoryModel.getIconImage()).into(myViewHolder.IconCategory);
        if (titleCategoryModel.getRating()==3){
            myViewHolder.iconStar1.setVisibility(View.VISIBLE);
            myViewHolder.iconStar2.setVisibility(View.VISIBLE);
            myViewHolder.iconStar3.setVisibility(View.VISIBLE);
        }else if (titleCategoryModel.getRating() ==2){
            myViewHolder.iconStar1.setVisibility(View.VISIBLE);
            myViewHolder.iconStar2.setVisibility(View.VISIBLE);
            myViewHolder.iconStar3.setVisibility(View.GONE);
        }else if (titleCategoryModel.getRating()==1){
            myViewHolder.iconStar1.setVisibility(View.VISIBLE);
            myViewHolder.iconStar2.setVisibility(View.GONE);
            myViewHolder.iconStar3.setVisibility(View.GONE);
        }else {
            myViewHolder.iconStar1.setVisibility(View.GONE);
            myViewHolder.iconStar2.setVisibility(View.GONE);
            myViewHolder.iconStar3.setVisibility(View.GONE);
        }
        myViewHolder.tvDistance.setText(titleCategoryModel.getDistance());
        myViewHolder.tvOldPrice.setText(titleCategoryModel.getOldPrice());
        myViewHolder.tvDiscount.setText(titleCategoryModel.getDiscount());
        myViewHolder.tvNewPrice.setText(titleCategoryModel.getNewPrice());
        myViewHolder.tvProductService.setText(titleCategoryModel.getProductService());
        myViewHolder.tvTitleProduct.setText(titleCategoryModel.getProductName());

        myViewHolder.tvOldPrice.setPaintFlags(myViewHolder.tvOldPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);



    }

    @Override
    public int getItemCount() {
        if (titleCategoryModelArrayList != null && titleCategoryModelArrayList.size() > 0) {
            return titleCategoryModelArrayList.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvDistance,tvOldPrice,tvDiscount,tvNewPrice,tvProductService,tvTitleProduct;
        ImageView IconCategory,iconStar1,iconStar2,iconStar3;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            IconCategory = itemView.findViewById(R.id.IconCategory);
            iconStar1 = itemView.findViewById(R.id.iconStar1);
            iconStar2 = itemView.findViewById(R.id.iconStar2);
            iconStar3 = itemView.findViewById(R.id.iconStar3);
            tvDistance = itemView.findViewById(R.id.tvDistance);
            tvOldPrice = itemView.findViewById(R.id.tvOldPrice);
            tvDiscount = itemView.findViewById(R.id.tvDiscount);
            tvNewPrice = itemView.findViewById(R.id.tvNewPrice);
            tvProductService = itemView.findViewById(R.id.tvProductService);
            tvTitleProduct = itemView.findViewById(R.id.tvTitleProduct);
        }
    }


}