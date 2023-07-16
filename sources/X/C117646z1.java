package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6z1  reason: invalid class name and case insensitive filesystem */
public final class C117646z1 {
    public static /* synthetic */ Modifier A00(Modifier modifier, AnonymousClass799 r9, String str, AnonymousClass0ZU r11, int i, boolean z) {
        AnonymousClass799 r4 = r9;
        String str2 = str;
        AnonymousClass7Us r2 = null;
        if ((i & 1) != 0) {
            r2 = new AnonymousClass7Us();
        }
        boolean A1Z = C86154wM.A1Z(i & 2, z);
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            r4 = null;
        }
        AnonymousClass0wJ.A1N(modifier, r2);
        C04220Ms.A0B(r11, 5);
        return AnonymousClass7HZ.A00((C142668fO) null, r2, C1190273f.A00(r2, modifier, 0.3f, A1Z), r4, str2, r11, A1Z);
    }

    public static Modifier A01(Modifier modifier, AnonymousClass799 r7, AnonymousClass0ZU r8) {
        return A00(modifier, r7, (String) null, r8, 7, false);
    }
}
