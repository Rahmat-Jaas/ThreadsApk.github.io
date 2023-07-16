package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6qZ  reason: invalid class name and case insensitive filesystem */
public final class C113016qZ {
    public final long A00;
    public final C25515Dn3 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public C113016qZ(C25515Dn3 dn3, String str, String str2, String str3, List list, long j, boolean z) {
        C04220Ms.A0B(list, 3);
        this.A02 = str;
        this.A01 = dn3;
        this.A05 = list;
        this.A00 = j;
        this.A03 = str2;
        this.A04 = str3;
        this.A06 = z;
    }

    public final List A00() {
        String str = this.A02;
        List A0n = C18180wK.A0n(str);
        List list = this.A05;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : list) {
            if (!C04220Ms.A0I(next, str)) {
                A0v.add(next);
            }
        }
        return AnonymousClass00J.A0V(A0v, A0n);
    }
}
