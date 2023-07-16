package com.instagram.common.task;

import X.AnonymousClass0wJ;
import X.AnonymousClass6BW;
import X.AnonymousClass7M7;
import X.C10450iM;
import X.C113806sA;
import X.C145388kQ;
import X.C63233h2;
import X.C67463zb;
import X.C92935kG;
import X.FR1;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFunctionShape362S0100000_2_I2;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import com.instagram.graphql.instagramschemagraphservices.IgFbPayPaymentMethodsQueryResponseImpl;
import java.util.Set;

public class IDxLTaskShape29S0300000_2_I2 extends FR1 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxLTaskShape29S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
    }

    public final void A02(Exception exc) {
        if (this.A03 != 0) {
            A04("");
        } else {
            C10450iM.A07("EncryptedSharedPrefs_apply_failed_write_to_disk", exc);
        }
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        if (this.A03 != 0) {
            A04((String) obj);
        } else if (AnonymousClass0wJ.A1X(obj)) {
            Set set = (Set) this.A01;
            set.getClass();
            if (!set.isEmpty()) {
                AnonymousClass7M7.A00((AnonymousClass7M7) this.A00, set);
            }
        }
    }

    public final synchronized void A04(String str) {
        synchronized (this) {
            IGPaymentMethodsAPI iGPaymentMethodsAPI = (IGPaymentMethodsAPI) this.A00;
            C145388kQ r1 = iGPaymentMethodsAPI.A00;
            if (r1 != null) {
                r1.AHZ(iGPaymentMethodsAPI.A02);
            }
            C113806sA r6 = (C113806sA) this.A02;
            Set set = (Set) this.A01;
            C67463zb A002 = C67463zb.A00();
            C67463zb A003 = C67463zb.A00();
            String str2 = iGPaymentMethodsAPI.A05;
            A002.A05("payment_type", str2);
            boolean A1W = AnonymousClass0wJ.A1W(str2);
            A002.A05("dev_pub_key", str);
            C92935kG A004 = AnonymousClass6BW.A00(r6, iGPaymentMethodsAPI.A03, new PandoGraphQLRequest(C63233h2.A04(A1W), "IgFbPayPaymentMethodsQuery", A002.getParamsCopy(), A003.getParamsCopy(), IgFbPayPaymentMethodsQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fbpay_account_extended"), new IDxFunctionShape362S0100000_2_I2(set, 9));
            iGPaymentMethodsAPI.A00 = A004;
            A004.A6o(iGPaymentMethodsAPI.A02);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056 A[Catch:{ all -> 0x0023, RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d A[Catch:{ all -> 0x0023, RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r10 = this;
            int r0 = r10.A03
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r10.A00     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI r0 = (com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI) r0     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            com.instagram.service.session.UserSession r0 = r0.A04     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            java.lang.String r0 = r0.getUserId()     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            X.7ne r8 = new X.7ne     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            r8.<init>(r10, r0)     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            X.7nc r7 = X.C129917nc.A00     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            X.0YY r6 = com.fbpay.util.executor.Retry.A00     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            r5 = 0
            r4 = 1
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            r9 = 0
        L_0x001e:
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x0023 }
            goto L_0x004d
        L_0x0023:
            r2 = move-exception
            java.lang.String r0 = "Failed attempt# "
            java.lang.String r1 = X.AnonymousClass00U.A0J(r0, r9)     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            java.lang.String r0 = "com.fbpay.util.executor.Retry"
            X.AnonymousClass0LU.A0H(r0, r1, r2)     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            r3.add(r2)     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            if (r9 >= r4) goto L_0x0050
            boolean r0 = r7.apply(r2)     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            if (r0 != 0) goto L_0x0050
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            X.4i7 r6 = (X.C78244i7) r6     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            java.lang.Object r0 = r6.invoke(r0)     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            long r0 = X.C18190wL.A08(r0)     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            java.lang.Thread.sleep(r0)     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            r9 = 1
            goto L_0x001e
        L_0x004d:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            return r0
        L_0x0050:
            int r0 = r3.size()     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            if (r0 != r4) goto L_0x005d
            java.lang.Object r0 = X.C86164wN.A0b(r3, r5)     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
        L_0x005c:
            throw r0     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
        L_0x005d:
            X.2Ag r0 = new X.2Ag     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            r0.<init>(r3)     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006a, all -> 0x0063 }
            goto L_0x005c
        L_0x0063:
            r1 = move-exception
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x006a:
            r0 = move-exception
            throw r0
        L_0x006c:
            r1 = move-exception
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x0073:
            java.lang.Object r0 = r10.A00
            X.7M7 r0 = (X.AnonymousClass7M7) r0
            X.7M8 r0 = r0.A02
            X.6ob r2 = r0.A00
            android.content.Context r1 = r0.A03
            java.lang.Object r0 = r10.A02
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r2.A00(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.task.IDxLTaskShape29S0300000_2_I2.call():java.lang.Object");
    }

    public final int getRunnableId() {
        if (this.A03 != 0) {
            return 239;
        }
        return 233;
    }
}
