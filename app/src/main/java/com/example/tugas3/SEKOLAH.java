package com.example.tugas3;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SEKOLAH extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listGcr = new String[] {"UIN Suska Riau","Universitas Riau","Universitas Muhammadiyah","Universitas lancang Kuning","Universitas Islam Riau"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listGcr));
    }
    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("UIN Suska Riau")) {
                a = new Intent(this, UinSuskaRiau.class);
            } else if (pilihan.equals("Universitas Riau")) {
                a = new Intent(this, UnivRiau.class);
            } else if (pilihan.equals("Universitas Muhammadiyah"))
            {

            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

