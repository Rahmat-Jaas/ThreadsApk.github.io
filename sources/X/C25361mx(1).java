package X;

import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.redex.IDxDListenerShape441S0100000_1_I2;

/* renamed from: X.1mx  reason: invalid class name and case insensitive filesystem */
public final class C25361mx extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25361mx(C697249u r7) {
        super("mprotectCode", 366, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C697249u r2 = this.A00;
        DalvikInternals.mprotectExecCode();
        C691847d.A02(new IDxDListenerShape441S0100000_1_I2(r2, 2));
    }
}
