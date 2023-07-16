package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3z7  reason: invalid class name */
public final class AnonymousClass3z7 implements CallerContextable {
    public static final CallerContext A06 = CallerContext.A00(AnonymousClass3z7.class);
    public static final String __redex_internal_original_name = "IGAutofillProvider";
    public Bundle A00;
    public C121557Gu A01;
    public UserSession A02;
    public HashMap A03 = AnonymousClass0wJ.A0y();
    public List A04 = AnonymousClass0wJ.A0v();
    public boolean A05 = false;

    public static void A00(C81894oZ r5, AnonymousClass3z7 r6) {
        HashMap hashMap = r6.A03;
        r5.Bls(C121557Gu.A02(hashMap), r6.A01.A03(hashMap), C121557Gu.A00(hashMap), C121557Gu.A01(hashMap));
    }

    public static void A01(AnonymousClass3z7 r1, String str, String str2) {
        HashMap hashMap = r1.A03;
        if (hashMap.get(str) == null) {
            hashMap.put(str, AnonymousClass0wJ.A0v());
        }
        ((List) hashMap.get(str)).add(str2);
    }

    public AnonymousClass3z7(Bundle bundle, C121557Gu r3, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = bundle;
        this.A01 = r3;
    }
}
