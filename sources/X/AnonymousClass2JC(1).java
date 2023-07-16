package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2JC  reason: invalid class name */
public final class AnonymousClass2JC {
    public static Object A00(AnonymousClass601 r7, C63893iY r8) {
        String str = (String) C63893iY.A07(r8);
        C63343hJ.getInstance();
        C04220Ms.A0B(r7, 0);
        C71494Ja r4 = new C71494Ja(C63913ic.A0F(r7));
        Bundle A06 = C18180wK.A06();
        Iterator A0z = AnonymousClass0wJ.A0z((Map) C63893iY.A08(r8));
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            String A0p = C18200wM.A0p(A0o);
            Object value = A0o.getValue();
            if (value instanceof Integer) {
                A06.putInt(A0p, AnonymousClass0wJ.A04(value));
            } else if (value instanceof Long) {
                A06.putLong(A0p, C18190wL.A08(value));
            } else if (value instanceof Short) {
                A06.putShort(A0p, ((Number) value).shortValue());
            } else if (value instanceof String) {
                A06.putString(A0p, (String) value);
            } else if (value instanceof Boolean) {
                A06.putBoolean(A0p, AnonymousClass0wJ.A1X(value));
            } else if (value instanceof Double) {
                A06.putDouble(A0p, ((Number) value).doubleValue());
            }
        }
        r4.Cod(A06);
        r4.CpK(str);
        r4.BaN(C63913ic.A05(r7));
        return null;
    }
}
