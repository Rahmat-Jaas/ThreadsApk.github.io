package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.78G  reason: invalid class name */
public final class AnonymousClass78G {
    public C143398ge A00;
    public AnonymousClass713 A01;
    public final HashMap A02 = AnonymousClass0wJ.A0y();
    public final Map A03 = AnonymousClass0wJ.A0y();
    public final Map A04 = AnonymousClass0wJ.A0y();
    public final Map A05 = AnonymousClass0wJ.A0y();
    public final Map A06 = AnonymousClass0wJ.A0y();

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ X.C142128du A00(X.C146608mW r12, X.C143408gf r13, X.C143418gg r14, X.AnonymousClass78G r15) {
        /*
            monitor-enter(r15)
            r4 = 0
            X.C04220Ms.A0B(r12, r4)     // Catch:{ all -> 0x0107 }
            boolean r9 = X.C18200wM.A1Z(r14)     // Catch:{ all -> 0x0107 }
            java.lang.String r6 = r12.AqJ()     // Catch:{ all -> 0x0107 }
            X.6gF r1 = r15.A01(r6)     // Catch:{ all -> 0x0107 }
            X.7IY r0 = X.AnonymousClass7IY.A00     // Catch:{ all -> 0x0107 }
            X.6gF r2 = r0.A04(r12, r1)     // Catch:{ all -> 0x0107 }
            java.util.Map r7 = r15.A04     // Catch:{ all -> 0x0107 }
            java.lang.Object r5 = r7.get(r6)     // Catch:{ all -> 0x0107 }
            X.8dt r5 = (X.C142118dt) r5     // Catch:{ all -> 0x0107 }
            X.8ge r3 = r15.A00     // Catch:{ all -> 0x0107 }
            r1 = 21
            kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4 r0 = new kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4     // Catch:{ all -> 0x0107 }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x0107 }
            X.8dt r5 = r3.C7H(r5, r0)     // Catch:{ all -> 0x0107 }
            X.C04220Ms.A0B(r6, r4)     // Catch:{ all -> 0x003a }
            java.util.Map r8 = r15.A05     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r8.get(r6)     // Catch:{ all -> 0x003a }
            X.6cA r3 = (X.C104666cA) r3     // Catch:{ all -> 0x003a }
            if (r3 != 0) goto L_0x0041
            goto L_0x003c
        L_0x003a:
            r0 = move-exception
            goto L_0x0056
        L_0x003c:
            X.6cA r3 = new X.6cA     // Catch:{ all -> 0x0107 }
            r3.<init>()     // Catch:{ all -> 0x0107 }
        L_0x0041:
            java.util.List r0 = r12.Ac8()     // Catch:{ all -> 0x0107 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0107 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0057
            r1.next()     // Catch:{ all -> 0x0107 }
            r0 = 0
            X.C04220Ms.A0B(r0, r4)     // Catch:{ all -> 0x0107 }
        L_0x0056:
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x0057:
            r8.put(r6, r3)     // Catch:{ all -> 0x003a }
            X.6gD r10 = new X.6gD     // Catch:{ all -> 0x0107 }
            r10.<init>(r3, r5)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = ""
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()     // Catch:{ all -> 0x0107 }
            r0.setText(r1)     // Catch:{ all -> 0x0107 }
            int r0 = r0.last()     // Catch:{ all -> 0x0107 }
            if (r0 > 0) goto L_0x0070
            java.lang.String r1 = "Sessionless"
        L_0x0070:
            java.lang.Object r5 = r13.AG3(r10, r2, r6, r1)     // Catch:{ all -> 0x0107 }
            X.8du r5 = (X.C142128du) r5     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = r12.Ayu()     // Catch:{ all -> 0x0107 }
            if (r3 == 0) goto L_0x0087
            java.util.HashMap r1 = r15.A02     // Catch:{ all -> 0x0107 }
            boolean r0 = r1.containsKey(r6)     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x0087
            r1.put(r6, r3)     // Catch:{ all -> 0x0107 }
        L_0x0087:
            java.lang.Object r3 = r10.A00     // Catch:{ all -> 0x0107 }
            X.8dt r3 = (X.C142118dt) r3     // Catch:{ all -> 0x0107 }
            X.78x r0 = r2.A01     // Catch:{ all -> 0x0107 }
            java.util.List r1 = r0.A06     // Catch:{ all -> 0x0107 }
            boolean r0 = X.C18190wL.A1a(r1)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00b0
            int r0 = X.C86144wL.A0C(r1, r9)     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0107 }
            X.6gE r0 = (X.C107136gE) r0     // Catch:{ all -> 0x0107 }
            long r0 = r0.A00     // Catch:{ all -> 0x0107 }
            r10 = -1
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x00b0
        L_0x00a7:
            java.util.HashMap r0 = r15.A02     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = X.C18240wQ.A0f(r6, r0)     // Catch:{ all -> 0x0107 }
            if (r1 != 0) goto L_0x00d4
            goto L_0x00c7
        L_0x00b0:
            boolean r0 = r12.AxB()     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x00c9
            java.lang.Integer r1 = r12.BDn()     // Catch:{ all -> 0x0107 }
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ all -> 0x0107 }
            if (r1 != r0) goto L_0x00c9
            X.78x r0 = r2.A00     // Catch:{ all -> 0x0107 }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x00c9
            goto L_0x00a7
        L_0x00c7:
            r1 = 0
            goto L_0x00d4
        L_0x00c9:
            java.util.Map r0 = r15.A06     // Catch:{ all -> 0x0107 }
            r0.put(r6, r2)     // Catch:{ all -> 0x0107 }
            if (r3 == 0) goto L_0x00f5
            r7.put(r6, r3)     // Catch:{ all -> 0x0107 }
            goto L_0x00f5
        L_0x00d4:
            r0 = 0
            r14.CUi(r5, r0, r1, r4)     // Catch:{ all -> 0x0107 }
            java.util.Map r3 = r15.A06     // Catch:{ all -> 0x0107 }
            X.78x r2 = X.AnonymousClass7IY.A00(r6)     // Catch:{ all -> 0x0107 }
            X.78x r1 = X.AnonymousClass7IY.A00(r6)     // Catch:{ all -> 0x0107 }
            X.6gF r0 = new X.6gF     // Catch:{ all -> 0x0107 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0107 }
            r3.put(r6, r0)     // Catch:{ all -> 0x0107 }
            r7.remove(r6)     // Catch:{ all -> 0x0107 }
            r8.remove(r6)     // Catch:{ all -> 0x0107 }
            java.util.Map r0 = r15.A03     // Catch:{ all -> 0x0107 }
            r0.remove(r6)     // Catch:{ all -> 0x0107 }
        L_0x00f5:
            java.util.HashMap r0 = r15.A02     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = X.C18240wQ.A0f(r6, r0)     // Catch:{ all -> 0x0107 }
            if (r1 != 0) goto L_0x00fe
            r1 = 0
        L_0x00fe:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0107 }
            r14.CUi(r5, r0, r1, r4)     // Catch:{ all -> 0x0107 }
            monitor-exit(r15)
            return r5
        L_0x0107:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78G.A00(X.8mW, X.8gf, X.8gg, X.78G):X.8du");
    }

    public final synchronized C107146gF A01(String str) {
        C107146gF r2;
        C04220Ms.A0B(str, 0);
        r2 = (C107146gF) this.A06.get(str);
        if (r2 == null) {
            r2 = new C107146gF(AnonymousClass7IY.A00(str), AnonymousClass7IY.A00(str));
        }
        return r2;
    }

    public AnonymousClass78G(C143398ge r2, AnonymousClass713 r3) {
        this.A01 = r3;
        this.A00 = r2;
    }
}
