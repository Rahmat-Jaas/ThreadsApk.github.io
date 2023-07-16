package com.instagram.creation.capture.quickcapture.sundial.widget.alignmentguideview;

import X.AnonymousClass0ZV;
import X.C04220Ms;
import X.C09860go;
import X.C18210wN;
import X.C18240wQ;
import X.C86134wK;
import X.C86144wL;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.ui.base.IgView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AlignmentGuideView extends IgView {
    public List A00;
    public final Paint A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlignmentGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
        this.A00 = AnonymousClass0ZV.A00;
        Paint A0F = C86144wL.A0F();
        C86134wK.A12(A0F);
        A0F.setStrokeWidth(C09860go.A03(context, 1));
        A0F.setPathEffect(new DashPathEffect(new float[]{20.0f, 10.0f}, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        this.A01 = A0F;
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C04220Ms.A0B(canvas, 0);
        super.onDraw(canvas);
        for (Object A002 : this.A00) {
            float A003 = C18240wQ.A00(A002);
            canvas2.drawLine(A003, (float) getPaddingTop(), A003, ((float) getHeight()) - ((float) getPaddingBottom()), this.A01);
        }
    }

    public final void setVerticalPositionsList(List list) {
        C04220Ms.A0B(list, 0);
        if (!C04220Ms.A0I(this.A00, list)) {
            this.A00 = list;
            int i = 0;
            if (list.isEmpty()) {
                i = 8;
            }
            setVisibility(i);
            invalidate();
        }
    }

    public final List getVerticalPositionsList() {
        return this.A00;
    }

    public final void setVerticalAlignmentGuideColor(int i) {
        this.A01.setColor(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AlignmentGuideView(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    public /* synthetic */ AlignmentGuideView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i));
    }
}
