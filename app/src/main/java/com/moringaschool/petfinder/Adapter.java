package com.moringaschool.petfinder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<PetSearchResponse> images;
    Context context;

    public Adapter( Context context,List<PetSearchResponse> images) {
        this.images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.bindPets(images.get(position));

    }

    @Override
    public int getItemCount() {

        return images.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.cardImage) ImageView mImageView;
        @BindView(R.id.name) TextView mNameTextView;

        private Context mContext;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindPets(PetSearchResponse petSearchResponse) {
            mNameTextView.setText(petSearchResponse.getBreedName());
            Picasso.get().load(petSearchResponse.getImage()).into(mImageView);

        }
    }
}

