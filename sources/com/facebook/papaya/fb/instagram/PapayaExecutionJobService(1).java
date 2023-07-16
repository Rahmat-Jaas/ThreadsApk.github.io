package com.facebook.papaya.fb.instagram;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.C10450iM;
import X.C132437tt;
import X.C1358180g;
import X.C14030oh;
import X.C146428mE;
import X.C18180wK;
import X.C18230wP;
import X.C86154wM;
import X.C86164wN;
import X.C90695dv;
import X.I17;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.papaya.client.platform.PlatformResourceChecker;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.service.session.UserSession;
import java.util.concurrent.Executors;

public final class PapayaExecutionJobService extends JobService {
    public C146428mE A00;
    public C90695dv A01;

    public final synchronized boolean onStartJob(JobParameters jobParameters) {
        Executors.newSingleThreadExecutor().execute(new C1358180g(jobParameters, this));
        return true;
    }

    public final synchronized boolean onStopJob(JobParameters jobParameters) {
        String str;
        C90695dv r3 = this.A01;
        if (r3 != null) {
            boolean isDeviceIdle = PlatformResourceChecker.isDeviceIdle(this);
            boolean hasExternalPower = PlatformResourceChecker.hasExternalPower(this);
            boolean hasUnmeteredConnectivity = PlatformResourceChecker.hasUnmeteredConnectivity(this);
            boolean hasNetworkConnectivity = PlatformResourceChecker.hasNetworkConnectivity(this);
            if (hasUnmeteredConnectivity) {
                str = "unmetered";
            } else if (hasNetworkConnectivity) {
                str = "unknown";
            } else {
                str = NetInfoModule.CONNECTION_TYPE_NONE;
            }
            QuickPerformanceLogger quickPerformanceLogger = r3.A00;
            quickPerformanceLogger.markerAnnotate(188224997, "stop_state", AnonymousClass4WJ.A0H(C18180wK.A0p("device_idle", String.valueOf(isDeviceIdle)), C18180wK.A0p("has_external_power", String.valueOf(hasExternalPower)), C18180wK.A0p("connectivity_type", str)).toString());
            quickPerformanceLogger.markerPoint(188224997, "JOB_STOPPED");
        }
        C146428mE r0 = this.A00;
        if (r0 != null) {
            r0.Cvy();
        }
        return false;
    }

    public static void A00(JobParameters jobParameters, PapayaExecutionJobService papayaExecutionJobService, Throwable th) {
        String str;
        if (th != null) {
            AnonymousClass0LU.A05(PapayaExecutionJobService.class, "Failed to run papaya", th, C86164wN.A1T());
        }
        C90695dv r4 = papayaExecutionJobService.A01;
        if (r4 != null) {
            if (th != null) {
                QuickPerformanceLogger quickPerformanceLogger = r4.A00;
                Throwable cause = th.getCause();
                if ((cause == null || (str = cause.getMessage()) == null) && (str = th.getMessage()) == null) {
                    str = I17.A00(10);
                }
                quickPerformanceLogger.markerAnnotate(188224997, TraceFieldType.FailureReason, str);
            }
            QuickPerformanceLogger quickPerformanceLogger2 = r4.A00;
            short s = 3;
            if (th == null) {
                s = 2;
            }
            quickPerformanceLogger2.markerEnd(188224997, s);
        }
        papayaExecutionJobService.jobFinished(jobParameters, false);
    }

    public final void onCreate() {
        int A04 = C14030oh.A04(717951798);
        int A042 = C14030oh.A04(-2038292478);
        super.onCreate();
        C14030oh.A0B(1604463720, A042);
        try {
            UserSession A0Z = C18230wP.A0Z();
            AnonymousClass0wJ.A1N(this, A0Z);
            C90695dv r0 = ((C132437tt) A0Z.A01(C132437tt.class, C86154wM.A11(this, A0Z, 6))).A00;
            if (r0 != null) {
                this.A01 = r0;
            }
        } catch (IllegalStateException unused) {
            C10450iM.A03("Papaya", "Can't locate Papaya instance when User session has ended.");
        }
        C14030oh.A0B(-49123793, A04);
    }

    public final void onDestroy() {
        int A04 = C14030oh.A04(724985562);
        super.onDestroy();
        C14030oh.A0B(-1091795650, A04);
    }
}
