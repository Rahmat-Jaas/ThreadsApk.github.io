package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.85b  reason: invalid class name and case insensitive filesystem */
public final class C1369285b implements C04560Oe {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C128907kZ A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C04560Oe A03;

    public C1369285b(Context context, C128907kZ r2, UserSession userSession, C04560Oe r4) {
        this.A02 = userSession;
        this.A00 = context;
        this.A03 = r4;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0052, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r3, 36313059429451025L) != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object get() {
        /*
            r11 = this;
            com.instagram.service.session.UserSession r3 = r11.A02
            java.lang.String r10 = r3.getUserId()
            android.content.Context r2 = r11.A00
            X.49q r1 = X.AnonymousClass3Zs.A03(r3)
            X.D2R r0 = X.D2R.A0z
            android.content.SharedPreferences r6 = r1.A01(r0)
            X.0Oe r4 = r11.A03
            java.lang.Object r8 = r4.get()
            X.6ci r8 = (X.C104996ci) r8
            X.6S4 r9 = new X.6S4
            r9.<init>()
            X.75Y r7 = new X.75Y     // Catch:{ IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException -> 0x0025 }
            r7.<init>(r2)     // Catch:{ IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException -> 0x0025 }
            goto L_0x002e
        L_0x0025:
            r2 = move-exception
            java.lang.String r1 = "DefaultAuthTicketManager"
            java.lang.String r0 = "Failed to create store"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            r7 = 0
        L_0x002e:
            X.7HL r5 = new X.7HL
            r5.<init>(r6, r7, r8, r9, r10)
            X.6eY r7 = new X.6eY
            r7.<init>(r3)
            java.lang.Object r6 = r4.get()
            X.6ci r6 = (X.C104996ci) r6
            X.7kZ r4 = r11.A01
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 != 0) goto L_0x0054
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36313059429451025(0x81028900000511, double:3.027863231914085E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            r8 = 0
            if (r0 == 0) goto L_0x0055
        L_0x0054:
            r8 = 1
        L_0x0055:
            X.76O r3 = new X.76O
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369285b.get():java.lang.Object");
    }
}
