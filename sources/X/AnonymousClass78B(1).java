package X;

import com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.instagram.service.session.UserSession;
import java.util.concurrent.Executors;

/* renamed from: X.78B  reason: invalid class name */
public final class AnonymousClass78B {
    public final AnonymousClass5E2 A00;
    public final AnonymousClass5E3 A01;
    public final AnonymousClass5E4 A02;
    public final AnonymousClass5E1 A03;
    public final AnonymousClass5E0 A04;

    private C1200678j A00(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        String A012 = instantExperiencesJSBridgeCall.A01();
        switch (A012.hashCode()) {
            case -2010971576:
                if (A012.equals("canMakePayment")) {
                    return this.A02;
                }
                break;
            case -1167572077:
                if (A012.equals("paymentsCheckout")) {
                    return this.A04;
                }
                break;
            case -267636863:
                if (A012.equals("requestAutoFill")) {
                    return this.A00;
                }
                break;
            case -257417255:
                if (A012.equals("paymentsChargeRequst")) {
                    return this.A03;
                }
                break;
            case 1722704025:
                if (A012.equals("saveAutofillData")) {
                    return this.A01;
                }
                break;
        }
        AnonymousClass0LU.A0N("InstantExperiencesCallHandler", "Unknown call code '%s'", A012);
        return null;
    }

    public AnonymousClass78B(AnonymousClass76J r7, C109696kQ r8, C91225fq r9, AnonymousClass5xH r10, UserSession userSession) {
        C91225fq r2 = r9;
        AnonymousClass5xH r3 = r10;
        UserSession userSession2 = userSession;
        this.A00 = new AnonymousClass5E2(r7, r2, r3, userSession2, Executors.newSingleThreadExecutor());
        this.A01 = new AnonymousClass5E3(r8, r2, r3, userSession2, Executors.newSingleThreadExecutor());
        this.A04 = new AnonymousClass5E0(r9, userSession);
        this.A02 = new AnonymousClass5E4(r9, userSession);
        this.A03 = new AnonymousClass5E1(r9, userSession);
    }

    public final void A01(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        try {
            C1200678j A002 = A00(instantExperiencesJSBridgeCall);
            if (A002 != null) {
                A002.A02(instantExperiencesJSBridgeCall);
            }
        } catch (AnonymousClass6CE e) {
            instantExperiencesJSBridgeCall.A03(new InstantExperienceGenericErrorResult(e));
            C1200678j A003 = A00(instantExperiencesJSBridgeCall);
            if (A003 != null) {
                A003.A01(instantExperiencesJSBridgeCall);
            }
        }
    }
}
