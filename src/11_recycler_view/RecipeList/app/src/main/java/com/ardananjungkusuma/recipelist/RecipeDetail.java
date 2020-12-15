package com.ardananjungkusuma.recipelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ardananjungkusuma.recipelist.models.Recipe;
import com.squareup.picasso.Picasso;

public class RecipeDetail extends AppCompatActivity {
    private TextView recipeName, ingredients, instructions;
    private ImageView recipeImage;
    public static final String Key_MainActivity = "Key_MainActivity";

    Recipe recipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);
        recipeName =(TextView) findViewById(R.id.txtNameRecipe);
        ingredients = (TextView)findViewById(R.id.txtIngredientsList);
        instructions = (TextView)findViewById(R.id.txtStepList);
        recipeImage = (ImageView) findViewById(R.id.imgRecipe);

        recipe = getIntent().getParcelableExtra(Key_MainActivity);
        recipeName.setText(recipe.getName());
        ingredients.setText(recipe.getIngredients());
        instructions.setText(recipe.getInstructions());
        Picasso.get().load(recipe.getImages()).into(recipeImage);
    }

    public void backToListRecipe(View view) {
        Intent i = new Intent(RecipeDetail.this, MainActivity.class);
        startActivity(i);
    }
}