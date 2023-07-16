package X;

import android.os.Bundle;
import java.util.Set;

/* renamed from: X.7cS  reason: invalid class name and case insensitive filesystem */
public final class C125107cS implements C015106z {
    public final Set A00 = C86134wK.A0u();

    public final void A00(String str) {
        this.A00.add(str);
    }

    public C125107cS(AnonymousClass070 r2) {
        r2.A03(this, "androidx.savedstate.Restarter");
    }

    public final Bundle Cfz() {
        Bundle A06 = C18180wK.A06();
        A06.putStringArrayList("classes_to_restore", C18200wM.A0s(this.A00));
        return A06;
    }
}
