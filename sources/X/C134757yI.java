package X;

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;
import java.util.List;

/* renamed from: X.7yI  reason: invalid class name and case insensitive filesystem */
public final class C134757yI implements CharSequence, Formattable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final List A03;

    private void A00(StringBuilder sb) {
        for (int i = this.A02; i < this.A00; i++) {
            CharSequence charSequence = (CharSequence) this.A03.get(i);
            if (charSequence instanceof C134757yI) {
                ((C134757yI) charSequence).A00(sb);
            } else {
                sb.append(charSequence);
            }
        }
    }

    public final int length() {
        return this.A01;
    }

    public final String toString() {
        StringBuilder A0s = C86114wI.A0s(this.A01);
        A00(A0s);
        return A0s.toString();
    }

    public C134757yI(List list, int i, int i2, int i3) {
        this.A03 = list;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final char charAt(int i) {
        return toString().charAt(i);
    }

    public final void formatTo(Formatter formatter, int i, int i2, int i3) {
        try {
            formatter.out().append(this);
        } catch (IOException e) {
            throw C86114wI.A0k(e);
        }
    }

    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }
}
