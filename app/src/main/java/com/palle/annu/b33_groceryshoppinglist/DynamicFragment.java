package com.palle.annu.b33_groceryshoppinglist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




/**
 * A simple {@link Fragment} subclass.
 */
public class DynamicFragment extends Fragment {
  //  protected TabPageIndicator indicator;

    protected ViewPager pager;

    private ViewPagerAdapter adapter;


    public DynamicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_dynamic, container, false);
   //     indicator = (TabPageIndicator) v.findViewById(R.id.tpi_header);
        pager = (ViewPager) v.findViewById(R.id.vp_pages);

        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Note that we are passing childFragmentManager, not FragmentManager
        adapter = new ViewPagerAdapter(getResources(), getChildFragmentManager());

        pager.setAdapter(adapter);
       // indicator.setViewPager(pager);
    }

    /**
     * Retrieve the currently visible Tab Fragment and propagate the onBackPressed callback
     *
     * @return true = if this fragment and/or one of its associates Fragment can handle the backPress
     */
    public boolean onBackPressed() {
        // currently visible tab Fragment
        OnBackPressListener currentFragment = (OnBackPressListener) adapter.getRegisteredFragment(pager.getCurrentItem());

        if (currentFragment != null) {
            // lets see if the currentFragment or any of its childFragment can handle onBackPressed
            return currentFragment.onBackPressed();
        }


        // this Fragment couldn't handle the onBackPressed call
        return false;
    }


}
