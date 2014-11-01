package project.thangpqpd00883.project;

import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

/**
 * A simple {@link Fragment} subclass.
 * 
 */
public class NewsFragment extends Fragment {

	public NewsFragment() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		View view = inflater.inflate(R.layout.fragment_news, container, false);

		ListView listview =(ListView)view.findViewById(R.id.lvNews);

        //EDITED Code 
        String[] items = new String[] {"News 1", "News 2", "News 3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items); 

        listview.setAdapter(adapter);  
        listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Fragment fragment = new WebviewFragment();
				
				//fragment.setArguments(args);
				FragmentManager frgManager = getFragmentManager();
				frgManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
			}
		});
      return view;
	}
}