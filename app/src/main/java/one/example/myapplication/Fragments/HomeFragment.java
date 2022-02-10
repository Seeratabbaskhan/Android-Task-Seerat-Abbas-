package one.example.myapplication.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

import one.example.myapplication.Adapters.MainCategoryAdapter;
import one.example.myapplication.Adapters.SubCategoryAdapter;
import one.example.myapplication.Adapters.TitleBotimCategoryAdapter;
import one.example.myapplication.Adapters.TitleCategoryAdapter;
import one.example.myapplication.Adapters.UserCategoryAdapter;
import one.example.myapplication.Model.MainCategoryModel;
import one.example.myapplication.Model.SubCategoryModel;
import one.example.myapplication.Model.TitleCategoryModel;
import one.example.myapplication.Model.UserModel;
import one.example.myapplication.R;


public class HomeFragment extends Fragment {
    private RecyclerView HrecMainCategory, VrecTitle, HrecyclerUser, HrecShopSubcat, recHSubShopCat;
    private AppCompatActivity context;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = (AppCompatActivity) getActivity();
    }

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //initviews
        HrecMainCategory = view.findViewById(R.id.recMainCategory);
        VrecTitle = view.findViewById(R.id.VrecTitle);
        HrecyclerUser = view.findViewById(R.id.HrecyclerUser);
        HrecShopSubcat = view.findViewById(R.id.HrecShopSubcat);
        recHSubShopCat = view.findViewById(R.id.recHSubShopCat);


        initListMainCategory();
        initMainTitleCategory();
        initUserList();
        initSubCatList();
        initSubShopCat();

        //setSlider
        ArrayList<SlideModel> imageList = new ArrayList<>();
        imageList.add(new SlideModel(R.drawable.slider1, "", null));
        imageList.add(new SlideModel(R.drawable.slider2, "", null));
        imageList.add(new SlideModel(R.drawable.slider3, "", null));
        imageList.add(new SlideModel(R.drawable.slider4, "", null));
        imageList.add(new SlideModel(R.drawable.slider5, "", null));
        imageList.add(new SlideModel(R.drawable.slider6, "", null));
        ImageSlider imageSlider = view.findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);

    }

    private void initSubShopCat() {
        recHSubShopCat.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<TitleCategoryModel> titleCategoryModelArrayList = new ArrayList<>();
        titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 3, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
        titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 2, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
        titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 3, "4KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
        titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 1, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
        titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 3, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
        titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 3, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
        titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 2, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
        titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 3, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
        titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 1, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));

        recHSubShopCat.setAdapter(new TitleBotimCategoryAdapter(context, titleCategoryModelArrayList));
    }

    private void initSubCatList() {
        HrecShopSubcat.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<SubCategoryModel> subCategoryModelArrayList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            subCategoryModelArrayList.add(new SubCategoryModel(R.drawable.subcat, "Sub Category"));
        }
        HrecShopSubcat.setAdapter(new SubCategoryAdapter(context, subCategoryModelArrayList));
    }

    private void initUserList() {
        HrecyclerUser.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<UserModel> userModelArrayList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            userModelArrayList.add(new UserModel(R.drawable.user, "@_user" + i));
        }
        HrecyclerUser.setAdapter(new UserCategoryAdapter(context, userModelArrayList));
    }

    private void initMainTitleCategory() {
        ArrayList<TitleCategoryModel> titleCategoryModelArrayList = new ArrayList<>();

            titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 3, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
            titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 2, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
            titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 3, "4KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
            titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 1, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
            titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 3, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
            titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 3, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
            titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 2, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
            titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 3, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));
            titleCategoryModelArrayList.add(new TitleCategoryModel(R.drawable.image, 1, "3KM", "10.00", "9.00", "10%", "TitleProduct", "Product Service"));

            VrecTitle.setLayoutManager(new GridLayoutManager(context, 3));
        VrecTitle.setAdapter(new TitleCategoryAdapter(context, titleCategoryModelArrayList));
    }

    private void initListMainCategory() {
        ArrayList<MainCategoryModel> mainCategories = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mainCategories.add(new MainCategoryModel(R.drawable.category, "Main Category " + i));
        }
        HrecMainCategory.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        HrecMainCategory.setAdapter(new MainCategoryAdapter(getActivity(), mainCategories));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}