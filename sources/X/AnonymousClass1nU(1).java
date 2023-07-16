package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape23S0200000_I2_7;

/* renamed from: X.1nU  reason: invalid class name */
public final class AnonymousClass1nU extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1nU(C697249u r7, int i) {
        super("shops_measure_navigation_to_surface", 442698930, i, false, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        AnonymousClass0ZU r1;
        Class cls;
        C60803Qo r4 = C84744tn.A00;
        UserSession userSession = this.A00.A06;
        if (C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36327816937089208L)) {
            r1 = new KtLambdaShape23S0200000_I2_7(47, userSession, r4);
            cls = AnonymousClass47e.class;
        } else {
            r1 = AnonymousClass4Xq.A00;
            cls = AnonymousClass434.class;
        }
        ((C84744tn) userSession.A01(cls, r1)).C3y();
    }
}
