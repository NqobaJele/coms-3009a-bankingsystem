package com.example.coms_3009a_banking_system.ClientAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.coms_3009a_banking_system.R;

public class AccountActivity extends AppCompatActivity {

    String Account_No;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        Intent intent = getIntent();
        Account_No = intent.getStringExtra("Account_Num");

        Toast.makeText(getApplicationContext(),Account_No,Toast.LENGTH_SHORT).show();

        //website to post to the php file
        //https://lamp.ms.wits.ac.za/home/s2143686/Account_activity.php
        //php takes Account number, Account pin, and the activity to be performed and reciever of funds.


    }
}