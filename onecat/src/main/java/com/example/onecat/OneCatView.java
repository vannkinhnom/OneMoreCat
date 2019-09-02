package com.example.onecat;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageView;

public class OneCatView extends AppCompatImageView {
    public OneCatView(Context context) {
        super(context);
        init(context, null, 0);
    }

    public OneCatView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs,0);
    }

    public OneCatView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        setImageDrawable(context.getDrawable(R.drawable.cat));
    }

}
