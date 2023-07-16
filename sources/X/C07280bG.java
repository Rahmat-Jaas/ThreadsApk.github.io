package X;

import android.app.Application;
import android.text.TextUtils;
import java.io.File;

/* renamed from: X.0bG  reason: invalid class name and case insensitive filesystem */
public final class C07280bG implements AnonymousClass0PC {
    public final Application A00;
    public final C04100Mg A01;
    public final AnonymousClass0Q4 A02;

    public final void start() {
        String A012 = C02640Cf.A01("fb.report_source");
        if (A012 == null || A012.equals("")) {
            A012 = System.getProperty("fb.report_source");
        }
        C04170Mn r4 = new C04170Mn((Throwable) null);
        if (!TextUtils.isEmpty(A012)) {
            r4.A03(AnonymousClass0MU.A8D, A012);
            String A013 = C02640Cf.A01("fb.test_name");
            String A014 = C02640Cf.A01("fb.test_execution_uuid");
            if (!TextUtils.isEmpty(A013) || !TextUtils.isEmpty(A014)) {
                StringBuilder sb = new StringBuilder("{");
                sb.append("\"test_name\":");
                sb.append('\"');
                sb.append(A013);
                sb.append("\",");
                sb.append("\"test_execution_uuid\":");
                sb.append('\"');
                sb.append(A014);
                sb.append('\"');
                sb.append('}');
                r4.A03(AnonymousClass0MU.A8F, sb.toString());
            } else {
                File file = new File(this.A02.A05, "report_source");
                file.mkdir();
                r4.A04(AnonymousClass0MY.A0E, AnonymousClass0ND.CRITICAL_REPORT, new File(file, "report_source_ref.txt"));
            }
        }
        String A015 = C02640Cf.A01("fb.testing.build_target");
        if (A015 != null && !A015.equals("")) {
            r4.A03(AnonymousClass0MU.A6d, A015);
        }
        String A016 = C02640Cf.A01("fb.fury_stacktraces_filename");
        if (!TextUtils.isEmpty(A016)) {
            File filesDir = this.A00.getFilesDir();
            r4.A04(AnonymousClass0MY.A09, AnonymousClass0ND.CRITICAL_REPORT, new File(filesDir, A016));
        }
        String A017 = C02640Cf.A01("ig.ig_server_rev_hash");
        if (((A017 != null && !A017.equals("")) || (A017 = System.getProperty("ig.ig_server_rev_hash")) != null) && !A017.equals("")) {
            r4.A03(AnonymousClass0MU.A5U, A017);
        }
        C04100Mg r1 = this.A01;
        r1.A07(r4, AnonymousClass0ND.CRITICAL_REPORT, this);
        r1.A07(r4, AnonymousClass0ND.LARGE_REPORT, this);
    }

    public C07280bG(Application application, C04100Mg r2, AnonymousClass0Q4 r3) {
        this.A00 = application;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.REPORT_SOURCE;
    }
}
