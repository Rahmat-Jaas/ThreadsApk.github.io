package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.3zB  reason: invalid class name and case insensitive filesystem */
public final class C67223zB implements CallerContextable {
    public static AnonymousClass3S1 A02 = null;
    public static AnonymousClass32J A03 = new AnonymousClass32J();
    public static final AnonymousClass3S1 A04 = AnonymousClass32A.A08;
    public static final AnonymousClass3S1 A05 = AnonymousClass32A.A07;
    public static final AnonymousClass3S1 A06 = AnonymousClass32A.A0B;
    public static final AnonymousClass3S1 A07 = AnonymousClass32A.A0I;
    public static final AnonymousClass3S1 A08 = AnonymousClass32A.A0A;
    public static final CallerContext A09 = CallerContext.A00(C67223zB.class);
    public static final String __redex_internal_original_name = "BusinessConversionFunnelLogger";
    public final C81194nK A00;
    public final C10300i6 A01;

    public static AnonymousClass32J A00(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle("conversion_funnel_log_payload");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        AnonymousClass32J r2 = new AnonymousClass32J();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            bundle.getString(C18180wK.A0k(it));
            synchronized (r2) {
            }
        }
        return r2;
    }

    public static C67223zB A01(C10300i6 r2) {
        return (C67223zB) C18180wK.A0c(r2, C67223zB.class, 8);
    }

    public static void A02(Bundle bundle, C67223zB r5, String str, String str2, String str3) {
        Object[] objArr;
        String str4;
        if (str != null && A02 != null) {
            C81194nK r3 = r5.A00;
            if (str3 == null) {
                objArr = new Object[]{str, str2};
                str4 = AnonymousClass000.A00(84);
            } else {
                objArr = new Object[]{str, str2, str3};
                str4 = "%s.%s.%s";
            }
            str4.getClass();
            String.format((Locale) null, str4, objArr);
            if (bundle != null) {
                bundle.getString("extra_conversion_funnel_action_tag");
            }
            A00(bundle);
            synchronized (r3) {
            }
        }
    }

    public C67223zB(C10300i6 r2) {
        this.A01 = r2;
        this.A00 = C18250wR.A0C(r2);
    }
}
