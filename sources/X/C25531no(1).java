package X;

import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.redex.IDxDListenerShape441S0100000_1_I2;

/* renamed from: X.1no  reason: invalid class name and case insensitive filesystem */
public final class C25531no extends C12140lP {
    public final /* synthetic */ IDxDListenerShape441S0100000_1_I2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25531no(IDxDListenerShape441S0100000_1_I2 iDxDListenerShape441S0100000_1_I2) {
        super("mprotect", 397, 5, false, false);
        this.A00 = iDxDListenerShape441S0100000_1_I2;
    }

    public final void loggedRun() {
        DalvikInternals.mprotectExecCode();
    }
}
