package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3TW  reason: invalid class name */
public final class AnonymousClass3TW {
    public final void A01(MMp mMp, Map map) {
        C04220Ms.A0B(map, 1);
        mMp.A0J();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object key = A0o.getKey();
            Object value = A0o.getValue();
            mMp.A0U((String) key);
            A00(mMp, value);
        }
        mMp.A0G();
    }

    private final void A00(MMp mMp, Object obj) {
        if (obj instanceof String) {
            mMp.A0Y((String) obj);
        } else if (obj instanceof Map) {
            A01(mMp, (Map) obj);
        } else if (obj instanceof List) {
            mMp.A0I();
            for (Object A00 : (List) obj) {
                A00(mMp, A00);
            }
            mMp.A0F();
        } else if (obj instanceof Boolean) {
            mMp.A0i(AnonymousClass0wJ.A1X(obj));
        } else if (obj instanceof Double) {
            mMp.A0L(((Number) obj).doubleValue());
        } else if (obj instanceof Long) {
            mMp.A0O(C18190wL.A08(obj));
        } else if (obj == null) {
            mMp.A0H();
        } else {
            throw C18180wK.A0a(AnonymousClass0wJ.A0t("unknown value type", obj));
        }
    }
}
