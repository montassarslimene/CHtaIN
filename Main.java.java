package com.example.Marketchat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chtain.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView productListView;

    private Button refreshButton;
    public class productAdapter implements com.example.Marketchat.productAdapter {
        public class CHtaIN extends AppCompatActivity {
            private com.example.chtain.SocketManager socketManager;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                socketManager = new com.example.chtain.SocketManager();
                socketManager.connectSocket();
            }
        }
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            productListView = findViewById(R.id.productListView);
            refreshButton = findViewById(R.id.refreshButton);
            List<Product> productList = new ArrayList<>();
            productList.add(new Product("Item 1", "Product 1", "One-line description for Product 1"));
            productList.add(new Product("Item 2", "Product 2", "One-line description for Product 2"));
            productList.add(new Product("Item 3", "Product 3", "One-line description for Product 3"));
            ProductAdapter productAdapter = new ProductAdapter(this, productList);
            productListView.setAdapter((ListAdapter) productAdapter);
            class CHtaIN extends AppCompatActivity {

            }
        }
        return refreshButton.setOnClickListener(new View.OnClickListener() {

            public void onClick (View) {
                    // Perform refresh action
                    refreshProductData()};
        }

        private class ProductAdapter {
            public ProductAdapter(productAdapter productAdapter, List<Product> productList) {
            }
        }
    }


    private void refreshProductData() {
        // Perform refresh logic
        Toast.makeText(this, "Product data refreshed", Toast.LENGTH_SHORT).show();
        // Update the product list with new data
        // productAdapter.updateProductList(newProductList);
    }}
