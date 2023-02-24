package in.portx.lisviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listDemo);
        String[] names = new String[]{"Ini Systems","JARS","PortX","Google","Apple","Meta","Netflix","Microsoft","Samsung","ThoughtWorks","Goldman Saches","KPMG","SBI"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,R.layout.name_list_item,names);
        listView.setAdapter(adapter);
        listView
                .setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view, int position, long id) {
                /*TextView textView =(TextView) view;
                textView.setText("Hello");
                Toast.makeText(getApplicationContext(),
                        names[position], Toast.LENGTH_SHORT).show();*/
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("name",names[position]);
                startActivity(intent);
            }
        });
    }
}