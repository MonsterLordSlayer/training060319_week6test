package com.example.training060319_week6test;

import android.content.Context;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

public class OkHttpExample {

    public void getSyncRespondforSchool(Context context){
        OkHttpClient returnClient =new OkHttpClient.Builder().build();
        Request request=new Request.Builder().url("https://data.cityofnewyork.us/resource/s3k6-pzi2.json").build();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Response response=returnClient.newCall(request).execute();
                    Response response2=returnClient.newCall(request).execute();
                    Gson gson=new Gson();
                    //RandomResponse randomresponse= gson.fromJson(response.body().string(),RandomResponse.class);
                    //Log.d("TAG syncrespond", " "+randomresponse.getResults().size());
                    SchoolAlone[] schoolalone=gson.fromJson(response.body().string(),SchoolAlone[].class);
                    ((MainActivity)context).runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            RecyclerView rv=((MainActivity)context).findViewById(R.id.rvSchool);
                            RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(context);
                            ArrayList<SchoolAlone> arrayList = new ArrayList<SchoolAlone>(Arrays.asList(schoolalone));
                            SchoolAdapter schoolAdapter=new SchoolAdapter(arrayList);
                            rv.setLayoutManager(layoutManager);
                            rv.setAdapter(schoolAdapter);
                        }
                    });

                }
                catch(Exception e){
                    e.printStackTrace();


                }
            }
        });
        thread.start();


    }
    public void getSyncRespondforSchoolwithSat(Context context){
        OkHttpClient returnClient =new OkHttpClient.Builder().build();
        Request request=new Request.Builder().url("https://data.cityofnewyork.us/resource/f9bf-2cp4.json").build();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Response response=returnClient.newCall(request).execute();
                    Response response2=returnClient.newCall(request).execute();
                    Gson gson=new Gson();
                    //RandomResponse randomresponse= gson.fromJson(response.body().string(),RandomResponse.class);
                    //Log.d("TAG syncrespond", " "+randomresponse.getResults().size());
                    SchoolwithSat[] schoolwithSats=gson.fromJson(response.body().string(),SchoolwithSat[].class);
                    ((MainActivity)context).runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            RecyclerView rv=((MainActivity)context).findViewById(R.id.rvSchool);
                            RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(context);
                            ArrayList<SchoolwithSat> arrayList = new ArrayList<SchoolwithSat>(Arrays.asList(schoolwithSats));
                            //SchoolAdapter schoolAdapter=new SchoolAdapter(arrayList);
                            //rv.setLayoutManager(layoutManager);
                            //rv.setAdapter(schoolAdapter);
                        }
                    });

                }
                catch(Exception e){
                    e.printStackTrace();


                }
            }
        });
        thread.start();


    }
}
