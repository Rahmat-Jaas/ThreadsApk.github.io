package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.41z  reason: invalid class name and case insensitive filesystem */
public final class C680641z implements C27783EtE {
    public final Map A00 = C18220wO.A0y();
    public final Map A01 = C18220wO.A0y();

    public final C27783EtE A73(String str, String str2) {
        C04220Ms.A0B(str, 0);
        this.A00.put(str, str2);
        return this;
    }

    public final C27783EtE A7L(String str, String str2) {
        C04220Ms.A0B(str, 0);
        this.A01.put(str, str2);
        return this;
    }

    public final void A00(MMp mMp) {
        mMp.A0J();
        Map map = this.A00;
        ArrayList A0w = C18220wO.A0w(map);
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            String A0p = C18200wM.A0p(A0o);
            Object value = A0o.getValue();
            mMp.A0U(A0p);
            mMp.A0T(value);
            A0w.add(Unit.A00);
        }
        Map map2 = this.A01;
        ArrayList A0w2 = C18220wO.A0w(map2);
        Iterator A0z2 = AnonymousClass0wJ.A0z(map2);
        while (A0z2.hasNext()) {
            Map.Entry A0o2 = C18180wK.A0o(A0z2);
            String A0p2 = C18200wM.A0p(A0o2);
            Object value2 = A0o2.getValue();
            mMp.A0U(A0p2);
            mMp.A0T(value2);
            A0w2.add(Unit.A00);
        }
        mMp.A0G();
    }
}
