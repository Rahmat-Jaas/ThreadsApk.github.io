package androidx.appcompat.widget;

import X.AnonymousClass8cP;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout {
    public AnonymousClass8cP A00;

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(AnonymousClass8cP r1) {
        this.A00 = r1;
    }

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }
}
