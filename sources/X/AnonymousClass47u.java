package X;

import android.content.Intent;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxCClientShape27S0100000_1_I2;
import java.util.Map;

/* renamed from: X.47u  reason: invalid class name */
public final class AnonymousClass47u implements C144608im {
    public final /* synthetic */ IDxCClientShape27S0100000_1_I2 A00;
    public final /* synthetic */ String A01;

    public AnonymousClass47u(IDxCClientShape27S0100000_1_I2 iDxCClientShape27S0100000_1_I2, String str) {
        this.A00 = iDxCClientShape27S0100000_1_I2;
        this.A01 = str;
    }

    public final void CAi(Map map) {
        IDxCClientShape27S0100000_1_I2 iDxCClientShape27S0100000_1_I2 = this.A00;
        C34608Ibe ibe = (C34608Ibe) iDxCClientShape27S0100000_1_I2.A00;
        if (C121897Ir.A03(ibe.getRootActivity())) {
            IDxCClientShape27S0100000_1_I2.A00(iDxCClientShape27S0100000_1_I2, this.A01);
            return;
        }
        C10300i6 r3 = ibe.A03;
        if (r3 == null || C63803iN.A05(AnonymousClass0TJ.A05, r3, 2342167115299037478L).booleanValue()) {
            C62413Zr.A01(ibe.getRootActivity(), 2131836144);
        }
        ibe.onActivityResult(HttpStatus.SC_SWITCHING_PROTOCOLS, 0, (Intent) null);
    }
}
