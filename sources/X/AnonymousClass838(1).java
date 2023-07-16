package X;

import android.os.Bundle;
import android.os.RemoteException;
import com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import java.util.List;

/* renamed from: X.838  reason: invalid class name */
public final class AnonymousClass838 implements Runnable {
    public final /* synthetic */ AutofillSharedJSBridgeProxy A00;
    public final /* synthetic */ C89405Ej A01;
    public final /* synthetic */ C111316n8 A02;
    public final /* synthetic */ RequestAutofillJSBridgeCall A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    public AnonymousClass838(AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, C89405Ej r2, C111316n8 r3, RequestAutofillJSBridgeCall requestAutofillJSBridgeCall, String str, List list) {
        this.A01 = r2;
        this.A00 = autofillSharedJSBridgeProxy;
        this.A03 = requestAutofillJSBridgeCall;
        this.A05 = list;
        this.A04 = str;
        this.A02 = r3;
    }

    public final void run() {
        C89405Ej r5 = this.A01;
        boolean booleanValue = C63803iN.A05(AnonymousClass0TJ.A05, r5.A0B, 36310512514760810L).booleanValue();
        boolean z = r5.A0K;
        boolean z2 = r5.A0M;
        boolean A0A = r5.A0A();
        boolean A0B = r5.A0B();
        AnonymousClass5EY r6 = new AnonymousClass5EY();
        Bundle A06 = C18180wK.A06();
        A06.putBoolean("is_payment_enabled", z);
        A06.putBoolean("is_reconsent_enabled", z2);
        A06.putBoolean("is_consent_accepted", A0A);
        A06.putBoolean("should_always_show_ads_disclosure", booleanValue);
        A06.putBoolean("should_show_fbpay_disclosure", A0B);
        r6.setArguments(A06);
        AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy = this.A00;
        RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = this.A03;
        List list = this.A05;
        String str = this.A04;
        String str2 = r5.A0G;
        if (str2 == null) {
            str2 = "";
        }
        r6.A01 = autofillSharedJSBridgeProxy;
        r6.A03 = requestAutofillJSBridgeCall;
        r6.A06 = list;
        r6.A02 = r5;
        r6.A04 = str;
        r6.A05 = str2;
        r5.A05(r6, this.A02, "AutofillBottomSheetDialogFragment");
        if (r5.A0B()) {
            r5.A0L = false;
            BrowserLiteCallback browserLiteCallback = AnonymousClass7Ep.A00().A06;
            if (browserLiteCallback != null) {
                try {
                    browserLiteCallback.Cku();
                } catch (RemoteException unused) {
                }
            }
            AnonymousClass78Q.A00(new AnonymousClass78Q(I17.A00(161), r5.A0c));
        }
    }
}
