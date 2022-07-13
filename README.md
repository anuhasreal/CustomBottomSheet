# Custom Animated Bottom Sheet

Animated Bottom Sheet With Rounded Corners

<img title="SIGIT" src="https://img.shields.io/badge/CODENAME%20-CustomBottomSheet-SCRIPT?colorA=grey&colorB=green&style=for-the-badge"> <img title="SARA" src="https://img.shields.io/badge/VERSION%20-1.0-SCRIPT?colorA=grey&colorB=green&style=for-the-badge">

### Normal Mode
<img title="white" src="https://github.com/AnuhasRox/CustomBottomSheet/blob/main/Image/IMG_20220713_104907.png">

### Dark Mode
<img title="white" src="https://github.com/AnuhasRox/CustomBottomSheet/blob/main/Image/IMG_20220713_104930.png">



### Bottom Sheet Style
1. First you need add this code to your project ```res/values/themes.xml``` file
``` 
   <style name="DialogAnimation">
        <item name="android:windowEnterAnimation">@anim/bottomsheet_in</item>
        <item name="android:windowExitAnimation">@anim/bottomsheet_out</item>
    </style>
 ```
2. Create file in this ```res/anim/bottomsheet_in.xml``` location and paste under code in it
``` 
<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android">

    <translate
        android:duration="@android:integer/config_mediumAnimTime"
        android:fromYDelta="100%p"
        android:toYDelta="0"/>

</set>
 ```
3. Create file in this ```res/anim/bottomsheet_out.xml``` location and paste under code in it
``` 
<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android">

    <translate
        android:duration="@android:integer/config_mediumAnimTime"
        android:fromYDelta="0"
        android:toYDelta="100%p"/>
        
</set>
 ```


### Bottom Sheet Layout
1. Add this code to your project ```res/layout/bottom_sheet.xml``` file
``` 
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/post_main_bottom_main"
    android:background="@drawable/rounddialog_back"
    android:layout_height="match_parent">

    <LinearLayout
        android:layout_marginTop="5dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="@dimen/_15mdp"
        android:orientation="vertical">

        <TextView
            android:layout_width="wrap_content"
            android:fontFamily="@font/raleway_semibold"
            android:layout_height="wrap_content"
            android:scaleType="center"
            android:textColor="@color/black1"
            android:textSize="@dimen/_17font_mdp"
            android:layout_marginTop="@dimen/_4mdp"
            android:layout_gravity="center"
            android:text="Choose a Option"
            app:tint="@color/black1" />

        <LinearLayout
            android:id="@+id/post_main_bottom_edit"
            android:gravity="center"
            android:layout_marginTop="@dimen/_10mdp"
            android:layout_marginStart="13dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <ImageButton
                android:layout_width="@dimen/_27mdp"
                android:layout_height="@dimen/_27mdp"
                android:src="@drawable/editic"
                android:layout_marginStart="@dimen/_2mdp"
                android:layout_gravity="center"
                android:scaleType="fitCenter"
                android:padding="@dimen/_1mdp"
                android:background="@android:color/transparent"/>
            <TextView
                android:layout_width="match_parent"
                android:layout_marginStart="@dimen/_5mdp"
                android:layout_height="wrap_content"
                android:text="Edit"
                android:textColor="@color/black1"
                android:textSize="@dimen/_17font_mdp"/>

        </LinearLayout>

        <LinearLayout
            android:id="@+id/post_main_bottom_downn"
            android:gravity="center"
            android:layout_marginTop="@dimen/_7mdp"
            android:layout_marginStart="13dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <ImageButton
                android:padding="@dimen/_1mdp"
                android:layout_width="@dimen/_27mdp"
                android:layout_height="@dimen/_27mdp"
                android:src="@drawable/downloadic"
                android:layout_gravity="center"
                android:layout_marginStart="@dimen/_2mdp"
                android:scaleType="fitCenter"
                android:background="@android:color/transparent"/>
            <TextView
                android:layout_width="match_parent"
                android:layout_marginStart="@dimen/_5mdp"
                android:layout_height="wrap_content"
                android:text="Save To Gallery"
                android:textColor="@color/black1"
                android:textSize="@dimen/_17font_mdp"/>

        </LinearLayout>

        <LinearLayout
            android:id="@+id/post_main_bottom_share"
            android:gravity="center"
            android:layout_marginTop="@dimen/_7mdp"
            android:visibility="gone"
            android:layout_marginStart="13dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <ImageButton
                android:layout_width="@dimen/_27mdp"
                android:layout_height="@dimen/_27mdp"
                android:rotation="45"
                android:src="@drawable/uploadic"
                android:padding="@dimen/_1mdp"
                android:layout_gravity="center"
                android:layout_marginStart="@dimen/_2mdp"
                android:scaleType="fitCenter"
                android:background="@android:color/transparent"/>
            <TextView
                android:layout_width="match_parent"
                android:layout_marginStart="@dimen/_5mdp"
                android:layout_height="wrap_content"
                android:text="Share"
                android:textColor="@color/black1"
                android:textSize="@dimen/_17font_mdp"/>

        </LinearLayout>

        <LinearLayout
            android:id="@+id/post_main_bottom_delete"
            android:gravity="center"
            android:layout_marginTop="@dimen/_7mdp"
            android:layout_marginStart="13dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <ImageButton
                android:padding="@dimen/_1mdp"
                android:layout_width="@dimen/_27mdp"
                android:layout_height="@dimen/_27mdp"
                android:src="@drawable/cancelic"
                android:layout_marginStart="@dimen/_2mdp"
                android:scaleType="fitCenter"
                android:background="@android:color/transparent"/>
            <TextView
                android:layout_width="match_parent"
                android:layout_marginStart="@dimen/_5mdp"
                android:layout_height="wrap_content"
                android:text="Delete"
                android:textColor="@color/black1"
                android:textSize="@dimen/_17font_mdp"/>

        </LinearLayout>
        <LinearLayout
            android:visibility="gone"
            android:id="@+id/post_main_bottom_block"
            android:gravity="center"
            android:layout_marginTop="@dimen/_7mdp"
            android:layout_marginStart="13dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <ImageButton
                android:padding="@dimen/_1mdp"
                android:layout_width="@dimen/_27mdp"
                android:layout_marginStart="@dimen/_2mdp"
                android:layout_height="@dimen/_27mdp"
                android:src="@drawable/blockic"
                android:scaleType="fitCenter"
                android:background="@android:color/transparent"/>
            <TextView
                android:layout_width="match_parent"
                android:layout_marginStart="@dimen/_5mdp"
                android:layout_height="wrap_content"
                android:text="Block Profile"
                android:textColor="@color/black1"
                android:textSize="@dimen/_17font_mdp"/>

        </LinearLayout>


        <LinearLayout
            android:id="@+id/post_main_bottom_Report"
            android:gravity="center"
            android:layout_marginTop="@dimen/_7mdp"
            android:layout_marginStart="13dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <ImageButton
                android:padding="@dimen/_1mdp"
                android:layout_width="@dimen/_27mdp"
                android:layout_height="@dimen/_27mdp"
                android:src="@drawable/erroric"
                android:layout_marginStart="@dimen/_2mdp"
                android:scaleType="fitCenter"
                android:background="@android:color/transparent"/>
            <TextView
                android:layout_width="match_parent"
                android:layout_marginStart="@dimen/_5mdp"
                android:layout_height="wrap_content"
                android:text="Report"
                android:textColor="@color/black1"
                android:textSize="@dimen/_17font_mdp"/>

        </LinearLayout>
    </LinearLayout>

</LinearLayout>
 ```



### For Activity
Follow this step to add animated bottom sheet

1. Copy this code
```
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
```   
2. After that, paste in your activity [like this](Example/MainActivity.java)
3. Now you can call alert dialog using this code
```loadDialog();```



### For Fragment
Follow this step to add animated alert dialog

1. Copy this code
```
private void loadDialog() {
  final Dialog dialog = new Dialog(getcontext());      
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
```   
2. After that, paste in your activity [like this](Example/Fragment.java)
3. Now you can call alert dialog using this code
```loadDialog();```
