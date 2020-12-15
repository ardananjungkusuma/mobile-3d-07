package com.ardananjungkusuma.recipelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ardananjungkusuma.recipelist.models.Recipe;
import com.ardananjungkusuma.recipelist.models.RecipeAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecipeAdapter.OnRecipeClickListener{

    public static final String Key_MainActivity = "Key_MainActivity";

    private RecyclerView rv;
    private RecipeAdapter recipeAdapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<Recipe> listRecipe = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.rvRecipe);

        listRecipe.add(new Recipe(
           "Chickpea-Mushroom Burgers","INGREDIENTS\n1/2 cup red or black quinoa, rinsed\n" +
                "Kosher salt\n" +
                "1/2 cup extra-virgin olive oil, divided, plus more for drizzling\n" +
                "2 (14.5-oz.) cans chickpeas, rinsed, drained\n" +
                "1 tsp. garlic powder\n" +
                "1/2 tsp. smoked paprika\n" +
                "8 oz. crimini mushrooms, trimmed, cut into 1/4\" pieces\n" +
                "1/4 cup tahini\n" +
                "1/4 cup white miso\n" +
                "1/4 cup oat flour or all-purpose flour\n" +
                "8 slices sharp cheddar or vegan cheese\n" +
                "Mayonnaise, mustard, hamburger buns, shredded iceberg lettuce, and sliced pickles (for serving; optional)","PREPARATION\nCook quinoa in a large saucepan of lightly salted boiling water, stirring occasionally, until tender, 8–10 minutes. Drain well and let cool at least 10 minutes.\n" +
                "Meanwhile, heat 1/4 cup oil in a large nonstick skillet over medium-high. Add chickpeas (make sure they are well drained) and cook, tossing occasionally, until lightly browned, 8–10 minutes. Add garlic powder and paprika and toss a few times to coat. Transfer to a large bowl and let cool about 5 minutes.\n" +
                "Add mushrooms, tahini, miso, and 1/4 cup oil to bowl with chickpeas and mash with a potato masher or fork to combine. Add quinoa and flour and mash until mixture holds together when squeezed in your hand. Taste and season with salt if needed. Form into 8 patties and arrange on a parchment-lined rimmed baking sheet. Freeze until firm, about 2 hours. At this point, the patties can be baked, or they can stay frozen up to 3 months. Transfer to resealable freezer bags or layer in an airtight container with sheets of parchment between patties.\n" +
                "Preheat oven to 425°. Drizzle frozen patties generously with oil on both sides on a rimmed baking sheet. Bake patties until browned and crisp, 25–30 minutes. Place a slice of cheese on top of each patty and bake until cheese is melted, about 1 minute.\n" +
                "Spread mayonnaise and mustard on cut sides of buns (if using). Place burgers on bottom buns. Top with lettuce and pickles (if using) and close up burgers.\n" +
                "Do Ahead: Patties can be made 3 months ahead. Transfer to a resealable freezer bag and freeze.","https://assets.epicurious.com/photos/5e4c65cfd57b3b000872c652/6:4/w_620%2Ch_413/VeggieBurger_RECIPE_IG_021320_516_VOG_final.jpg"
        ));
        listRecipe.add(new Recipe(
                "Smash Burger Alfresco","INGREDIENTS\n1 cup finely chopped dill pickles\n" +
                "1/2 cup mayonnaise\n" +
                "2 Tbsp. ketchup\n" +
                "2 Tbsp. sauce from a can of chipotles in adobo\n" +
                "1/2 tsp. kosher salt, plus more\n" +
                "1 1/2 lb. ground beef (20% percent fat)\n" +
                "4 potato rolls\n" +
                "1/2 head of iceberg lettuce, leaves separated, torn into pieces about the size of the buns\n" +
                "1 white onion, very thinly sliced into rings on a mandoline\n" +
                "4 thin tomato slices (optional)\n" +
                "2 Tbsp. vegetable oil\n" +
                "8 slices American cheese","PREPARATION\n" +
                "Prepare a grill for high heat. Place a cast-iron griddle, flat side up, on grate; heat until very hot, at least 20 minutes.\n" +
                "Mix together pickles, mayonnaise, ketchup, adobo sauce, and 1/2 tsp. salt in a medium bowl; set special sauce aside.\n" +
                "Divide beef into eight 3-oz. portions (don’t form into patties). Place 4 portions between 2 sheets of parchment paper, spacing 6\" apart, and, using a meat mallet or skillet, firmly smash to create thin patties, about 5\" across. Transfer to a baking sheet. Repeat with remaining portions and fresh parchment paper.\n" +
                "Wrap all the buns together in a large sheet of foil to make a packet (this will keep buns soft and from getting too toasted on the grill). Place packet on grate and grill, turning once, until buns are warmed through, about 1 minute. Spread sauce over cut sides of buns. Place 3–4 pieces of lettuce on bottom buns and top each with some onion and a tomato slice, if using.\n" +
                "Drizzle oil over griddle and use paper towels to evenly coat surface. The oil needs to be hot; you should see smoke almost instantly. Season patties lightly with salt. Place 4 on griddle, seasoned side down, and season top sides lightly with salt. Cook, undisturbed, until outer edges are brown and undersides are very crisp, about 2 minutes. Flip and place a slice of cheese on top of each patty. Cook until cheese is melted, about 30 seconds. Transfer patties to buns with toppings, stacking 2 patties on each bun. Repeat with remaining 4 patties, scraping off any cheese stuck to griddle in between batches.","https://assets.epicurious.com/photos/5d3770a318159f000876ad68/6:4/w_620%2Ch_413/summer-smash-burger-recipe-BA-071119.jpg"
        ));
        listRecipe.add(new Recipe(
                "Diner-Style Patty Melt","INGREDIENTS\n" +
                "1 pound ground beef chuck (20% fat), or 4 vegetarian patties such as Lightlife Plant-Based Burgers\n" +
                "1 teaspoon kosher salt\n" +
                "1/4 teaspoon freshly ground black pepper\n" +
                "8 slices rye bread\n" +
                "2 tablespoons vegetable oil, divided\n" +
                "1 large onion, sliced into 1/4\" rounds\n" +
                "8 thin slices cheddar, American, or Swiss cheese\n" +
                "8 teaspoons mayonnaise, divided","PREPARATION\n" +
                "Season beef with salt and pepper; divide into 4 patties. Form each patty into a thin oval that is slightly larger than a slice of bread you’re using.\n" +
                "Heat 1 Tbsp. oil in a large skillet or griddle, preferably cast iron, over medium-high. Cook onion slices in a single layer, being careful not to let rings separate, until softened and charred, about 4 minutes per side. Transfer to a plate and divide into individual rings.\n" +
                "Add remaining 1 Tbsp. oil to skillet. Working in batches if needed, cook patties, pressing flat with a spatula, until browned but still pink in the center, about 1 1/2 minutes per side. Transfer to a plate.\n" +
                "Wipe out skillet and reduce heat to medium-low. Top each slice of bread with 1 cheese slice, 1 patty, one-quarter of the onions, another slice of cheese, then a second slice of bread. Spread tops of each sandwich with 1 tsp. mayonnaise. Working in batches if needed, cook sandwiches, mayo side down, spreading the top of each sandwich with 1 tsp. mayonnaise, until golden brown, about 3 minutes. Flip and continue to cook until bread is golden brown and cheese is melted, about 3 minutes.\n","https://assets.epicurious.com/photos/577185997823d8090d928cd6/1:1/w_1600%2Cc_limit/diner-patty-melt-20062016.jpg"
        ));
        listRecipe.add(new Recipe(
                "Cheesy Pasta Cauliflower","INGREDIENTS\n" +
                "1 pound pasta, such as medium shell or tube pasta\n" +
                "1 (14-ounce) can cherry tomatoes, lightly crushed by hand\n" +
                "8 ounces low-moisture whole-milk mozzarella, coarsely grated\n" +
                "4 ounces provolone or other mildly sharp cheese (such as more of the cheddar below), coarsely grated\n" +
                "2 ounces sharp cheddar, coarsely grated\n" +
                "2 ounces Parmesan, grated\n" +
                "1 1/2 cups heavy cream\n" +
                "Freshly ground black pepper\n" +
                "1/2 head of cauliflower, cut into 1/2\" pieces\n" +
                "Room-temperature butter or nonstick cooking oil spray (for pan)","PREPARATION\n" +
                "Preheat oven to 350°F. Cook pasta in a large pot of boiling salted water until about halfway cooked (it needs to be very firm at this stage so that it doesn’t overcook when baked). Drain, reserving 1/2 cup pasta cooking liquid, and run under cold water to stop the cooking. Drain well.\n" +
                "Lightly crush cherry tomatoes with your hands in a large bowl. Add mozzarella, provolone, cheddar, Parmesan, cream, and reserved ½ cup pasta cooking liquid and mix to combine. Season generously with salt and pepper. Add cauliflower and cooked pasta and toss to coat. Butter (or lightly coat) a 3-qt. or 13x9x2\" baking dish with butter. Scrape in pasta mixture and spread out into an even layer. Cover dish tightly with foil and bake pasta until hot throughout and steaming when foil is lifted, 20–25 minutes.\n" +
                "Remove foil and increase oven temperature to 425°F. Continue to bake pasta until sauce is bubbling and top is browned and crunchy in spots, 25–30 minutes. Let cool slightly before serving.\n" +
                "Do Ahead\n" +
                "Pasta can be assembled 2 days ahead. Cover and chill until ready to bake.","https://assets.epicurious.com/photos/5a5fc857ac6a085f02ed2635/6:4/w_620%2Ch_413/cheesy-baked-pasta-with-cauliflower-recipe-BA-011718.jpg"
        ));
        listRecipe.add(new Recipe(
                "Ashkenazic Potato Pudding","INGREDIENTS\n" +
                "1/2 cup schmaltz or vegetable oil\n" +
                "6 medium or 4 large russet potatoes (about 2 pounds), peeled\n" +
                "2 medium yellow onions, chopped (about 1 cup)\n" +
                "3 large eggs, lightly beaten\n" +
                "About 1 teaspoon salt\n" +
                "Ground black pepper to taste\n" +
                "1/4 cup gribenes (poultry cracklings) or grated carrot, optional\n" +
                "About 1/3 cup matza meal or all-purpose flour","PREPARATION\n" +
                "Preheat the oven to 375°F. Heat an 8- or 9-inch square baking dish in the oven.\n" +
                "Coat the bottom and sides of the baking dish with 1/4 cup of the schmaltz or oil and return to the oven until very hot, about 15 minutes.\n" +
                "Place the potatoes in a large bowl of lightly salted cold water. (This keeps them from discoloring.) Grate the potates into the onions, stirring to mix.\n" +
                "Stir in the eggs, remaining 1/4 cup schmaltz or oil, salt, pepper, and, if desired, gribenes or carrot. Add enough matza meal or flour to bind the batter.\n" +
                "Pour into the heated dish and bake until golden brown, about 1 hour. Although this is best when warm, the leftovers can be served at room temperature.","https://assets.epicurious.com/photos/58bdb21392eece36cc1d3f81/1:1/w_1600%2Cc_limit/Potato-Kugel-03022017.jpg"
        ));
        listRecipe.add(new Recipe(
                "Chicken Pot Tot Hotdish","INGREDIENTS\n" +
                "3 tablespoons unsalted butter\n" +
                "1 large onion, finely chopped\n" +
                "3 carrots, cut into 1/2-inch pieces\n" +
                "Kosher salt\n" +
                "6 tablespoons flour\n" +
                "3 cups whole milk\n" +
                "Enough chicken broth base to make 3 cups broth\n" +
                "3/4 cup peas, fresh or frozen\n" +
                "1 1/2 pounds boneless, skinless chicken thigh, cut into 1/2- to 3/4-inch pieces\n" +
                "1/2 teaspoon dried thyme\n" +
                "Black pepper\n" +
                "18 ounces frozen Tater Tots\n" +
                "Ketchup, for serving (optional)","PREPARATION\n" +
                "Preheat the oven to 400ºF.\n" +
                "In a large skillet, melt the butter over medium-high heat. Add the onion and carrots and a pinch of salt and cook, stirring until soft, about 10 minutes. Stir in the flour so that it gets evenly distributed. Add 1 1/2 cups of the milk, stirring constantly until thickened. Repeat with the remaining 1 1/2 cups milk. Stir in the chicken broth base, peas, chicken, thyme, and a few turns of pepper and simmer, stirring often, until the chicken is cooked through and no longer pink, 10 to 15 minutes. Taste the mixture and adjust seasonings if desired.\n" +
                "Transfer the mixture to an 11x8-inch baking dish (or other 3-quart ovenproof dish) and cover the bitch with Tater Tots. Arrange them snugly and neatly. Bake until the tots are golden brown. Begin checking for doneness at 30 minutes. Let cool slightly and serve with ketchup, if desired.","https://assets.epicurious.com/photos/581105d68aedcde86f7b9608/1:1/w_1600%2Cc_limit/chicken-pot-tater-tot-102616.jpg"
        ));
        listRecipe.add(new Recipe(
                "Creamy Mushroom Lasagna","INGREDIENTS\n" +
                "Olive, grape seed, or coconut oil, or veggie broth for sautéing\n" +
                "3 garlic cloves, minced\n" +
                "16 ounces mushrooms, chopped (you can use a mix of different mushrooms)\n" +
                "1 tablespoon tamari or coconut aminos\n" +
                "1 teaspoon dried thyme\n" +
                "3/4 cup raw cashews, soaked for a few hours (overnight is best), drained\n" +
                "1 cup veggie broth\n" +
                "2 big handfuls spinach\n" +
                "10 ounces gluten-free lasagna noodles (I use Tinkyada's brown rice version)\n" +
                "4 cups marinara sauce, store-bought (a 32-oz jar) or homemade\n" +
                "Nutritional yeast (optional)","PREPARATION\n" +
                "Preheat the oven to 350ºF.\n" +
                "In a large skillet, heat a glug of oil or veggie broth over medium. When the pan is hot, add the garlic and sauté until it becomes fragrant. This will take about a minute. Add the mushrooms, tamari, and thyme. Cook, stirring every minute or so, for 6 to 8 minutes or until the mushrooms release their water and a little broth starts to form.\n" +
                "Combine the cashews and veggie broth in a high-speed blender and blend until the mixture is completely smooth. This might take up to 5 minutes, depending on the speed and power of your blender. Pour the cashew sauce into the pan with the mushrooms. Reduce the heat to medium-low and simmer for a couple minutes to let the sauce thicken, stirring frequently. Throw in the spinach and stir for another minute.\n" +
                "Prepare the lasagna noodles according to the package instructions. Make sure to do this after your mushroom sauce is ready to go, so the noodles don't sit for too long and start sticking together.\n" +
                "Spread a third of the marinara sauce on the bottom of an 8-by-11-inch baking dish. Add a layer of noodles. Cover the noodles with half of the mushroom cream. Add a layer of noodles. Use another third of the marinara to cover these noodles. Add the remaining mushroom cream. Add the last layer of noodles and cover it with the remaining marinara sauce.\n" +
                "Cover the lasagna with aluminum foil and bake for 30 minutes. Remove the foil, add a sprinkle of nutritional yeast over the top, if you like, and bake for another 15 minutes. Let the lasagna rest for 5 minutes before serving.","https://assets.epicurious.com/photos/585c0118661915cd34f0eb0b/6:4/w_620%2Ch_413/mushroom-lasagna-HC-122116.jpg"
        ));
        listRecipe.add(new Recipe(
                "Pumpkin Gruyère Gratin","INGREDIENTS\n" +
                "1 teaspoon extra-virgin olive oil\n" +
                "1 teaspoon butter\n" +
                "1 medium onion, halved and sliced\n" +
                "One 3 1/2-pound sugar pumpkin, kabocha, or butternut squash, peeled, seeded, and cubed (about 9 cups)\n" +
                "1 tablespoon fresh thyme leaves, stems reserved\n" +
                "1 1/2 teaspoons kosher salt, divided\n" +
                "1/2 teaspoon freshly ground pepper\n" +
                "3/4 cup heavy cream\n" +
                "2 garlic cloves, very thinly sliced\n" +
                "Pinch cayenne pepper\n" +
                "Freshly grated nutmeg\n" +
                "2 teaspoons cornstarch\n" +
                "3 1/2 ounces Gruyère cheese, grated (1 heaping cup)\n" +
                "1/3 cup Japanese-style breadcrumbs (panko)","PREPARATION\n" +
                "Preheat oven to 425°F. In a medium skillet over medium heat, heat the oil and butter. Add the onion and 1/2 teaspoon salt and cook until softened and starting to brown, 8 to 10 minutes, tossing occasionally. Transfer to a 3-quart gratin dish and add pumpkin, thyme leaves, and 1/2 teaspoon salt, and pepper and toss to combine. Roast until squash is soft, tossing halfway through, about 45 minutes.\n" +
                "Meanwhile, in a small saucepan, combine cream, reserved thyme stems, garlic, remaining 1/2 teaspoon salt, cayenne, and nutmeg. Bring to a simmer, whisk in cornstarch, and cook for 1 minute. Turn off heat, cover, and let steep about 30 minutes.\n" +
                "Once squash is tender, remove thyme stems from cream mixture and pour cream over squash. Sprinkle with cheese and then breadcrumbs. Return to oven and cook until cream is bubbling, 5 to 7 minutes. Broil until top is golden brown, 2 to 3 minutes. Serve immediately.\n" +
                "DO AHEAD:\n" +
                "The pumpkin mixture can be roasted up to one day ahead of time.","https://assets.epicurious.com/photos/54b9c26b2a4b69f8647e6def/6:4/w_620%2Ch_413/51252910_pumpkin-gratin_1x1.jpg"
        ));
        recipeAdapter = new RecipeAdapter(listRecipe);
        recipeAdapter.setListener(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(recipeAdapter);
        rv.setLayoutManager(layoutManager);
    }

    @Override
    public void onClick(View view, int position) {
        Recipe recipe = listRecipe.get(position);
        Intent i = new Intent(MainActivity.this, RecipeDetail.class);
        i.putExtra(Key_MainActivity, recipe);
        startActivity(i);
    }
}