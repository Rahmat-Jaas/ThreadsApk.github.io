package X;

import java.util.List;

/* renamed from: X.3VO  reason: invalid class name */
public final class AnonymousClass3VO {
    public final List A00 = AnonymousClass0wJ.A0v();

    public static AnonymousClass3VO A00() {
        return new AnonymousClass3VO();
    }

    public final C63893iY A01() {
        return new C63893iY(this.A00);
    }

    public final void A02(Object obj, int i) {
        List list = this.A00;
        if (list.size() <= i) {
            list.add(i, obj);
            return;
        }
        throw C18190wL.A0a("Arguments must be continuous");
    }

    public final void A03(Object obj, int i) {
        List list = this.A00;
        if (list.size() <= i) {
            list.add(i, obj);
            return;
        }
        throw C18190wL.A0a("Arguments must be continuous");
    }
}
