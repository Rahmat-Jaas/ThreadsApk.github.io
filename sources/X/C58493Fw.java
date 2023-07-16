package X;

import java.util.ArrayList;
import java.util.List;
import libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount;

/* renamed from: X.3Fw  reason: invalid class name and case insensitive filesystem */
public abstract class C58493Fw {
    public String A00;
    public String A01;
    public String A02;
    public List A03;
    public boolean A04;

    public final List A00() {
        List list = this.A03;
        if (list != null) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (Object next : list) {
                if (C04220Ms.A0I(((FxUnifiedLauncherAddedAccount) next).A00, "FACEBOOK")) {
                    A0v.add(next);
                }
            }
            return A0v;
        }
        C04220Ms.A0E("addedAccounts");
        throw null;
    }
}
