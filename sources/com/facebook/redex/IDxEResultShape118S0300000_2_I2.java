package com.facebook.redex;

import X.AnonymousClass7WZ;
import X.AnonymousClass84D;
import X.C109646kL;
import X.C122827Tz;
import X.C122977Uu;
import X.C122987Uv;
import X.C142818fe;
import X.C147258p3;
import X.C147368pE;
import X.C86144wL;
import java.util.Iterator;
import java.util.Map;

public class IDxEResultShape118S0300000_2_I2 implements C142818fe {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxEResultShape118S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public final void dispose() {
        switch (this.A03) {
            case 0:
                Object obj = this.A02;
                ((AnonymousClass84D) this.A00).remove(obj);
                ((C122827Tz) this.A01).A05.remove(obj);
                return;
            case 1:
                C147368pE r2 = (C147368pE) this.A02;
                C122987Uv r0 = (C122987Uv) r2.getValue();
                if (r0 != null) {
                    ((C147258p3) this.A01).D7s(new C122977Uu(r0));
                    r2.CrC((Object) null);
                }
                Map map = (Map) this.A00;
                Iterator A0z = C86144wL.A0z(map);
                while (A0z.hasNext()) {
                    ((C147258p3) this.A01).D7s(new C122977Uu((C122987Uv) A0z.next()));
                }
                map.clear();
                return;
            default:
                C109646kL r4 = (C109646kL) this.A01;
                AnonymousClass7WZ r3 = (AnonymousClass7WZ) this.A02;
                Map map2 = r3.A02;
                if (r4.A00) {
                    Map CWd = r4.A01.CWd();
                    if (CWd.isEmpty()) {
                        map2.remove(r4.A02);
                    } else {
                        map2.put(r4.A02, CWd);
                    }
                }
                r3.A01.remove(this.A00);
                return;
        }
    }
}
