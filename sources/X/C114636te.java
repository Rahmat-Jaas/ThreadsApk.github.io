package X;

import java.util.List;

/* renamed from: X.6te  reason: invalid class name and case insensitive filesystem */
public final class C114636te {
    public String A00;
    public List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114636te) {
                C114636te r5 = (C114636te) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18180wK.A03(this.A00));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("BackupDataEntry(userId=");
        A0s.append(this.A00);
        A0s.append(AnonymousClass000.A00(513));
        return C86104wH.A0y(this.A01, A0s);
    }

    public C114636te(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}
