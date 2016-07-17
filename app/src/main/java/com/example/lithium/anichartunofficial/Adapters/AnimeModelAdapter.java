package com.example.lithium.anichartunofficial.Adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lithium.anichartunofficial.Models.AnimeModel;
import com.example.lithium.anichartunofficial.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AnimeModelAdapter extends RecyclerView.Adapter<AnimeModelAdapter.ViewHolder> {

    Context mContext;
    List<AnimeModel> models;

    public AnimeModelAdapter(Context context, List<AnimeModel> list) {
        mContext = context;
        models = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Picasso.with(mContext)
                .load(R.drawable.icon)
                .into(holder.thumbnail);
        holder.title.setText(models.get(position).getTitle_romanji());
        holder.source.setText(models.get(position).getType());
        holder.eps.setText(Integer.toString(models.get(position).getTotal_episodes()));

        holder.description.setText("placeholder description");
        holder.genres.setText("placeholder genres");
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        ImageView thumbnail;
        TextView title;
        TextView source;
        TextView eps;
        TextView description;
        TextView genres;

        public ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.card_view);
            thumbnail = (ImageView) itemView.findViewById(R.id.card_thumbnail_image);
            title = (TextView) itemView.findViewById(R.id.card_airing_datetime);
            source = (TextView) itemView.findViewById(R.id.card_airing_source);
            eps = (TextView) itemView.findViewById(R.id.card_airing_eps);
            description = (TextView) itemView.findViewById(R.id.card_airing_description);
            genres = (TextView) itemView.findViewById(R.id.card_airing_genres);
        }
    }
}
