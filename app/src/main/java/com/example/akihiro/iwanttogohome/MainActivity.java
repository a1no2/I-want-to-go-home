package com.example.akihiro.iwanttogohome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView main_text;
    ListView main_ListView;
    Button mainHome_btn, registration_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_text = (TextView)findViewById(R.id.main_text);
        main_ListView = (ListView)findViewById(R.id.main_Listview);
        mainHome_btn = (Button)findViewById(R.id.mainHome_btn);
        mainHome_btn.setOnClickListener(this);
        registration_btn = (Button)findViewById(R.id.registration_btn);
        registration_btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.mainHome_btn:
                break;
            case R.id.registration_btn:
                break;
        }

    }
}
