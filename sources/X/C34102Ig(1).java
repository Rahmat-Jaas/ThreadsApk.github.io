package X;

import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

/* renamed from: X.2Ig  reason: invalid class name and case insensitive filesystem */
public final class C34102Ig {
    public static final Object A00(AnonymousClass601 r5, C63893iY r6) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r6, r5);
        Object A0B = C63893iY.A0B(r6, 0);
        A0B.getClass();
        C18240wQ.A1I(A0B);
        int A04 = AnonymousClass0wJ.A04(C63893iY.A0A(r6, A1Z ? 1 : 0));
        boolean A01 = AnonymousClass3WF.A01(r6, 2);
        Fragment A012 = C63913ic.A01(r5);
        if (!(A012 instanceof AnonymousClass1c8)) {
            return null;
        }
        if ("start".equals(A0B)) {
            AnonymousClass1c8 r52 = (AnonymousClass1c8) A012;
            IgBloksScreenConfig igBloksScreenConfig = r52.A0A;
            HashMap hashMap = igBloksScreenConfig.A0T;
            if (hashMap == null) {
                hashMap = AnonymousClass0wJ.A0y();
                igBloksScreenConfig.A0T = hashMap;
            }
            hashMap.put(Integer.valueOf(A04), Boolean.valueOf(A01));
            E2V.A03(r52.A03).AJa(A04, A01);
            return null;
        } else if (!"end".equals(A0B)) {
            return null;
        } else {
            AnonymousClass1c8 r53 = (AnonymousClass1c8) A012;
            IgBloksScreenConfig igBloksScreenConfig2 = r53.A0A;
            HashMap hashMap2 = igBloksScreenConfig2.A0U;
            if (hashMap2 == null) {
                hashMap2 = AnonymousClass0wJ.A0y();
                igBloksScreenConfig2.A0U = hashMap2;
            }
            hashMap2.put(Integer.valueOf(A04), Boolean.valueOf(A01));
            E2V.A03(r53.A03).AJh(A04, A01);
            return null;
        }
    }
}
