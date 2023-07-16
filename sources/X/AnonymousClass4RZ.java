package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import java.util.ArrayList;

/* renamed from: X.4RZ  reason: invalid class name */
public final class AnonymousClass4RZ implements Runnable {
    public final /* synthetic */ IDxACallbackShape111S0100000_1_I2 A00;
    public final /* synthetic */ AnonymousClass1U4 A01;

    public AnonymousClass4RZ(IDxACallbackShape111S0100000_1_I2 iDxACallbackShape111S0100000_1_I2, AnonymousClass1U4 r2) {
        this.A00 = iDxACallbackShape111S0100000_1_I2;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass1aA r4 = (AnonymousClass1aA) this.A00.A00;
        r4.A0E.getClass();
        C313225m r0 = r4.A0D;
        C313225m r3 = C313225m.ARGUMENT_TWOFAC_FLOW;
        if (r0 == r3) {
            C63463hW.A03();
            ArrayList arrayList = this.A01.A03;
            Bundle A06 = C18180wK.A06();
            C313225m.A00(A06, r3);
            A06.putStringArrayList("backup_codes_key", arrayList);
            C29241xa r2 = new C29241xa();
            AnonymousClass0wJ.A19(r2, C18210wN.A0F(A06, r2, r4), r4.A0E);
            return;
        }
        C82654q3 r02 = (C82654q3) r4.getTargetFragment();
        if (r02 == null || !r02.BNR()) {
            C18180wK.A12(r4);
        }
        C38039KHq A002 = AnonymousClass3LY.A00(r4.A0E);
        Context requireContext = r4.requireContext();
        C05030Qo.A04(r4.A0E);
        A002.CWx(new AnonymousClass46Y(requireContext, this.A01.A01));
    }
}
