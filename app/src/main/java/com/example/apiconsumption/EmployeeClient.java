package com.example.apiconsumption;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface EmployeeClient {

    @GET("employees")
    Call<List<Employee>>getEmployees();

    @GET("employee/{id}")
    Call<Employee>getEmployeeByID(@Path("id")int id);

    @POST("create")
    Call<Employee>createEmployee(
            @Body Employee employee
    );
}
