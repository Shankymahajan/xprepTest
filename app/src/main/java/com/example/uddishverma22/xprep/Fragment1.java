package com.example.uddishverma22.xprep;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by ShashankMahajan on 17/01/17.
 */
public class Fragment1 extends Fragment {

    View v;
    ExpandableListAdapter adapter;
    ExpandableListView lv;
    ArrayList<POJO.Legs> legs;

    public static final String TAG="TEST FRAG";
    Bundle b;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.frag1, container, false);

        b= new Bundle();
        b=getArguments();
        if(b != null) {
            ArrayList<POJO.Legs> data = (ArrayList<POJO.Legs>) b.getSerializable("data");
            Log.d(TAG, data.get(0).getLegId());
        }
        return v;
    }

    public void setLegs(ArrayList<POJO.Legs> legs) {
        this.legs = legs;

        adapter.setLegsArrayList(legs);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        lv = (ExpandableListView) view.findViewById(R.id.expListView);

        adapter = new ExpandableListAdapter(new ArrayList<POJO.Legs>());
        lv.setAdapter(adapter);
        lv.setGroupIndicator(null);
    }

    public class ExpandableListAdapter extends BaseExpandableListAdapter {

        private final LayoutInflater inf;
        ArrayList<POJO.Legs> legsArrayList;

        public void setLegsArrayList(ArrayList<POJO.Legs> legsArrayList) {
            this.legsArrayList.clear();
            this.legsArrayList.addAll(legsArrayList);
            notifyDataSetChanged();
        }

        public ExpandableListAdapter(ArrayList<POJO.Legs> legsArrayList) {
            this.legsArrayList = legsArrayList;
            inf = LayoutInflater.from(getActivity());
        }

        @Override
        public int getGroupCount() {
            return legsArrayList.size();
        }

        @Override
        public int getChildrenCount(int groupPosition) {
            return 3;
        }

        @Override
        public Object getGroup(int groupPosition) {
            return legsArrayList.get(groupPosition);
        }

        @Override
        public Object getChild(int groupPosition, int childPosition) {
            return legsArrayList.get(groupPosition).getLegId();
        }

        @Override
        public long getGroupId(int groupPosition) {
            return groupPosition;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getChildView(int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

            ViewHolder holder;
            if (convertView == null) {
                convertView = inf.inflate(R.layout.list_item, parent, false);
                holder = new ViewHolder();

                holder.text = (TextView) convertView.findViewById(R.id.lblListItem);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.text.setText(legsArrayList.get(groupPosition).getTravelDuration());

            return convertView;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return false;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
            ViewHolder holder;

            if (convertView == null) {
                convertView = inf.inflate(R.layout.list_group, parent, false);

                holder = new ViewHolder();
                holder.text = (TextView) convertView.findViewById(R.id.lblListHeader);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.text.setText("Legs : " + groupPosition);

            return convertView;
        }

        private class ViewHolder {
            TextView text;
        }
    }
}