package X;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.7YP  reason: invalid class name */
public final class AnonymousClass7YP implements AnonymousClass8d2 {
    public final AccessibilityManager A00;

    public AnonymousClass7YP(Context context) {
        Object systemService = context.getSystemService("accessibility");
        C04220Ms.A0C(systemService, C28174Ezk.A00(37));
        this.A00 = (AccessibilityManager) systemService;
    }
}
