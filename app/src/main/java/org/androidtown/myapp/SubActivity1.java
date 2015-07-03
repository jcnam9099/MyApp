package org.androidtown.myapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SubActivity1 extends ActionBarActivity {
    String id;
    String password;
    String correctid="test";
    String correctpassword="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);
            Button longinbtn = (Button) findViewById(R.id.loginbtn);
            longinbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText idEditText = (EditText) findViewById(R.id.idEditText);
                    EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
                    id = idEditText.getText().toString();
                    password = passwordEditText.getText().toString();
                    if (id.equals(correctid) && password.equals(correctpassword)){
                        Toast.makeText(getApplicationContext(), "Login",
                                Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(getApplicationContext(), "INCORRECT",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });



}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
