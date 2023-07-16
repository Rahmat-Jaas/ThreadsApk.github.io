package com.instagram.common.ui.widget.imageview;

import X.AnonymousClass0hB;
import X.AnonymousClass2LX;
import X.C14030oh;
import X.C29934Fwk;
import X.C86144wL;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;

public class CornerPunchedImageView extends CircularImageView {
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public Path A04;
    public boolean A05;
    public final String A06;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] getPunchCenter() {
        /*
            r5 = this;
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0051
            int r1 = r5.getWidth()
            r4 = 0
        L_0x0009:
            java.lang.String r3 = r5.A06
            int r0 = r3.hashCode()
            r2 = 2
            switch(r0) {
                case -1698351794: goto L_0x0019;
                case -1682225977: goto L_0x0026;
                case -1364013995: goto L_0x0034;
                case -1139554575: goto L_0x0047;
                default: goto L_0x0013;
            }
        L_0x0013:
            r0 = 0
        L_0x0014:
            int[] r0 = new int[]{r1, r0}
            return r0
        L_0x0019:
            java.lang.String r0 = "bottom_start"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r5.getHeight()
            goto L_0x0014
        L_0x0026:
            java.lang.String r0 = "bottom_end"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r5.getHeight()
            r1 = r4
            goto L_0x0014
        L_0x0034:
            java.lang.String r0 = "center"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            int r1 = r5.getWidth()
            int r1 = r1 / r2
            int r0 = r5.getHeight()
            int r0 = r0 / r2
            goto L_0x0014
        L_0x0047:
            java.lang.String r0 = "top_end"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            r1 = r4
            goto L_0x0013
        L_0x0051:
            r1 = 0
            int r4 = r5.getWidth()
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.imageview.CornerPunchedImageView.getPunchCenter():int[]");
    }

    public final void onDraw(Canvas canvas) {
        if (this.A00) {
            canvas.clipPath(this.A04, Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    public void setPunchOffsetX(int i) {
        this.A01 = i;
        A00();
        invalidate();
    }

    public void setPunchOffsetY(int i) {
        this.A02 = i;
        A00();
        invalidate();
    }

    public void setPunchRadius(int i) {
        this.A03 = i;
        A00();
        invalidate();
    }

    public CornerPunchedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = AnonymousClass0hB.A02(context);
        this.A00 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A0N);
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        this.A06 = AnonymousClass2LX.A00(context, obtainStyledAttributes, 0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        boolean z = this.A05;
        int i2 = this.A01;
        this.A01 = z ? -i2 : i2;
        obtainStyledAttributes.recycle();
        A00();
    }

    private void A00() {
        Path A0G = C86144wL.A0G();
        this.A04 = A0G;
        A0G.setFillType(Path.FillType.EVEN_ODD);
        int[] punchCenter = getPunchCenter();
        int i = this.A03;
        if (i == -1) {
            i = getWidth() >> 1;
        }
        this.A04.addCircle((float) (punchCenter[0] + this.A01), (float) (punchCenter[1] + this.A02), (float) i, Path.Direction.CW);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = C14030oh.A06(1748021324);
        super.onSizeChanged(i, i2, i3, i4);
        A00();
        C14030oh.A0D(-2079388974, A062);
    }

    public CornerPunchedImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CornerPunchedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
