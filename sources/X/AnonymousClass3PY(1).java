package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3PY  reason: invalid class name */
public final class AnonymousClass3PY {
    public static final List A00(Context context, C10300i6 r3) {
        List A00 = C50662tM.A00(context);
        if (A00.isEmpty()) {
            AnonymousClass44X.A00().A03(r3, "ig_android_growth_fx_access_fb_ig_prefill_email");
            A00.isEmpty();
            String str = AnonymousClass2BE.A00;
            if (!(!A00.isEmpty() || str == null || str.length() == 0)) {
                A00.add(str);
            }
        }
        return A00;
    }

    public static final List A01(Context context, C10300i6 r5, Integer num) {
        AnonymousClass0wJ.A1N(num, context);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = C50662tM.A00(context).iterator();
        while (it.hasNext()) {
            A0v.add(new C29611yx(C18180wK.A0k(it), "android_account_manager"));
        }
        if (!(num == AnonymousClass006.A0C || num == AnonymousClass006.A0N)) {
            AnonymousClass44X.A00().A03(r5, "ig_android_growth_fx_access_fb_ig_prefill_email");
            String str = AnonymousClass2BE.A00;
            if (!(str == null || str.length() == 0)) {
                A0v.add(new C29611yx(str, "uig_via_phone_id"));
            }
        }
        return A0v;
    }
}
