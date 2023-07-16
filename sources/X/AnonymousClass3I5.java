package X;

import java.util.List;

/* renamed from: X.3I5  reason: invalid class name */
public final class AnonymousClass3I5 {
    public final int A00;
    public final String A01;
    public final List A02;

    public AnonymousClass3I5(List list, int i, String str) {
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I5) {
                AnonymousClass3I5 r5 = (AnonymousClass3I5) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, (C18180wK.A03(this.A01) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("AsyncComponentContainerTargetInfo(serverId=");
        A0s.append(this.A01);
        A0s.append(", clientId=");
        A0s.append(this.A00);
        A0s.append(", keyPath=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
