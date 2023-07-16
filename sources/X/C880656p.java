package X;

import java.util.Map;

/* renamed from: X.56p  reason: invalid class name and case insensitive filesystem */
public final class C880656p extends C880856r {
    public C121177En A00;
    public String A01 = "clipsAdvancedSettingsConfig";

    public C880656p(C121177En r2, Object obj) {
        super(obj);
        this.A00 = r2;
    }

    public final void A0H(Object obj) {
        C121177En r2 = this.A00;
        if (r2 != null) {
            Map map = r2.A03;
            String str = this.A01;
            map.put(str, obj);
            C86074wE r0 = (C86074wE) r2.A01.get(str);
            if (r0 != null) {
                r0.CrC(obj);
            }
        }
        super.A0H(obj);
    }

    public C880656p(C121177En r2) {
        this.A00 = r2;
    }
}
