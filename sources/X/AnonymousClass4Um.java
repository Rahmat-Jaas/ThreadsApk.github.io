package X;

/* renamed from: X.4Um  reason: invalid class name */
public final class AnonymousClass4Um implements C86024w9 {
    public Object A00;

    public final Object BKJ(Object obj, AnonymousClass0A5 r5) {
        C04220Ms.A0B(r5, 1);
        Object obj2 = this.A00;
        if (obj2 != null) {
            return obj2;
        }
        throw C18180wK.A0a(AnonymousClass00U.A0V("Property ", ((C02240Aj) r5).name, " should be initialized before get."));
    }

    public final void CrD(Object obj, Object obj2, AnonymousClass0A5 r4) {
        C04220Ms.A0B(obj2, 2);
        this.A00 = obj2;
    }
}
