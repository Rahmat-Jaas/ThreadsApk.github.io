package com.instagram.ui.text;

import X.C121907Is;
import X.C14030oh;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.barcelona.R;

public class TabTextView extends TextView {
    public int A00;
    public final Paint A01 = new Paint();
    public final Rect A02 = new Rect();

    public TabTextView(Context context) {
        super(context);
        A00();
    }

    private void A00() {
        this.A00 = getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        Context context = getContext();
        this.A01.setColor(context.getColor(C121907Is.A02(context, R.attr.textColorSelected)));
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.drawRect(this.A02, this.A01);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C14030oh.A06(101637289);
        super.onSizeChanged(i, i2, i3, i4);
        this.A02.set(0, i2 - this.A00, i, i2);
        C14030oh.A0D(-690833775, A06);
    }

    public TabTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public TabTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
