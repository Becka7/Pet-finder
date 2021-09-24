package com.moringaschool.petfinder.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moringaschool.petfinder.databinding.FragmentDogDetailBinding;
import com.moringaschool.petfinder.modules.PetSearchResponse;
import com.moringaschool.petfinder.ui.DogDetail;

import java.util.List;

public class PetPagerAdapter extends FragmentPagerAdapter {
    private List<PetSearchResponse> mPetos;

    public PetPagerAdapter(@NonNull FragmentManager fm, int behavior,List<PetSearchResponse> petos) {
        super(fm, behavior);
        mPetos = petos;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return DogDetail.newInstance(mPetos.get(position));

    }

    @Override
    public int getCount() {
        return mPetos.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mPetos.get(position).getBreedName();
    }
}
