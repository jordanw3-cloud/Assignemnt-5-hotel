package edu.umbc.is.example.assignemnt_5_hotel;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { // detail activity, second page with content
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail); // links xml, main activity takes us here

        // create objects

        TextView tvAdd1 = findViewById(R.id.tvAdd1); // text views of address broken into two parts.
        TextView tvAdd2 = findViewById(R.id.tvAdd2);
        TextView tvCost1 = findViewById(R.id.tvCost1); // textview of cost a night


    }
}
