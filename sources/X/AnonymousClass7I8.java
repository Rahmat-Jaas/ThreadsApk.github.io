package X;

import android.os.Bundle;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.7I8  reason: invalid class name */
public final class AnonymousClass7I8 {
    public static final AnonymousClass7I8 A00 = new AnonymousClass7I8();

    public static final Bundle A01(ECPPaymentRequest eCPPaymentRequest, AnonymousClass69R r4, LoggingContext loggingContext, String str, String str2, String[] strArr) {
        AnonymousClass0wJ.A1M(eCPPaymentRequest, 0, str);
        C04220Ms.A0B(str2, 4);
        Bundle A06 = C18180wK.A06();
        A06.putParcelable("ECP_LAUNCH_PARAMS", eCPPaymentRequest);
        A06.putParcelable("logging_context", loggingContext);
        A06.putString("ECP_PAYPAL_BA_LOADING_URL", str);
        A06.putString("ECP_CONTAINER_FRAGMENT_TYPE", "web_view_fragment");
        A06.putString("ECP_CONTAINER_FRAGMENT_TITLE", (String) null);
        A06.putString("ECP_CONTENT_FRAGMENT_REQUEST_KEY", str2);
        A06.putStringArray("ECP_PAYPAL_BA_ALLOWED_INTERCEPT_URL", strArr);
        A06.putSerializable("ECP_CONTAINER_FRAGMENT_NAV_BAR_STYLE", r4);
        return A06;
    }

    public static /* synthetic */ Bundle A02(AnonymousClass69R r2, AnonymousClass69R r3, LoggingContext loggingContext, String str, String str2, String str3, String str4, int i) {
        if ((i & 16) != 0) {
            r2 = null;
        }
        if ((i & 32) != 0) {
            r3 = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        Bundle A06 = C18180wK.A06();
        A06.putString("ECP_SESSION_ID", str);
        A06.putString("ECP_PRODUCT_ID", str2);
        A06.putString("ECP_CLIENT_RECEIVER_ID", str3);
        A06.putString("ECP_CONTENT_FRAGMENT_REQUEST_KEY", str4);
        A06.putParcelable("logging_context", loggingContext);
        A06.putSerializable("ECP_SELECTION_NAV_BAR_STYLE", r2);
        A06.putSerializable("ECP_FORM_NAV_BAR_STYLE", r3);
        return A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.A00 != true) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.os.Bundle A00(X.C880856r r20, com.facebookpay.form.fragment.model.FeatureConfiguration r21, com.fbpay.logging.LoggingContext r22) {
        /*
            android.os.Bundle r2 = X.C18180wK.A06()
            r1 = 1
            r3 = r21
            if (r21 == 0) goto L_0x0010
            boolean r0 = r3.A00
            r17 = 2131826515(0x7f111753, float:1.9285917E38)
            if (r0 == r1) goto L_0x0013
        L_0x0010:
            r17 = 2131826523(0x7f11175b, float:1.9285933E38)
        L_0x0013:
            r18 = 2131826532(0x7f111764, float:1.9285951E38)
            r19 = 2131826540(0x7f11176c, float:1.9285967E38)
            X.7Kx r0 = X.C86104wH.A0R(r20)
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r0)
            com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl r0 = (com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl) r0
            com.facebookpay.form.model.AddressFormFieldsConfig r4 = X.AnonymousClass7BH.A00(r0)
            r6 = 0
            r21 = 0
            r20 = 950256(0xe7ff0, float:1.331592E-39)
            r5 = r22
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r22 = r21
            com.facebookpay.form.fragment.model.FormParams r1 = X.C128187j7.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = "ECP_FORM_FRAGMENT_PARAMS"
            r2.putParcelable(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7I8.A00(X.56r, com.facebookpay.form.fragment.model.FeatureConfiguration, com.fbpay.logging.LoggingContext):android.os.Bundle");
    }
}
