package com.example.Marketchat;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.chtain.R;

public class Activity_login extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText emailEditText; // Declare the variable
        EditText passwordEditText; // Variable declaration
        Button loginButton; // Variable declaration
        // Initialize views
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        // Set click listener for login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get entered email and password
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Perform login logic
                boolean isLoginSuccessful = performLogin(email, password);

                // Check login result
                if (isLoginSuccessful) {
                    // Start main activity
                    Intent intent = new Intent(Activity_login.this, MainActivity.productAdapter.CHtaIN.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Show error message or handle login failure
                    // For example, display a toast message
                    Toast.makeText(Activity_login.this, "Login failed. Please try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean performLogin(String email, String password) {
        // Perform your login logic here
        // You can implement your own authentication mechanism or connect to a backend service

        // For demonstration purposes, let's assume the login is successful if the email and password are not empty
        return !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password);
    }
}
