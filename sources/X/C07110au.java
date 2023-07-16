package X;

import java.io.File;

/* renamed from: X.0au  reason: invalid class name and case insensitive filesystem */
public final class C07110au implements AnonymousClass0PC {
    public final C04100Mg A00;
    public final AnonymousClass0Q4 A01;

    public C07110au(C04100Mg r1, AnonymousClass0Q4 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.JAVA_APP_DEATH;
    }

    public final void start() {
        AnonymousClass0LU.A0O("lacrima", "Start JavaAppDeathCrashDetector... %s", getClass().getName());
        AnonymousClass0Q4 r1 = this.A01;
        File A02 = r1.A02(r1.A06);
        if (A02 != null) {
            AnonymousClass0NN r3 = new AnonymousClass0NN(new File(A02, "state.txt"));
            r3.A02();
            File file = new File(A02, "native_state.txt");
            File file2 = new File(A02, "anr_state.txt");
            char A002 = AnonymousClass0NO.A00(r3.A03(), AnonymousClass0NJ.A00(file), AnonymousClass0NJ.A00(file2));
            if (AnonymousClass0NO.A04(AnonymousClass006.A01, A002)) {
                C04170Mn r5 = new C04170Mn((Throwable) null);
                r5.A02(AnonymousClass0MU.A1K, Long.valueOf(System.currentTimeMillis() / 1000));
                r5.A03(AnonymousClass0MU.A45, String.valueOf(A002));
                C04100Mg r2 = this.A00;
                r2.A07(r5, AnonymousClass0ND.CRITICAL_REPORT, this);
                if (new File(A02, "large_suppl_java_detect_prop.txt").exists()) {
                    r2.A07(r5, AnonymousClass0ND.LARGE_REPORT, this);
                }
            }
        }
    }
}
