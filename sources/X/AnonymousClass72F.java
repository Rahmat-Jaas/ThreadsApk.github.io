package X;

import java.util.ArrayList;
import kotlin.Function;

/* renamed from: X.72F  reason: invalid class name */
public final class AnonymousClass72F {
    public static final C146378m9 A00(Object obj, AnonymousClass0YY r5, AnonymousClass0YP r6) {
        C04220Ms.A0B(r6, 0);
        if (r5 != null) {
            return (C146378m9) ((AnonymousClass0YM) r5.invoke(C141288aL.A00)).invoke(r6, obj, (Object) null);
        }
        AnonymousClass0MJ A17 = C86144wL.A17();
        A17.A00 = r6;
        AnonymousClass0MJ A172 = C86144wL.A17();
        A172.A00 = obj;
        AnonymousClass0MJ A173 = C86144wL.A17();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A173.A00 = A0v;
        AnonymousClass0MJ A174 = C86144wL.A17();
        A174.A00 = A0v;
        C04180Mo r1 = new C04180Mo();
        A01(C1191173o.A00, r1, A172, A17, A174, A173);
        return new AnonymousClass88B(r1, A172, A17, A174, A173);
    }

    /* JADX INFO: finally extract failed */
    public static final void A01(Object obj, C04180Mo r4, AnonymousClass0MJ r5, AnonymousClass0MJ r6, AnonymousClass0MJ r7, AnonymousClass0MJ r8) {
        if (!(obj instanceof Function)) {
            try {
                r4.A00 = true;
                r5.A00 = ((AnonymousClass0YP) r6.A00).invoke(r5.A00, obj);
                r4.A00 = false;
                Object obj2 = r7.A00;
                r8.A00 = obj2;
                for (Object A1G : (Iterable) obj2) {
                    C18240wQ.A1G(A1G);
                }
            } catch (Throwable th) {
                r4.A00 = false;
                throw th;
            }
        } else {
            throw C18190wL.A0a("Actions must be plain objects. Use custom middleware for async \nactions.");
        }
    }
}
