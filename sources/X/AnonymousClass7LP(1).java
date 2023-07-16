package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7LP  reason: invalid class name */
public final class AnonymousClass7LP implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration A00;
    public final /* synthetic */ C104196bO A01;

    public final void onConfigurationChanged(Configuration configuration) {
        C04220Ms.A0B(configuration, 0);
        Configuration configuration2 = this.A00;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator A0u = C18190wL.A0u(this.A01.A00);
        while (A0u.hasNext()) {
            Object next = A0u.next();
            C04220Ms.A06(next);
            C114546tT r0 = (C114546tT) ((Reference) ((Map.Entry) next).getValue()).get();
            if (r0 == null || Configuration.needNewResources(updateFrom, r0.A00)) {
                A0u.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    public AnonymousClass7LP(Configuration configuration, C104196bO r2) {
        this.A00 = configuration;
        this.A01 = r2;
    }

    public final void onLowMemory() {
        this.A01.A00.clear();
    }

    public final void onTrimMemory(int i) {
        this.A01.A00.clear();
    }
}
