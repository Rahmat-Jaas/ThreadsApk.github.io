package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

/* renamed from: X.0j1  reason: invalid class name and case insensitive filesystem */
public final class C10830j1 implements AnonymousClass0i4 {
    public boolean A00;
    public final C10390iG A01;

    public static void A01(C10830j1 r1) {
        C10390iG r0;
        if (r1.A00 && (r0 = r1.A01) != null) {
            C691847d.A02(r0);
        }
    }

    public final void onSessionWillEnd() {
        C10390iG r0;
        if (this.A00 && (r0 = this.A01) != null) {
            C691847d.A03(r0);
        }
    }

    public C10830j1(Context context, UserSession userSession) {
        C10890j8 r1 = null;
        if (C07960cV.A05(AnonymousClass0e5.A00(36314128876308284L))) {
            if (ClassTracingLogger.sEnabled) {
                this.A00 = true;
                if (AnonymousClass0LT.A02(context)) {
                    File A012 = AnonymousClass0LT.A01(context);
                    if (A012.exists()) {
                        File A002 = AnonymousClass0LT.A00(context);
                        File[] listFiles = A012.listFiles();
                        if (listFiles != null) {
                            for (File file : listFiles) {
                                if (!file.equals(A002)) {
                                    AnonymousClass0IV.A00(file);
                                }
                            }
                        }
                    }
                }
                r1 = new C10890j8(context, new C10680ik(C10260hz.A00).A00(), this, userSession);
            }
            this.A01 = r1;
            boolean A02 = A02(userSession);
            try {
                HashSet<String> hashSet = new HashSet<>();
                for (ServiceInfo serviceInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 516).services) {
                    hashSet.add(serviceInfo.processName);
                }
                for (String A0L : hashSet) {
                    AnonymousClass0SH.A02(context, AnonymousClass00U.A0L("classtracinglogger_enable_", A0L), A02);
                }
            } catch (PackageManager.NameNotFoundException e) {
                AnonymousClass0LU.A03(ClassTracingLogger.class, "Package manager failed. Not logging.", e);
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof DeadObjectException) {
                    AnonymousClass0LU.A03(ClassTracingLogger.class, "DeadObjectException while attempting to update enabled state.", e2);
                } else {
                    throw e2;
                }
            }
            AnonymousClass0SH.A02(context, "mdcd_multiprocess_enable", A02 ? 1 : 0);
            for (String A0L2 : AnonymousClass0i7.A00(context)) {
                AnonymousClass0SH.A02(context, AnonymousClass00U.A0L("nativemetrics_", A0L2), A02);
            }
        }
    }

    public static void A00(Context context, C13330nS r2) {
        Set A012 = AnonymousClass3JC.A01(context, AnonymousClass0i7.A00(context));
        USLEBaseShape0S0000000 A002 = C32402Br.A00(r2);
        A002.A0U("loaded_libraries", new ArrayList(A012));
        A002.A0T("release_channel", C10340iB.A00().name().toLowerCase(Locale.US));
        A002.Bb4();
    }

    public static boolean A02(UserSession userSession) {
        Long A002;
        if (C19573AyZ.A03(userSession)) {
            A002 = C09060en.A00(userSession);
        } else if (C10340iB.A00() == C10340iB.ALPHA || C10340iB.A00() == C10340iB.BETA) {
            A002 = C09080ep.A00(userSession);
        } else {
            A002 = C09090eq.A00(userSession);
        }
        int intValue = A002.intValue();
        if (intValue <= 0 || new Random().nextInt(intValue) != 0) {
            return false;
        }
        return true;
    }
}
