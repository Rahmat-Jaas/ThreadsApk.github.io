package X;

import java.io.File;

/* renamed from: X.0Lh  reason: invalid class name and case insensitive filesystem */
public final class C03910Lh implements AnonymousClass0PC {
    public final C019809f A00;
    public final C04100Mg A01;
    public final AnonymousClass0Q4 A02;
    public final boolean A03;
    public final boolean A04;
    public final /* synthetic */ AnonymousClass0Z6 A05;

    public C03910Lh(C019809f r1, C04100Mg r2, AnonymousClass0Z6 r3, AnonymousClass0Q4 r4, boolean z, boolean z2) {
        this.A05 = r3;
        this.A02 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = z;
        this.A03 = z2;
    }

    public final void start() {
        String str;
        String A052;
        boolean z = false;
        if (this.A05.A00) {
            z = true;
        }
        AnonymousClass0Q4 r1 = this.A02;
        File A022 = r1.A02(r1.A06);
        if (A022 != null) {
            File file = new File(A022, "state.txt");
            AnonymousClass0NN r10 = new AnonymousClass0NN(file);
            char A023 = r10.A02();
            boolean A012 = AnonymousClass0NO.A01(A023);
            boolean z2 = A012;
            File file2 = new File(A022, "native_state.txt");
            File file3 = new File(A022, "anr_state.txt");
            char A002 = AnonymousClass0NJ.A00(file2);
            char A003 = AnonymousClass0NJ.A00(file3);
            char A032 = r10.A03();
            boolean A033 = AnonymousClass0NO.A03(A032, A002, A003);
            if (A033 && A023 == 'f' && (A052 = r10.A05(this.A00)) != null && A052.contains(C019609d.A01.getClass().getSimpleName())) {
                A012 = false;
            }
            if (this.A03 && !A012) {
                return;
            }
            if (!this.A04 || !(A023 == 'i' || A023 == 'x' || A023 == '?')) {
                if (z) {
                    str = " - Dry run... do not assemble ufad report.";
                } else {
                    String A013 = C02640Cf.A01("fb.report_source");
                    if ("jest_e2e".equals(A013)) {
                        str = "Ignore ufads on jest test runs.";
                    } else if (!"sapienz".equals(A013) || A023 != 'f') {
                        if (z2) {
                            AnonymousClass0NO.A03(A032, A002, A003);
                        }
                        if (AnonymousClass0NO.A04(AnonymousClass006.A01, AnonymousClass0NO.A00(A032, A002, A003)) && !new File(A022, "critical_suppl_java_detect_prop.txt").exists() && !new File(A022, "critical_java_prop.txt").exists() && !new File(A022, "critical_java_detect_prop.txt").exists()) {
                            AnonymousClass0LU.A0C("lacrima", "Java state with no java report, reporting as fad");
                        } else if (!A033) {
                            return;
                        }
                        C04170Mn r5 = new C04170Mn((Throwable) null);
                        r5.A02(AnonymousClass0MU.A2y, Long.valueOf(file.lastModified() / 1000));
                        r5.A02(AnonymousClass0MU.A1K, Long.valueOf(System.currentTimeMillis() / 1000));
                        r5.A03(AnonymousClass0MU.A4b, "unexplained");
                        C04100Mg r12 = this.A01;
                        r12.A07(r5, AnonymousClass0ND.CRITICAL_REPORT, this);
                        if (A012) {
                            r12.A07(r5, AnonymousClass0ND.LARGE_REPORT, this);
                            return;
                        }
                        return;
                    } else {
                        str = "Ignore f states on sapienz runs.";
                    }
                }
                AnonymousClass0LU.A0C("lacrima", str);
            }
        }
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.UNEXPLAINED;
    }
}
