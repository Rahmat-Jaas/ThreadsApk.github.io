package androidx.lifecycle;

import X.AnonymousClass060;
import X.AnonymousClass066;
import X.AnonymousClass75P;
import X.C121447Ge;
import X.C14260p5;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class ReflectiveGenericLifecycleObserver implements C14260p5 {
    public final AnonymousClass75P A00;
    public final Object A01;

    public final void CMI(AnonymousClass060 r4, AnonymousClass066 r5) {
        AnonymousClass75P r0 = this.A00;
        Object obj = this.A01;
        Map map = r0.A01;
        AnonymousClass75P.A00(r4, r5, obj, (List) map.get(r4));
        AnonymousClass75P.A00(r4, r5, obj, (List) map.get(AnonymousClass060.ON_ANY));
    }

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.A01 = obj;
        C121447Ge r2 = C121447Ge.A02;
        Class<?> cls = obj.getClass();
        AnonymousClass75P r0 = (AnonymousClass75P) r2.A00.get(cls);
        this.A00 = r0 == null ? C121447Ge.A00(r2, cls, (Method[]) null) : r0;
    }
}
