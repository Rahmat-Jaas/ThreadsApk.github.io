package X;

import java.text.BreakIterator;

/* renamed from: X.7Ym  reason: invalid class name and case insensitive filesystem */
public final class C123767Ym implements C143088g5 {
    public final void A91(C115546vR r5) {
        int i;
        C04220Ms.A0B(r5, 0);
        int i2 = r5.A01;
        if (i2 != -1) {
            i = r5.A00;
        } else {
            i2 = r5.A03;
            i = r5.A02;
            if (i2 != i || i == -1) {
                r5.A03(i2, i2);
            } else if (i != 0) {
                String obj = r5.toString();
                int i3 = r5.A03;
                int i4 = r5.A02;
                if (i3 != i4) {
                    i4 = -1;
                }
                C04220Ms.A0B(obj, 0);
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(obj);
                i2 = characterInstance.preceding(i4);
                int i5 = r5.A03;
                i = r5.A02;
                if (i5 != i) {
                    i = -1;
                }
            } else {
                return;
            }
        }
        r5.A01(i2, i);
    }

    public final String toString() {
        return "BackspaceCommand()";
    }

    public final int hashCode() {
        return C86124wJ.A16(this).hashCode();
    }

    public final boolean equals(Object obj) {
        return obj instanceof C123767Ym;
    }
}
