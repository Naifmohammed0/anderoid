package sharaf9.tawfeeq.android.com.computercinter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listview=(ListView)findViewById(R.id.listView);
        final String[] item=getResources().getStringArray(R.array.index);
        ArrayAdapter arrayadapter =new ArrayAdapter<String>(this,R.layout.row_item,R.id.textitme,item);
        listview.setAdapter(arrayadapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                if (id==0){
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
            }
            else if (id==1){
                    Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                    startActivity(intent);
                }
                else if(id==2){
                    Intent intent=new Intent(MainActivity.this,Main4Activity.class);
                    startActivity(intent);
                }
                else if(id==3){
                    Intent intent=new Intent(MainActivity.this,Main5Activity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
