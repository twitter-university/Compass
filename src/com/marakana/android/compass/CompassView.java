package com.marakana.android.compass;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CompassView extends ImageView {
	private float degrees=0;

	public CompassView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onDraw(Canvas canvas) {
	    int height = this.getHeight();
	    int width = this.getWidth();

		canvas.rotate(360-degrees, width/2, height/2);
		super.onDraw(canvas);
	}

	public void setDegrees(float degrees) {
		this.degrees = degrees;
		this.invalidate();
	}
}
