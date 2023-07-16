package X;

import android.content.Context;
import java.lang.reflect.Field;

/* renamed from: X.09p  reason: invalid class name and case insensitive filesystem */
public final class C020609p extends AnonymousClass0J8 {
    public C020609p() {
        super("display", (String) null, (String) null, (String) null);
    }

    public final void A00(Context context, C03470In r9) {
        Field A03;
        Field A032;
        Class A01;
        Class A012 = r9.A01("android.hardware.display.DisplayManagerGlobal");
        if (A012 != null && (A03 = r9.A03(A012, "sInstance")) != null) {
            try {
                Object obj = A03.get((Object) null);
                if (obj != null && (A032 = r9.A03(A012, "mDm")) != null) {
                    Object obj2 = A032.get(obj);
                    if (obj2 != null && (A01 = r9.A01("android.hardware.display.IDisplayManager")) != null) {
                        A032.set(obj, new AnonymousClass0J7(A01, obj2, this.A03, true).A00);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
