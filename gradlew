<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout android:id="@+id/slidelinearlay"
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    tools:context=".MainActivity"
    android:layout_width="match_parent"
    android:layout_height="300dp"
    xmlns:tools="http://schemas.android.com/tools">
        <android.support.v7.widget.CardView
            app:cardCornerRadius="25dp"
            android:layout_width="match_parent"
            android:layout_height="match_parent">
                <RelativeLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent">
        <ImageView
            android:id="@+id/imgSlide"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:src="@drawable/ic_launcher_background"
            android:tint="#6F000000"
            android:scaleType="fitXY"/>
        <TextView
            android:id="@+id/tvTitle"
            android:layout_centerHorizontal="true"
            android:layout_centerVertical="true"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Baslik"
            android:textColor="#fff"
            android:textSize="30sp"
            android:textStyle="bold"/>

        <TextView
            android:layout_marginStart="10dp"
            android:layout_marginEnd="10dp"
            android:layout_below="@+id/tvTitle"
            android:layout_centerHorizontal="true"
            android:id="@+id/tvDesc"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Description"
            android:textColor="#fff"
            android:textSize="17sp"
            />

        <Button
            android:layout_margin="10dp"
            android:id="@+id/readMoreButton"
            android:layout_width="140dp"
            android:layout_height="30dp"
            android:background="@drawable/mybuttons"
            android:text="Read Moree"
            android:layout_below="@+id/tvDesc"
            android:layout_centerHorizontal="true"
            android:textColor="#fff"
            android:textSize="13dp"/>
                </RelativeLayout>
        </android.support.v7.widget.CardView>
</RelativeLayout>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     