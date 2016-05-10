package at.htldornbirn.a3cwi.ufw_ratingapp.layouts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import at.htldornbirn.a3cwi.ufw_ratingapp.R;
import at.htldornbirn.a3cwi.ufw_ratingapp.adapter.StudentsAdapter;

/**
 * Created by David on 20.04.2016.
 */
public class LayoutStudents extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ts_main);

        ListView lvStudent = (ListView) findViewById(R.id.listView);
        final StudentsAdapter sta = new StudentsAdapter(this);
        lvStudent.setAdapter(sta);
    }
}