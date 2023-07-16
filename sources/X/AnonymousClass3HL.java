package X;

import java.util.List;

/* renamed from: X.3HL  reason: invalid class name */
public final class AnonymousClass3HL {
    public String A00;
    public String A01;
    public List A02;
    public List A03;

    public final String A00(int i) {
        List list = this.A02;
        if (list == null || list.size() <= i) {
            return "";
        }
        return ((AnonymousClass380) this.A02.get(i)).A01;
    }

    public final String A01(int i) {
        List list = this.A03;
        if (list == null || list.size() <= i) {
            return "";
        }
        return ((AnonymousClass380) this.A03.get(i)).A01;
    }
}
