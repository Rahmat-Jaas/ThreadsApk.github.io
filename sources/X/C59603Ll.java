package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2001000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2110000_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Ll  reason: invalid class name and case insensitive filesystem */
public final class C59603Ll {
    public static final KtCSuperShape0S2110000_I2 A00(AnonymousClass1RW r10, String str) {
        String str2 = str;
        boolean A1Z = AnonymousClass0wJ.A1Z(str, r10);
        C569439d r0 = r10.A00;
        if (r0 == null) {
            C18250wR.A0m();
            throw null;
        }
        String str3 = r0.A00;
        boolean z = r0.A02;
        List<KtCSuperShape0S2001000_I2> list = r0.A01;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        for (KtCSuperShape0S2001000_I2 ktCSuperShape0S2001000_I2 : list) {
            A0w.add(new KtCSuperShape0S2101000_I2((KtCSuperShape0S1100000_I2) null, ktCSuperShape0S2001000_I2.A02, ktCSuperShape0S2001000_I2.A01, ktCSuperShape0S2001000_I2.A00));
        }
        return new KtCSuperShape0S2110000_I2(str2, str3, (List) A0w, A1Z ? 1 : 0, z);
    }

    public static final C32165H8c A01(UserSession userSession, String str, String str2) {
        C04220Ms.A0B(str, 1);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J("feed/prompts/search/");
        A0O.A0O("query", str);
        A0O.A0O("cursor", str2);
        A0O.A0I(AnonymousClass00U.A0X("prompts_search_", str, str2, '_'));
        A0O.A0E(AnonymousClass006.A0N);
        A0O.A07(300000);
        return AnonymousClass0wJ.A0T(A0O, AnonymousClass1RW.class, AnonymousClass3K7.class);
    }
}
