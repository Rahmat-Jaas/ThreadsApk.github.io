package X;

/* renamed from: X.7lI  reason: invalid class name and case insensitive filesystem */
public class C129107lI implements C146788mr {
    public static final C129107lI A02 = new C129107lI((String) null, C18180wK.A0X());
    public final String A00;
    public final boolean A01;

    public C129107lI(String str, Boolean bool) {
        this.A01 = bool.booleanValue();
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C129107lI) {
                C129107lI r5 = (C129107lI) obj;
                if (this.A01 != r5.A01 || !C117046y2.A01(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0I((Object) null, Boolean.valueOf(this.A01), this.A00);
    }

    public C129107lI() {
        this.A01 = false;
        this.A00 = null;
    }
}
