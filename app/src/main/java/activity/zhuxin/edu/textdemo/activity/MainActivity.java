package activity.zhuxin.edu.textdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import activity.zhuxin.edu.textdemo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //上拉下拉
        Button but1= (Button) findViewById(R.id.btn_1);
        but1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_1:
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                break;
        }
    }
}
