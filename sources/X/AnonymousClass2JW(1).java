package X;

import java.util.Arrays;

/* renamed from: X.2JW  reason: invalid class name */
public final class AnonymousClass2JW {
    public static final String A00(String str) {
        if (str != null) {
            if (str.equals("regular")) {
                return "regular";
            }
            if (!str.equals("emphasized")) {
                String format = String.format("Got unexpected button style: %s", Arrays.copyOf(new Object[]{str}, 1));
                C04220Ms.A06(format);
                C30967GcS.A02("BloksScreenNavbarButtonData", format);
            }
        }
        return "emphasized";
    }
}
