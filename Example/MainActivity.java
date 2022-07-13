package com.anuhas.quity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
    }
private void loadDialog() {
  final Dialog dialog = new Dialog(MainActivity.this);      
  dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);      
  dialog.setContentView(R.layout.bottom_sheet);
  
  dialog.findViewById(R.id.post_main_bottom_delete).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  Toast.makeText(BottomSheet.this, "Download Button", Toast.LENGTH_SHORT).show();
                  dialog.dismiss();
                }
            });
  dialog.findViewById(R.id.post_main_bottom_edit).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  Toast.makeText(BottomSheet.this, "Edit Button", Toast.LENGTH_SHORT).show();
                  dialog.dismiss();
                }
            });
  dialog.findViewById(R.id.post_main_bottom_share).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  Toast.makeText(BottomSheet.this, "Share Button", Toast.LENGTH_SHORT).show();
                  dialog.dismiss();
                }
            });
  
  dialog.show();
  dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
  dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
  dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
  dialog.getWindow().setGravity(Gravity.BOTTOM);
}
}
