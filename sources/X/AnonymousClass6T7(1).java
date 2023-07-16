package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.6T7  reason: invalid class name */
public final class AnonymousClass6T7 {
    public static final String A00(D2U d2u) {
        switch (C18230wP.A04(d2u, 0)) {
            case 1:
            case 20:
                return "emailAddress";
            case 2:
            case 19:
                return "phoneNumber";
            case 3:
                return "streetAddress";
            case 4:
                return "addressLocality";
            case 5:
            case 6:
                return "addressRegion";
            case 7:
                return "addressCountry";
            case 8:
            case 9:
                return "postalCode";
            case 10:
                return "personName";
            case 11:
                return "personGivenName";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "personFamilyName";
            case 13:
                return "gender";
            default:
                return "";
        }
    }
}
