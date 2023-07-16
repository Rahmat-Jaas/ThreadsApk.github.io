package X;

import java.util.Set;

/* renamed from: X.19R  reason: invalid class name */
public final class AnonymousClass19R extends AnonymousClass0Sf implements C81664oA {
    public final C306422i A00;
    public final Integer A01;
    public final Set A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass19R) {
                AnonymousClass19R r5 = (AnonymousClass19R) obj;
                if (!(this.A00 == r5.A00 && C04220Ms.A0I(this.A02, r5.A02) && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A05 = AnonymousClass0wJ.A05(this.A02, C18210wN.A04(this.A00));
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            str = "CAMERA_OFF";
        } else {
            str = "UNKNOWN";
        }
        return A05 + str.hashCode() + intValue;
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("RtcScreenShareStateModel(state=");
        A0s.append(this.A00);
        A0s.append(", peersSharing=");
        A0s.append(this.A02);
        A0s.append(", reasonUnavailable=");
        if (this.A01.intValue() != 0) {
            str = "CAMERA_OFF";
        } else {
            str = "UNKNOWN";
        }
        A0s.append(str);
        return AnonymousClass0wJ.A0u(A0s);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3 == X.C306422i.A04) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass19R(X.C306422i r3, java.lang.Integer r4, java.util.Set r5) {
        /*
            r2 = this;
            X.AnonymousClass0wJ.A1O(r3, r5)
            r0 = 3
            X.C04220Ms.A0B(r4, r0)
            r2.<init>()
            r2.A00 = r3
            r2.A02 = r5
            r2.A01 = r4
            X.22i r0 = X.C306422i.PAUSED
            if (r3 == r0) goto L_0x0019
            X.22i r1 = X.C306422i.SHARING
            r0 = 0
            if (r3 != r1) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            r2.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19R.<init>(X.22i, java.lang.Integer, java.util.Set):void");
    }
}
