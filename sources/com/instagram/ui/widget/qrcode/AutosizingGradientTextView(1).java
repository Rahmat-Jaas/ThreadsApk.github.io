package com.instagram.ui.widget.qrcode;

import X.AnonymousClass0h8;
import X.C09860go;
import X.C14030oh;
import X.C18210wN;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.ui.base.IgTextView;

public class AutosizingGradientTextView extends IgTextView {
    public int A00;
    public int A01;
    public int[] A02;

    public AutosizingGradientTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A00(int i, int i2) {
        if (this.A02 != null) {
            TextPaint paint = getPaint();
            int[] iArr = this.A02;
            paint.setShader(new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i2, (float) i, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, iArr[0], iArr[1], Shader.TileMode.CLAMP));
            invalidate();
        }
    }

    public void setGradient(int[] iArr) {
        this.A02 = iArr;
        A00(getWidth(), getHeight());
    }

    public final void onMeasure(int i, int i2) {
        int A06 = C14030oh.A06(-1870505663);
        String A0c = C18210wN.A0c(this);
        setTextSize(0, AnonymousClass0h8.A00(Layout.Alignment.ALIGN_CENTER, new TextPaint(getPaint()), A0c, View.MeasureSpec.getSize(i), getMaxLines(), this.A01, this.A00));
        super.onMeasure(i, i2);
        C14030oh.A0D(730941591, A06);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C14030oh.A06(1668174876);
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        C14030oh.A0D(-994157332, A06);
    }

    public AutosizingGradientTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = null;
        this.A01 = Math.round(C09860go.A03(context, 14));
        this.A00 = Math.round(C09860go.A03(context, 40));
    }

    public AutosizingGradientTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
