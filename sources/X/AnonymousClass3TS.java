package X;

import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.3TS  reason: invalid class name */
public final class AnonymousClass3TS {
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x03dc, code lost:
        if (r15.CW4(new X.C58743Gz(r3.A01, X.AnonymousClass1j3.A02(r23))) != false) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x03e7, code lost:
        return new X.AnonymousClass39T(com.google.common.collect.ImmutableList.of(r6), (X.C57243Ah) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x03ed, code lost:
        return new X.AnonymousClass39T((com.google.common.collect.ImmutableList) null, (X.C57243Ah) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x03ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x03ef, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        r0 = X.C18250wR.A0V(X.AnonymousClass00U.A0L("Failed to create filter of type ", r8.A00.name()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass39T A01(X.AnonymousClass3DQ r22, X.C81224nO r23, X.C57233Ag r24) {
        /*
            r21 = this;
            r4 = 0
            r5 = 1
            r10 = 2
            r6 = r24
            X.C04220Ms.A0B(r6, r10)
            X.3HP r8 = r6.A00
            com.instagram.quickpromotion.model.FilterType r0 = r8.A00
            X.C04220Ms.A06(r0)
            r0 = r22
            X.3Bg r3 = r0.A06
            android.content.Context r2 = r3.A00     // Catch:{ 2Ac -> 0x03f0 }
            com.instagram.service.session.UserSession r7 = r3.A03     // Catch:{ 2Ac -> 0x03f0 }
            X.3UU r1 = r3.A02     // Catch:{ 2Ac -> 0x03f0 }
            com.instagram.quickpromotion.model.FilterType r9 = r8.A00     // Catch:{ 2Ac -> 0x03f0 }
            int r0 = r9.ordinal()     // Catch:{ 2Ac -> 0x03f0 }
            switch(r0) {
                case 0: goto L_0x0050;
                case 1: goto L_0x035b;
                case 2: goto L_0x0061;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00ea;
                case 5: goto L_0x034f;
                case 6: goto L_0x0103;
                case 7: goto L_0x033b;
                case 8: goto L_0x011c;
                case 9: goto L_0x0342;
                case 10: goto L_0x0135;
                case 11: goto L_0x014a;
                case 12: goto L_0x015f;
                case 13: goto L_0x0174;
                case 14: goto L_0x0189;
                case 15: goto L_0x0022;
                case 16: goto L_0x01d0;
                case 17: goto L_0x01df;
                case 18: goto L_0x01eb;
                case 19: goto L_0x01a2;
                case 20: goto L_0x01b7;
                case 21: goto L_0x0224;
                case 22: goto L_0x023d;
                case 23: goto L_0x0022;
                case 24: goto L_0x01fc;
                case 25: goto L_0x0256;
                case 26: goto L_0x037f;
                case 27: goto L_0x0385;
                case 28: goto L_0x020f;
                case 29: goto L_0x026f;
                case 30: goto L_0x027b;
                case 31: goto L_0x02b8;
                case 32: goto L_0x02b8;
                case 33: goto L_0x02a3;
                case 34: goto L_0x02b8;
                case 35: goto L_0x028e;
                case 36: goto L_0x02b8;
                case 37: goto L_0x02b8;
                case 38: goto L_0x02b8;
                case 39: goto L_0x038b;
                case 40: goto L_0x0391;
                case 41: goto L_0x02cc;
                case 42: goto L_0x02e5;
                case 43: goto L_0x0355;
                case 44: goto L_0x0361;
                case 45: goto L_0x0367;
                case 46: goto L_0x0397;
                case 47: goto L_0x0349;
                case 48: goto L_0x02fe;
                case 49: goto L_0x036d;
                case 50: goto L_0x0373;
                case 51: goto L_0x0379;
                case 52: goto L_0x0033;
                case 53: goto L_0x02b8;
                case 54: goto L_0x0311;
                default: goto L_0x0022;
            }     // Catch:{ 2Ac -> 0x03f0 }
        L_0x0022:
            java.lang.String r1 = "Failed to create filter of type "
            com.instagram.quickpromotion.model.FilterType r0 = r8.A00     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.String r0 = r0.name()     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ 2Ac -> 0x03f0 }
        L_0x0032:
            throw r0     // Catch:{ 2Ac -> 0x03f0 }
        L_0x0033:
            java.lang.String r0 = "first"
            X.3Fu r7 = r8.A00(r0)     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.String r0 = "second"
            X.3Fu r1 = r8.A00(r0)     // Catch:{ 2Ac -> 0x03f0 }
            r2 = 0
            if (r7 == 0) goto L_0x0045
            java.lang.Integer r0 = r7.A01     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x0046
        L_0x0045:
            r0 = r2
        L_0x0046:
            if (r1 == 0) goto L_0x004a
            java.lang.Integer r2 = r1.A01     // Catch:{ 2Ac -> 0x03f0 }
        L_0x004a:
            if (r0 == 0) goto L_0x0022
            if (r2 == 0) goto L_0x0022
            goto L_0x039d
        L_0x0050:
            X.3Fu r0 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.Integer r0 = r0.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            int r0 = r0.intValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4G0 r15 = new X.4G0     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0061:
            X.3Fu r12 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.String r0 = "event"
            X.3Fu r13 = r8.A00(r0)     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.String r0 = "event_count"
            X.3Fu r10 = r8.A00(r0)     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.String r0 = "metric"
            X.3Fu r11 = r8.A00(r0)     // Catch:{ 2Ac -> 0x03f0 }
            r15 = 0
            if (r12 == 0) goto L_0x0022
            if (r13 == 0) goto L_0x0022
            if (r10 == 0) goto L_0x0022
            if (r11 == 0) goto L_0x0022
            X.235[] r7 = X.AnonymousClass235.values()     // Catch:{ 2Ac -> 0x03f0 }
            int r2 = r7.length     // Catch:{ 2Ac -> 0x03f0 }
            r9 = 0
            r1 = 0
        L_0x0085:
            if (r1 >= r2) goto L_0x0098
            r16 = r7[r1]     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.String r14 = r16.name()     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.String r0 = r13.A03     // Catch:{ 2Ac -> 0x03f0 }
            boolean r0 = r14.equalsIgnoreCase(r0)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 != 0) goto L_0x009a
            int r1 = r1 + 1
            goto L_0x0085
        L_0x0098:
            r16 = r15
        L_0x009a:
            X.Lbw[] r7 = X.C40293Lbw.values()     // Catch:{ 2Ac -> 0x03f0 }
            int r2 = r7.length     // Catch:{ 2Ac -> 0x03f0 }
        L_0x009f:
            if (r9 >= r2) goto L_0x00b2
            r17 = r7[r9]     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.String r1 = r17.name()     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.String r0 = r11.A03     // Catch:{ 2Ac -> 0x03f0 }
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 != 0) goto L_0x00b4
            int r9 = r9 + 1
            goto L_0x009f
        L_0x00b2:
            r17 = r15
        L_0x00b4:
            java.lang.String r1 = r12.A03     // Catch:{ 2Ac -> 0x03f0 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 != 0) goto L_0x0022
            if (r16 == 0) goto L_0x0022
            if (r17 == 0) goto L_0x0022
            java.lang.Integer r0 = r10.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            long r19 = r0.longValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GW r15 = new X.4GW     // Catch:{ 2Ac -> 0x03f0 }
            r18 = r1
            r15.<init>(r16, r17, r18, r19)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x00d1:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GP r15 = new X.4GP     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r2, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x00ea:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GS r15 = new X.4GS     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r2, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0103:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GN r15 = new X.4GN     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x011c:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GF r15 = new X.4GF     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r2, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0135:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            X.4Fo r15 = new X.4Fo     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r2)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x014a:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            X.4G5 r15 = new X.4G5     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r2)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x015f:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            X.4G6 r15 = new X.4G6     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r2)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0174:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            X.4G1 r15 = new X.4G1     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0189:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GR r15 = new X.4GR     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r2, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x01a2:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r1.A03     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            X.4GG r15 = new X.4GG     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x01b7:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GO r15 = new X.4GO     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r2, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x01d0:
            X.3Fu r0 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Integer r0 = r0.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            X.4GK r15 = new X.4GK     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x01df:
            X.3Fu r0 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Integer r0 = r0.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            if (r1 == 0) goto L_0x0022
            goto L_0x03b3
        L_0x01eb:
            X.3Fu r0 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Integer r1 = r0.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            X.0gi r0 = X.C09820gj.A00     // Catch:{ 2Ac -> 0x03f0 }
            X.4GV r15 = new X.4GV     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r0, r7, r1)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x01fc:
            X.3Fu r0 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r0.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GI r15 = new X.4GI     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x020f:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            X.4G7 r15 = new X.4G7     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r2)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0224:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Integer r0 = r1.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            int r0 = r0.intValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4Fq r15 = new X.4Fq     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x023d:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Integer r0 = r1.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            int r0 = r0.intValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4Fr r15 = new X.4Fr     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0256:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GT r15 = new X.4GT     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7, r2, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x026f:
            X.3Fu r0 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r0.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            if (r1 == 0) goto L_0x0022
            goto L_0x03b9
        L_0x027b:
            X.3Fu r0 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r0.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GA r15 = new X.4GA     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x028e:
            X.3Fu r0 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0022
            java.lang.Integer r0 = r0.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            int r0 = r0.intValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GE r15 = new X.4GE     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r1, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x02a3:
            X.3Fu r0 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0022
            java.lang.Integer r0 = r0.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            int r0 = r0.intValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GC r15 = new X.4GC     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r1, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x02b8:
            X.3Fu r7 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.String r2 = r9.toString()     // Catch:{ 2Ac -> 0x03f0 }
            X.C04220Ms.A0B(r2, r10)     // Catch:{ 2Ac -> 0x03f0 }
            r0 = 0
            if (r7 == 0) goto L_0x02c6
            java.lang.Boolean r0 = r7.A00     // Catch:{ 2Ac -> 0x03f0 }
        L_0x02c6:
            if (r1 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0022
            goto L_0x03c3
        L_0x02cc:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4G9 r15 = new X.4G9     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x02e5:
            X.3Fu r1 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = A00(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Boolean r0 = r1.A00     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.booleanValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4G8 r15 = new X.4G8     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x02fe:
            X.3Fu r0 = r8.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            java.lang.Integer r0 = r0.A01     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
            int r0 = r0.intValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GQ r15 = new X.4GQ     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0311:
            java.lang.String r1 = r8.A02     // Catch:{ 2Ac -> 0x03f0 }
            if (r1 == 0) goto L_0x0022
            java.lang.String r0 = "ERROR"
            boolean r0 = r0.equals(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 != 0) goto L_0x0334
            java.lang.String r0 = "PASS"
            boolean r0 = r0.equals(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 != 0) goto L_0x032d
            java.lang.String r0 = "FAIL"
            boolean r0 = r0.equals(r1)     // Catch:{ 2Ac -> 0x03f0 }
            if (r0 == 0) goto L_0x0022
        L_0x032d:
            X.4G4 r15 = new X.4G4     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r1)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0334:
            X.2Ac r0 = new X.2Ac     // Catch:{ 2Ac -> 0x03f0 }
            r0.<init>()     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x0032
        L_0x033b:
            X.4Fy r15 = new X.4Fy     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0342:
            X.4Ft r15 = new X.4Ft     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0349:
            X.4G3 r15 = new X.4G3     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x034f:
            X.4Fx r15 = new X.4Fx     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0355:
            X.4Fp r15 = new X.4Fp     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x035b:
            X.4GX r15 = new X.4GX     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0361:
            X.4G2 r15 = new X.4G2     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0367:
            X.4Fz r15 = new X.4Fz     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x036d:
            X.4GH r15 = new X.4GH     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7, r2)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0373:
            X.4Fu r15 = new X.4Fu     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0379:
            X.4Fv r15 = new X.4Fv     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x037f:
            X.4GY r15 = new X.4GY     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r2, r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0385:
            X.4GM r15 = new X.4GM     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r2, r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x038b:
            X.4Fs r15 = new X.4Fs     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0391:
            X.4GB r15 = new X.4GB     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x0397:
            X.4Fw r15 = new X.4Fw     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r7)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x039d:
            int r0 = r0.intValue()     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.Long r1 = X.C18230wP.A0f(r0)     // Catch:{ 2Ac -> 0x03f0 }
            int r0 = r2.intValue()     // Catch:{ 2Ac -> 0x03f0 }
            java.lang.Long r0 = X.C18230wP.A0f(r0)     // Catch:{ 2Ac -> 0x03f0 }
            X.4GL r15 = new X.4GL     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r1, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x03b3:
            X.4GJ r15 = new X.4GJ     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r1, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x03b9:
            boolean r0 = r0.booleanValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GD r15 = new X.4GD     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r1, r0)     // Catch:{ 2Ac -> 0x03f0 }
            goto L_0x03cc
        L_0x03c3:
            boolean r0 = r0.booleanValue()     // Catch:{ 2Ac -> 0x03f0 }
            X.4GU r15 = new X.4GU     // Catch:{ 2Ac -> 0x03f0 }
            r15.<init>(r1, r2, r0)     // Catch:{ 2Ac -> 0x03f0 }
        L_0x03cc:
            X.3YD r3 = r3.A01
            r2 = 0
            java.lang.String r1 = X.AnonymousClass1j3.A02(r23)     // Catch:{ Exception -> 0x03ee }
            X.3Gz r0 = new X.3Gz     // Catch:{ Exception -> 0x03ee }
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x03ee }
            boolean r0 = r15.CW4(r0)     // Catch:{ Exception -> 0x03ee }
            if (r0 != 0) goto L_0x03e8
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r6)
            X.39T r0 = new X.39T
            r0.<init>(r1, r2, r4)
            return r0
        L_0x03e8:
            X.39T r0 = new X.39T
            r0.<init>(r2, r2, r5)
            return r0
        L_0x03ee:
            r0 = move-exception
            throw r0
        L_0x03f0:
            r2 = move-exception
            java.lang.String r1 = "Failed to create filter handler"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TS.A01(X.3DQ, X.4nO, X.3Ag):X.39T");
    }

    public static boolean A00(C58473Fu r1) {
        return IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(r1.A02);
    }
}
