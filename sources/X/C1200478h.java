package X;

import java.util.Map;

/* renamed from: X.78h  reason: invalid class name and case insensitive filesystem */
public final class C1200478h {
    public static final C111386nF A01 = new C111386nF();
    public static final Map A02 = C18220wO.A0y();
    public final Map A00 = C18220wO.A0y();

    public final C114586tX A00(String str) {
        C04220Ms.A0B(str, 0);
        if (str.length() > 0) {
            C114586tX r0 = (C114586tX) this.A00.get(str);
            if (r0 != null) {
                return r0;
            }
            throw C18180wK.A0a(AnonymousClass00U.A0V("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw C18190wL.A0a("navigator name cannot be an empty string");
    }

    public final void A01(C114586tX r7) {
        C04220Ms.A0B(r7, 0);
        String A002 = A01.A00(r7.getClass());
        if (A002.length() > 0) {
            Map map = this.A00;
            C114586tX r3 = (C114586tX) map.get(A002);
            if (!C04220Ms.A0I(r3, r7)) {
                boolean z = false;
                if (r3 != null && r3.A00) {
                    z = true;
                }
                if (!(!z)) {
                    StringBuilder A0r = C18200wM.A0r();
                    A0r.append("Navigator ");
                    A0r.append(r7);
                    throw C18180wK.A0a(C86104wH.A0x(r3, " is replacing an already attached ", A0r));
                } else if (!r7.A00) {
                    map.put(A002, r7);
                } else {
                    StringBuilder A0r2 = C18200wM.A0r();
                    A0r2.append("Navigator ");
                    A0r2.append(r7);
                    throw C18180wK.A0a(C18180wK.A0i(" is already attached to another NavController", A0r2));
                }
            }
        } else {
            throw C18190wL.A0a("navigator name cannot be an empty string");
        }
    }
}
