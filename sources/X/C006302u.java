package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* renamed from: X.02u  reason: invalid class name and case insensitive filesystem */
public final class C006302u {
    public static void A01(Context context, TypedArray typedArray, AttributeSet attributeSet, View view, int[] iArr, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    public static View.AccessibilityDelegate A00(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void A02(View view, List list) {
        view.setSystemGestureExclusionRects(list);
    }
}
