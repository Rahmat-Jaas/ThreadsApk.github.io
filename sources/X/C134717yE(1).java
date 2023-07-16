package X;

import java.util.List;

/* renamed from: X.7yE  reason: invalid class name and case insensitive filesystem */
public final class C134717yE implements Appendable {
    public int A00;
    public int A01;
    public final List A02;

    public final String toString() {
        List list = this.A02;
        return new C134757yI(list, this.A01, list.size(), this.A00).toString();
    }

    public C134717yE(int i) {
        this.A02 = C18240wQ.A0k(i);
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence.subSequence(i, i2));
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        this.A02.add(charSequence);
        this.A00 += charSequence.length();
        return this;
    }

    public final Appendable append(char c) {
        append((CharSequence) new C134737yG(c));
        return this;
    }
}
