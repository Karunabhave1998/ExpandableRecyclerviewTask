package com.example.expandablerecyclerviewtask;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class TouristAdapter extends RecyclerView.Adapter<TouristAdapter.TouristVH> {

    Context context;
    List<TouristModel> touristModelList;

    public TouristAdapter(Context context, List<TouristModel> touristModelList) {
        this.context = context;
        this.touristModelList = touristModelList;
    }

    @NonNull
    @Override
    public TouristVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.expandable_layout,parent,false);
        return new TouristVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TouristVH holder, int position) {
        TouristModel touristModel = touristModelList.get(position);
        holder.placeImage.setImageResource(touristModelList.get(position).gettImage());
        holder.nameTextview.setText(touristModelList.get(position).getTpname1());
        holder.downImageView.setImageResource(touristModelList.get(position).getDownArrow1());
        holder.callImageView.setImageResource(touristModelList.get(position).getCall1());
        holder.mapImageView.setImageResource(touristModelList.get(position).getMap1());
        holder.browseImageview.setImageResource(touristModelList.get(position).getBrowse1());

       boolean isExpanded = touristModelList.get(position).isExpanded();
       holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);



    }

    @Override
    public int getItemCount() {
        return touristModelList.size();
    }

    public class TouristVH extends RecyclerView.ViewHolder {

        TextView nameTextview;
        ImageView placeImage, downImageView, callImageView, mapImageView, browseImageview;
        LinearLayout expandableLayout;

        public TouristVH(@NonNull View itemView) {
            super(itemView);
           placeImage = itemView.findViewById(R.id.touristImage);
            nameTextview = itemView.findViewById(R.id.titleTextview);
            downImageView = itemView.findViewById(R.id.downArrow);
            callImageView = itemView.findViewById(R.id.callId);
            mapImageView = itemView.findViewById(R.id.mapId);
            browseImageview = itemView.findViewById(R.id.browseId);

            expandableLayout = itemView.findViewById(R.id.expandablelayout);

            downImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TouristModel touristModel = touristModelList.get(getAdapterPosition());
                    touristModel.setExpanded(!touristModel.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });

            callImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+touristModelList.get(getAbsoluteAdapterPosition()).getMoNumber()));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    context.startActivity(intent);



                }
            });
            mapImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    String label = touristModelList.get(getAbsoluteAdapterPosition()).getTpname1();
                    String uriBegin = "geo:" + touristModelList.get(getAbsoluteAdapterPosition()).getLatitude() + " , " + touristModelList.get(getAbsoluteAdapterPosition()).getLongitude();
                    String query = touristModelList.get(getAbsoluteAdapterPosition()).getLatitude() + ","+ touristModelList.get(getAbsoluteAdapterPosition()).getLongitude() + "(" + label + ")";
                    String encodedQuery = Uri.encode(query);
                    String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";

                    Uri uri = Uri.parse(uriString);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);

                    context.startActivity(intent);
                }
            });

            browseImageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(touristModelList.get(getAbsoluteAdapterPosition()).getLink()));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    context.startActivity(intent);
                }
            });





        }
    }
}
