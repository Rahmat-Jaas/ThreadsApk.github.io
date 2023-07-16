package X;

import java.util.List;

/* renamed from: X.6uM  reason: invalid class name and case insensitive filesystem */
public final class C115016uM {
    public final int A00;
    public final List A01;
    public final int A02;

    public C115016uM(List list, int i, int i2) {
        C04220Ms.A0B(list, 3);
        this.A00 = i;
        this.A02 = i2;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115016uM) {
                C115016uM r5 = (C115016uM) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && C04220Ms.A0I(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, ((this.A00 * 31) + this.A02) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("SoundSyncBeats(audioStartTimeMs=");
        A0s.append(this.A00);
        A0s.append(", audioEndTimeMs=");
        A0s.append(this.A02);
        A0s.append(", beatList=");
        return C86104wH.A0y(this.A01, A0s);
    }
}
