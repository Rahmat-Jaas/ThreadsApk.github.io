package X;

import java.util.ArrayList;

/* renamed from: X.0Jr  reason: invalid class name and case insensitive filesystem */
public final class C03590Jr extends AnonymousClass0LH {
    public final ArrayList A00 = new ArrayList(16);

    public static void A00(C03590Jr r1, Object obj) {
        if (r1.A03) {
            r1.A00.add(obj);
            return;
        }
        throw new IllegalStateException("Expected object to be mutable");
    }

    public final void A07() {
        this.A00.clear();
    }

    public final void A08() {
        this.A01.A00.Can(this);
    }

    public final void A09() {
        ArrayList arrayList = this.A00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof AnonymousClass0LH) {
                ((AnonymousClass0LH) obj).A04();
            }
        }
    }

    public final void A0A(int i) {
        ArrayList arrayList = this.A00;
        int size = arrayList.size() - 32;
        while (true) {
            int i2 = size - 1;
            if (size > 0) {
                arrayList.remove(arrayList.size() - 1);
                size = i2;
            } else {
                arrayList.trimToSize();
                return;
            }
        }
    }

    public final void A0B(AnonymousClass0LH r3) {
        AnonymousClass0SJ.A01(r3, "subParams cannot be null!");
        if (this.A03) {
            r3.A03();
            A00(this, r3);
            r3.A03();
            r3.A00 = this;
            return;
        }
        throw new IllegalStateException("Expected object to be mutable");
    }
}
