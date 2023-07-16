package X;

import java.util.HashSet;

/* renamed from: X.04Z  reason: invalid class name */
public class AnonymousClass04Z {
    public final C13370nZ A00;
    public final C113806sA A01;

    public final void A02() {
        C13370nZ r2 = this.A00;
        C113806sA r0 = this.A01;
        HashSet hashSet = r2.A05;
        if (hashSet.remove(r0) && hashSet.isEmpty()) {
            r2.A01();
        }
    }

    public final boolean A03() {
        C13370nZ r1 = this.A00;
        Integer A012 = C011505i.A01(r1.A04.mView);
        Integer num = r1.A00;
        if (A012 == num) {
            return true;
        }
        Integer num2 = AnonymousClass006.A01;
        if (A012 == num2 || num == num2) {
            return false;
        }
        return true;
    }

    public AnonymousClass04Z(C113806sA r1, C13370nZ r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public final C113806sA A01() {
        return this.A01;
    }
}
