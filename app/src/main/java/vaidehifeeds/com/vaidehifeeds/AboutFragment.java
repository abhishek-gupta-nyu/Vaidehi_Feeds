package vaidehifeeds.com.vaidehifeeds;

/**
 * Created by BB3 on 7/22/2015.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragment that appears in the "content_frame", shows a planet
 */
public class AboutFragment extends Fragment {

    public AboutFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_about, container, false);

        return rootview;

    }
}