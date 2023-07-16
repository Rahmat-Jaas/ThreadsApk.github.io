package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.89F  reason: invalid class name */
public final class AnonymousClass89F<T> extends AbstractList<T> implements C141918dT<Object>, C41800MdR<T> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public final List A06;

    public final Object Ajz(int i) {
        List list = this.A06;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((C885659e) list.get(i2)).A04.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((C885659e) list.get(i2)).A04.get(i);
    }

    public final int B1n() {
        return this.A01;
    }

    public final int B1o() {
        return this.A02;
    }

    public final int BE3() {
        return this.A04;
    }

    public final Object get(int i) {
        int i2 = i - this.A02;
        if (i < 0 || i >= size()) {
            throw C86114wI.A0a("Index: ", ", Size: ", i, size());
        } else if (i2 < 0 || i2 >= this.A04) {
            return null;
        } else {
            return Ajz(i2);
        }
    }

    public final int getSize() {
        return this.A02 + this.A04 + this.A01;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("leading ");
        A0s.append(this.A02);
        A0s.append(", storage ");
        A0s.append(this.A04);
        A0s.append(", trailing ");
        A0s.append(this.A01);
        A0s.append(' ');
        return C18180wK.A0i(C18200wM.A0l(" ", this.A06), A0s);
    }

    public AnonymousClass89F(AnonymousClass89F r3) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A06 = A0v;
        this.A05 = true;
        A0v.addAll(r3.A06);
        this.A02 = r3.A02;
        this.A01 = r3.A01;
        this.A03 = r3.A03;
        this.A05 = r3.A05;
        this.A04 = r3.A04;
        this.A00 = r3.A00;
    }

    public final /* bridge */ Object remove(int i) {
        return super.remove(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public AnonymousClass89F() {
        this.A06 = AnonymousClass0wJ.A0v();
        this.A05 = true;
    }
}
