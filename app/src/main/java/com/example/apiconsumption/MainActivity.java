package com.example.apiconsumption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Button show, add;
    EditText etId;

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        String BASE_URL = "http://dummy.restapiexample.com/api/v1/";
//        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//        Retrofit.Builder builder =new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create());
//        Retrofit retrofit = builder.client(httpClient.build()).build();
//        EmployeeClient employeeClient = retrofit.create(EmployeeClient.class);
//        Call<List<Employee>> call = employeeClient.getEmployees();
//        call.enqueue(new Callback<List<Employee>>() {
//            @Override
//            public void onResponse(Call<List<Employee>> call, Response<List<Employee>> response) {
//
//                Log.d(TAG, response.body().toString());
//
//                Toast.makeText(MainActivity.this,response.body().toString() , Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onFailure(Call<List<Employee>> call, Throwable t) {
//
//                Log.d(TAG, t.getLocalizedMessage());
//            }
//        });


        etId = findViewById(R.id.etID);
        show = findViewById(R.id.btnView);


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String BASE_URL = "http://dummy.restapiexample.com/api/v1/";
                OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
                Retrofit.Builder builder =new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create());
                Retrofit retrofit = builder.client(httpClient.build()).build();
                EmployeeClient employeeClient = retrofit.create(EmployeeClient.class);
                Call<Employee>call = employeeClient.getEmployeeByID(Integer.parseInt(etId.getText().toString()));
                call.enqueue(new Callback<Employee>() {
                    @Override
                    public void onResponse(Call<Employee> call, Response<Employee> response) {
//                        Log.d(TAG, response.body().toString());

                        Toast.makeText(MainActivity.this,response.body().toString() , Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Employee> call, Throwable t) {
                        Log.d(TAG, t.getLocalizedMessage());
                    }
                });

            }
        });

        add = findViewById(R.id.btnCreate);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String BASE_URL = "http://dummy.restapiexample.com/api/v1/";
                OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
                Retrofit.Builder builder =new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create());
                Retrofit retrofit = builder.client(httpClient.build()).build();
                EmployeeClient employeeClient = retrofit.create(EmployeeClient.class);
                Call<Employee>call = employeeClient.createEmployee(new Employee(1,"Prakash",40000, 23));
                call.enqueue(new Callback<Employee>() {
                    @Override
                    public void onResponse(Call<Employee> call, Response<Employee> response) {


                        Toast.makeText(MainActivity.this,"Success" , Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Employee> call, Throwable t) {

                        Log.d(TAG, t.getLocalizedMessage());
                    }
                });
            }
        });
    }
}
