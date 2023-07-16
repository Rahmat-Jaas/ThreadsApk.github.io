package X;

import java.util.ArrayList;

/* renamed from: X.0Vz  reason: invalid class name and case insensitive filesystem */
public final class C05770Vz implements C04050Mb {
    public final void CWp(C04170Mn r10, AnonymousClass0ND r11) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int i = 0;
        while (i < arrayList.size()) {
            arrayList.get(i);
            sb.append((String) null);
            sb.append(':');
            sb.append(0);
            sb2.append((String) null);
            sb2.append(':');
            sb2.append(0);
            sb3.append((String) null);
            sb3.append(':');
            sb3.append(0);
            i++;
            if (i < arrayList.size()) {
                sb.append(' ');
                sb2.append(' ');
                sb3.append(' ');
            }
        }
        r10.A02(AnonymousClass0MU.A38, 0L);
        r10.A02(AnonymousClass0MU.A32, 0L);
        r10.A02(AnonymousClass0MU.A31, 0L);
        r10.A02(AnonymousClass0MU.A37, 0L);
        r10.A03(AnonymousClass0MU.A7t, sb.toString());
        r10.A03(AnonymousClass0MU.A7s, sb2.toString());
        r10.A03(AnonymousClass0MU.A7u, sb3.toString());
    }

    public final Integer Awy() {
        return AnonymousClass006.A01;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
