package X;

import android.content.Context;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6ob  reason: invalid class name and case insensitive filesystem */
public final class C111896ob {
    public C146218lq A00;

    public final boolean A00(Context context, Map map) {
        OutputStream BEI = this.A00.BEI(context);
        if (BEI == null) {
            return false;
        }
        MMp A03 = C18987Aon.A00.A03(BEI);
        A03.A0I();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object value = A0o.getValue();
            if (value != null) {
                AnonymousClass69G r5 = (AnonymousClass69G) AnonymousClass69G.A02.get(value.getClass());
                if (r5 == null) {
                    for (AnonymousClass69G r1 : AnonymousClass69G.values()) {
                        if (r1.A00.isInstance(value)) {
                            r5 = r1;
                        }
                    }
                    if (r5 == null) {
                    }
                }
                String A0p = C18200wM.A0p(A0o);
                String obj = value.toString();
                A03.A0J();
                if (A0p != null) {
                    A03.A0d("n", A0p);
                }
                if (obj != null) {
                    A03.A0d("v", obj);
                }
                A03.A0d("t", r5.A01);
                A03.A0G();
            }
        }
        A03.A0F();
        A03.flush();
        A03.close();
        return true;
    }

    public C111896ob(C146218lq r1) {
        this.A00 = r1;
    }
}
