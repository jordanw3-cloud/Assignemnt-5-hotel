package edu.umbc.is.example.assignemnt_5_hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMineralHotel = findViewById(R.id.tvMineralHotel); // create text view

        Button btnHotelInfo = findViewById(R.id.btnHotelInfo); // create button

        btnHotelInfo.setOnClickListener(e ->{ // on click to change page
            startActivity(new Intent(this, DetailActivity.class));
        });
    }
}