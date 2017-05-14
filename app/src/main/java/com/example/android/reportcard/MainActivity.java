package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_list);

     // Create an arraylist of ReportCard Objects
       ArrayList<ReportCard> results = new ArrayList<ReportCard>();
        //String[] results = new String[10];

        results.add(new ReportCard("Biology","75"));
        results.add(new ReportCard("French", "24"));
        results.add(new ReportCard("Maths", "76"));
        results.add(new ReportCard("Physics", "56"));
        results.add(new ReportCard("Geography", "87"));
        results.add(new ReportCard("Chemistry", "65"));
        results.add(new ReportCard("English", "80"));
        results.add(new ReportCard("Art", "50"));
        results.add(new ReportCard("Music","71"));
        results.add(new ReportCard("Philosophy", "67"));

        //Create an {@link ArrayAdapter}, whose data source is a list of Strings.


        // The adapter knows how to create layouts for each item in the list, using the
        //Android R.layout, simple_list_item_1.xml layout resource defined in the Android framework. This later is replaced by creating a different layout from a listview then text views using list_item.xml

        ReportCardAdapter adapter = new ReportCardAdapter(this, results);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // report_list.xml layout file.


        ListView listView = (ListView)findViewById(R.id.List);
        listView.setAdapter(adapter);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for report entry in the list of results.
        // Do this by calling the setAdapter method on the {@link ListView} ReportCardAdapter object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name adapter.






    }
}
