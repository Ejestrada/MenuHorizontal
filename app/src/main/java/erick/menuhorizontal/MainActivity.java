package erick.menuhorizontal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.darwindeveloper.horizontalscrollmenulibrary.custom_views.HorizontalScrollMenuView;
import com.darwindeveloper.horizontalscrollmenulibrary.extras.MenuItem;

public class MainActivity extends AppCompatActivity {

    HorizontalScrollMenuView menu;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = (HorizontalScrollMenuView)findViewById(R.id.menu);
        textView = (TextView)findViewById(R.id.txtText);


        //Creamos el Menu

        initMenu();
    }

    private void initMenu()
    {
        menu.addItem("Codigo", R.drawable.ic_camara);
        menu.addItem("Galeria", R.drawable.ic_galeria);
        menu.addItem("Informacion", R.drawable.ic_informacion);

        menu.setOnHSMenuClickListener(new HorizontalScrollMenuView.OnHSMenuClickListener() {
            @Override
            public void onHSMClick(MenuItem menuItem, int position) {
                Toast.makeText(MainActivity.this, ""+menuItem.getText(), Toast.LENGTH_SHORT).show();
                textView.setText(menuItem.getText());
            }
        });

    }
}
