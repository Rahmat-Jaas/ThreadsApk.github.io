package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass099;
import X.AnonymousClass0wJ;
import X.AnonymousClass563;
import X.AnonymousClass57S;
import X.AnonymousClass5j6;
import X.AnonymousClass5xV;
import X.AnonymousClass5xc;
import X.AnonymousClass6I8;
import X.AnonymousClass7JF;
import X.AnonymousClass7JJ;
import X.AnonymousClass7Kx;
import X.AnonymousClass88J;
import X.C04220Ms;
import X.C112556pn;
import X.C1198277d;
import X.C122027Jo;
import X.C128957ke;
import X.C18180wK;
import X.C18240wQ;
import X.C86104wH;
import X.C86114wI;
import X.C91975hO;
import X.C92315hy;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;
import com.fbpay.logging.LoggingContext;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import java.util.List;

public class IDxDListenerShape321S0100000_2_I2 implements DialogInterface.OnDismissListener {
    public Object A00;
    public final int A01;

    public IDxDListenerShape321S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Fragment fragment;
        String str;
        FormCellLoggingEvents formCellLoggingEvents;
        switch (this.A01) {
            case 0:
                C91975hO r1 = ((C92315hy) ((IDxCListenerShape203S0100000_2_I2) this.A00).A00).A00;
                if (false != r1.A00) {
                    r1.A00 = false;
                    C1198277d r2 = r1.A00;
                    if (r2 != null && (formCellLoggingEvents = r1.A01) != null) {
                        r2.A00(formCellLoggingEvents.A00, C18180wK.A0Y(), false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ECPHandler eCPHandler = ((AnonymousClass5j6) this.A00).A05;
                if (eCPHandler != null) {
                    eCPHandler.BNA();
                    return;
                }
                return;
            case 2:
                AnonymousClass5j6 r12 = (AnonymousClass5j6) this.A00;
                ECPHandler eCPHandler2 = r12.A05;
                if (eCPHandler2 != null) {
                    eCPHandler2.BNA();
                }
                fragment = r12.mParentFragment;
                break;
            case 3:
                C128957ke A002 = AnonymousClass7JJ.A00();
                AnonymousClass563 r5 = (AnonymousClass563) this.A00;
                LoggingContext loggingContext = r5.A08;
                if (loggingContext != null) {
                    PaypalConsentLaunchParams paypalConsentLaunchParams = r5.A05;
                    if (paypalConsentLaunchParams != null) {
                        AnonymousClass6I8.A00(A002, loggingContext, "cancel", Long.parseLong(paypalConsentLaunchParams.A05));
                        AnonymousClass7Kx.A0K(r5.A09, (Object) null, new AnonymousClass88J());
                        fragment = r5.mParentFragment;
                        break;
                    } else {
                        str = "launchParams";
                    }
                } else {
                    str = "loggingContext";
                }
                C04220Ms.A0E(str);
                throw null;
            case 4:
                AnonymousClass57S r0 = (AnonymousClass57S) ((AnonymousClass5xc) this.A00).A02.getValue();
                C122027Jo r52 = r0.A00;
                Integer num = AnonymousClass006.A04;
                CreatorLoggingData creatorLoggingData = r0.A01;
                r52.A08(Boolean.valueOf(creatorLoggingData.A01), Boolean.valueOf(creatorLoggingData.A02), num, creatorLoggingData.A00);
                return;
            case 5:
                AnonymousClass7JF r22 = (AnonymousClass7JF) this.A00;
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r22.A01, "user_click_appreciationfeed_exit"), 2818);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    AnonymousClass7JF.A02(A0I, r22);
                    C86114wI.A1C(A0I, AnonymousClass7JF.A00(r22, (Boolean) null, (Boolean) null, AnonymousClass006.A00, AnonymousClass006.A04, (Long) null, (String) null, (String) null, (List) null, 252));
                    A0I.Bb4();
                    return;
                }
                return;
            case 6:
                C18240wQ.A1G(C86104wH.A0f(this.A00));
                return;
            case 7:
                AnonymousClass5xV r13 = (AnonymousClass5xV) this.A00;
                AnonymousClass5xV.A00(r13).A0B();
                if (C04220Ms.A0I(dialogInterface, r13.A00)) {
                    r13.A00 = null;
                    return;
                }
                return;
            case 8:
                AnonymousClass5xV r14 = (AnonymousClass5xV) this.A00;
                AnonymousClass5xV.A00(r14).A0C();
                if (C04220Ms.A0I(dialogInterface, r14.A01)) {
                    r14.A01 = null;
                    return;
                }
                return;
            default:
                C112556pn r23 = (C112556pn) this.A00;
                r23.A00 = System.currentTimeMillis();
                r23.A01 = false;
                return;
        }
        C04220Ms.A0C(fragment, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
        ((AnonymousClass099) fragment).onDismiss(dialogInterface);
    }
}
