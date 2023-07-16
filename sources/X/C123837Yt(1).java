package X;

/* renamed from: X.7Yt  reason: invalid class name and case insensitive filesystem */
public final class C123837Yt implements C143088g5 {
    public final int A00;
    public final C134747yH A01;

    public C123837Yt(String str, int i) {
        C04220Ms.A0B(str, 1);
        this.A01 = C134747yH.A04(str);
        this.A00 = i;
    }

    public final void A91(C115546vR r7) {
        int i;
        C04220Ms.A0B(r7, 0);
        int i2 = r7.A01;
        int i3 = 1;
        if (C86114wI.A1T(i2, -1)) {
            i = r7.A00;
        } else {
            i2 = r7.A03;
            i = r7.A02;
        }
        String str = this.A01.A00;
        r7.A04(i2, i, str);
        int length = str.length();
        if (length > 0) {
            r7.A02(i2, length + i2);
        }
        int i4 = r7.A03;
        int i5 = r7.A02;
        if (i4 != i5) {
            i5 = -1;
        }
        int i6 = this.A00;
        int i7 = i5 + i6;
        if (i6 <= 0) {
            i3 = length;
        }
        int A02 = AnonymousClass8bI.A02(i7 - i3, 0, r7.A04.A00());
        r7.A03(A02, A02);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C123837Yt) {
                C123837Yt r5 = (C123837Yt) obj;
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
        StringBuilder A0s = C18190wL.A0s("SetComposingTextCommand(text='");
        A0s.append(this.A01.A00);
        A0s.append("', newCursorPosition=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
