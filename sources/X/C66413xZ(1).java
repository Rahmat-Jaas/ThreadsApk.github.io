package X;

import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;

/* renamed from: X.3xZ  reason: invalid class name and case insensitive filesystem */
public final class C66413xZ implements C147138nS {
    public final C84654td A00;
    public final C10300i6 A01;
    public final String A02;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        C10300i6 r3 = this.A01;
        C84654td r0 = this.A00;
        BusinessFlowAnalyticsLogger A012 = C37076Jk8.A01(r0.Aiz(), r3, "professional_account_selection", C18200wM.A0q(((BusinessConversionActivity) r0).A0B));
        C04220Ms.A0A(A012);
        return new C19370zl(A012, r3, this.A02);
    }

    public C66413xZ(C84654td r2, C10300i6 r3, String str) {
        AnonymousClass0wJ.A1O(r3, r2);
        C04220Ms.A0B(str, 4);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = str;
    }
}
