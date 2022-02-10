package one.example.myapplication.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import one.example.myapplication.Fragments.HomeFragment;
import one.example.myapplication.Fragments.OtherFragment;
import one.example.myapplication.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager2 myviewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageOne = findViewById(R.id.imageOne);
        imageOne.setOnClickListener(this);
        ImageView imagetwo = findViewById(R.id.imagetwo);
        imagetwo.setOnClickListener(this);
        ImageView imagethree = findViewById(R.id.imagethree);
        imagethree.setOnClickListener(this);
        ImageView imagefour = findViewById(R.id.imagefour);
        imagefour.setOnClickListener(this);
        ImageView imagefive = findViewById(R.id.imagefive);
        imagefive.setOnClickListener(this);

        myviewPager = findViewById(R.id.myviewPager);
        myviewPager.setAdapter(new PagerAdapter(MainActivity.this));
        myviewPager.setUserInputEnabled(false);
        myviewPager.setCurrentItem(2, false);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imageOne) {
            myviewPager.setCurrentItem(0, false);
        } else if (id == R.id.imagetwo) {
            myviewPager.setCurrentItem(1, false);
        } else if (id == R.id.imagethree) {
            myviewPager.setCurrentItem(2, false);
        } else if (id == R.id.imagefour) {
            myviewPager.setCurrentItem(3, false);
        } else if (id == R.id.imagefive) {
            myviewPager.setCurrentItem(4, false);
        }
    }

    public static class PagerAdapter extends FragmentStateAdapter {
        public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }


        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return new OtherFragment();
                case 1:
                    return new OtherFragment();
                case 2:
                    return new HomeFragment();
                case 3:
                    return new OtherFragment();
                case 4:
                    return new OtherFragment();
                default:
                    return null;

            }
        }

        @Override
        public int getItemCount() {
            return 5;
        }
    }
}