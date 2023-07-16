package X;

import android.content.Context;
import java.lang.reflect.Field;

/* renamed from: X.0CX  reason: invalid class name */
public final class AnonymousClass0CX extends AnonymousClass0J8 {
    public AnonymousClass0CX() {
        super("window", (String) null, (String) null, (String) null);
    }

    public final void A00(Context context, C03470In r9) {
        Field A03;
        Class A01;
        Object obj;
        Class A012 = r9.A01("android.view.WindowManagerGlobal");
        if (A012 != null && (A03 = r9.A03(A012, "sWindowManagerService")) != null) {
            try {
                Object obj2 = A03.get((Object) null);
                if (obj2 != null && (A01 = r9.A01("android.view.IWindowManager")) != null && (obj = new AnonymousClass0J7(A01, obj2, this.A03, true).A00) != null) {
                    A03.set((Object) null, obj);
                }
            } catch (Exception unused) {
            }
        }
    }
}
