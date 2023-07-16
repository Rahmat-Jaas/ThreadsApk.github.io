package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.07J  reason: invalid class name */
public final class AnonymousClass07J extends ViewGroup.LayoutParams {
    public float A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public boolean A01;
    public int A02;
    public boolean A03;

    public AnonymousClass07J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.A0l);
        this.A02 = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }

    public AnonymousClass07J() {
        super(-1, -1);
    }
}
