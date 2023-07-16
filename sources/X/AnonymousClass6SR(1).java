package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.6SR  reason: invalid class name */
public final class AnonymousClass6SR {
    public static boolean A00(View view, double d) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null) {
            return false;
        }
        Rect A0D = C86134wK.A0D();
        if (!view.getGlobalVisibleRect(A0D)) {
            return false;
        }
        long height = ((long) A0D.height()) * ((long) A0D.width());
        long height2 = ((long) view.getHeight()) * ((long) view.getWidth());
        return height2 > 0 && ((double) height) >= d * ((double) height2);
    }
}
