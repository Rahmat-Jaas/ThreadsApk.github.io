package X;

import android.content.Context;
import com.instagram.feo2confidence.helper.ConfidencePingWorker;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.61Y  reason: invalid class name */
public final class AnonymousClass61Y extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61Y(C697249u r7) {
        super("startConfidencePing", 249642657, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        Context context = this.A00.A05;
        if (new AnonymousClass3TI(context).A01.A00() >= 1) {
            C04220Ms.A0B(context, 0);
            try {
                UserSession A0Z = C18230wP.A0Z();
                TimeUnit timeUnit = TimeUnit.HOURS;
                C39971LCa lCa = new C39971LCa(ConfidencePingWorker.class, timeUnit, timeUnit, 12, 12);
                lCa.A01(0, TimeUnit.MILLISECONDS);
                String A0L = AnonymousClass00U.A0L("ConfidencePingWorker", AnonymousClass0wJ.A0Y(A0Z).BK7());
                C41250M5i.A00(context).A05((C39973LCc) lCa.A00(), AnonymousClass006.A01, A0L);
            } catch (Exception e) {
                C10450iM.A06("ConfidencePingWorker", "Exception upon start confidence ping", e);
            }
        }
    }
}
