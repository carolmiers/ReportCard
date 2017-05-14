package com.example.android.reportcard;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Carol on 14/05/2017.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {
    public ReportCardAdapter(Activity context, ArrayList<ReportCard> results){
    super (context,0, results );

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        /**
         * Provides a view for an AdapterView (ListView, GridView, etc.)
         *
         * @param position The position in the list of data that should be displayed in the
         *                 list item view.
         * @param convertView The recycled view to populate.
         * @param parent The parent ViewGroup that is used for inflation.
         * @return The View for the position in the AdapterView.
         */


        //Get the {@link word) object located at this position in the list
        ReportCard currentReport = getItem(position);

        //Find the TextView in the list_item.xml layout with the ID subject_text_view

        TextView reportTextView = (TextView)listItemView.findViewById(R.id.subject_text_view);
        //Get the version name from the current Report object and
        // Set this text on the name reportTextView
        reportTextView.setText(currentReport.getmsubjectaken());

        //Find the TextView in the list_item.xml layout with the ID score_text_view

        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.score_text_view);
        //Get the version name from the current report object and
        // Set this text on the name TextView
        defaultTextView.setText(currentReport.getmscoreresult());

        TextView stringTextView = (TextView)listItemView.findViewById(R.id.string_text_view);
        //Get the version name from the current report object and
        // Set this text on the name TextView
        defaultTextView.setText(currentReport.toString());
        //call the listItemView
        return(listItemView);



    }





}
