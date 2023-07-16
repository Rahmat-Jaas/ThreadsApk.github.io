package X;

import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0hU  reason: invalid class name and case insensitive filesystem */
public final class C09980hU implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Runnable A00;

    public final void onViewDetachedFromWindow(View view) {
    }

    public C09980hU(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void onViewAttachedToWindow(View view) {
        List<Rect> emptyList;
        DisplayCutout displayCutout;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = displayCutout.getBoundingRects();
        }
        C09960hR.A00 = emptyList;
        view.removeOnAttachStateChangeListener(this);
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
    }
}
