package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.7CE  reason: invalid class name */
public final class AnonymousClass7CE {
    public static final Handler A00 = new AnonymousClass4z4(Looper.getMainLooper());

    public static GradientDrawable A00(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof GradientDrawable) {
            return (GradientDrawable) drawable;
        }
        if (drawable instanceof ScaleDrawable) {
            return A00(((DrawableWrapper) drawable).getDrawable());
        }
        if (!(drawable instanceof StateListDrawable) || drawable.getConstantState() == null) {
            return null;
        }
        DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) drawable.getConstantState();
        for (int i = 0; i < drawableContainerState.getChildCount(); i++) {
            GradientDrawable A002 = A00(drawableContainerState.getChild(i));
            if (A002 != null) {
                return A002;
            }
        }
        return null;
    }

    public static void A01(C111286n5 r3, int i) {
        GradientDrawable gradientDrawable = r3.A09;
        if (gradientDrawable != null && r3.A0A != null && r3.A0B != null) {
            gradientDrawable.setSize(-1, i);
            r3.A0A.setSize(-1, i);
            r3.A0B.setSize(-1, i);
        }
    }
}
