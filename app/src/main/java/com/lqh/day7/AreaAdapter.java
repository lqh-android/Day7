package com.lqh.day7;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.lqh.day7.Bean.Area;

import java.util.List;

/**
 * Created by Administrator on 2017/7/26.
 */

public class AreaAdapter extends RecyclerView.Adapter<AreaAdapter.ViewHolder>{

    private Context context;

    private List<Area> areaList;

    CardItemClickListener cardItemOnclick;


    public void setOnItemClickListener(CardItemClickListener clickListener){
        this.cardItemOnclick=clickListener;
    }

    public interface CardItemClickListener{
         void onItemClick(View view,int position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView areaImage;
        TextView areaText;

        public ViewHolder(View view){
            super(view);
            cardView = (CardView)view.findViewById(R.id.card_view);
            areaImage = (ImageView)view.findViewById(R.id.area_image);
            areaText = (TextView)view.findViewById(R.id.area_text);
        }
    }

    public AreaAdapter(Context context,List<Area> areaList){
        this.context=context;
        this.areaList=areaList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (context != null){
            context = parent.getContext();
        }
        View view = LayoutInflater.from(context).inflate(R.layout.item_area,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Area area = areaList.get(position);
        holder.areaImage.setImageResource(R.drawable.city_icon);
        holder.areaText.setText(area.getAreaName());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardItemOnclick.onItemClick(view,position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return areaList.size();
    }
}
