package X;

/* renamed from: X.4Uo  reason: invalid class name and case insensitive filesystem */
public final class C73854Uo implements C86024w9 {
    public Object A00;
    public final AnonymousClass0YY A01;

    public final Object BKJ(Object obj, AnonymousClass0A5 r7) {
        C04220Ms.A0B(r7, 1);
        Object obj2 = this.A00;
        if (obj2 == null) {
            throw C18180wK.A0a(AnonymousClass8bQ.A0l("Validation error: Group setup: @validationError", "@propertyName", ((C02240Aj) r7).name, false));
        }
        AnonymousClass2O6 r4 = (AnonymousClass2O6) this.A01.invoke(obj2);
        if (r4 instanceof AnonymousClass1pE) {
            return ((AnonymousClass1pE) r4).A00;
        }
        if (r4 instanceof AnonymousClass1pD) {
            throw C18180wK.A0a(AnonymousClass8bQ.A0l(AnonymousClass8bQ.A0l("Validation error: Group setup: @validationError", "@propertyName", ((C02240Aj) r7).name, false), "@validationError", ((AnonymousClass1pD) r4).A00, false));
        }
        throw AnonymousClass4VZ.A00();
    }

    public C73854Uo(AnonymousClass0YY r1) {
        this.A01 = r1;
    }

    public final void CrD(Object obj, Object obj2, AnonymousClass0A5 r3) {
        this.A00 = obj2;
    }
}
