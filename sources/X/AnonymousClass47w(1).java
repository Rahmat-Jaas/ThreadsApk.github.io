package X;

import android.content.Intent;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxCClientShape27S0100000_1_I2;
import java.util.Map;

/* renamed from: X.47w  reason: invalid class name */
public final class AnonymousClass47w implements C144608im {
    public final /* synthetic */ IDxCClientShape27S0100000_1_I2 A00;
    public final /* synthetic */ C34607Ibd A01;
    public final /* synthetic */ String A02;

    public AnonymousClass47w(IDxCClientShape27S0100000_1_I2 iDxCClientShape27S0100000_1_I2, C34607Ibd ibd, String str) {
        this.A01 = ibd;
        this.A00 = iDxCClientShape27S0100000_1_I2;
        this.A02 = str;
    }

    public final void CAi(Map map) {
        C34607Ibd ibd = this.A01;
        if (C121897Ir.A03(ibd.getRootActivity())) {
            IDxCClientShape27S0100000_1_I2.A01(this.A00, this.A02);
            return;
        }
        C62413Zr.A01(ibd.getRootActivity(), 2131836144);
        ibd.onActivityResult(HttpStatus.SC_SWITCHING_PROTOCOLS, 0, (Intent) null);
    }
}
