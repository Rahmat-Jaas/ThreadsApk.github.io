package X;

import java.text.CharacterIterator;

/* renamed from: X.83V  reason: invalid class name */
public final class AnonymousClass83V implements CharacterIterator {
    public int A00 = 0;
    public final int A01;
    public final CharSequence A02;

    public AnonymousClass83V(CharSequence charSequence, int i) {
        this.A02 = charSequence;
        this.A01 = i;
    }

    public final char first() {
        this.A00 = 0;
        return current();
    }

    public final char last() {
        int i = this.A01;
        if (0 == i) {
            this.A00 = i;
            return 65535;
        }
        int i2 = i - 1;
        this.A00 = i2;
        return this.A02.charAt(i2);
    }

    public final char setIndex(int i) {
        if (i > this.A01 || 0 > i) {
            throw C18190wL.A0a(AnonymousClass000.A00(949));
        }
        this.A00 = i;
        return current();
    }

    public final char current() {
        int i = this.A00;
        if (i == this.A01) {
            return 65535;
        }
        return this.A02.charAt(i);
    }

    public final int getBeginIndex() {
        return 0;
    }

    public final int getEndIndex() {
        return this.A01;
    }

    public final int getIndex() {
        return this.A00;
    }

    public final char next() {
        int i = this.A00 + 1;
        this.A00 = i;
        int i2 = this.A01;
        if (i < i2) {
            return this.A02.charAt(i);
        }
        this.A00 = i2;
        return 65535;
    }

    public final char previous() {
        int i = this.A00;
        if (i <= 0) {
            return 65535;
        }
        int i2 = i - 1;
        this.A00 = i2;
        return this.A02.charAt(i2);
    }

    public final Object clone() {
        try {
            Object clone = super.clone();
            C04220Ms.A06(clone);
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }
}
