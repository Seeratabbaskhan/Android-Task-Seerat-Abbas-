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
import one.example.myapplication.Model.UserModel;
import one.example.myapplication.R;

public class UserCategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<UserModel> userModelArrayList;
    Context context;

    public UserCategoryAdapter(Context context, ArrayList<UserModel> userModelArrayList) {
        this.context = context;
        this.userModelArrayList = userModelArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_user, parent, false));

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        UserModel userModel = userModelArrayList.get(position);
        Glide.with(context).load(userModel.getUserImage()).into(myViewHolder.IconUser);
        myViewHolder.tvUserName.setText(userModel.getUserText());
    }

    @Override
    public int getItemCount() {
        if (userModelArrayList != null && userModelArrayList.size() > 0) {
            return userModelArrayList.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvUserName;
        ImageView IconUser;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            IconUser = itemView.findViewById(R.id.IconUser);
            tvUserName = itemView.findViewById(R.id.tvUserName);
        }
    }


}