package X;

import android.app.job.JobParameters;
import com.facebook.papaya.fb.instagram.PapayaExecutionJobService;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.redex.IDxFCallbackShape114S0200000_2_I2;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.service.session.UserSession;

/* renamed from: X.80g  reason: invalid class name and case insensitive filesystem */
public final class C1358180g implements Runnable {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ PapayaExecutionJobService A01;

    public C1358180g(JobParameters jobParameters, PapayaExecutionJobService papayaExecutionJobService) {
        this.A01 = papayaExecutionJobService;
        this.A00 = jobParameters;
    }

    public final void run() {
        ListenableFuture listenableFuture;
        PapayaExecutionJobService papayaExecutionJobService = this.A01;
        JobParameters jobParameters = this.A00;
        synchronized (papayaExecutionJobService) {
            C90695dv r1 = papayaExecutionJobService.A01;
            if (r1 != null) {
                QuickPerformanceLogger quickPerformanceLogger = r1.A00;
                quickPerformanceLogger.markerStart(188224997, false);
                quickPerformanceLogger.markerAnnotate(188224997, "population", r1.A01);
            }
            try {
                UserSession A0Z = C18230wP.A0Z();
                AnonymousClass0wJ.A1N(papayaExecutionJobService, A0Z);
                listenableFuture = C30954Gc6.A01((C127057gS) A0Z.A01(C127057gS.class, C86154wM.A11(papayaExecutionJobService, A0Z, 4)));
            } catch (IllegalStateException unused) {
                C10450iM.A03("Papaya", "Can't locate Papaya instance when User session has ended.");
                listenableFuture = new C93845rm(C18180wK.A0a("Can't locate Papaya instance when User session has ended."));
            }
            C30954Gc6.A03(new IDxFCallbackShape114S0200000_2_I2(1, jobParameters, papayaExecutionJobService), listenableFuture, C97356Ba.A01);
        }
    }
}
