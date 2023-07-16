package X;

import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;

/* renamed from: X.3xa  reason: invalid class name and case insensitive filesystem */
public final class C66423xa implements C147138nS {
    public final C84654td A00;
    public final C10300i6 A01;
    public final String A02;

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        C10300i6 r4 = this.A01;
        C84654td r0 = this.A00;
        BusinessFlowAnalyticsLogger A012 = C37076Jk8.A01(r0.Aiz(), r4, "switch_to_business_account", C18200wM.A0q(((BusinessConversionActivity) r0).A0B));
        C555133m r2 = new C555133m(r4);
        C04220Ms.A0A(A012);
        return new AnonymousClass10K(A012, r2, r4, this.A02);
    }

    public C66423xa(C84654td r2, C10300i6 r3, String str) {
        AnonymousClass0wJ.A1O(r3, r2);
        C04220Ms.A0B(str, 4);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = str;
    }
}
