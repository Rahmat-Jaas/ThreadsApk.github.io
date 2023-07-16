package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6qR  reason: invalid class name and case insensitive filesystem */
public final class C112936qR {
    public final /* synthetic */ C104986ch A00;
    public final /* synthetic */ C109826kg A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Iterator A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ Map A05;

    public final void A00(String str, Throwable th) {
        Throwable th2 = th;
        if (th != null) {
            C109826kg r0 = this.A01;
            r0.A03.execute(new AnonymousClass835(r0.A01, r0.A02, (Object) null, (String) null, th2));
            return;
        }
        Map map = this.A05;
        map.put(this.A02, str);
        C116986xw.A01(this.A00, this.A01, this.A03, this.A04, map);
    }

    public C112936qR(C104986ch r1, C109826kg r2, String str, Iterator it, Map map, Map map2) {
        this.A01 = r2;
        this.A05 = map;
        this.A02 = str;
        this.A03 = it;
        this.A04 = map2;
        this.A00 = r1;
    }
}
