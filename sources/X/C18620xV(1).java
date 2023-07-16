package X;

import android.text.SpannableString;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0xV  reason: invalid class name and case insensitive filesystem */
public final class C18620xV extends SpannableString {
    public C18620xV() {
        this(AnonymousClass0ZV.A00, 10, 10, 1);
    }

    public C18620xV(List list, int i, int i2, int i3) {
        super(C18200wM.A0l(AnonymousClass8bQ.A0k("\n", i3), list));
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int A08 = C18220wO.A08(C18180wK.A0k(it));
            setSpan(new AnonymousClass7QI(i, i2, 4), i4, i4 + A08, 33);
            i4 += A08 + i3;
        }
    }
}
