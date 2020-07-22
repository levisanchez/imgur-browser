package edu.cnm.deepdive.imgurbrowser.controller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import edu.cnm.deepdive.imgurbrowser.R;
import edu.cnm.deepdive.imgurbrowser.viewmodel.ListViewModel;

public class MainActivity extends AppCompatActivity {

  ListViewModel listViewModel;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

//    listViewModel = new ViewModelProvider(this)
//        .get(ListViewModel.class);
//    getLifecycle().addObserver(listViewModel);
//    listViewModel.getSearchResult().observe(this, new Observer<Search>() {
//      @Override
//      public void onChanged(Search search) {
//        listViewModel.loadData();
//      }
//    });  **WE JUST USED THIS TO TEST DATA***

  }
}
