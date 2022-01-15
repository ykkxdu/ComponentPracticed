package com.example.componentpracticed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARouter.getInstance().inject(this);
        button = findViewById(R.id.main_button);
        Intent intent = new Intent();
        intent.setClassName("com.example.module_cart",
                "com.example.module_cart.CartActivity");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ARouter.getInstance().build("/cart/cartActivity").navigation();
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"click", Toast.LENGTH_SHORT).show();
                //finish();
            }
        });
    }
}