package X;

import android.text.TextUtils;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.redex.IDxFCallbackShape313S0100000_1_I2;
import com.instagram.user.model.User;

/* renamed from: X.4SF  reason: invalid class name */
public final class AnonymousClass4SF implements Runnable {
    public final /* synthetic */ AnonymousClass1dW A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;

    public AnonymousClass4SF(AnonymousClass1dW r1, User user, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = user;
    }

    public final void run() {
        AnonymousClass1dW r4 = this.A00;
        C18180wK.A12(r4);
        String str = this.A02;
        if (!TextUtils.isEmpty(str)) {
            User user = this.A01;
            if (!user.A2y() && user.A2s()) {
                C67463zb A002 = C67463zb.A00();
                GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
                GraphQlCallInput.A05(A003, str, "user_inputted_phone_number");
                C67463zb.A01(A003, A002);
                AnonymousClass7Ko.A0B(true);
                C67453za.A00(r4.A02).AMA(C67473zc.A00(A002, AnonymousClass16H.class, "IGSendWhatsappLinkCreationVerification"), new IDxFCallbackShape313S0100000_1_I2(r4, 2));
            }
        }
    }
}
