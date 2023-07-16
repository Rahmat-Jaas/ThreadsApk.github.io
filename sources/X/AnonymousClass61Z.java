package X;

import android.content.Context;
import com.instagram.security.attestation.keystore.worker.KeyAttestationWorker;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.61Z  reason: invalid class name */
public final class AnonymousClass61Z extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61Z(C697249u r7) {
        super("AttestationKeystorePeriodic", 1800671267, 3, true, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        Context context = this.A00.A05;
        C04220Ms.A0B(context, 0);
        try {
            UserSession A02 = C05030Qo.A02(C18230wP.A0Z());
            AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
            boolean A0E = C63803iN.A0E(r2, A02, 2342166685802635258L);
            long A03 = C63803iN.A03(r2, A02, 36605151565517183L);
            long A032 = C63803iN.A03(r2, A02, 36605151565386109L);
            long A033 = C63803iN.A03(r2, A02, 36605151565451646L);
            if (A03 < A032) {
                C14100oo ABJ = C10770iu.A00().ABJ("KeyAttestationScheduler", 817903298);
                ABJ.A8U("error", "Key attestation scheduling failed due to incorrect intervals");
                ABJ.report();
                return;
            }
            try {
                Integer num = AnonymousClass006.A00;
                C41237M1g m1g = new C41237M1g(AnonymousClass006.A01, AnonymousClass00J.A0c(C86134wK.A0u()), -1, -1, A0E, false, false, false);
                TimeUnit timeUnit = TimeUnit.MINUTES;
                TimeUnit timeUnit2 = timeUnit;
                C39971LCa lCa = new C39971LCa(KeyAttestationWorker.class, timeUnit2, timeUnit, A03 * 60, A032 * 60);
                lCa.A01(A033, timeUnit);
                lCa.A02(m1g);
                C41250M5i.A00(context).A05((C39973LCc) lCa.A00(), num, "KeyAttestationScheduler");
            } catch (UnsupportedOperationException e) {
                C14100oo ABJ2 = C10770iu.A00().ABJ("KeyAttestationScheduler", 817903298);
                ABJ2.A8U("error", "Key attestation scheduling failed due to unsupported operation");
                ABJ2.Ciu(e);
                ABJ2.report();
            }
        } catch (IllegalStateException unused) {
        }
    }
}
