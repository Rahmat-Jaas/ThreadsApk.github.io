package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.3w4  reason: invalid class name and case insensitive filesystem */
public final class C65843w4 implements C142858fi {
    public final /* synthetic */ C65853w5 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ AnonymousClass0ZU A02;

    public C65843w4(C65853w5 r1, String str, AnonymousClass0ZU r3) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = r3;
    }

    public final void D8F() {
        Map map = this.A00.A00;
        String str = this.A01;
        List list = (List) map.remove(str);
        if (list != null) {
            list.remove(this.A02);
            if (C18190wL.A1a(list)) {
                map.put(str, list);
            }
        }
    }
}
