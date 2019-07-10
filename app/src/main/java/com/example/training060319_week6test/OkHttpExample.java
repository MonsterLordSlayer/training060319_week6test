package com.example.training060319_week6test;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;

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
    public void getSyncRespondforSchoolwithSat(Context context, String dbn){
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
                    ((Main2Activity)context).runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Log.d("TAG", "run2: "+dbn);
                            for (int i=0;i<schoolwithSats.length;i++){

                                if (dbn.equals(schoolwithSats[i].getDbn())){
                                    TextView tv=((Main2Activity) context).findViewById(R.id.tvSat);
                                    tv.setText("Reading: "+schoolwithSats[i].getSatCriticalReadingAvgScore()+" Writing: "+schoolwithSats[i].getSatWritingAvgScore()+" Math: "+schoolwithSats[i].getSatMathAvgScore());

                                    Log.d("TAG", "run: "+schoolwithSats[i].getSchoolName());
                                    break;
                                }

                            }

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
