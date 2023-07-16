package com.facebook.redex;

import X.AnonymousClass00U;
import X.AnonymousClass066;
import X.AnonymousClass0wJ;
import X.AnonymousClass76O;
import X.AnonymousClass7BN;
import X.AnonymousClass7Ic;
import X.AnonymousClass7JJ;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.C002801h;
import X.C03480Iw;
import X.C04220Ms;
import X.C104996ci;
import X.C107266gT;
import X.C108876j6;
import X.C110336lW;
import X.C110996mc;
import X.C113996sW;
import X.C115006uL;
import X.C115406v0;
import X.C116986xw;
import X.C117026y0;
import X.C120967Dk;
import X.C120977Dl;
import X.C121257Ff;
import X.C122037Js;
import X.C122157Kv;
import X.C124017aJ;
import X.C128667k3;
import X.C128677k4;
import X.C142618fJ;
import X.C143158gC;
import X.C143688h9;
import X.C145348kM;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import X.C86154wM;
import X.C86164wN;
import X.C880756q;
import X.C880856r;
import X.C92885kB;
import X.M5J;
import android.os.Bundle;
import androidx.fragment.app.IDxLCallbacksShape42S0100000_2_I2;
import com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl;
import com.facebook.graphql.impls.FBPayLoggingPolicyImpl;
import com.facebook.graphql.impls.FBPayPaymentConfigImpl;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.fbpay.logging.LoggingPolicy;
import com.fbpay.util.pttatresource.IDxBResourceShape34S0000000_2_I2;
import com.google.gson.Gson;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class IDxObserverShape3S1500000_2_I2 implements C143158gC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public IDxObserverShape3S1500000_2_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A06 = i;
        this.A00 = obj4;
        this.A05 = str;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj5;
        this.A04 = obj2;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        LoggingPolicy loggingPolicy;
        M5J m5j;
        IllegalArgumentException A0a;
        C145348kM r5;
        Object obj2 = obj;
        switch (this.A06) {
            case 0:
                AnonymousClass7Kx r3 = (AnonymousClass7Kx) obj2;
                if (AnonymousClass7Kx.A0R(r3) && C18190wL.A1Z(r3.A01, true)) {
                    C113996sW r32 = (C113996sW) this.A01;
                    C110996mc r52 = r32.A03;
                    String A002 = C122037Js.A00();
                    TransactionInfo transactionInfo = (TransactionInfo) this.A04;
                    EcpUIConfiguration ecpUIConfiguration = (EcpUIConfiguration) this.A02;
                    PaymentReceiverInfo paymentReceiverInfo = (PaymentReceiverInfo) this.A03;
                    ECPConfirmationConfiguration eCPConfirmationConfiguration = (ECPConfirmationConfiguration) this.A00;
                    String str = this.A05;
                    C86104wH.A1P(transactionInfo, 2, str);
                    ECPHandler eCPHandler = r52.A00;
                    eCPHandler.Cqk(AnonymousClass7Kx.A0A(transactionInfo));
                    r52.A01.A0u(new IDxLCallbacksShape42S0100000_2_I2(r52, 0), false);
                    String A0n = C18190wL.A0n(C03480Iw.A00());
                    C110336lW A052 = AnonymousClass7JJ.A02().A05("137885231632764", "5206913519322793");
                    if (A052 != null) {
                        FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl = A052.A00;
                        if (fBPayCheckoutScreenConfigImpl != null) {
                            CheckoutConfiguration A08 = C122157Kv.A08(fBPayCheckoutScreenConfigImpl);
                            FBPayPaymentConfigImpl fBPayPaymentConfigImpl = A052.A03;
                            if (fBPayPaymentConfigImpl != null) {
                                ECPPaymentConfiguration A0C = C122157Kv.A0C(fBPayPaymentConfigImpl, transactionInfo, "1050350152384275");
                                FBPayLoggingPolicyImpl fBPayLoggingPolicyImpl = A052.A02;
                                if (fBPayLoggingPolicyImpl != null) {
                                    loggingPolicy = C122157Kv.A0J(fBPayLoggingPolicyImpl);
                                } else {
                                    loggingPolicy = null;
                                }
                                r52.A04.A02(new ECPPaymentRequest(A08, eCPConfirmationConfiguration, A0C, ecpUIConfiguration, paymentReceiverInfo, loggingPolicy, A002, "137885231632764", A0n, "1050350152384275", 0, false), str).A0C(r52.A02, r52.A03);
                                eCPHandler.ACn().A0C(r32.A00, C124017aJ.A00);
                                return;
                            }
                            throw C18180wK.A0a("Required value was null.");
                        }
                        throw C18180wK.A0a("Required value was null.");
                    }
                    throw AnonymousClass0wJ.A0b();
                }
                return;
            case 1:
                AnonymousClass7Ic r9 = (AnonymousClass7Ic) this.A00;
                C107266gT r11 = (C107266gT) this.A01;
                C880856r r10 = (C880856r) this.A02;
                String str2 = this.A05;
                Object obj3 = this.A03;
                C142618fJ r2 = (C142618fJ) this.A04;
                AnonymousClass7Kx r33 = (AnonymousClass7Kx) obj2;
                if (AnonymousClass7Kx.A0O(r33)) {
                    Throwable th = r33.A02;
                    if (th instanceof C92885kB) {
                        th.getClass();
                        C92885kB r4 = (C92885kB) th;
                        try {
                            r11.A01.putString("AUTH_EXCEPTION", new Gson().A08(r4));
                            ArrayDeque<C115406v0> arrayDeque = new ArrayDeque<>();
                            List<C115006uL> list = r4.A00.A00;
                            if (list.isEmpty() || list.get(0).A00.isEmpty()) {
                                A0a = C18190wL.A0a("AuthException does not have group or any factor.");
                            } else {
                                for (C115406v0 next : list.get(0).A00) {
                                    String str3 = next.A00;
                                    if ("BIO".equalsIgnoreCase(str3) || "PIN".equalsIgnoreCase(str3) || "CSC".equalsIgnoreCase(str3) || "SDC".equalsIgnoreCase(str3) || "PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(str3) || "FB_ACCESS_TOKEN".equalsIgnoreCase(str3) || "IG_ACCESS_TOKEN".equalsIgnoreCase(str3) || "THREE_DS".equalsIgnoreCase(str3)) {
                                        arrayDeque.add(next);
                                    } else {
                                        A0a = C18190wL.A0a(AnonymousClass00U.A0L("Not supported auth factor:", str3));
                                    }
                                }
                                C128667k3 r6 = r9.A00;
                                if (r6 != null) {
                                    for (C115406v0 r53 : arrayDeque) {
                                        Map map = r6.A07;
                                        Iterator A0s = C86154wM.A0s(map);
                                        while (true) {
                                            if (A0s.hasNext()) {
                                                Object next2 = A0s.next();
                                                if (C04220Ms.A0I(((C115406v0) next2).A00, r53.A00)) {
                                                    if (next2 != null) {
                                                        map.remove(next2);
                                                    }
                                                }
                                            }
                                        }
                                        C04220Ms.A04(r53);
                                        map.put(r53, (Object) null);
                                    }
                                }
                                r9.A05(r10, r11, obj3, str2, arrayDeque);
                                return;
                            }
                            throw A0a;
                        } catch (IllegalArgumentException e) {
                            r10.A0G(AnonymousClass7Kx.A0C(e));
                            return;
                        }
                    }
                }
                if (r9.A00 != null) {
                    if (C86114wI.A1Z(C92885kB.A01, C117026y0.A00(r33.A02))) {
                        C128667k3 r62 = r9.A00;
                        Map map2 = r62.A07;
                        Iterator it = new HashSet(map2.keySet()).iterator();
                        while (it.hasNext()) {
                            C115406v0 r22 = (C115406v0) it.next();
                            if (C04220Ms.A0I(r22.A00, "BIO")) {
                                map2.remove(r22);
                            } else {
                                C108876j6 r0 = (C108876j6) map2.get(r22);
                                if (!(r0 == null || r0.A01 == null)) {
                                    map2.put(r22, (Object) null);
                                }
                            }
                        }
                        r62.A00((C108876j6) null);
                        return;
                    }
                }
                if (r9.A00 != null && r2 != null && !AnonymousClass7Kx.A0P(r33) && (m5j = (M5J) r2.apply(r33.A01)) != null) {
                    AnonymousClass7Kx.A0H(m5j, C86164wN.A0O(r10, r9, 19));
                    return;
                }
                return;
            case 2:
                AnonymousClass7Ic r23 = (AnonymousClass7Ic) this.A00;
                String str4 = this.A05;
                C107266gT r1 = (C107266gT) this.A01;
                C142618fJ r42 = (C142618fJ) this.A02;
                Object obj4 = this.A03;
                C880756q r02 = (C880756q) this.A04;
                AnonymousClass7Kx r34 = (AnonymousClass7Kx) obj2;
                if (AnonymousClass7Kx.A0R(r34)) {
                    Object A0D = AnonymousClass7Kx.A0D(r34);
                    C104996ci r54 = r23.A04;
                    AnonymousClass76O A09 = AnonymousClass7Kz.A09();
                    C120967Dk[] r7 = {(C120967Dk) A0D};
                    HashSet A0u = C18200wM.A0u();
                    Collections.addAll(A0u, r7);
                    IDxSCallbackShape308S0200000_2_I2 iDxSCallbackShape308S0200000_2_I2 = new IDxSCallbackShape308S0200000_2_I2(0, r23.A03, r1);
                    Bundle bundle = r1.A01;
                    M5J A032 = new IDxBResourceShape34S0000000_2_I2(r42, A09, r54, new C120977Dl(C116986xw.A00(iDxSCallbackShape308S0200000_2_I2, Collections.unmodifiableSet(A0u)), obj4, str4, C86134wK.A0n(bundle), bundle.getString("PAYMENT_OTC_SESSION_ID"), bundle.getString("PAYMENT_OTC_TYPE"), (String) null, C121257Ff.A00(bundle), Collections.unmodifiableSet(A0u)), 0).A03();
                    AnonymousClass066 r55 = r23.A01;
                    if (r55 == null) {
                        r55 = r23.A02;
                        r55.getClass();
                    }
                    Object obj5 = obj4;
                    String str5 = str4;
                    C142618fJ r92 = r42;
                    A032.A0C(r55, new IDxObserverShape3S1600000_2_I2(r92, A032, r02, r1, r23, obj5, str5, 0));
                    return;
                }
                AnonymousClass7Ic.A01(r42, r02, r1, r23, obj4, str4);
                return;
            default:
                AnonymousClass7Ic r102 = (AnonymousClass7Ic) this.A00;
                Queue queue = (Queue) this.A01;
                C880856r r72 = (C880856r) this.A02;
                String str6 = this.A05;
                Object obj6 = this.A03;
                C107266gT r43 = (C107266gT) this.A04;
                AnonymousClass7Kx r35 = (AnonymousClass7Kx) obj2;
                if (AnonymousClass7Kx.A0R(r35)) {
                    String str7 = (String) AnonymousClass7Kx.A0D(r35);
                    C002801h.A04(!queue.isEmpty(), "factors can not be empty!");
                    Object poll = queue.poll();
                    poll.getClass();
                    C115406v0 r24 = (C115406v0) poll;
                    if ("SDC".equalsIgnoreCase(r24.A00)) {
                        AnonymousClass7Kz.A0J();
                        throw C18190wL.A0a("SDC auth factor not supported");
                    }
                    C107266gT A003 = AnonymousClass7BN.A00(r43.A01, r24, str7);
                    C128667k3 r56 = r102.A00;
                    if (r56 != null) {
                        r56.A01 = r24;
                        r56.A00 = A003;
                        r5 = r56;
                    } else {
                        C104996ci r112 = r102.A04;
                        AnonymousClass066 r63 = r102.A01;
                        if (r63 == null) {
                            r63 = r102.A02;
                            r63.getClass();
                        }
                        r5 = new C128677k4(r63, r72, r102.A03, A003, r102, r112, obj6, str6, queue);
                    }
                    Bundle bundle2 = A003.A01;
                    String A0j = C18190wL.A0j(bundle2, "AUTH_METHOD_TYPE");
                    List list2 = r102.A05;
                    list2.add(A0j);
                    C143688h9 r36 = AnonymousClass7Kz.A07().A07;
                    Map A012 = C121257Ff.A01(bundle2);
                    A012.put("DYNAMIC_AUTH_OPERATION_NAME", str6);
                    A012.put("DYNAMIC_AUTH_AUTH_TYPES", Collections.unmodifiableList(list2));
                    r36.Bb8("client_verify_dynamic_auth_display", Collections.unmodifiableMap(A012));
                    if ("BIO".equalsIgnoreCase(A0j)) {
                        M5J m5j2 = r102.A03.A02;
                        AnonymousClass066 r03 = r102.A01;
                        if (r03 == null) {
                            r03 = r102.A02;
                            r03.getClass();
                        }
                        AnonymousClass7Kx.A0F(r03, m5j2, new IDxObserverShape55S0300000_2_I2(21, (Object) A003, (Object) r5, (Object) r102));
                        return;
                    }
                    AnonymousClass7Ic.A02(r5, A003, r102);
                    return;
                }
                r72.A0G(AnonymousClass7Kx.A0C(r35.A02));
                return;
        }
    }
}
