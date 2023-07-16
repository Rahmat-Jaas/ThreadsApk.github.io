package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.service.session.UserSession;

/* renamed from: X.1jI  reason: invalid class name */
public final class AnonymousClass1jI extends C30814GWv {
    public BugReport A00;
    public C18330wh A01;
    public final Activity A02;
    public final Bitmap A03;
    public final BugReportComposerViewModel A04;
    public final C61593Uj A05;
    public final UserSession A06;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0092 A[SYNTHETIC, Splitter:B:25:0x0092] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A03(java.lang.Object[] r12) {
        /*
            r11 = this;
            com.instagram.service.session.UserSession r6 = r11.A06
            java.lang.Class<X.0ek> r0 = X.C09030ek.class
            java.lang.Object r5 = r6.A00(r0)
            X.0ek r5 = (X.C09030ek) r5
            if (r5 == 0) goto L_0x0090
            r0 = 0
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 30539777(0x1d20001, float:7.714182E-38)
            r0 = 802(0x322, float:1.124E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0UG r4 = X.AnonymousClass0UF.A00(r0, r2, r1)
            X.0dr r3 = X.AnonymousClass0Vt.A00()
            if (r4 != 0) goto L_0x008d
            java.lang.String r0 = "none"
        L_0x0024:
            java.lang.String r2 = "IgProfiloSessionManager"
            java.lang.String r1 = "Bugreport Blackbox trace collection requested. Trace Id: "
            r3.A03(r0, r2, r1)
            r5.A01 = r4
            if (r4 == 0) goto L_0x0090
            java.lang.String r0 = r4.A01
        L_0x0031:
            com.instagram.bugreporter.BugReport r1 = r11.A00
            java.util.HashMap r5 = r1.A0C
            if (r0 == 0) goto L_0x003c
            java.lang.String r1 = "black_box_trace_id"
            r5.put(r1, r0)
        L_0x003c:
            X.49q r2 = X.AnonymousClass3Zs.A03(r6)
            X.D2R r1 = X.D2R.A0s
            java.lang.Class<X.34T> r0 = X.AnonymousClass34T.class
            android.content.SharedPreferences r8 = r2.A02(r1, r0)
            r4 = 0
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "dogfooding_assistant_expire_time"
            r1 = 0
            long r6 = r8.getLong(r3, r1)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0086
            r0 = r4
        L_0x005a:
            long r6 = java.lang.System.currentTimeMillis()
            long r2 = r8.getLong(r3, r1)
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x007f
            r1 = r4
        L_0x0067:
            if (r0 == 0) goto L_0x0073
            java.lang.String r2 = "dogfooding_assistant_tag"
            r5.put(r2, r0)
            java.lang.String r0 = "dogfooding_assistant_owner"
            r5.put(r0, r1)
        L_0x0073:
            com.instagram.bugreporter.BugReport r0 = r11.A00
            java.util.ArrayList r3 = r0.A0B
            X.C63643hy.A01()
            android.graphics.Bitmap r7 = r11.A03
            if (r7 == 0) goto L_0x00c2
            goto L_0x0092
        L_0x007f:
            java.lang.String r1 = "dogfooding_assistant_user"
            java.lang.String r1 = r8.getString(r1, r4)
            goto L_0x0067
        L_0x0086:
            java.lang.String r0 = "dogfooding_assistant_tag"
            java.lang.String r0 = r8.getString(r0, r4)
            goto L_0x005a
        L_0x008d:
            java.lang.String r0 = r4.A01
            goto L_0x0024
        L_0x0090:
            r0 = 0
            goto L_0x0031
        L_0x0092:
            android.app.Activity r6 = r11.A02     // Catch:{ IOException -> 0x00ba }
            java.lang.String r1 = "image/png"
            java.lang.String r2 = "screenshot"
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ IOException -> 0x00ba }
            java.lang.String r1 = r0.getExtensionFromMimeType(r1)     // Catch:{ IOException -> 0x00ba }
            if (r1 == 0) goto L_0x00a8
            java.lang.String r0 = "."
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ IOException -> 0x00ba }
        L_0x00a8:
            java.io.File r0 = X.AnonymousClass3L0.A00(r6, r2, r1)     // Catch:{ IOException -> 0x00ba }
            android.net.Uri r0 = X.GY6.A01(r7, r0)     // Catch:{ IOException -> 0x00ba }
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = r0.getPath()     // Catch:{ IOException -> 0x00ba }
            r3.add(r0)     // Catch:{ IOException -> 0x00ba }
            goto L_0x00c2
        L_0x00ba:
            r2 = move-exception
            java.lang.String r1 = "LaunchBugReporterTask"
            java.lang.String r0 = "Could not create temporary file for screenshot."
            X.AnonymousClass0LU.A0E(r1, r0, r2)
        L_0x00c2:
            X.3IL r1 = new X.3IL
            r1.<init>()
            com.instagram.bugreporter.BugReport r0 = r11.A00
            r1.A01(r0)
            r1.A0B = r3
            r1.A0C = r5
            com.instagram.bugreporter.BugReport r0 = r1.A00()
            r11.A00 = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1jI.A03(java.lang.Object[]):java.lang.Object");
    }

    public final void A04() {
        if (!this.A00.A0E) {
            Activity activity = this.A02;
            C18330wh r1 = new C18330wh(activity);
            this.A01 = r1;
            C18330wh.A02(activity, r1, 2131822738);
            C13950oZ.A00(this.A01);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0042, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r4, 36326107540104620L) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A05(java.lang.Object r7) {
        /*
            r6 = this;
            android.app.Activity r5 = r6.A02
            if (r5 == 0) goto L_0x0051
            r6.A06()
            com.instagram.service.session.UserSession r4 = r6.A06
            java.lang.Class<X.47c> r1 = X.C691747c.class
            r0 = 6
            java.lang.Object r1 = X.C18180wK.A0c(r4, r1, r0)
            X.47c r1 = (X.C691747c) r1
            X.0iH r0 = X.C10410iI.A00
            r0.A00(r1)
            java.lang.Class<com.instagram.bugreporter.BugReporterActivity> r0 = com.instagram.bugreporter.BugReporterActivity.class
            android.content.Intent r3 = X.C18250wR.A04(r5, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r0)
            com.instagram.bugreporter.BugReport r1 = r6.A00
            java.lang.String r0 = "BugReporterActivity.INTENT_EXTRA_BUGREPORT"
            r3.putExtra(r0, r1)
            com.instagram.bugreporter.BugReportComposerViewModel r1 = r6.A04
            java.lang.String r0 = "BugReporterActivity.INTENT_EXTRA_VIEWMODEL"
            r3.putExtra(r0, r1)
            boolean r0 = X.C34442Jo.A00()
            if (r0 == 0) goto L_0x0044
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36326107540104620(0x810e67000025ac, double:3.0361149096319427E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0045
        L_0x0044:
            r1 = 1
        L_0x0045:
            java.lang.String r0 = "BugReporterActivity.INTENT_GDPR_SCREEN_ENABLED"
            r3.putExtra(r0, r1)
            X.C18230wP.A12(r3, r4)
            X.C10650ih.A02(r5, r3)
        L_0x0050:
            return
        L_0x0051:
            java.lang.String r1 = "NO_ACTIVITY_CONTEXT_AVAILABLE"
            X.3Uj r0 = r6.A05
            if (r0 == 0) goto L_0x0050
            r0.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1jI.A05(java.lang.Object):void");
    }

    public final void A06() {
        if (this.A01 != null && !this.A02.isDestroyed()) {
            this.A01.dismiss();
            this.A01 = null;
        }
    }

    public AnonymousClass1jI(Activity activity, Bitmap bitmap, BugReport bugReport, BugReportComposerViewModel bugReportComposerViewModel, C61593Uj r5, UserSession userSession) {
        this.A06 = userSession;
        this.A02 = activity;
        this.A00 = bugReport;
        this.A03 = bitmap;
        this.A05 = r5;
        this.A04 = bugReportComposerViewModel;
    }
}
