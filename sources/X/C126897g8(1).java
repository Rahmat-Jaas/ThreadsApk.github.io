package X;

import java.util.List;

/* renamed from: X.7g8  reason: invalid class name and case insensitive filesystem */
public final class C126897g8 implements C142128du {
    public final AnonymousClass8rP A00;
    public final String A01;
    public final List A02;
    public final String A03;

    public C126897g8(AnonymousClass8rP r1, String str, String str2, List list) {
        this.A03 = str;
        this.A01 = str2;
        this.A00 = r1;
        this.A02 = list;
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A01);
        A0r.append(" ");
        A0r.append(this.A03);
        A0r.append(" ");
        for (Object obj : this.A02) {
            A0r.append(obj.toString());
            A0r.append(" ");
        }
        return C18190wL.A0n(A0r);
    }
}
