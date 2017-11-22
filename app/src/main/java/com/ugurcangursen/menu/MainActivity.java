package com.ugurcangursen.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static final int ID_SAYFA1= Menu.FIRST;
    public static final int ID_SAYFA2= Menu.FIRST+1;
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
       // MenuInflater m= getMenuInflater();  // Burada menüleri kullanabilmemiz için gerekli olan MenuInflater oluşturduk. //
       // m.inflate(R.menu.menum, menu);  //Daha sonra oluşturduğumuz m nesnesi üzerinden Inflate metodunu çağırdık.
        // Bu metodun içerisine biraz önce oluşturduğumuz menüyü yazdık. (Bizim
        // menümüzün adı “menum” ‘dü ve menü klasörünün altında bulunuyordu.)
        //return super.onCreateOptionsMenu(menu);
        super.onCreateOptionsMenu(menu);

        menu.add(Menu.NONE,ID_SAYFA1,0,"1.Sayfaa");
        menu.add(Menu.NONE,ID_SAYFA2,1,"2.Sayfaa");
        return true;

    }
    @Override
    public  boolean onOptionsItemSelected (MenuItem item) {

        TextView tv = (TextView) findViewById(R.id.hello);
        switch (item.getItemId()) {
            case ID_SAYFA1:
                tv.setText("1.Sayfaya Tıklandı");
                return true;

            case ID_SAYFA2:
                tv.setText("2.Sayfaya Tıklandı.");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }}
   // @Override
    // public boolean onOptionsItemSelected(MenuItem item) {

    //  switch (item.getItemId())
    // {
    //    case ID_SAYFA1:
    //     Toast.makeText(this, "1.Sayfa Tıklandı",
    //              Toast.LENGTH_LONG).show();
    //      return true;

    //  case ID_SAYFA2:
    //      Toast.makeText(this, "2.Sayfa Tıklandı",
    //             Toast.LENGTH_LONG).show();
    //      return true;
    //  }
    //  return false;
    // }

