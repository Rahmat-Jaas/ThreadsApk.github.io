package X;

import android.content.Context;

/* renamed from: X.3Mc  reason: invalid class name and case insensitive filesystem */
public final class C59733Mc {
    public static void A00(Context context, H1T h1t, C63873iU r5, C10300i6 r6, Integer num, Integer num2, String str) {
        Integer num3 = AnonymousClass006.A01;
        h1t.A0F(num3);
        h1t.A0B(C22041Td.class, C59723Mb.class);
        if (num2 == num3) {
            h1t.A0J("consent/existing_user_flow/");
        } else if (num2 == AnonymousClass006.A00) {
            h1t.A0J("consent/new_user_flow/");
            C18180wK.A0t(context, h1t, C62983bG.A02(0), C09140ev.A00(context));
            h1t.A0P("phone_id", C18190wL.A0l(r6));
            h1t.A0O("gdpr_s", str);
        }
        if (num != null) {
            h1t.A0O("current_screen_key", AnonymousClass2PA.A00(num));
        }
        C32165H8c A0Q = C18190wL.A0Q(h1t);
        A0Q.A00 = r5;
        C31155GhB.A03(A0Q);
    }

    public static void A01(Context context, C10300i6 r2) {
        H1T A0N = AnonymousClass0wJ.A0N(r2);
        A0N.A0J("consent/new_user_flow_begins/");
        A0N.A0O(C62983bG.A02(0), C18230wP.A0i(context));
        C31155GhB.A03(C18180wK.A0T(A0N, C22041Td.class, C59723Mb.class));
    }
}
