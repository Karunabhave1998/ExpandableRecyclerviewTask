package com.example.expandablerecyclerviewtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TouristAdapter touristAdapter;
    TouristModel touristModel;
    List<TouristModel> touristModelList= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        touristAdapter = new TouristAdapter(getApplicationContext(),touristModelList);
        recyclerView.setAdapter(touristAdapter);


        initData();

    }






    private void initData() {

        touristModel = new TouristModel(R.drawable.img,"GateWay of India",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_arrow_forward_24,"1234567890",18.921686, 72.833097,"https://www.maharashtratourism.gov.in/gateway-of-india");
        touristModelList.add(touristModel);
        touristModel = new TouristModel(R.drawable.agra,"Agra",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_arrow_forward_24,"1234567890",18.921970, 72.834557,"https://www.maharashtratourism.gov.in/gateway-of-india");
        touristModelList.add(touristModel);
        touristModel = new TouristModel(R.drawable.mysore,"Mysore Palace",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_arrow_forward_24,"1234567890",18.921970, 72.834557,"https://www.maharashtratourism.gov.in/gateway-of-india");
        touristModelList.add(touristModel);
        touristModel = new TouristModel(R.drawable.goldentemple,"Golden Temple",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_arrow_forward_24,"1234567890",18.921970, 72.834557,"https://www.maharashtratourism.gov.in/gateway-of-india");
        touristModelList.add(touristModel);
        touristModel = new TouristModel(R.drawable.jaipur,"Jaipur",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_arrow_forward_24,"1234567890",18.921970, 72.834557,"https://www.maharashtratourism.gov.in/gateway-of-india");
        touristModelList.add(touristModel);
        touristModel = new TouristModel(R.drawable.pratapgad,"Pratapgad",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_arrow_forward_24,"1234567890",18.921970, 72.834557,"https://www.maharashtratourism.gov.in/gateway-of-india");
        touristModelList.add(touristModel);
        touristModel = new TouristModel(R.drawable.goa,"Goa",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_arrow_forward_24,"1234567890",18.921970, 72.834557,"https://www.maharashtratourism.gov.in/gateway-of-india");
        touristModelList.add(touristModel);
        touristModel = new TouristModel(R.drawable.wonderla,"Woderala",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_arrow_forward_24,"1234567890",18.921970, 72.834557,"https://www.maharashtratourism.gov.in/gateway-of-india");
        touristModelList.add(touristModel);
        touristModel = new TouristModel(R.drawable.golkondafort,"Golkonda Fort",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_arrow_forward_24,"1234567890",18.921970, 72.834557,"https://www.maharashtratourism.gov.in/gateway-of-india");
        touristModelList.add(touristModel);
        touristModel = new TouristModel(R.drawable.murudjanjira,"Murud Janjira",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_arrow_forward_24,"1234567890",18.921970, 72.834557,"https://www.maharashtratourism.gov.in/gateway-of-india");
        touristModelList.add(touristModel);
        touristModel = new TouristModel(R.drawable.kerala,"Keral",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_arrow_forward_24,"1234567890",18.921970, 72.834557,"https://www.maharashtratourism.gov.in/gateway-of-india");
        touristModelList.add(touristModel);
        touristModel = new TouristModel(R.drawable.kanyakumari,"KanyaKumari",R.drawable.ic_baseline_arrow_drop_down_24,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_arrow_forward_24,"1234567890",18.921970, 72.834557,"https://www.maharashtratourism.gov.in/gateway-of-india");
        touristModelList.add(touristModel);
       touristAdapter.notifyDataSetChanged();






    }


}