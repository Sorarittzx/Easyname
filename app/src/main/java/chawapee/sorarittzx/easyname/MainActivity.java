package chawapee.sorarittzx.easyname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chawapee.sorarittzx.easyname.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fragment To activity
        if(savedInstanceState == null){
          getSupportFragmentManager().beginTransaction()
                  .add(R.id.contentFragmentMain,new MainFragment())
                  .commit();

        }

    } //Main Method




}   //Main Class
