package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5001000_I2;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: X.7hw  reason: invalid class name and case insensitive filesystem */
public final class C127917hw implements L3C {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass7EY A02;

    public final void BlI(String str, int i) {
        C04220Ms.A0B(str, 0);
        boolean z = this.A01;
        AnonymousClass7EY r2 = this.A02;
        String A002 = A00(i, str);
        if (z) {
            AnonymousClass7EY.A00(r2, "extra_assets_fetch_success", A002);
            return;
        }
        AnonymousClass7EY.A00(r2, "assets_fetch_success", A002);
        this.A00 = true;
    }

    public final void BuQ(String str, int i) {
        C04220Ms.A0B(str, 0);
        AnonymousClass7EY.A00(this.A02, "document_fetch_success", A00(i, str));
    }

    public final void CLS(ImmutableMap immutableMap, Integer num, String str) {
        AnonymousClass0wJ.A1Z(num, str);
        C04220Ms.A0B(immutableMap, 2);
        AnonymousClass7EY r0 = this.A02;
        QuickPerformanceLogger quickPerformanceLogger = r0.A01;
        KtCSuperShape0S5001000_I2 ktCSuperShape0S5001000_I2 = r0.A00;
        C110596lx r4 = r0.A02;
        r0.A03.execute(new AnonymousClass83F(ktCSuperShape0S5001000_I2, quickPerformanceLogger, r4, immutableMap, num, str, quickPerformanceLogger.currentMonotonicTimestampNanos()));
    }

    public static String A00(int i, Object obj) {
        AnonymousClass7E4 r3 = new AnonymousClass7E4();
        Map map = r3.A00;
        map.put("load_source", obj);
        map.put("byte_size", String.valueOf(i));
        return r3.A02();
    }

    public static String A01(Object obj) {
        AnonymousClass7E4 r3 = new AnonymousClass7E4();
        Map map = r3.A00;
        map.put("error", "general_error");
        map.put("error_msg", obj);
        return r3.A02();
    }

    public final void A02(Throwable th) {
        AnonymousClass7EY r5 = this.A02;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        r5.A03.execute(new AnonymousClass82N(r5, message, r5.A01.currentMonotonicTimestampNanos()));
    }

    public final void BjU(String str) {
        AnonymousClass7EY r5 = this.A02;
        AnonymousClass7E4 r4 = new AnonymousClass7E4();
        r4.A00.put(AnonymousClass3Q6.A00(9, 10, 56), str);
        AnonymousClass7EY.A00(r5, "active_request_reuse", r4.A02());
    }

    public final void BlG(Throwable th) {
        boolean z = this.A01;
        AnonymousClass7EY r3 = this.A02;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        if (z) {
            AnonymousClass7EY.A00(r3, "extra_assets_fetch_fail", A01(message));
            return;
        }
        AnonymousClass7EY.A00(r3, "assets_fetch_fail", A01(message));
        this.A00 = true;
    }

    public final void BlH() {
        boolean z = this.A00;
        AnonymousClass7EY r2 = this.A02;
        if (z) {
            AnonymousClass7EY.A00(r2, "extra_assets_fetch_start", (String) null);
            this.A01 = true;
            return;
        }
        AnonymousClass7EY.A00(r2, "assets_fetch_start", (String) null);
    }

    public final void BuO(Throwable th) {
        AnonymousClass7EY r2 = this.A02;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        AnonymousClass7EY.A00(r2, "document_fetch_fail", A01(message));
    }

    public final void BuP() {
        AnonymousClass7EY.A00(this.A02, "document_fetch_start", (String) null);
    }

    public final void CAE(boolean z) {
        AnonymousClass7EY r2 = this.A02;
        r2.A03.execute(new C1358880n(r2, z));
    }

    public final void CC9(Throwable th) {
        AnonymousClass7EY r2 = this.A02;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        AnonymousClass7EY.A00(r2, "prepare_render_fail", A01(message));
    }

    public final void CCA() {
        AnonymousClass7EY.A00(this.A02, I17.A00(809), (String) null);
    }

    public final void CCB() {
        AnonymousClass7EY.A00(this.A02, I17.A00(810), (String) null);
    }

    public C127917hw(AnonymousClass7EY r1) {
        this.A02 = r1;
    }
}
