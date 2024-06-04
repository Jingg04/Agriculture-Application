package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductList extends AppCompatActivity {

    ImageView fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView imageButton6 = findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, ProfileEdit.class);
                startActivity(intent);
            }
        });

        ImageView fruit = findViewById(R.id.fruit);
        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, DetailFruit.class);
                startActivity(intent);
            }
        });
        ImageView orange1 = findViewById(R.id.orange1);
        orange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, Orange.class);
                startActivity(intent);
            }
        });
        ImageView mango1 = findViewById(R.id.mango1);
        mango1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, Mango.class);
                startActivity(intent);
            }
        });
        ImageView vegetable = findViewById(R.id.vegetable);
        vegetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, DetailVegetable.class);
                startActivity(intent);
            }
        });
        ImageView watermelon1 = findViewById(R.id.watermelon1);
        watermelon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, WaterMelon.class);
                startActivity(intent);
            }
        });
        ImageView rice = findViewById(R.id.rice);
        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, RomdoulRice.class);
                startActivity(intent);
            }
        });
        ImageView pumpkin1 = findViewById(R.id.pumpkin1);
        pumpkin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, PumkinSeeds.class);
                startActivity(intent);
            }
        });
        ImageView ginger1 = findViewById(R.id.ginger1);
        ginger1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, Ginger.class);
                startActivity(intent);
            }
        });
        ImageView grain = findViewById(R.id.grain);
        grain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, DetailGrant.class);
                startActivity(intent);
            }
        });
        ImageView spice1 = findViewById(R.id.spice1);
        spice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, DetailSpice.class);
                startActivity(intent);
            }
        });
        ImageView seed = findViewById(R.id.seed);
        seed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, DetailSeeds.class);
                startActivity(intent);
            }
        });
        ImageView plants1 = findViewById(R.id.plants1);
        plants1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, DetailPlants.class);
                startActivity(intent);
            }
        });
        ImageView post1 = findViewById(R.id.post1);
        post1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, Pp.class);
                startActivity(intent);
            }
        });
        ImageView home1 = findViewById(R.id.home1);
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductList.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}