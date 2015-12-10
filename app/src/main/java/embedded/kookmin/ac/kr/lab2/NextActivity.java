package embedded.kookmin.ac.kr.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent intent=this.getIntent();
        Toast.makeText(this.getApplicationContext(),"name:"+intent.getStringExtra("name"),Toast.LENGTH_LONG).show();
    }
}
