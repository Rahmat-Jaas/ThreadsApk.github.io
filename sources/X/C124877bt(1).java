package X;

/* renamed from: X.7bt  reason: invalid class name and case insensitive filesystem */
public class C124877bt implements C147138nS {
    public static C124877bt A00;
    public static final C141888dO A01 = C124947c0.A00;

    public /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public C62793ak create(Class cls) {
        C04220Ms.A0B(cls, 0);
        try {
            Object A0g = C86134wK.A0g(cls);
            C04220Ms.A06(A0g);
            return (C62793ak) A0g;
        } catch (NoSuchMethodException e) {
            throw C86154wM.A0h(C86104wH.A0x(cls, "Cannot create an instance of ", C18200wM.A0r()), e);
        } catch (InstantiationException e2) {
            throw C86154wM.A0h(C86104wH.A0x(cls, "Cannot create an instance of ", C18200wM.A0r()), e2);
        } catch (IllegalAccessException e3) {
            throw C86154wM.A0h(C86104wH.A0x(cls, "Cannot create an instance of ", C18200wM.A0r()), e3);
        }
    }
}
