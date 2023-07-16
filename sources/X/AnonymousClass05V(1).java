package X;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: X.05V  reason: invalid class name */
public final class AnonymousClass05V extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ C12810mW A01;

    public AnonymousClass05V(Rect rect, C12810mW r2) {
        this.A01 = r2;
        this.A00 = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        Rect rect = this.A00;
        if (rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
