package X;

import androidx.fragment.app.FragmentActivity;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.MessageHandler;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.7jn  reason: invalid class name and case insensitive filesystem */
public abstract class C128557jn implements MessageHandler {
    public static final AtomicLong A08 = new AtomicLong(System.currentTimeMillis());
    public C146668mf A00;
    public final FragmentActivity A01;
    public final C143158gC A02 = C86114wI.A0Q(this, 121);
    public final C143158gC A03 = C86114wI.A0Q(this, 122);
    public final C113336rB A04;
    public final C112256pG A05;
    public final C04530Oa A06;
    public final C04530Oa A07 = C86124wJ.A13(this, 39);

    public final C115316ur A01() {
        String A032;
        C92625ix r1 = (C92625ix) this;
        IF5 BHU = r1.A01.BHU();
        if (BHU == null || (A032 = BHU.A03()) == null) {
            AnonymousClass0LU.A0B("IAWOffsiteMessageHandler", "Webview url is empty");
            return null;
        }
        ((C92615iw) r1.A07.getValue()).A00 = A032;
        String A0q = C18200wM.A0q(r1.A08);
        boolean BXU = r1.A00.BXU();
        return new C115316ur(A032, A0q, r1.A00.B9B(), r1.A03(), (Map) r1.A06.getValue(), BXU);
    }

    public final void A02(PaymentRequestContent paymentRequestContent) {
        C146668mf r2;
        C04220Ms.A0B(paymentRequestContent, 0);
        if (!C04220Ms.A0I(this.A00.B3n(), AnonymousClass6IW.A00(paymentRequestContent))) {
            r2 = this.A05.A00(AnonymousClass6IW.A00(paymentRequestContent));
            if (r2 != null) {
                C04530Oa r1 = this.A06;
                C86164wN.A0P(r1).A0H();
                C86164wN.A0P(r1).A03 = r2;
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        } else {
            r2 = this.A00;
        }
        this.A00 = r2;
        C04530Oa r12 = this.A06;
        if (C86164wN.A0P(r12).A03 == null) {
            CheckoutHandler A0P = C86164wN.A0P(r12);
            C146668mf r0 = this.A00;
            C04220Ms.A0B(r0, 0);
            A0P.A03 = r0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        r2.runOnUiThread(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0089, code lost:
        r1.runOnUiThread(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        throw X.C18180wK.A0a(X.AnonymousClass00U.A0V("Unexpected message type ", r3.getMessageType(r4), " received from Merchant"));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            byte[] r1 = android.util.Base64.decode(r6, r0)
            X.C04220Ms.A06(r1)
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            X.C04220Ms.A08(r0)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1, r0)
            com.facebookpay.offsite.models.message.GsonUtils r3 = com.facebookpay.offsite.models.message.GsonUtils.INSTANCE
            java.lang.String r1 = r3.getMessageType(r4)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1142390254: goto L_0x0033;
                case -302871978: goto L_0x004c;
                case 100017577: goto L_0x005c;
                case 1680331711: goto L_0x007a;
                default: goto L_0x0022;
            }
        L_0x0022:
            java.lang.String r2 = "Unexpected message type "
            java.lang.String r1 = r3.getMessageType(r4)
            java.lang.String r0 = " received from Merchant"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0033:
            java.lang.String r0 = "fbpayAvailableRequest"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            com.facebookpay.offsite.models.message.PaymentRequest r1 = r3.getToOffsitePaymentRequest(r4)
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            r5.A02(r0)
            androidx.fragment.app.FragmentActivity r2 = r5.A01
            X.80s r0 = new X.80s
            r0.<init>(r5, r1)
            goto L_0x0074
        L_0x004c:
            java.lang.String r0 = "paymentHandled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            androidx.fragment.app.FragmentActivity r1 = r5.A01
            X.80u r0 = new X.80u
            r0.<init>(r5, r4)
            goto L_0x0089
        L_0x005c:
            java.lang.String r0 = "paymentRequest"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            com.facebookpay.offsite.models.message.PaymentRequest r1 = r3.getToOffsitePaymentRequest(r4)
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r1.content
            r5.A02(r0)
            androidx.fragment.app.FragmentActivity r2 = r5.A01
            X.80t r0 = new X.80t
            r0.<init>(r5, r1)
        L_0x0074:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r2.runOnUiThread(r0)
            return
        L_0x007a:
            java.lang.String r0 = "paymentDetailsUpdated"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            androidx.fragment.app.FragmentActivity r1 = r5.A01
            X.80v r0 = new X.80v
            r0.<init>(r5, r4)
        L_0x0089:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.runOnUiThread(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128557jn.handleMessage(java.lang.String):void");
    }

    public final ECPHandler getEcpHandler() {
        return (ECPHandler) this.A07.getValue();
    }

    public C128557jn(FragmentActivity fragmentActivity, C113336rB r3, C112256pG r4, C04530Oa r5) {
        this.A01 = fragmentActivity;
        this.A04 = r3;
        this.A06 = r5;
        this.A05 = r4;
        this.A00 = r4.A00("742725890006429");
    }
}
