package com.example.email;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class emailAdapter extends BaseAdapter {
    List<email> emails;

    public emailAdapter(List<email> emails) {
        this.emails = emails;
    }

    @Override
    public int getCount() {
        return emails.size();
    }

    @Override
    public Object getItem(int position) {
        return emails.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class ViewHolder{
        ImageView star;
        TextView txtName, txtContent, txtTime, textRound;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        Random rd=new Random();
        if(convertView==null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.dong_email,parent, false);
            viewHolder = new ViewHolder();
            viewHolder.star = convertView.findViewById(R.id.star);
            viewHolder.txtTime = convertView.findViewById(R.id.time);
            viewHolder.txtName = convertView.findViewById(R.id.name);
            viewHolder.textRound = convertView.findViewById(R.id.round);
            viewHolder.txtContent = convertView.findViewById(R.id.noidung);
            convertView.setTag(viewHolder);
        }
        else viewHolder = (ViewHolder) convertView.getTag();

        email contact = emails.get(position);
        viewHolder.txtTime.setText(contact.getTime());
        viewHolder.txtContent.setText(contact.getContent());
        viewHolder.txtName.setText(contact.getName());
       ColorFilter colorFilter= new ColorFilter();
        viewHolder.textRound.getBackground().setColorFilter(Color.parseColor(contact.getBgColor()), PorterDuff.Mode.SRC_ATOP);
        viewHolder.textRound.setText(contact.getName().substring(0,1));
        if(contact.isSelected()){
            viewHolder.star.setImageResource(R.drawable.ic_star_favorite);
        }else viewHolder.star.setImageResource(R.drawable.ic_star0);

        viewHolder.star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isSelected = emails.get(position).isSelected;
                emails.get(position).setSelected(!isSelected);
                notifyDataSetChanged();
            }
        });

        return convertView;
    }
}
