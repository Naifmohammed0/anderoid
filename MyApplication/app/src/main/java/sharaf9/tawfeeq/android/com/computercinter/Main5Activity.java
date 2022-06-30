package sharaf9.tawfeeq.android.com.computercinter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {
    final Mysqldb mydb = new  Mysqldb(this);
    ListView las;
    EditText name ,phon,Id,price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Id =(EditText)findViewById(R.id.editText);
        name =(EditText)findViewById(R.id.editText2);
        phon =(EditText)findViewById(R.id.editText3);
        price =(EditText)findViewById(R.id.editText4);

        las = (ListView)findViewById(R.id.listView3);
        Button tr = (Button)findViewById(R.id.button2);
        tr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Boolean r = mydb.inserData3(name.getText().toString(),phon.getText().toString(),price.getText().toString());
                Toast.makeText(getApplicationContext(), "" +r, Toast.LENGTH_SHORT).show();
                showdate();
                name.setText(" ");
                phon.setText(" ");
                price.setText(" ");
            }

        });

        Button t = (Button)findViewById(R.id.button4);

        t.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Boolean up = mydb.updateData3(Id.getText().toString(),name.getText().toString(),phon.getText().toString(),price.getText().toString());
                if (up==true) {
                    Toast.makeText(getApplicationContext(), "" + up, Toast.LENGTH_SHORT).show();
                    Id.setText(" ");
                    name.setText(" ");
                    phon.setText(" ");
                    price.setText(" ");
                    showdate();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), ""+up, Toast.LENGTH_SHORT).show();
                }
            }

        });

        Button de = (Button)findViewById(R.id.button3);

        de.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Integer del = mydb.Delete3 (Id.getText().toString());
                if (del > 0) {
                    Toast.makeText(getApplicationContext(), "OK", Toast.LENGTH_SHORT).show();
                    showdate();

                }
                else
                {
                    Toast.makeText(getApplicationContext(), "NO", Toast.LENGTH_SHORT).show();
                }
            }

        });
        showdate();
    }
    public void showdate(){

        ArrayList listData = mydb.get_first_name3();
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listData);
        las.setAdapter(ad);

    }


}
