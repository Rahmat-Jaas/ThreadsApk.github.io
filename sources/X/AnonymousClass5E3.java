package X;

import android.text.TextUtils;
import com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.redex.IDxFCallbackShape18S1200000_2_I2;
import com.facebook.redex.IDxFCallbackShape79S0300000_2_I2;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: X.5E3  reason: invalid class name */
public final class AnonymousClass5E3 extends C1200678j {
    public C109696kQ A00;
    public AnonymousClass5xH A01;
    public UserSession A02;
    public Executor A03;

    public final /* bridge */ /* synthetic */ void A02(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        SaveAutofillDataJSBridgeCall saveAutofillDataJSBridgeCall = (SaveAutofillDataJSBridgeCall) instantExperiencesJSBridgeCall;
        super.A02(saveAutofillDataJSBridgeCall);
        String join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, C18200wM.A0s(saveAutofillDataJSBridgeCall.A04().keySet()));
        AnonymousClass7H6.A01(this.A02).A04(saveAutofillDataJSBridgeCall, new C1375989e(this, join));
        C109696kQ r7 = this.A00;
        HashMap A04 = saveAutofillDataJSBridgeCall.A04();
        SettableFuture settableFuture = new SettableFuture();
        AnonymousClass76J r4 = r7.A00;
        SettableFuture settableFuture2 = new SettableFuture();
        r4.A03.execute(new C72864Qa(r4, new C125267co(r4, settableFuture2)));
        C30954Gc6.A03(new IDxFCallbackShape79S0300000_2_I2(0, A04, settableFuture, r7), settableFuture2, r7.A03);
        C30954Gc6.A03(new IDxFCallbackShape18S1200000_2_I2(saveAutofillDataJSBridgeCall, this, join, 4), settableFuture, this.A03);
    }

    public AnonymousClass5E3(C109696kQ r2, C91225fq r3, AnonymousClass5xH r4, UserSession userSession, Executor executor) {
        super(r3, AnonymousClass7H6.A01(userSession));
        this.A02 = userSession;
        this.A01 = r4;
        this.A03 = executor;
        this.A00 = r2;
    }
}
