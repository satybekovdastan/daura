package ds.daura.programma_dlya_nachinayushih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ds.daura.R;
import ds.daura.programma_dlya_nachinayushih.chetvertiy_kurs_po_izucheniu_edinobojiya.Chetvertiy_kurs_po_izucheniu_edinobojiyaActivity;
import ds.daura.programma_dlya_nachinayushih.tretii_kurs_po_iz_eb.Tretii_kurs_po_izucheniu_edinobojiyaActivity;
import ds.daura.programma_dlya_nachinayushih.vtoroi_kurs_po_iz_eb.Vtoroy_kurs_po_izucheniu_edinobojiyaActivity;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.line1:
                startActivity(new Intent(TwoActivity.this, LectionActivity.class));
                break;
            case R.id.line2:
                startActivity(new Intent(TwoActivity.this, Vtoroy_kurs_po_izucheniu_edinobojiyaActivity.class));
                break;
            case R.id.line3:
                startActivity(new Intent(TwoActivity.this, Tretii_kurs_po_izucheniu_edinobojiyaActivity.class));
                break;
            case R.id.line4:
                startActivity(new Intent(TwoActivity.this, Chetvertiy_kurs_po_izucheniu_edinobojiyaActivity.class));
                break;
        }
    }
}
