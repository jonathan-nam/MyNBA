package com.example.jonat.list;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PlayerListAdapter extends ArrayAdapter<Player> {
    ArrayList<Player> players;
    Context context;
    int resource;

    public PlayerListAdapter (Context context, int resource, ArrayList<Player> players) {
        super(context, resource, players);
        this.players = players;
        this.context = context;
        this.resource = resource;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.player_list_layout, null, true);
        }
        Player player = getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.selfPortrait);
        Glide.with(context).load(player.getPhotoLink()).into(imageView);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView points = (TextView) convertView.findViewById(R.id.points);
        TextView rebounds = (TextView) convertView.findViewById(R.id.rebounds);
        TextView assists = (TextView) convertView.findViewById(R.id.assists);
        name.setText(player.getName());
        points.setText("PTS\n" + String.valueOf(player.getPPG()));
        rebounds.setText("REB\n" +String.valueOf(player.gettRB()));
        assists.setText("AST\n" + String.valueOf(player.getaST()));

        return convertView;
    }
}
