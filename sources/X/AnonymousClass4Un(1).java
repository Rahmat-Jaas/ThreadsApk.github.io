package X;

/* renamed from: X.4Un  reason: invalid class name */
public final class AnonymousClass4Un implements C86024w9 {
    public Object A00;
    public final Object A01;

    public final Object BKJ(Object obj, AnonymousClass0A5 r6) {
        C04220Ms.A0B(r6, 1);
        Object obj2 = this.A00;
        if (obj2 != null || (obj2 = this.A01) != null) {
            return obj2;
        }
        throw C18180wK.A0a(AnonymousClass8bQ.A0l("Experiment @propertyName is required and must be set", "@propertyName", ((C02240Aj) r6).name, false));
    }

    public AnonymousClass4Un(Object obj) {
        this.A01 = obj;
    }

    public final void CrD(Object obj, Object obj2, AnonymousClass0A5 r3) {
        this.A00 = obj2;
    }
}
