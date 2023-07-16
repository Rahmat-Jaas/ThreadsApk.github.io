package X;

import com.instagram.common.api.base.IDxACallbackShape0S1300000_1_I2;
import java.util.HashSet;

/* renamed from: X.3Y8  reason: invalid class name */
public final class AnonymousClass3Y8 {
    public static final AnonymousClass3Y8 A02 = new AnonymousClass3Y8((C145538kf) null);
    public final C145538kf A00;
    public final HashSet A01;

    public final void A00(C10300i6 r9, C83884s9 r10, String str) {
        String str2 = str;
        if (this.A01.add(str)) {
            H1T A0O = C18180wK.A0O(r9);
            A0O.A0T("users/%s/info/", str);
            C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C21891So.class, AnonymousClass3PI.class);
            A0T.A00 = new IDxACallbackShape0S1300000_1_I2(r9, r10, this, str2, 2);
            C145538kf r0 = this.A00;
            if (r0 != null) {
                r0.schedule(A0T);
            } else {
                C31155GhB.A03(A0T);
            }
        }
    }

    public AnonymousClass3Y8(C145538kf r2) {
        this.A01 = C18200wM.A0u();
        this.A00 = r2;
    }

    public AnonymousClass3Y8() {
        this((C145538kf) null);
    }
}
