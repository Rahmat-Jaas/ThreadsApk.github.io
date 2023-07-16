package com.instagram.debug.devoptions.fbpay;

import X.AnonymousClass0wJ;
import X.AnonymousClass5qq;
import X.AnonymousClass7JJ;
import X.AnonymousClass7Kz;
import X.AnonymousClass84Y;
import X.C04220Ms;
import X.C12560m7;
import X.C14030oh;
import X.C18180wK;
import android.os.Bundle;
import android.view.View;
import com.facebookpay.confirmation.model.ECPConfirmationParams;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellAction;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellSection;
import com.fbpay.logging.LoggingContext;
import com.fbpay.logging.LoggingPolicy;
import java.util.ArrayList;

public final class IgECPPlaygroundActivity$onCreate$6$1 implements View.OnClickListener {
    public final /* synthetic */ IgECPPlaygroundActivity this$0;

    public IgECPPlaygroundActivity$onCreate$6$1(IgECPPlaygroundActivity igECPPlaygroundActivity) {
        this.this$0 = igECPPlaygroundActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1907787588);
        IgECPPlaygroundActivity igECPPlaygroundActivity = this.this$0;
        if (igECPPlaygroundActivity.ecpLauncher == null) {
            C04220Ms.A0E("ecpLauncher");
            throw null;
        }
        C12560m7 supportFragmentManager = igECPPlaygroundActivity.getSupportFragmentManager();
        Bundle A06 = C18180wK.A06();
        A06.putInt("STYLE_RES", 2131886577);
        AnonymousClass5qq r1 = new AnonymousClass5qq();
        r1.setArguments(A06);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(new ECPConfirmationUpsellAction("LINK", "Connected", "messages", "Stay connected", "https://m.facebook.com/facebook_pay/connect_learn_more"));
        String str = "LINK";
        A0v.add(new ECPConfirmationUpsellAction(str, "Invite", "envelope_invitation", "Invite your friends", ""));
        A0v.add(new ECPConfirmationUpsellAction(str, "Share", "share", "Share fundraiser", ""));
        ECPConfirmationParams eCPConfirmationParams = new ECPConfirmationParams(new ECPConfirmationUpsellSection("Up Next", A0v), "Thanks for your purchase", "A confirmation email was sent to example@fb.com", "See Receipt", "https://m.facebook.com/facebook_pay/connect_learn_more", "Add extra security with PIN", "CLOSE");
        AnonymousClass84Y r16 = AnonymousClass84Y.A00;
        LoggingContext loggingContext = new LoggingContext((LoggingPolicy) null, "uplclienttest_1634071535_403977fe-132e-4c89-9498-8e1ef4bf95e1", r16, r16, 137885231632764L, false);
        AnonymousClass7JJ A052 = AnonymousClass7Kz.A05();
        Bundle A062 = C18180wK.A06();
        A062.putParcelable("ECP_CONFIRMATION_FRAGMENT_PARAMS", eCPConfirmationParams);
        A062.putParcelable("logging_context", loggingContext);
        r1.A05 = A052.A06(A062, "content_confirmation_fragment");
        r1.A0A(supportFragmentManager, "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG");
        C14030oh.A0C(1805183970, A05);
    }
}
