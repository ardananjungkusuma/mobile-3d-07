package com.ardananjungkusuma.latihanretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ardananjungkusuma.latihanretrofit.databinding.ActivityMainBinding;
import com.ardananjungkusuma.latihanretrofit.models.Repo;
import com.ardananjungkusuma.latihanretrofit.services.GithubService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private EditText search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        search = findViewById(R.id.cariByUsername);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GithubService service = retrofit.create(GithubService.class);

        Call<List<Repo>> repos = service.listRepos("ardananjungkusuma");

        repos.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                binding.setRepo(response.body().get(0));
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG);
            }
        });
    }

    public void searchIt(View view) {
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GithubService service = retrofit.create(GithubService.class);

        Call<List<Repo>> repos = service.listRepos(search.getText().toString());

        repos.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                binding.setRepo(response.body().get(0));
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG);
            }
        });
    }
}