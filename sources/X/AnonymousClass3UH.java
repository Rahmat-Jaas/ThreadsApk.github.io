package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3UH  reason: invalid class name */
public final class AnonymousClass3UH {
    public final AnonymousClass3TS A00 = new AnonymousClass3TS();

    public final Map A01(AnonymousClass3DQ r5, C81224nO r6, C57243Ah r7) {
        C04220Ms.A0B(r6, 0);
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (r7 != null) {
            for (C57233Ag r1 : r7.A02) {
                A0y.put(r1, Boolean.valueOf(this.A00.A01(r5, r6, r1).A02));
            }
            for (C57243Ah A01 : r7.A01) {
                A0y.putAll(A01(r5, r6, A01));
            }
        }
        return A0y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r2 == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r2 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r2 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        if (r1 == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b6, code lost:
        if (r1 != false) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x003a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass39T A00(X.AnonymousClass3DQ r8, X.AnonymousClass3UH r9, X.C81224nO r10, X.C57243Ah r11) {
        /*
            java.lang.Integer r6 = r11.A00
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r6 == r0) goto L_0x010d
            java.util.List r5 = r11.A02
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0016
            java.util.List r0 = r11.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x010d
        L_0x0016:
            java.util.Iterator r4 = r5.iterator()
        L_0x001a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r3 = r4.next()
            X.3Ag r3 = (X.C57233Ag) r3
            X.3TS r0 = r9.A00
            X.39T r0 = r0.A01(r8, r10, r3)
            boolean r2 = r0.A02
            java.lang.Integer r1 = X.AnonymousClass006.A00
            if (r6 != r1) goto L_0x004b
            if (r2 != 0) goto L_0x0059
        L_0x0034:
            java.lang.Integer r1 = X.AnonymousClass006.A01
        L_0x0036:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r1 == r0) goto L_0x001a
            int r2 = r1.intValue()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x00cf
            if (r2 == r1) goto L_0x005c
            java.lang.String r0 = "No boolean equivalent for UNSET"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x004b:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r6 != r0) goto L_0x0052
            if (r2 == 0) goto L_0x0059
            goto L_0x0036
        L_0x0052:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r6 != r0) goto L_0x0059
            if (r2 == 0) goto L_0x0059
            goto L_0x0034
        L_0x0059:
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            goto L_0x0036
        L_0x005c:
            if (r3 != 0) goto L_0x0064
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of()
            goto L_0x0105
        L_0x0064:
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r3)
            goto L_0x0105
        L_0x006a:
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.List r0 = r11.A01
            java.util.Iterator r7 = r0.iterator()
        L_0x0074:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r7.next()
            X.3Ah r0 = (X.C57243Ah) r0
            X.39T r3 = A00(r8, r9, r10, r0)
            java.lang.Integer r2 = X.AnonymousClass006.A01
            if (r6 != r2) goto L_0x008f
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x008f
            r4.add(r3)
        L_0x008f:
            boolean r1 = r3.A02
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r6 != r0) goto L_0x00ac
            if (r1 != 0) goto L_0x00b9
        L_0x0097:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r2 == r0) goto L_0x0074
            int r2 = r2.intValue()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x00cf
            if (r2 == r1) goto L_0x0103
            java.lang.String r0 = "No boolean equivalent for UNSET"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00ac:
            if (r6 != r2) goto L_0x00b2
            if (r1 == 0) goto L_0x00b9
            r2 = r0
            goto L_0x0097
        L_0x00b2:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r6 != r0) goto L_0x00b9
            if (r1 == 0) goto L_0x00b9
            goto L_0x0097
        L_0x00b9:
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            goto L_0x0097
        L_0x00bc:
            int r1 = r6.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x00d7
            r0 = 2
            if (r1 == r0) goto L_0x00cf
            r0 = 0
            if (r1 == r0) goto L_0x00cf
            X.2Aa r0 = new X.2Aa
            r0.<init>()
            throw r0
        L_0x00cf:
            r1 = 0
            r0 = 1
            X.39T r2 = new X.39T
            r2.<init>(r1, r1, r0)
            return r2
        L_0x00d7:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00fe
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            java.util.Iterator r1 = r4.iterator()
        L_0x00e5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r1.next()
            X.39T r0 = (X.AnonymousClass39T) r0
            com.google.common.collect.ImmutableList r0 = r0.A00
            if (r0 == 0) goto L_0x00e5
            r2.addAll((java.lang.Iterable) r0)
            goto L_0x00e5
        L_0x00f9:
            com.google.common.collect.ImmutableList r3 = X.C18250wR.A0F(r2)
            goto L_0x0105
        L_0x00fe:
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r5)
            goto L_0x0105
        L_0x0103:
            com.google.common.collect.ImmutableList r3 = r3.A00
        L_0x0105:
            r1 = 0
            r0 = 0
            X.39T r2 = new X.39T
            r2.<init>(r3, r1, r0)
            return r2
        L_0x010d:
            X.2Aa r0 = new X.2Aa
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UH.A00(X.3DQ, X.3UH, X.4nO, X.3Ah):X.39T");
    }
}
