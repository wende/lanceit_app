package com.lanceit.haito.lanceit.view.hub.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lanceit.haito.lanceit.R;
import com.lanceit.haito.lanceit.view.hub.HubActivity;
import com.lanceit.haito.lanceit.model.FeedItem;
import com.lanceit.haito.lanceit.utils.GeoLocationManager;

import java.util.List;

public class LanceAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    public List list;

    private GeoLocationManager glm;

    public LanceAdapter(Context context, List list)
    {
        super();
        this.context = context;
        this.list = list;

        this.glm = ((HubActivity)context).getMyLocationManager();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.daily_adpter, null);
        }

        LinearLayout linearlayout = (LinearLayout) view.findViewById(R.id.mainImage);

        TextView title = (TextView) view.findViewById(R.id.item_title);
        TextView shortDesc = (TextView) view.findViewById(R.id.item_shortDesc);
        TextView distance = (TextView) view.findViewById(R.id.item_distance);

        FeedItem feedItem = (FeedItem) list.get(position);

        linearlayout.setBackgroundResource(R.drawable.buy_tour_pic);
        title.setText(feedItem.getTitle());
        shortDesc.setText(
                feedItem.getDescription()
                        .substring(0, feedItem.getDescription().length() > 30 ? 30 : feedItem.getDescription().length()) + "..."
        );
        //TODO:Naprawic to
        //distance.setText(glm.getDistanceFrom(feedItem.getLat(),feedItem.getLng()) + "m");

        return view;
    }
}
