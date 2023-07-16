package com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram;

import X.AnonymousClass0IB;
import X.AnonymousClass0TJ;
import X.AnonymousClass0gN;
import X.AnonymousClass0gV;
import X.AnonymousClass0wJ;
import X.C109106jT;
import X.C1189272v;
import X.C125587dZ;
import X.C132197tV;
import X.C18180wK;
import X.C18210wN;
import X.C18240wQ;
import X.C63803iN;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.cameracore.mediapipeline.arclass.benchmark.interfaces.IARClassBenchmark;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.instagram.service.session.UserSession;
import java.util.concurrent.Executor;

public class InstagramARClassBenchmark implements IARClassBenchmark {
    public final Context A00;
    public final AnalyticsLogger A01;
    public final AnonymousClass0IB A02;
    public final UserSession A03;
    public final Executor A04 = new AnonymousClass0gV(AnonymousClass0gN.A00(), 813, 3, false, false);
    public final C132197tV A05;
    public final C109106jT A06;

    public final void startBenchmarks() {
        UserSession userSession = this.A03;
        boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36310357895217189L);
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A06;
        long A032 = C63803iN.A03(r2, userSession, 36591832871993366L);
        long A033 = C63803iN.A03(r2, userSession, 36591832871731221L);
        double A002 = C63803iN.A00(r2, userSession, 37154782825218048L);
        double A003 = C63803iN.A00(r2, userSession, 37154782825283585L);
        if (A0E) {
            long j = A032 * 1000;
            SharedPreferences sharedPreferences = this.A05.A00;
            boolean z = false;
            if (sharedPreferences.contains("refreshTimeMillis") && C18240wQ.A09(C18180wK.A05(sharedPreferences, "refreshTimeMillis")) < j) {
                z = true;
            }
            if (!C18210wN.A1W(z)) {
                AnonymousClass0wJ.A12(sharedPreferences.edit(), "refreshTimeMillis", System.currentTimeMillis());
                if (Math.random() < A002) {
                    C109106jT r1 = this.A06;
                    C125587dZ r9 = new C125587dZ(this, A003, A033);
                    synchronized (r1) {
                        r9.onSuccess(C1189272v.A00);
                    }
                }
            }
        }
    }

    public InstagramARClassBenchmark(Context context, AnalyticsLogger analyticsLogger, AnonymousClass0IB r9, C109106jT r10, UserSession userSession) {
        this.A01 = analyticsLogger;
        this.A00 = context;
        this.A03 = userSession;
        this.A06 = r10;
        this.A02 = r9;
        this.A05 = new C132197tV(userSession);
    }
}
