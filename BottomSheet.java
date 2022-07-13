//for activity

private void loadDialog() {
  final Dialog dialog = new Dialog(BottomSheet.this);      
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
