package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass7Ep;
import X.AnonymousClass7K3;
import X.C111116mo;
import X.C1201579a;
import X.C131587sR;
import X.C131597sS;
import X.C132017tB;
import X.C18240wQ;
import X.C86164wN;
import X.C89405Ej;
import X.H81;
import X.KJC;
import X.KKI;
import android.content.Context;
import android.os.RemoteException;
import com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload;
import com.facebook.browser.lite.extensions.autofill.model.AutofillSettings;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.fbpay.w3c.CardDetails;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.service.session.UserSession;
import kotlin.Function;

public class IDxObjectShape120S0200000_2_I2 implements Function, AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObjectShape120S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A02) {
            case 0:
                C89405Ej r2 = (C89405Ej) this.A00;
                AutofillSettings autofillSettings = r2.A09;
                if (autofillSettings != null) {
                    int i = autofillSettings.A00 + 1;
                    BrowserLiteCallback browserLiteCallback = AnonymousClass7Ep.A00().A06;
                    if (browserLiteCallback != null) {
                        try {
                            browserLiteCallback.D8x(i);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                r2.A0F = "connect_opt_out";
                C89405Ej.A01(r2, "DECLINED_CONNECT", AnonymousClass0wJ.A1X(this.A01));
                return null;
            case 1:
                C89405Ej r22 = (C89405Ej) this.A00;
                C89405Ej.A01(r22, "ACCEPTED_CONNECT", AnonymousClass0wJ.A1X(this.A01));
                r22.A0C = AnonymousClass006.A00;
                r22.A0N = true;
                BrowserLiteCallback browserLiteCallback2 = AnonymousClass7Ep.A00().A06;
                if (browserLiteCallback2 == null) {
                    return null;
                }
                try {
                    browserLiteCallback2.CVj();
                    return null;
                } catch (RemoteException unused2) {
                    return null;
                }
            case 2:
                C89405Ej r23 = (C89405Ej) this.A00;
                r23.A0F = "connect_error";
                C89405Ej.A01(r23, "FAILED_CONNECT", AnonymousClass0wJ.A1X(this.A01));
                return null;
            case 3:
                AnonymousClass7K3 r3 = ((C89405Ej) this.A00).A06;
                CardDetails cardDetails = (CardDetails) C18240wQ.A0b(((AutofillConnectPayload) this.A01).A03);
                C89405Ej r1 = r3.A02;
                if (r1.A0S) {
                    return null;
                }
                AnonymousClass7K3.A04(r3, "ACCEPTED_AUTOFILL");
                r1.A0S = true;
                AnonymousClass7K3.A03(r3, cardDetails, cardDetails.A07);
                return null;
            case 4:
                return new C132017tB((Context) this.A00, (UserSession) this.A01);
            case 5:
                UserSession userSession = (UserSession) this.A01;
                return new C1201579a(C86164wN.A0C((Context) this.A00, AnonymousClass00U.A0L("autofill_store_", userSession.getUserId())), userSession);
            case 6:
                return new C111116mo((Context) this.A00, (UserSession) this.A01);
            case 7:
                return StellaIpcDirectMessagingServiceClient.lambda$getInstance$0((Context) this.A00, (UserSession) this.A01);
            case 8:
                return new KKI((Context) this.A00, (UserSession) this.A01);
            case 9:
                return new C131597sS((Context) this.A00, (UserSession) this.A01);
            case 10:
                return new C131587sR((Context) this.A00, (UserSession) this.A01);
            case 11:
                return new KJC((Context) this.A00, (UserSession) this.A01);
            default:
                return new H81((UserSession) this.A01);
        }
    }
}
