package X;

import com.facebook.profilo.ipc.TraceContext;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.0ek  reason: invalid class name and case insensitive filesystem */
public final class C09030ek implements AnonymousClass0i1 {
    public final UserSession A00;
    public volatile AnonymousClass0UG A01;

    public C09030ek(UserSession userSession) {
        this.A00 = userSession;
    }

    public static void A00(C09030ek r4, boolean z) {
        AnonymousClass0Vt.A00().A03(Boolean.valueOf(z), "IgProfiloSessionManager", "Session start. Cold start? - %b");
        GQH.A01().CwT(new AnonymousClass0Bn(r4));
    }

    public final void onUserSessionWillEnd(boolean z) {
        boolean z2;
        AnonymousClass0Vt.A00().A03(Boolean.valueOf(z), "IgProfiloSessionManager", "Session changed: clearData and stop tracing, isLoggedOut = %b");
        C08000cZ A002 = C08000cZ.A00();
        A002.A06(new C07870cK());
        C05680Uw r4 = C05680Uw.A0A;
        if (r4 != null) {
            for (TraceContext traceContext : r4.A06()) {
                C05680Uw.A04(r4, traceContext.A0B, traceContext.A01, 0, 9, traceContext.A05);
            }
        }
        synchronized (A002) {
            AnonymousClass0VF r6 = A002.A01;
            ArrayList<File> arrayList = new ArrayList<>();
            arrayList.addAll(AnonymousClass0VF.A00(r6, r6.A06));
            arrayList.addAll(AnonymousClass0VF.A00(r6, r6.A05));
            arrayList.addAll(AnonymousClass0VF.A00(r6, r6.A03));
            arrayList.addAll(AnonymousClass0VF.A00(r6, r6.A04));
            z2 = true;
            for (File file : arrayList) {
                if (file.exists() && !file.delete()) {
                    z2 = false;
                    r6.A02.A02++;
                }
            }
        }
        C08000cZ.A00().A08((C09020eh) null);
        if (!z2) {
            C10450iM.A03("IgProfiloSessionManager", "Fail to clean up profilo traces and configuration during logout");
        }
    }
}
