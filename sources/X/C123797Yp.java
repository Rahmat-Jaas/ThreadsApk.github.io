package X;

/* renamed from: X.7Yp  reason: invalid class name and case insensitive filesystem */
public final class C123797Yp implements C143088g5 {
    public final int A00;
    public final C134747yH A01;

    public final void A91(C115546vR r6) {
        int i;
        int length;
        C04220Ms.A0B(r6, 0);
        int i2 = r6.A01;
        if (i2 != -1) {
            i = r6.A00;
        } else {
            i2 = r6.A03;
            i = r6.A02;
        }
        String str = this.A01.A00;
        r6.A04(i2, i, str);
        int i3 = r6.A03;
        int i4 = r6.A02;
        if (i3 != i4) {
            i4 = -1;
        }
        int i5 = this.A00;
        int i6 = i4 + i5;
        if (i5 > 0) {
            length = i6 - 1;
        } else {
            length = i6 - str.length();
        }
        int A02 = AnonymousClass8bI.A02(length, 0, r6.A04.A00());
        r6.A03(A02, A02);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C123797Yp) {
                C123797Yp r5 = (C123797Yp) obj;
                if (!C04220Ms.A0I(this.A01.A00, r5.A01.A00) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18180wK.A03(this.A01.A00) + this.A00;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CommitTextCommand(text='");
        A0s.append(this.A01.A00);
        A0s.append("', newCursorPosition=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C123797Yp(C134747yH r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
