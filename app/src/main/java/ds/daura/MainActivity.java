package ds.daura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ds.daura.islam_v_voprosah.IslamVoprosahActivity;
import ds.daura.pokloneniya.PokloneniyaActivity;
import ds.daura.programma_dlya_nachinayushih.TwoActivity;
import ds.daura.programma_dlya_treb_znaniya.Plitka2Activity;
import ds.daura.tolkovanie_korana.TolkovanieKoranaActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                 startActivity(new Intent(MainActivity.this, TwoActivity.class));
                break;
            case R.id.btn2:
                 startActivity(new Intent(MainActivity.this, Plitka2Activity.class));
                break;
            case R.id.btn3:
                 startActivity(new Intent(MainActivity.this, TolkovanieKoranaActivity.class));
                break;
            case R.id.btn4:
                 startActivity(new Intent(MainActivity.this, PokloneniyaActivity.class));
                break;
            case R.id.btn5:
                 startActivity(new Intent(MainActivity.this, IslamVoprosahActivity.class));
                break;
            case R.id.btn6:
                // startActivity(new Intent(MainActivity.this, FAQActivity.class));
                break;
        }
    }
}
