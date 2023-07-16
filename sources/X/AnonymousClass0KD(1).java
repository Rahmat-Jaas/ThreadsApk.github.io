package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.0KD  reason: invalid class name */
public final class AnonymousClass0KD extends AnonymousClass0LH {
    public int A00;
    public final ArrayList A01 = new ArrayList(32);

    public final void A09() {
        for (int i = 0; i < this.A00; i++) {
            Object A0B = A0B(i);
            if (A0B instanceof AnonymousClass0LH) {
                ((AnonymousClass0LH) A0B).A04();
            }
        }
    }

    private void A01(String str) {
        if (!this.A03) {
            throw new IllegalStateException("Expected object to be mutable");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(AnonymousClass00U.A0L("key=", str));
        }
    }

    public final void A07() {
        this.A01.clear();
        this.A00 = 0;
    }

    public final void A08() {
        this.A01.A01.Can(this);
    }

    public final void A0A(int i) {
        int i2 = this.A00 - 32;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                ArrayList arrayList = this.A01;
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                i2 = i3;
            } else {
                this.A01.trimToSize();
                return;
            }
        }
    }

    public final Object A0B(int i) {
        if (i >= 0 && i < this.A00) {
            return this.A01.get((i << 1) + 1);
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final String A0C(int i) {
        if (i >= 0 && i < this.A00) {
            return (String) this.A01.get(i << 1);
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final void A0D(AnonymousClass0LH r2, String str) {
        AnonymousClass0SJ.A01(r2, "subParams cannot be null!");
        A01(str);
        r2.A03();
        A00(this, r2, str);
        r2.A03();
        r2.A00 = this;
    }

    public static void A00(AnonymousClass0KD r1, Object obj, String str) {
        r1.A01(str);
        ArrayList arrayList = r1.A01;
        arrayList.add(str);
        arrayList.add(obj);
        r1.A00++;
    }
}
