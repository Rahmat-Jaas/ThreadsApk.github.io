package X;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.6sF  reason: invalid class name and case insensitive filesystem */
public final class C113846sF {
    public Map A00 = null;
    public C41212LzK[] A01;
    public final String A02;
    public final byte[] A03;

    public final void A00(C970167p r3, Object obj) {
        Map map = this.A00;
        if (map == null) {
            map = new EnumMap(C970167p.class);
            this.A00 = map;
        }
        map.put(r3, obj);
    }

    public final String toString() {
        return this.A02;
    }

    public C113846sF(String str, byte[] bArr, C41212LzK[] lzKArr) {
        System.currentTimeMillis();
        this.A02 = str;
        this.A03 = bArr;
        this.A01 = lzKArr;
    }
}
