package com.example.jmush.android_session10_assignment_102;

/**
 * Created by jmush on 9/5/17.
 */

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuFragment extends ListFragment {
    // creating  array
    String[] title = new String[] { "Name","Email","Phone","Profession" };
    String[] detail = new String[]{"Junaid Ahmed","junaid@gmail.com","123456","Working"};
    @Override

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.list_fragment, container, false);
        //populating title to listview
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, title);
        //populating in listview
        setListAdapter(adapter);

        return view;

    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // getting instance of fragment
        TextFragment txt = (TextFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        // calling method change and setting the details as per the item selected
        txt.change(title[position],""+detail[position]);
        //setting background color to fragment
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}