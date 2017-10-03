package ds.daura.programma_dlya_treb_znaniya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ds.daura.programma_dlya_treb_znaniya.chetyre_pravila.ChetyrePravilaActivity;
import ds.daura.R;
import ds.daura.programma_dlya_treb_znaniya.shest_osnov.ShestOsnovActivity;

public class Plitka2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plitka2);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.line1:
                startActivity(new Intent(Plitka2Activity.this, TriOsnovPravila.class));
                break;
            case R.id.line2:
                startActivity(new Intent(Plitka2Activity.this, ChetyrePravilaActivity.class));
                break;
            case R.id.line3:
                startActivity(new Intent(Plitka2Activity.this, ShestOsnovActivity.class));
                break;
        }
    }
}
