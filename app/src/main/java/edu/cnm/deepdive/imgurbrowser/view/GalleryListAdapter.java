package edu.cnm.deepdive.imgurbrowser.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import edu.cnm.deepdive.imgurbrowser.R;
import edu.cnm.deepdive.imgurbrowser.model.Gallery;
import edu.cnm.deepdive.imgurbrowser.model.Image;
import java.lang.reflect.Array;

public class GalleryListAdapter extends RecyclerView.Adapter<GalleryListAdapter.GalleryViewHolder> {

  private final Context context;
  private final Gallery[] galleries;

  public GalleryListAdapter(Context context, Gallery[] galleries) {
    super();
    this.context = context;
    this.galleries = galleries;
  }

  @NonNull
  @Override
  public GalleryListAdapter.GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
      int viewType) {
    View view = LayoutInflater.from(context).
        inflate(R.layout.item_gallery_search, parent, false);
    return new GalleryViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull GalleryListAdapter.GalleryViewHolder holder, int position) {
    holder.bind(position);
  }

  @Override
  public int getItemCount() {
    return galleries.length;
  }

  class GalleryViewHolder extends RecyclerView.ViewHolder {

    private final TextView title;
    private final TextView description;
    private final Spinner imageSpinner;

    public GalleryViewHolder(@NonNull View itemView) {
      super(itemView);
      title = itemView.findViewById(R.id.title);
      description = itemView.findViewById(R.id.description);
      imageSpinner = itemView.findViewById(R.id.gallery_search_spinner);
      imageSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
//          String item = adapterView.getItemAtPosition(position).toString();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
      });
    }

    private void bind(int position) {
      title.setText(galleries[position].getTitle());
//      description.setText(galleries[position].getDescription());
//      ArrayAdapter<Image> dataAdapter = new ArrayAdapter<>(context,
//          android.R.layout.simple_spinner_item, galleries[position].getImages());
//      dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//      imageSpinner.setAdapter(dataAdapter);


      GalleryImageAdapter galleryImageAdapter = new GalleryImageAdapter(context,
          galleries[position].getImages());
      imageSpinner.setAdapter(galleryImageAdapter);
    }


  }
  }

