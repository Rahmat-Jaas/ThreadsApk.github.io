package X;

import java.util.Map;

/* renamed from: X.7Cq  reason: invalid class name and case insensitive filesystem */
public final class C120817Cq {
    public static final Map A00 = AnonymousClass0wJ.A0y();
    public static final Map A01 = AnonymousClass0wJ.A0y();

    public static Object A00(Class cls) {
        String name = cls.getName();
        try {
            return C18230wP.A0g(AnonymousClass00U.A0L(name, "$$PropsSetter"));
        } catch (ClassNotFoundException unused) {
            AnonymousClass0JV.A02("ViewManagerPropertyUpdater", AnonymousClass0wJ.A0t("Could not find generated setter for ", cls));
            return null;
        } catch (IllegalAccessException | InstantiationException e) {
            throw C86154wM.A0h(AnonymousClass00U.A0L("Unable to instantiate methods getter for ", name), e);
        }
    }
}
