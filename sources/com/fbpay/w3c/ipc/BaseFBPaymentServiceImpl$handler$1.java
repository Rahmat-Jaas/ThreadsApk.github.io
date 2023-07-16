package com.fbpay.w3c.ipc;

import X.AnonymousClass0wJ;
import X.AnonymousClass3VE;
import X.AnonymousClass7Kz;
import X.AnonymousClass813;
import X.AnonymousClass814;
import X.AnonymousClass815;
import X.AnonymousClass8bP;
import X.AnonymousClass8bQ;
import X.C04220Ms;
import X.C111136mq;
import X.C113406rL;
import X.C113806sA;
import X.C128877kW;
import X.C14030oh;
import X.C18190wL;
import X.C86144wL;
import X.C86154wM;
import X.C86164wN;
import X.C880056g;
import X.C99246Ir;
import X.C99256Is;
import android.util.SparseArray;
import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.FBPaymentService;
import com.fbpay.w3c.FBPaymentServiceAddCardCallback;
import com.fbpay.w3c.FBPaymentServiceAddressCallback;
import com.fbpay.w3c.FBPaymentServiceCardDetailsCallback;
import com.fbpay.w3c.FBPaymentServiceContactCallback;
import com.fbpay.w3c.FBPaymentServiceRemoveCardCallback$Stub$Proxy;
import com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl;
import java.util.Collections;

public final class BaseFBPaymentServiceImpl$handler$1 extends FBPaymentService.Stub {
    public final /* synthetic */ FBPaymentServiceImpl A00;

    public BaseFBPaymentServiceImpl$handler$1(FBPaymentServiceImpl fBPaymentServiceImpl) {
        this.A00 = fBPaymentServiceImpl;
        C14030oh.A0A(1046190929, C14030oh.A03(1934758393));
    }

    public final void A5Z(FBPaymentServiceAddressCallback fBPaymentServiceAddressCallback) {
        int i;
        int A002 = AnonymousClass0wJ.A00(-883036859, fBPaymentServiceAddressCallback);
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A00;
        AnonymousClass3VE r0 = fBPaymentServiceImpl.A01;
        if (r0 == null || !r0.A00(fBPaymentServiceImpl)) {
            fBPaymentServiceAddressCallback.CRf(Collections.emptyList());
            i = 2117006956;
        } else {
            fBPaymentServiceImpl.A00.post(new AnonymousClass813(fBPaymentServiceAddressCallback, fBPaymentServiceImpl));
            i = -695082795;
        }
        C14030oh.A0A(i, A002);
    }

    public final void A5k(CardDetails cardDetails, FBPaymentServiceAddCardCallback fBPaymentServiceAddCardCallback) {
        IllegalArgumentException illegalArgumentException;
        int intValue;
        int length;
        int A03 = C14030oh.A03(-1744128742);
        int A1Z = AnonymousClass0wJ.A1Z(cardDetails, fBPaymentServiceAddCardCallback);
        try {
            Integer num = cardDetails.A03;
            if (num == null || num.intValue() < 2000) {
                illegalArgumentException = C18190wL.A0a("expiryYear is not defined");
            } else {
                Integer num2 = cardDetails.A02;
                if (num2 == null || A1Z > (intValue = num2.intValue()) || intValue >= 13) {
                    illegalArgumentException = C18190wL.A0a("expiryMonth is not defined");
                } else {
                    String str = cardDetails.A08;
                    if (str == null || 3 > (length = AnonymousClass8bP.A0P(str).length()) || length >= 5) {
                        illegalArgumentException = C18190wL.A0a("csc is not defined");
                    } else {
                        String str2 = cardDetails.A06;
                        if (str2 == null || AnonymousClass8bQ.A0n(str2)) {
                            illegalArgumentException = C18190wL.A0a("pan is not defined");
                        } else {
                            AnonymousClass7Kz.A0J();
                            FBPaymentServiceImpl fBPaymentServiceImpl = this.A00;
                            C113406rL r0 = fBPaymentServiceImpl.A02;
                            if (r0 != null) {
                                C111136mq r7 = (C111136mq) r0.A00.get();
                                C128877kW r6 = new C128877kW(r7.A05.A00, "IAB_AUTOFILL");
                                SparseArray A0D = C86154wM.A0D();
                                String format = String.format("%02d%02d", C86144wL.A1a(num2, Integer.valueOf(num.intValue() % 100)));
                                C04220Ms.A06(format);
                                A0D.append(14, format);
                                A0D.append(15, str);
                                A0D.append(13, str2);
                                Address address = cardDetails.A00;
                                if (address != null) {
                                    String str3 = address.A00;
                                    if (str3 != null && AnonymousClass8bQ.A0m(str3)) {
                                        A0D.append(2, str3);
                                    }
                                    String str4 = address.A05;
                                    if (str4 != null && AnonymousClass8bQ.A0m(str4)) {
                                        A0D.append(5, str4);
                                    }
                                    String str5 = address.A06;
                                    if (str5 != null && AnonymousClass8bQ.A0m(str5)) {
                                        A0D.append(6, str5);
                                    }
                                    String str6 = address.A01;
                                    if (str6 != null && AnonymousClass8bQ.A0m(str6)) {
                                        A0D.append(7, str6);
                                    }
                                    String str7 = address.A04;
                                    if (str7 != null && AnonymousClass8bQ.A0m(str7)) {
                                        A0D.append(8, str7);
                                    }
                                    String str8 = address.A02;
                                    if (str8 != null && AnonymousClass8bQ.A0m(str8)) {
                                        A0D.append(21, str8);
                                    }
                                    String str9 = address.A07;
                                    if (str9 != null && AnonymousClass8bQ.A0m(str9)) {
                                        A0D.append(9, str9);
                                    }
                                }
                                C99256Is.A00(fBPaymentServiceImpl, new C880056g(C99246Ir.A00(r6.Ch4(A0D, (C113806sA) null), C86164wN.A0s(r7, 13))), C86164wN.A0s(fBPaymentServiceAddCardCallback, 17));
                            }
                            C14030oh.A0A(1054264253, A03);
                            return;
                        }
                    }
                }
            }
            throw illegalArgumentException;
        } catch (IllegalArgumentException e) {
            fBPaymentServiceAddCardCallback.onError(e.getMessage());
            C14030oh.A0A(304829274, A03);
        }
    }

    public final void A5l(FBPaymentServiceCardDetailsCallback fBPaymentServiceCardDetailsCallback) {
        int i;
        int A002 = AnonymousClass0wJ.A00(172746894, fBPaymentServiceCardDetailsCallback);
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A00;
        AnonymousClass3VE r0 = fBPaymentServiceImpl.A01;
        if (r0 == null || !r0.A00(fBPaymentServiceImpl)) {
            fBPaymentServiceCardDetailsCallback.CRf(Collections.emptyList());
            i = -1033120705;
        } else {
            fBPaymentServiceImpl.A00.post(new AnonymousClass814(fBPaymentServiceCardDetailsCallback, fBPaymentServiceImpl));
            i = 2026234444;
        }
        C14030oh.A0A(i, A002);
    }

    public final void A5q(FBPaymentServiceContactCallback fBPaymentServiceContactCallback) {
        int i;
        int A002 = AnonymousClass0wJ.A00(-497492689, fBPaymentServiceContactCallback);
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A00;
        AnonymousClass3VE r0 = fBPaymentServiceImpl.A01;
        if (r0 == null || !r0.A00(fBPaymentServiceImpl)) {
            fBPaymentServiceContactCallback.CRf(Collections.emptyList());
            i = 289163115;
        } else {
            fBPaymentServiceImpl.A00.post(new AnonymousClass815(fBPaymentServiceContactCallback, fBPaymentServiceImpl));
            i = 1339713357;
        }
        C14030oh.A0A(i, A002);
    }

    public final void CbZ(String str, FBPaymentServiceRemoveCardCallback$Stub$Proxy fBPaymentServiceRemoveCardCallback$Stub$Proxy) {
        int A03 = C14030oh.A03(1809951111);
        AnonymousClass0wJ.A1N(str, fBPaymentServiceRemoveCardCallback$Stub$Proxy);
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A00;
        C113406rL r0 = fBPaymentServiceImpl.A02;
        if (r0 != null) {
            C111136mq r7 = (C111136mq) r0.A00.get();
            SparseArray A0D = C86154wM.A0D();
            A0D.put(20, str);
            C99256Is.A00(fBPaymentServiceImpl, new C880056g(C99246Ir.A00(new C128877kW(r7.A05.A00, "IAB_AUTOFILL").Cc3(A0D, (C113806sA) null), C86164wN.A0s(r7, 14))), C86164wN.A0s(fBPaymentServiceRemoveCardCallback$Stub$Proxy, 20));
        }
        C14030oh.A0A(-807957548, A03);
    }
}
