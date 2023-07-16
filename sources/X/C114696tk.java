package X;

/* renamed from: X.6tk  reason: invalid class name and case insensitive filesystem */
public final class C114696tk {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114696tk) {
                C114696tk r5 = (C114696tk) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass00U.A0e("UpdateContactIdParams(oldId=", this.A01, ", newId=", this.A00, ')');
    }

    public final int hashCode() {
        return C18210wN.A05(this.A00, C18180wK.A03(this.A01));
    }

    public C114696tk(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
