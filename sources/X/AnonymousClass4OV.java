package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.api.base.IDxRParserShape48S0000000_1_I2;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.service.session.UserSession;
import java.io.IOException;

/* renamed from: X.4OV  reason: invalid class name */
public final class AnonymousClass4OV implements Runnable {
    public final /* synthetic */ AnonymousClass1cS A00;

    public AnonymousClass4OV(AnonymousClass1cS r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1cS r6 = this.A00;
        Context context = r6.getContext();
        AnonymousClass06E A002 = AnonymousClass06E.A00(r6);
        UserSession userSession = r6.A06;
        PublicPhoneContact submitPublicPhoneContact = r6.A03.getSubmitPublicPhoneContact();
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("business/account/validate_phone_number/");
        A0N.A06();
        if (submitPublicPhoneContact != null && !TextUtils.isEmpty(submitPublicPhoneContact.A02)) {
            String str = null;
            try {
                str = AnonymousClass2R3.A00(submitPublicPhoneContact);
            } catch (IOException unused) {
                C10450iM.A03("edit_business_profile", "Couldn't serialize create business public phone contact");
            }
            A0N.A0O("public_phone_contact", str);
        }
        A0N.A01 = new IDxRParserShape48S0000000_1_I2(0);
        C32165H8c A02 = A0N.A02();
        C63873iU.A0F(A02, context, r6, 13);
        C31155GhB.A01(context, A002, A02);
    }
}
