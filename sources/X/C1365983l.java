package X;

import java.util.Comparator;

/* renamed from: X.83l  reason: invalid class name and case insensitive filesystem */
public final class C1365983l implements Comparator {
    public static final C1365983l A00 = new C1365983l();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C875353d r8 = (C875353d) obj;
        C875353d r9 = (C875353d) obj2;
        if (r8 == null) {
            throw C18190wL.A0a("Required value was null.");
        } else if (r9 != null) {
            int i = 0;
            if (AnonymousClass7FM.A03(r8) && AnonymousClass7FM.A03(r9)) {
                AnonymousClass54T r0 = r8.A06;
                if (r0 != null) {
                    AnonymousClass7Y3 r3 = r0.A0H;
                    AnonymousClass54T r02 = r9.A06;
                    if (r02 != null) {
                        AnonymousClass7Y3 r2 = r02.A0H;
                        if (r3.equals(r2)) {
                            return 0;
                        }
                        AnonymousClass84X A01 = AnonymousClass84X.A01(new AnonymousClass7Y3[16]);
                        do {
                            A01.A08(0, r3);
                            r3 = r3.A09();
                        } while (r3 != null);
                        AnonymousClass84X A012 = AnonymousClass84X.A01(new AnonymousClass7Y3[16]);
                        do {
                            A012.A08(0, r2);
                            r2 = r2.A09();
                        } while (r2 != null);
                        int min = Math.min(A01.A00 - 1, A012.A00 - 1);
                        if (min >= 0) {
                            while (C04220Ms.A0I(A01.A01[i], A012.A01[i])) {
                                if (i != min) {
                                    i++;
                                }
                            }
                            return C04220Ms.A00(((AnonymousClass7Y3) A01.A01[i]).A03, ((AnonymousClass7Y3) A012.A01[i]).A03);
                        }
                        throw C18180wK.A0a("Could not find a common ancestor between the two FocusModifiers.");
                    }
                    throw C18180wK.A0a("Required value was null.");
                }
                throw C18180wK.A0a("Required value was null.");
            } else if (AnonymousClass7FM.A03(r8)) {
                return -1;
            } else {
                if (!AnonymousClass7FM.A03(r9)) {
                    return 0;
                }
                return 1;
            }
        } else {
            throw C18190wL.A0a("Required value was null.");
        }
    }
}
