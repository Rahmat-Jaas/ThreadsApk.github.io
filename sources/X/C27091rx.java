package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1rx  reason: invalid class name and case insensitive filesystem */
public final class C27091rx extends AnonymousClass3GM {
    public final C684944a A00;
    public final AnonymousClass25R A01;
    public final boolean A02;

    public static final Map A00(AnonymousClass17J r5) {
        List list = r5.A04;
        if (list == null) {
            return null;
        }
        ArrayList<AnonymousClass17J> A0v = AnonymousClass0wJ.A0v();
        for (Object next : list) {
            AnonymousClass17J r0 = (AnonymousClass17J) next;
            if (r0.A01 + r0.A00 > 0) {
                A0v.add(next);
            }
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
        for (AnonymousClass17J r3 : A0v) {
            A0w.add(C18180wK.A0p(r3.A03.toString(), String.valueOf(r3.A01 + r3.A00)));
        }
        LinkedHashMap A0y = C18220wO.A0y();
        AnonymousClass4WJ.A0J(A0w, A0y);
        return A0y;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C27091rx(X.C684944a r17, X.AnonymousClass25P r18, X.AnonymousClass25P r19, X.AnonymousClass25P r20, X.AnonymousClass25P r21, X.AnonymousClass25R r22, X.C83654rl r23, X.AnonymousClass3II r24, X.AnonymousClass38V r25, X.AnonymousClass0ZU r26, X.C83224qz r27, int r28, int r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r16 = this;
            r0 = r24
            r6 = r23
            X.4tk r10 = r0.A00(r6)
            r11 = r28
            r9 = r27
            r8 = r26
            r7 = r25
            r15 = r33
            r4 = r20
            r3 = r19
            r14 = r31
            r2 = r18
            r13 = r30
            r12 = r29
            r1 = r16
            r5 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r32
            r1.A02 = r0
            r0 = r22
            r1.A01 = r0
            r0 = r17
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27091rx.<init>(X.44a, X.25P, X.25P, X.25P, X.25P, X.25R, X.4rl, X.3II, X.38V, X.0ZU, X.4qz, int, int, boolean, boolean, boolean, boolean):void");
    }
}
