package com.example.tablayoutwscube;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;


//fragment pager adapter is interface class and it has abstract methods which needs to be implemented
public  class ViewPagerMessengerAdapter extends FragmentPagerAdapter {


    public ViewPagerMessengerAdapter(@NonNull FragmentManager fm)
    {
        super(fm);
    }

    @NonNull
    @Override

//kis position p kia fragment dekhana ya load karwana
    public Fragment getItem(int position) {
        if(position==0){
            return new ChatFragment();
        }else if(position ==1)
        {
            return new StatusFragment();
        }else
            return new CallsFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0) {
            return "Chats";
        }else if(position ==1)
        {
            return "Status";
        }
        else{
            return "Calls";
        }
    }
}