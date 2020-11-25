package com.ardananjungkusuma.recipelist.models;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ardananjungkusuma.recipelist.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {

    private List<Recipe> listRecipe = new ArrayList<>();

    public RecipeAdapter(List<Recipe> listRecipe) {
        this.listRecipe = listRecipe;
    }

    private OnRecipeClickListener listener;

    public interface OnRecipeClickListener {
        public void onClick(View view, int position);
    }

    public void setListener(OnRecipeClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vh = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_item, parent, false);
        RecipeViewHolder viewHolder = new RecipeViewHolder(vh);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        Recipe item = listRecipe.get(position);
        holder.recipeName.setText(item.getName());
        holder.instructions.setText(item.getInstructions());
        holder.ingredients.setText(item.getIngredients());
        Picasso.get().load(item.getImages()).noPlaceholder().into(holder.imgRecipe);
    }

    @Override
    public int getItemCount() {
        return listRecipe.size();
    }

    public class RecipeViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgRecipe;
        public TextView recipeName, ingredients, instructions;

        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            imgRecipe = itemView.findViewById(R.id.imageRecipe);
            recipeName = itemView.findViewById(R.id.txtName);
            ingredients = itemView.findViewById(R.id.txtIngredients);
            instructions = itemView.findViewById(R.id.txtInstructions);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(v, getAdapterPosition());
                }
            });
        }
    }
}
