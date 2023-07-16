package X;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.3mW  reason: invalid class name and case insensitive filesystem */
public final class C64543mW implements TextWatcher {
    public static final C62143Xh A04 = new C62143Xh();
    public final AnonymousClass3BA A00;
    public final C62143Xh A01;
    public final C11660kZ A02;
    public final String A03;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static C64543mW A00(C10300i6 r2) {
        return (C64543mW) C18180wK.A0c(r2, C64543mW.class, 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C64543mW r11, java.lang.Integer r12, long r13) {
        /*
            java.lang.Integer r7 = X.AnonymousClass006.A00
            if (r12 != r7) goto L_0x00b3
            X.3BA r0 = r11.A00
            r0.A03 = r13
        L_0x0008:
            X.3Xh r3 = r11.A01
            X.0kZ r4 = r11.A02
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r12 != r0) goto L_0x00a9
            java.lang.String r5 = "background"
        L_0x0012:
            X.4WE r0 = X.AnonymousClass4WE.A00()
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "app_state"
            X.0rn r2 = X.C15730rn.A01(r0, r1)
            java.lang.String r0 = "state"
            r2.A0D(r0, r5)
            X.JlQ r0 = X.C103066Xr.A00
            X.Je6 r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.A0D(r0, r1)
            r4.Cd7(r2)
        L_0x0031:
            int r5 = r12.intValue()
            r7 = 1
            r1 = 1000(0x3e8, double:4.94E-321)
            if (r5 == r7) goto L_0x0051
            r0 = 3
            if (r5 == r0) goto L_0x0047
            r0 = 2
            if (r5 == r0) goto L_0x0047
            r0 = 0
            if (r5 == r0) goto L_0x0047
            r0 = 5
            if (r5 == r0) goto L_0x0047
        L_0x0046:
            return
        L_0x0047:
            int[] r0 = r3.A06
            if (r0 == 0) goto L_0x0046
            long r13 = r13 / r1
            X.0rn r5 = X.C62143Xh.A00(r3, r12, r13)
            goto L_0x00a3
        L_0x0051:
            long r13 = r13 / r1
            long r1 = r3.A04
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0046
            long r5 = r3.A03
            long r1 = r13 - r5
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0082
            r5 = 64
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0082
            r5 = 0
        L_0x0069:
            int[] r6 = r3.A06
            if (r6 != 0) goto L_0x0090
            r3.A04 = r13
            r3.A03 = r13
            int r6 = r3.A00
            int[] r2 = new int[r6]
            r3.A06 = r2
            r1 = 0
            r2[r1] = r7
            r0 = 1
        L_0x007b:
            if (r0 >= r6) goto L_0x0089
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x007b
        L_0x0082:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.0rn r5 = X.C62143Xh.A00(r3, r0, r13)
            goto L_0x0069
        L_0x0089:
            int r0 = r3.A02
            int r0 = r0 + 1
            r3.A02 = r0
            goto L_0x009d
        L_0x0090:
            int r0 = (int) r1
            int r2 = r0 >> 5
            r1 = r6[r2]
            r0 = r0 & 31
            int r7 = r7 << r0
            r7 = r7 | r1
            r6[r2] = r7
            r3.A04 = r13
        L_0x009d:
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
        L_0x00a3:
            if (r5 == 0) goto L_0x0046
            r4.Cd7(r5)
            return
        L_0x00a9:
            if (r12 != r7) goto L_0x0031
            r0 = 888(0x378, float:1.244E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            goto L_0x0012
        L_0x00b3:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r12 != r0) goto L_0x0008
            X.3BA r6 = r11.A00
            java.lang.String r0 = r11.A03
            r8 = 1000(0x3e8, double:4.94E-321)
            long r4 = r13 / r8
            long r2 = r6.A00
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0008
            long r2 = r2 * r8
            r6.A00 = r4
            X.32i r8 = r6.A01
            X.32h r9 = r8.A00
            if (r9 != 0) goto L_0x00ea
            r9 = 2003(0x7d3, double:9.896E-321)
            if (r0 == 0) goto L_0x0129
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            byte[] r0 = r0.getBytes()
            r1.update(r0)
            long r0 = r1.getValue()
            long r0 = r0 % r9
        L_0x00e3:
            X.32h r9 = new X.32h
            r9.<init>(r0)
            r8.A00 = r9
        L_0x00ea:
            long r0 = r9.A00
            r9 = -1
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0008
            r8 = 2003(0x7d3, double:9.896E-321)
            long r4 = r4 % r8
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0008
            X.4WE r0 = X.AnonymousClass4WE.A00()
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "immediate_active_seconds"
            X.0rn r4 = X.C15730rn.A01(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            java.lang.String r0 = "activity_time"
            r4.A0C(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "last_activity_time"
            r4.A0C(r0, r1)
            long r0 = r6.A03
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "last_foreground_time"
            r4.A0C(r0, r1)
            X.0kZ r0 = r11.A02
            r0.Ce1(r4)
            goto L_0x0008
        L_0x0129:
            r0 = -1
            goto L_0x00e3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64543mW.A01(X.3mW, java.lang.Integer, long):void");
    }

    public final void A02() {
        A01(this, AnonymousClass006.A0j, System.currentTimeMillis());
        this.A00.A01.A00 = null;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        A01(this, AnonymousClass006.A01, System.currentTimeMillis());
    }

    public C64543mW(AnonymousClass3BA r1, C62143Xh r2, C11660kZ r3, String str) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = str;
    }
}
