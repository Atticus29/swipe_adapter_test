package com.example.guest.swipeviewtest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragment extends Fragment {
    TextView textView;

    public PageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        View view;
        String message = Integer.toString(bundle.getInt("count"));
        if(message.equals("2")){
            view = inflater.inflate(R.layout.second_layout, container, false);
        } else{
            view = inflater.inflate(R.layout.page_fragment_layout, container, false);
        }
        textView = (TextView) view.findViewById(R.id.textView);

        textView.setText("This is the " + message +"th page");
        // Inflate the layout for this fragment
        return view;
    }

}
