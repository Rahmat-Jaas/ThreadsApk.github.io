package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7sh  reason: invalid class name and case insensitive filesystem */
public final class C131737sh implements C144608im {
    public final /* synthetic */ C144608im A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ Map A02;

    public C131737sh(C144608im r1, Runnable runnable, Map map) {
        this.A02 = map;
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void CAi(Map map) {
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            C86154wM.A1U(A0o.getKey(), AnonymousClass7K8.A01, ((C971568d) A0o.getValue()).A00);
        }
        Map map2 = this.A02;
        map2.putAll(map);
        this.A00.CAi(map2);
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }
}
