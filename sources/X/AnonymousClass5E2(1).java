package X;

import android.text.TextUtils;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall;
import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.redex.IDxFCallbackShape18S1200000_2_I2;
import com.facebook.redex.IDxFunctionShape243S0200000_2_I2;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.5E2  reason: invalid class name */
public final class AnonymousClass5E2 extends C1200678j {
    public final AnonymousClass76J A00;
    public final AnonymousClass5xH A01;
    public final UserSession A02;
    public final Executor A03;

    public final /* bridge */ /* synthetic */ void A02(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        List A012;
        RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = (RequestAutofillJSBridgeCall) instantExperiencesJSBridgeCall;
        super.A02(requestAutofillJSBridgeCall);
        String join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, C18200wM.A0s(requestAutofillJSBridgeCall.A04()));
        AnonymousClass7H6.A01(this.A02).A04(requestAutofillJSBridgeCall, new C1375689b(this, join));
        AnonymousClass76J r5 = this.A00;
        String str = (String) requestAutofillJSBridgeCall.A00("selectedAutoCompleteTag");
        Set A04 = requestAutofillJSBridgeCall.A04();
        SettableFuture settableFuture = new SettableFuture();
        r5.A03.execute(new C72864Qa(r5, new C125277cp(r5, settableFuture, str)));
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (NameAutofillData.A00.contains(str)) {
            A012 = r5.A01.A02();
        } else if (TelephoneAutofillData.A01.contains(str)) {
            A012 = r5.A01.A03();
        } else {
            boolean contains = AddressAutofillData.A00.contains(str);
            C115456v8 r0 = r5.A01;
            if (contains) {
                A012 = r0.A00();
            } else {
                A012 = r0.A01();
            }
        }
        A0v.addAll(A012);
        C30954Gc6.A03(new IDxFCallbackShape18S1200000_2_I2(requestAutofillJSBridgeCall, this, join, 3), C34497IYj.A00(new IDxFunctionShape243S0200000_2_I2(0, r5, A04), new C34501IYn(ImmutableList.copyOf((Iterable) Arrays.asList(new ListenableFuture[]{settableFuture, new AnonymousClass5ro(A0v)}))), r5.A02), this.A03);
    }

    public AnonymousClass5E2(AnonymousClass76J r2, C91225fq r3, AnonymousClass5xH r4, UserSession userSession, Executor executor) {
        super(r3, AnonymousClass7H6.A01(userSession));
        this.A02 = userSession;
        this.A03 = executor;
        this.A00 = r2;
        this.A01 = r4;
    }
}
