package X;

import java.util.HashSet;
import java.util.Map;

/* renamed from: X.0iA  reason: invalid class name and case insensitive filesystem */
public final class C10330iA implements C08760eF {
    public final /* synthetic */ C10320i9 A00;

    public final synchronized void CVM() {
        C10320i9 r4 = this.A00;
        Map map = r4.A04;
        HashSet hashSet = new HashSet(map.size());
        for (C08890eT r1 : map.values()) {
            hashSet.add(new C08890eT(r1));
        }
        r4.A01.AKp(new C10350iC(this, hashSet));
    }

    public C10330iA(C10320i9 r1) {
        this.A00 = r1;
    }
}
