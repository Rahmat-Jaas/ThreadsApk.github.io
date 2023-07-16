package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.redex.IDxFunctionShape152S0200000_2_I2;
import com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.expresscheckout.models.ECPAvailabilityResponseParams;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.fbpay.logging.LoggingContext;
import com.fbpay.logging.LoggingPolicy;

/* renamed from: X.6uD  reason: invalid class name and case insensitive filesystem */
public final class C114966uD {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final C12560m7 A02;

    public final M5J A00(Bundle bundle) {
        String string = bundle.getString(AnonymousClass7C6.A00());
        if (string != null) {
            String string2 = bundle.getString("product_id");
            if (string2 != null) {
                long parseLong = Long.parseLong(string2);
                AnonymousClass84Y r8 = AnonymousClass84Y.A00;
                bundle.putParcelable("logging_context", new LoggingContext((LoggingPolicy) null, string, r8, r8, parseLong, false));
                bundle.putInt("STYLE_RES", 2131886577);
                AnonymousClass5jB r3 = new AnonymousClass5jB();
                r3.setArguments(bundle);
                r3.A0E(bundle, this.A02, "loading_fragment", "BOTTOM_SHEET_CONTAINER_FRAGMENT_TAG");
                C880756q r0 = r3.A04;
                if (r0 != null) {
                    return r0;
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        if (r5.A0A(r3, r1, r0) != false) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0090 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.M5J A02(com.facebookpay.expresscheckout.models.ECPPaymentRequest r17, java.lang.String r18) {
        /*
            r16 = this;
            r6 = 0
            r1 = r17
            r5 = r18
            boolean r2 = X.AnonymousClass0wJ.A1Z(r1, r5)
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r10 = r1.A0A
            java.lang.String r3 = r1.A08
            long r13 = java.lang.Long.parseLong(r3)
            com.fbpay.logging.LoggingPolicy r9 = r1.A06
            if (r9 == 0) goto L_0x00a0
            java.util.Set r11 = X.AnonymousClass7Hr.A01(r9)
        L_0x001d:
            if (r9 == 0) goto L_0x009d
            java.util.Set r12 = X.AnonymousClass7Hr.A02(r9)
        L_0x0023:
            boolean r15 = r1.A0B
            com.fbpay.logging.LoggingContext r8 = new com.fbpay.logging.LoggingContext
            r8.<init>(r9, r10, r11, r12, r13, r15)
            r7 = 2131886577(0x7f1201f1, float:1.9407737E38)
            java.lang.String r0 = "STYLE_RES"
            r4.putInt(r0, r7)
            java.lang.String r0 = "ECP_LAUNCH_PARAMS"
            r4.putParcelable(r0, r1)
            java.lang.String r0 = "logging_context"
            r4.putParcelable(r0, r8)
            X.5jB r7 = new X.5jB
            r7.<init>()
            r7.setArguments(r4)
            java.lang.String r0 = "FORCE_NUX"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "DEFAULT_VALUE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0099
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r5 = X.AnonymousClass7JJ.A02()
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r1.A01
            if (r0 == 0) goto L_0x0094
            java.util.Set<X.68M> r1 = r0.A0B
            java.util.Set<X.68F> r0 = r0.A0C
        L_0x0060:
            boolean r0 = r5.A0A(r3, r1, r0)
            if (r0 == 0) goto L_0x0099
        L_0x0066:
            r1 = 1
            java.lang.String r0 = "IS_ECP_NUX_FORM_SCREEN"
            r4.putBoolean(r0, r2)
            java.lang.String r5 = "content_nux_fragment"
        L_0x006e:
            X.7ke r3 = X.AnonymousClass7JJ.A00()
            if (r1 == 0) goto L_0x0091
            java.lang.String r2 = "nux_checkout"
        L_0x0076:
            r1 = 0
            X.7DP r0 = new X.7DP
            r0.<init>(r6, r1)
            java.util.LinkedHashMap r0 = X.C18220wO.A0y()
            r3.A0I(r8, r2, r0)
            r0 = r16
            X.0m7 r1 = r0.A02
            java.lang.String r0 = "BOTTOM_SHEET_CONTAINER_FRAGMENT_TAG"
            r7.A0E(r4, r1, r5, r0)
            X.56q r0 = r7.A04
            if (r0 == 0) goto L_0x00a4
            return r0
        L_0x0091:
            java.lang.String r2 = "pux_checkout"
            goto L_0x0076
        L_0x0094:
            X.84Y r1 = X.AnonymousClass84Y.A00
            X.84Y r0 = X.AnonymousClass84Y.A00
            goto L_0x0060
        L_0x0099:
            r1 = 0
            java.lang.String r5 = "content_bottom_sheet_fragment"
            goto L_0x006e
        L_0x009d:
            X.84Y r12 = X.AnonymousClass84Y.A00
            goto L_0x0023
        L_0x00a0:
            X.84Y r11 = X.AnonymousClass84Y.A00
            goto L_0x001d
        L_0x00a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114966uD.A02(com.facebookpay.expresscheckout.models.ECPPaymentRequest, java.lang.String):X.M5J");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r2.getChildFragmentManager();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C114966uD(androidx.fragment.app.Fragment r2, androidx.fragment.app.FragmentActivity r3) {
        /*
            r1 = this;
            r1.<init>()
            r1.A00 = r2
            r1.A01 = r3
            if (r2 == 0) goto L_0x000f
            X.0m7 r0 = r2.getChildFragmentManager()
            if (r0 != 0) goto L_0x0013
        L_0x000f:
            X.0m7 r0 = r3.getSupportFragmentManager()
        L_0x0013:
            r1.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114966uD.<init>(androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity):void");
    }

    public final M5J A01(ECPAvailabilityRequestParams eCPAvailabilityRequestParams) {
        String str;
        ECPRepositoryImpl A022 = AnonymousClass7JJ.A02();
        A022.A01 = null;
        AnonymousClass7Kx.A0J(A022.A06, (Object) null);
        A022.A02 = null;
        A022.A04 = false;
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        A0L.A0D(eCPAvailabilityRequestParams.A06, AnonymousClass7C6.A00());
        String str2 = eCPAvailabilityRequestParams.A03;
        A0L.A0D(str2, "payment_product_id");
        PaymentReceiverInfo paymentReceiverInfo = eCPAvailabilityRequestParams.A01;
        String str3 = paymentReceiverInfo.A00;
        if (str3 == null) {
            str3 = paymentReceiverInfo.A02;
        }
        A0L.A0A("receiver_ids", C06750aI.A14(str3));
        AnonymousClass73F.A00(A0L);
        A0L.A0D(eCPAvailabilityRequestParams.A05, "security_origin");
        A0L.A0C("disable_logging", Boolean.valueOf(eCPAvailabilityRequestParams.A09));
        C1202479j r3 = A022.A02;
        if (r3 == null) {
            C104996ci A0C = AnonymousClass7Kz.A0C();
            r3 = new AnonymousClass5k8(AnonymousClass7Sk.A00, new IDxFunctionShape152S0200000_2_I2(4, A0L, A022), A0C);
            A022.A02 = r3;
        }
        C04220Ms.A06(r3.A03());
        boolean A09 = A022.A09(str2);
        boolean A0A = A022.A0A(str2, eCPAvailabilityRequestParams.A07, eCPAvailabilityRequestParams.A08);
        DefaultPaymentMethodFields A04 = A022.A04(str2);
        AnonymousClass7JB r1 = AnonymousClass7JB.A00;
        if (A0A) {
            str = "NUX";
        } else {
            str = "PUX";
        }
        r1.A04(eCPAvailabilityRequestParams, str);
        return C880856r.A04(AnonymousClass7Kx.A0A(new ECPAvailabilityResponseParams(A04, 0, A09, A0A)));
    }
}
