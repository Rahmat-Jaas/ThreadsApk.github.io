package com.instagram.debug.devoptions.eventvisualizer;

import X.C18220wO;
import X.C41006Ltt;
import X.C61803Vq;
import X.L70;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

public class EventItemDecoration extends C61803Vq {
    public final int mDividerHeight;
    public final int mLeftOffset;
    public final Paint mPaint;
    public final int mRightOffset;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        rect.left = this.mLeftOffset;
        rect.right = this.mRightOffset;
    }

    public EventItemDecoration(Context context) {
        this.mDividerHeight = context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
        this.mLeftOffset = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        this.mRightOffset = C18220wO.A01(context, R.dimen.abc_edit_text_inset_top_material);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(context.getColor(R.color.fds_white_alpha60));
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C41006Ltt ltt) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.getClass();
            int bottom = childAt.getBottom() + ((L70) layoutParams).bottomMargin;
            canvas.drawRect((float) paddingLeft, (float) bottom, (float) width, (float) (this.mDividerHeight + bottom), this.mPaint);
        }
    }
}
