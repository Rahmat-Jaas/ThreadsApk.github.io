package X;

import android.content.Context;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;

/* renamed from: X.4PI  reason: invalid class name */
public final class AnonymousClass4PI implements Runnable {
    public final /* synthetic */ IDxACallbackShape111S0100000_1_I2 A00;

    public AnonymousClass4PI(IDxACallbackShape111S0100000_1_I2 iDxACallbackShape111S0100000_1_I2) {
        this.A00 = iDxACallbackShape111S0100000_1_I2;
    }

    public final void run() {
        C23231co r4 = (C23231co) this.A00.A00;
        String phoneNumber = r4.A07.getPhoneNumber();
        C63103bV.A03.A05(r4.getContext());
        C18180wK.A12(r4);
        C38039KHq A002 = AnonymousClass3LY.A00(r4.A05);
        Context context = r4.getContext();
        r4.A05.getUserId();
        A002.CWx(new AnonymousClass46Y(context, phoneNumber));
    }
}
