package X;

import java.util.regex.Pattern;

/* renamed from: X.6ru  reason: invalid class name and case insensitive filesystem */
public abstract class C113646ru {
    public int A00 = 0;
    public int A01;
    public String A02;

    public void A00(String str) {
        if (this instanceof C92195hm) {
            return;
        }
        if (this instanceof C92185hl) {
            ((C92185hl) this).A00 = Pattern.compile(str);
        } else if (this instanceof C92175hk) {
            ((C92175hk) this).A00 = Integer.parseInt(str);
        } else if (this instanceof C92165hj) {
            ((C92165hj) this).A00 = Integer.parseInt(str);
        } else if (this instanceof C92155hi) {
            ((C92155hi) this).A00 = Integer.parseInt(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0118 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C92195hm
            if (r0 == 0) goto L_0x002c
            r1 = r8
            X.5hm r1 = (X.C92195hm) r1
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r3 = 0
            if (r0 != 0) goto L_0x0119
            com.facebook.phonenumbers.PhoneNumberUtil r1 = r1.A00     // Catch:{ 2Ah -> 0x001b }
            java.lang.String r0 = "US"
            X.4Np r0 = r1.A0A(r9, r0)     // Catch:{ 2Ah -> 0x001b }
            boolean r3 = r1.A0G(r0)     // Catch:{ 2Ah -> 0x001b }
            return r3
        L_0x001b:
            r0 = move-exception
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.String r1 = "NumberParseException was thrown: "
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            r2.println(r0)
            return r3
        L_0x002c:
            boolean r0 = r8 instanceof X.C92185hl
            if (r0 == 0) goto L_0x0044
            r1 = r8
            X.5hl r1 = (X.C92185hl) r1
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0042
            java.util.regex.Pattern r0 = r1.A00
            boolean r0 = X.C18240wQ.A1V(r9, r0)
            r3 = 1
            if (r0 != 0) goto L_0x0119
        L_0x0042:
            r3 = 0
            return r3
        L_0x0044:
            boolean r0 = r8 instanceof X.C92175hk
            if (r0 == 0) goto L_0x0057
            r0 = r8
            X.5hk r0 = (X.C92175hk) r0
            if (r9 == 0) goto L_0x0042
            int r1 = X.AnonymousClass2C6.A00(r9)
            int r0 = r0.A00
            r3 = 1
            if (r1 >= r0) goto L_0x0119
            goto L_0x0042
        L_0x0057:
            boolean r0 = r8 instanceof X.C92165hj
            if (r0 == 0) goto L_0x006a
            r0 = r8
            X.5hj r0 = (X.C92165hj) r0
            if (r9 == 0) goto L_0x0042
            int r1 = X.AnonymousClass2C6.A00(r9)
            int r0 = r0.A00
            r3 = 1
            if (r1 <= r0) goto L_0x0119
            goto L_0x0042
        L_0x006a:
            boolean r0 = r8 instanceof X.C92155hi
            if (r0 == 0) goto L_0x0081
            r2 = r8
            X.5hi r2 = (X.C92155hi) r2
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0042
            int r1 = X.AnonymousClass2C6.A00(r9)
            int r0 = r2.A00
            r3 = 1
            if (r1 == r0) goto L_0x0119
            goto L_0x0042
        L_0x0081:
            boolean r0 = r8 instanceof X.C92135hg
            if (r0 == 0) goto L_0x008c
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r3 = r0 ^ 1
            return r3
        L_0x008c:
            boolean r0 = r8 instanceof X.C92125hf
            if (r0 == 0) goto L_0x00e4
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r3 = 0
            if (r0 != 0) goto L_0x0119
            boolean r0 = android.text.TextUtils.isDigitsOnly(r9)
            if (r0 == 0) goto L_0x0119
            int r1 = r9.length()
            r0 = 4
            if (r1 != r0) goto L_0x0119
            r7 = 2
            java.lang.String r0 = r9.substring(r3, r7)
            int r6 = java.lang.Integer.parseInt(r0)
            r1 = 1
            if (r6 < r1) goto L_0x0119
            r0 = 12
            if (r6 > r0) goto L_0x0119
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            int r5 = r0.get(r1)
            java.lang.String r0 = r9.substring(r7)
            int r4 = java.lang.Integer.parseInt(r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            int r2 = r0.get(r1)
            int r0 = r2 / 100
            int r1 = r0 * 100
            int r1 = r1 + r4
            if (r1 >= r2) goto L_0x00d5
            int r1 = r1 + 100
        L_0x00d5:
            if (r1 != r5) goto L_0x0114
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            int r0 = r0.get(r7)
            int r0 = r0 + 1
            if (r6 >= r0) goto L_0x0114
            return r3
        L_0x00e4:
            boolean r0 = r8 instanceof X.C92115he
            if (r0 == 0) goto L_0x00f7
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0042
            X.69W r0 = X.AnonymousClass69W.A00(r9)
            boolean r3 = X.C99236Iq.A00(r0, r9)
            return r3
        L_0x00f7:
            r0 = r8
            X.5hh r0 = (X.C92145hh) r0
            com.google.common.collect.ImmutableList r2 = r0.A00
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r3 = 0
            if (r0 != 0) goto L_0x0119
            X.69W r1 = X.AnonymousClass69W.A00(r9)
            if (r2 == 0) goto L_0x0118
            X.69W r0 = X.AnonymousClass69W.UNKNOWN
            if (r1 == r0) goto L_0x0118
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L_0x0118
            return r3
        L_0x0114:
            int r0 = r5 + 20
            if (r1 > r0) goto L_0x0119
        L_0x0118:
            r3 = 1
        L_0x0119:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113646ru.A01(java.lang.String):boolean");
    }
}
