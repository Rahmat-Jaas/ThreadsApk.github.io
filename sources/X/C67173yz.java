package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;

/* renamed from: X.3yz  reason: invalid class name and case insensitive filesystem */
public final class C67173yz implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67173yz.class);
    public static final String __redex_internal_original_name = "FetchPagesUtil";

    public static void A00(Context context, AnonymousClass06E r4, AnonymousClass1ig r5, C10300i6 r6, String str) {
        C26241qH r2;
        C31082GfJ gfJ;
        if (C61853Wb.A01(A00, r6, "ig_professional_fb_page_linking")) {
            r2 = new C26241qH(C67353zP.A02());
            String A002 = C61853Wb.A00(C67353zP.A00, r6, "ig_professional_conversion_flow");
            AnonymousClass7Ko.A07(A002, "fbAccessToken must not be null");
            gfJ = new C31082GfJ(A002);
        } else if (!TextUtils.isEmpty(str)) {
            r2 = new C26241qH(C67353zP.A02());
            gfJ = new C31082GfJ(str);
        } else {
            return;
        }
        gfJ.A07(r2);
        C32165H8c A03 = gfJ.A03();
        A03.A00 = r5;
        C31155GhB.A01(context, r4, A03);
    }
}
