package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2;

/* renamed from: X.78u  reason: invalid class name and case insensitive filesystem */
public final class C1201378u {
    public C113896sL A00;
    public boolean A01;
    public final C105376dK A02 = new C105376dK(this);
    public final UserSession A03;

    public static final void A00(AnonymousClass22X r2, C1201378u r3) {
        int ordinal;
        if (r2 == null) {
            ordinal = -1;
        } else {
            ordinal = r2.ordinal();
        }
        boolean z = true;
        if (ordinal == 1 || ordinal == 3 || ordinal == 5) {
            z = false;
        }
        r3.A01 = z;
    }

    public final AnonymousClass22X A01() {
        C113896sL r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("sparkARFLMConsentManager");
            throw null;
        }
        AnonymousClass22X r02 = r0.A04;
        if (r02 == null) {
            return AnonymousClass22X.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        }
        return r02;
    }

    public C1201378u(UserSession userSession) {
        this.A03 = userSession;
        C113896sL r0 = ((C132187tU) userSession.A01(C132187tU.class, new KtLambdaShape22S0100000_I2_2(userSession, 24))).A00;
        this.A00 = r0;
        AnonymousClass22X r02 = r0.A04;
        A00(r02 == null ? AnonymousClass22X.UNSET_OR_UNRECOGNIZED_ENUM_VALUE : r02, this);
        C113896sL r2 = this.A00;
        if (r2 == null) {
            C04220Ms.A0E("sparkARFLMConsentManager");
            throw null;
        } else {
            r2.A01.add(C86114wI.A0Q(this, 283));
        }
    }

    public final boolean A02() {
        if (A01() == AnonymousClass22X.CONSENTED || A01() == AnonymousClass22X.NOT_APPLICABLE) {
            return true;
        }
        return false;
    }
}
