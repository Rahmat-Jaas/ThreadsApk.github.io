package X;

import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.redex.IDxFCallbackShape18S1200000_2_I2;
import java.util.List;

/* renamed from: X.7pX  reason: invalid class name */
public final class AnonymousClass7pX implements C144478iZ {
    public final /* synthetic */ IDxFCallbackShape18S1200000_2_I2 A00;

    public AnonymousClass7pX(IDxFCallbackShape18S1200000_2_I2 iDxFCallbackShape18S1200000_2_I2) {
        this.A00 = iDxFCallbackShape18S1200000_2_I2;
    }

    public final void Blv(BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        IDxFCallbackShape18S1200000_2_I2 iDxFCallbackShape18S1200000_2_I2 = this.A00;
        InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall = (InstantExperiencesJSBridgeCall) iDxFCallbackShape18S1200000_2_I2.A01;
        instantExperiencesJSBridgeCall.A03(new RequestAutofillJSBridgeCallResult((List) new AnonymousClass89R(browserExtensionsAutofillData, this)));
        AnonymousClass5E2 r2 = (AnonymousClass5E2) iDxFCallbackShape18S1200000_2_I2.A00;
        AnonymousClass7H6 A01 = AnonymousClass7H6.A01(r2.A02);
        AnonymousClass32J A002 = AnonymousClass7H6.A00(instantExperiencesJSBridgeCall.A01);
        synchronized (A002) {
        }
        synchronized (A002) {
        }
        synchronized (A01.A00) {
        }
        instantExperiencesJSBridgeCall.A03(new RequestAutofillJSBridgeCallResult((List) new AnonymousClass89S(browserExtensionsAutofillData, this)));
        r2.A01(instantExperiencesJSBridgeCall);
    }
}
