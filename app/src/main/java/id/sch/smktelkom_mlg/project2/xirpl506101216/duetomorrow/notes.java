package id.sch.smktelkom_mlg.project2.xirpl506101216.duetomorrow;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class notes extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_notes,
                container, false);
        Button button = (Button) rootView.findViewById(R.id.buttonNote);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail1211();
            }
        });
        return rootView;
    }

    public void updateDetail1211() {
        Intent intent = new Intent(getActivity(), iwil.class);
        startActivity(intent);
    }
}