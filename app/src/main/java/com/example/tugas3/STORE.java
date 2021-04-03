package com.example.tugas3;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class STORE extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listStr = new String[] {"Giant Plaza Panam","KFC Panam","Living World","Transmart Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listStr));
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
            if (pilihan.equals("Giant Plaza Panam")) {
                a = new Intent(this, GiantPlazaPanam.class);
            } else if (pilihan.equals("KFC Panam")) {
                a = new Intent(this, KFCPanam.class);
            } else if (pilihan.equals("Living World"))
            {

            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

