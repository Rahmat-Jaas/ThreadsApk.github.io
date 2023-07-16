package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;

/* renamed from: X.4RX  reason: invalid class name */
public final class AnonymousClass4RX implements Runnable {
    public final /* synthetic */ IDxACallbackShape111S0100000_1_I2 A00;
    public final /* synthetic */ AnonymousClass1U3 A01;

    public AnonymousClass4RX(IDxACallbackShape111S0100000_1_I2 iDxACallbackShape111S0100000_1_I2, AnonymousClass1U3 r2) {
        this.A00 = iDxACallbackShape111S0100000_1_I2;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass3Um r0 = this.A01.A01;
        Bundle A06 = C18180wK.A06();
        r0.A00(A06);
        A06.putBoolean("push_to_next", true);
        C29211xV r3 = (C29211xV) this.A00.A00;
        String str = r3.A05;
        String str2 = r3.A03;
        String str3 = r3.A04;
        A06.putString("COUNTRY_CODE", str2);
        A06.putString("NATIONAL_NUMBER", str3);
        A06.putBoolean("IS_PHONE_CONFIRMED", true);
        A06.putString("PHONE_NUMBER", str);
        C313225m.A00(A06, C313225m.ARGUMENT_TWOFAC_FLOW);
        Fragment A03 = C63463hW.A01().A03(r3.A01);
        C25786Drz A0Q = C18180wK.A0Q(r3.getActivity(), r3.A01);
        A0Q.A0A(A06, A03);
        A0Q.A0C(r3, 0);
        A0Q.A05();
    }
}
