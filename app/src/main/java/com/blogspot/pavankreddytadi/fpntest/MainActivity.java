package com.blogspot.pavankreddytadi.fpntest;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static MessagesDatabase messagesDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        messagesDatabase = Room.databaseBuilder(this,MessagesDatabase.class,"MY_DB")
                .allowMainThreadQueries()
                .build();

        List<MessageObjects> list =messagesDatabase.messageObjectsDAO().getAllMessages();
        for(int i=0;i<list.size();i++)
        {
            Toast.makeText(this, list.get(i).getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
