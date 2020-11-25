package com.ardananjungkusuma.recipelist.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Recipe implements Parcelable {
    private String name,ingredients,instructions,images;

    public Recipe(String name, String ingredients, String instructions, String images) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.images = images;
    }

    protected Recipe(Parcel in) {
        name = in.readString();
        ingredients = in.readString();
        instructions = in.readString();
        images = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(ingredients);
        dest.writeString(instructions);
        dest.writeString(images);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Recipe> CREATOR = new Creator<Recipe>() {
        @Override
        public Recipe createFromParcel(Parcel in) {
            return new Recipe(in);
        }

        @Override
        public Recipe[] newArray(int size) {
            return new Recipe[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Recipe() {
    }
}
