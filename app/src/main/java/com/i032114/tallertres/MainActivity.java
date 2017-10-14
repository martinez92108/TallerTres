package com.i032114.tallertres;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.id_toolbar);
        shoeTollbar(getResources().getString(R.string.str_tb_p4));

    }

    public  void  shoeTollbar(String title){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.user_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        showpantallaDos();


        return super.onOptionsItemSelected(item);
    }
    public void showpantallaDos(){
        Intent a = new Intent(getApplicationContext(),Posts.class);
        startActivity(a);

    }
}
