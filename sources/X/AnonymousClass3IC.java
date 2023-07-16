package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3IC  reason: invalid class name */
public final class AnonymousClass3IC {
    public Map A00 = null;
    public Map A01 = null;
    public Map A02 = null;
    public final List A03;

    public final AnonymousClass3GH A00(String str, String str2) {
        Number number;
        if (!(str == null || str2 == null || (number = (Number) A02().get(str)) == null)) {
            for (AnonymousClass3GH r1 : A01(number.intValue())) {
                if (str2.equals(r1.A01)) {
                    return r1;
                }
            }
        }
        return null;
    }

    public final List A01(int i) {
        List list;
        Map map;
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = AnonymousClass0wJ.A0y();
                List<AnonymousClass3GH> list2 = this.A03;
                int i2 = -1;
                int i3 = -1;
                int i4 = -1;
                for (AnonymousClass3GH r0 : list2) {
                    i3++;
                    int i5 = r0.A02;
                    if (i5 != i2) {
                        if (i2 >= 0) {
                            this.A00.put(Integer.valueOf(i2), new C563836z(i4, i3));
                        }
                        i2 = i5;
                        i4 = i3;
                    }
                }
                if (i2 >= 0) {
                    this.A00.put(Integer.valueOf(i2), new C563836z(i4, list2.size()));
                }
            }
            list = this.A03;
            list.size();
            this.A00.size();
            map = this.A00;
        }
        C563836z r02 = (C563836z) C18200wM.A0f(map, i);
        if (r02 != null) {
            return list.subList(r02.A00, r02.A01);
        }
        return Collections.emptyList();
    }

    public final synchronized Map A02() {
        if (this.A02 == null) {
            this.A02 = AnonymousClass0wJ.A0y();
            for (AnonymousClass3GH r0 : this.A03) {
                this.A02.put(r0.A00, Integer.valueOf(r0.A02));
            }
        }
        return this.A02;
    }

    public AnonymousClass3IC(List list) {
        this.A03 = Collections.unmodifiableList(C18200wM.A0s(list));
    }
}
