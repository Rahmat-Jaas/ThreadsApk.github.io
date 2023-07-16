package X;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.7r0  reason: invalid class name */
public final class AnonymousClass7r0 implements C144578ij {
    public final C108696in A00 = new C108696in();
    public final Map A01 = C18220wO.A0y();
    public final ExecutorService A02 = Executors.newSingleThreadExecutor();

    public final C108136hs Cr0(AnonymousClass3HX r5, AnonymousClass7HV r6, AnonymousClass73X r7, AnonymousClass769 r8, C110486ll r9) {
        String str = r8.A00;
        Map map = this.A01;
        C04220Ms.A06(str);
        Object obj = map.get(str);
        if (obj == null) {
            obj = AnonymousClass0wJ.A0v();
            map.put(str, obj);
        }
        ((Collection) obj).add(C86144wL.A0w(r6));
        return new C108136hs(new AnonymousClass80Q(this, str), (Object) null);
    }
}
