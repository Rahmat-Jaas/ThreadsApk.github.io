package X;

import android.content.Context;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: X.7cj  reason: invalid class name and case insensitive filesystem */
public final class C125217cj implements C143198gH {
    public final /* synthetic */ AnonymousClass51R A00;
    public final /* synthetic */ C113126qn A01;

    public C125217cj(AnonymousClass51R r1, C113126qn r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void BuA() {
        C113126qn r3 = this.A01;
        Context context = r3.A07.A00;
        AnonymousClass51R r2 = this.A00;
        r2.setVisibility(8);
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                windowManager.removeView(r2);
                WeakReference weakReference = C1188872r.A00;
                if (weakReference.get() == r2) {
                    weakReference.clear();
                }
                r3.A05.BuA();
                return;
            }
            throw C18180wK.A0a("Window manager required but not found.");
        } catch (IllegalArgumentException unused) {
        }
    }
}
