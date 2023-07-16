package X;

/* renamed from: X.3Dl  reason: invalid class name and case insensitive filesystem */
public final class C58013Dl {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment A00(android.os.Parcelable r12, X.C10300i6 r13, X.C306222g r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17) {
        /*
            r11 = this;
            android.os.Bundle r2 = X.C18180wK.A06()
            X.C18180wK.A0w(r2, r13)
            java.lang.String r0 = "argument_content"
            r2.putParcelable(r0, r12)
            int r0 = r15.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x013c
            java.lang.String r0 = "REG_FLOW"
        L_0x0016:
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r0 = "argument_flow"
            r2.putString(r0, r1)
            java.lang.String r0 = "argument_entry_point"
            r2.putSerializable(r0, r14)
            java.lang.String r0 = "argument_selected_age_account_id"
            r1 = r16
            r2.putSerializable(r0, r1)
            java.lang.String r0 = "argument_selected_age_account_type"
            r1 = r17
            r2.putSerializable(r0, r1)
            X.22f r4 = X.AnonymousClass22f.NO_SPLIT
            X.3T4 r5 = new X.3T4
            r5.<init>()
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r15 != r0) goto L_0x00d8
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 18304927277388901(0x41083c00021465, double:1.894891313486875E-307)
            boolean r6 = X.C63173fJ.A05(r3, r0)
            r0 = 18304927277454438(0x41083c00031466, double:1.894891313512779E-307)
            boolean r7 = X.C63173fJ.A05(r3, r0)
            r0 = 18304927277257827(0x41083c00001463, double:1.894891313435068E-307)
            boolean r8 = X.C63173fJ.A05(r3, r0)
            r0 = 18304927277323364(0x41083c00011464, double:1.8948913134609715E-307)
            boolean r9 = X.C63173fJ.A05(r3, r0)
            r0 = 18304927277519975(0x41083c00041467, double:1.8948913135386825E-307)
        L_0x0068:
            boolean r10 = X.C63173fJ.A05(r3, r0)
        L_0x006c:
            X.3T4 r5 = new X.3T4
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0071:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x00c3
            X.22f r4 = X.AnonymousClass22f.MULTI_SPLIT_TWO_BUTTON
        L_0x0077:
            java.lang.String r0 = "argument_disclosure_version"
            r2.putSerializable(r0, r4)
            boolean r3 = r5.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "argument_force_disclosure_reading"
            r2.putSerializable(r0, r1)
            int r1 = r4.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x00b5
            r0 = 3
            if (r1 == r0) goto L_0x00af
            r0 = 4
            if (r1 == r0) goto L_0x00a9
            r0 = 1
            if (r1 == r0) goto L_0x00a3
            r0 = 2
            if (r1 != r0) goto L_0x00bd
            X.1sO r0 = new X.1sO
            r0.<init>()
        L_0x009f:
            r0.setArguments(r2)
            return r0
        L_0x00a3:
            X.1sP r0 = new X.1sP
            r0.<init>()
            goto L_0x009f
        L_0x00a9:
            X.1sN r0 = new X.1sN
            r0.<init>()
            goto L_0x009f
        L_0x00af:
            X.1sS r0 = new X.1sS
            r0.<init>()
            goto L_0x009f
        L_0x00b5:
            if (r3 == 0) goto L_0x00bd
            X.1sT r0 = new X.1sT
            r0.<init>()
            goto L_0x009f
        L_0x00bd:
            X.1bw r0 = new X.1bw
            r0.<init>()
            goto L_0x009f
        L_0x00c3:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x00ca
            X.22f r4 = X.AnonymousClass22f.MULTI_SPLIT_SINGLE_BUTTON
            goto L_0x0077
        L_0x00ca:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x00d1
            X.22f r4 = X.AnonymousClass22f.NO_SPLIT_NON_STICKY_FOOTER
            goto L_0x0077
        L_0x00d1:
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0077
            X.22f r4 = X.AnonymousClass22f.NO_SPLIT_HINT_TEXT
            goto L_0x0077
        L_0x00d8:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r15 != r0) goto L_0x0071
            X.22g r0 = X.C306222g.IG_SAC_SIGN_UP
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            if (r14 != r0) goto L_0x010d
            r0 = 18305335299216734(0x41089b0001155e, double:1.8950525851411837E-307)
            boolean r6 = X.C63173fJ.A05(r3, r0)
            r0 = 18305335299282271(0x41089b0002155f, double:1.8950525851670873E-307)
            boolean r7 = X.C63173fJ.A05(r3, r0)
            r0 = 18305335299151197(0x41089b0000155d, double:1.89505258511528E-307)
            boolean r8 = X.C63173fJ.A05(r3, r0)
            r0 = 18305335299347808(0x41089b00031560, double:1.895052585192991E-307)
            boolean r9 = X.C63173fJ.A05(r3, r0)
            r0 = 18305335299413345(0x41089b00041561, double:1.8950525852188947E-307)
            goto L_0x0068
        L_0x010d:
            r0 = 36319330081772649(0x81083d00011469, double:3.03182881769217E-306)
            boolean r6 = X.C63803iN.A0E(r3, r13, r0)
            r0 = 36319330081838186(0x81083d0002146a, double:3.031828817733616E-306)
            boolean r7 = X.C63803iN.A0E(r3, r13, r0)
            r0 = 36319330081707112(0x81083d00001468, double:3.031828817650724E-306)
            boolean r8 = X.C63803iN.A0E(r3, r13, r0)
            r0 = 36319330081903723(0x81083d0003146b, double:3.031828817775062E-306)
            boolean r9 = X.C63803iN.A0E(r3, r13, r0)
            r0 = 36319330081969260(0x81083d0004146c, double:3.0318288178165076E-306)
            boolean r10 = X.C63803iN.A0E(r3, r13, r0)
            goto L_0x006c
        L_0x013c:
            java.lang.String r0 = "NUX_FLOW"
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58013Dl.A00(android.os.Parcelable, X.0i6, X.22g, java.lang.Integer, java.lang.String, java.lang.String):androidx.fragment.app.Fragment");
    }
}
