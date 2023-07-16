package X;

import android.content.Context;
import com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationWorker;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.61b  reason: invalid class name and case insensitive filesystem */
public final class C955261b extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C955261b(C697249u r7) {
        super("AttestationPlayIntegrityPeriodic", 718484570, 3, true, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C14100oo r1;
        String str;
        Context context = this.A00.A05;
        C04220Ms.A0B(context, 0);
        try {
            UserSession A02 = C05030Qo.A02(C18230wP.A0Z());
            AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
            boolean A0E = C63803iN.A0E(r2, A02, 2342167407357141479L);
            long A03 = C63803iN.A03(r2, A02, 36605873120023014L);
            long A032 = C63803iN.A03(r2, A02, 36605873119891940L);
            long A033 = C63803iN.A03(r2, A02, 36605873119957477L);
            long A034 = C63803iN.A03(r2, A02, 36605873120285160L);
            long A035 = C63803iN.A03(r2, A02, 36605873120219623L);
            if (A03 < A032) {
                r1 = C10770iu.A00().ABJ("PlayIntegrityAttestationScheduler", 817896512);
                str = "Play Integrity attestation scheduling failed due to incorrect intervals";
            } else if (A035 < 10000) {
                r1 = C10770iu.A00().ABJ("PlayIntegrityAttestationScheduler", 817896512);
                str = "Play Integrity attestation scheduling failed due to incorrect retry wait duration";
            } else {
                try {
                    Integer num = AnonymousClass006.A00;
                    C41237M1g m1g = new C41237M1g(AnonymousClass006.A01, AnonymousClass00J.A0c(C86134wK.A0u()), -1, -1, A0E, false, false, false);
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    C39971LCa lCa = new C39971LCa(PlayIntegrityAttestationWorker.class, timeUnit, timeUnit, A03 * 60, A032 * 60);
                    lCa.A01(A033, timeUnit);
                    lCa.A02(m1g);
                    if (A034 > 0) {
                        lCa.A03(num, TimeUnit.MILLISECONDS, A035);
                    }
                    C41250M5i.A00(context).A05((C39973LCc) lCa.A00(), num, "PlayIntegrityAttestationScheduler");
                    return;
                } catch (UnsupportedOperationException e) {
                    C14100oo ABJ = C10770iu.A00().ABJ("PlayIntegrityAttestationScheduler", 817896512);
                    ABJ.A8U("error", "Play Integrity attestation scheduling failed due to unsupported operation");
                    ABJ.Ciu(e);
                    ABJ.report();
                    return;
                }
            }
            r1.A8U("error", str);
            r1.report();
        } catch (IllegalStateException unused) {
        }
    }
}
