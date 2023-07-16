package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.impls.ComponentDataMutationResponseImpl;
import com.facebook.graphql.impls.CredentialResponseImpl;
import com.facebook.graphql.impls.CreditCardCredentialImpl;
import com.facebook.graphql.impls.SharedPaymentsErrorImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxFunctionShape17S1200000_2_I2;
import com.facebook.redex.IDxFunctionShape326S0100000_2_I2;
import com.facebook.redex.IDxObserverShape24S1200000_2_I2;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.fbpay.logging.LoggingContext;
import com.fbpay.util.boundresources.IDxBResourceShape1S1200000_2_I2;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape1S2200000_I2;
import kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1;

/* renamed from: X.7j4  reason: invalid class name and case insensitive filesystem */
public final class C128167j4 implements C145308kH {
    public static final C121037Du A05 = new C121037Du();
    public String A00 = "LIVE";
    public final AnonymousClass7IT A01 = new AnonymousClass7IT();
    public final C111796oQ A02 = new C111796oQ();
    public final C111806oR A03 = new C111806oR();
    public final Context A04;

    public static final M5J A01(C121207Et r10, C128167j4 r11, LoggingContext loggingContext, String str) {
        AnonymousClass7DP r0;
        C121207Et r9 = r10;
        AnonymousClass79R A002 = AnonymousClass6IY.A00(r10);
        C128167j4 r102 = r11;
        r11.A09(A002);
        C128957ke A003 = AnonymousClass7JJ.A00();
        List A0n = C18180wK.A0n(AnonymousClass69P.PAYMENT_METHOD);
        String str2 = r9.A08;
        boolean A0I = C04220Ms.A0I(str2, "PRE_WARM");
        OtcInput otcInput = r9.A03;
        if (otcInput != null) {
            r0 = AnonymousClass7DP.A00(otcInput);
        } else {
            r0 = null;
        }
        LinkedHashMap A0y = C18220wO.A0y();
        if (r0 != null) {
            AnonymousClass7Kr.A0B(r0, A0y);
        }
        LoggingContext loggingContext2 = loggingContext;
        A003.A0G(loggingContext2, str2, A0n, A0y, A0I);
        ImmutableList of = ImmutableList.of("PAYMENT_METHOD");
        C04220Ms.A06(of);
        r9.A00 = of;
        String str3 = r11.A00;
        String str4 = r9.A0A;
        if (!C04220Ms.A0I(str3, str4)) {
            r11.A00 = str4;
            AnonymousClass7Kx.A0J(AnonymousClass7IT.A00(r11.A01, AnonymousClass6IY.A00(r9)), (Object) null);
        }
        M5J A032 = new IDxBResourceShape1S1200000_2_I2(AnonymousClass7Kz.A0C(), r9, r102, str, 0).A03();
        C880756q A022 = AnonymousClass7IT.A02(r102, AnonymousClass6IY.A00(r9));
        C04220Ms.A06(A032);
        C121277Fh.A02(A032, A022, new IDxObserverShape55S0300000_2_I2(A022, r9, loggingContext2, 14));
        return A022;
    }

    public static final Throwable A03(ComponentDataMutationResponseImpl componentDataMutationResponseImpl) {
        ComponentDataMutationResponseImpl.FbpayAccountMutation A002;
        TreeJNI treeValue;
        TreeJNI reinterpret;
        TreeJNI A0M;
        SharedPaymentsErrorImpl sharedPaymentsErrorImpl;
        if (componentDataMutationResponseImpl == null || (A002 = componentDataMutationResponseImpl.A00()) == null || (treeValue = A002.getTreeValue("credential_response", ComponentDataMutationResponseImpl.FbpayAccountMutation.CredentialResponse.class)) == null || (reinterpret = treeValue.reinterpret(CredentialResponseImpl.class)) == null || (A0M = C86154wM.A0M(reinterpret, CredentialResponseImpl.Error.class)) == null || (sharedPaymentsErrorImpl = (SharedPaymentsErrorImpl) C86124wJ.A0T(A0M)) == null) {
            return null;
        }
        return AnonymousClass7Fb.A01(sharedPaymentsErrorImpl);
    }

    public final void A07(SparseArray sparseArray, AnonymousClass79R r13, AnonymousClass7Kx r14) {
        Object obj;
        int size;
        C1203179r r0;
        C880756q A022 = AnonymousClass7IT.A02(this, r13);
        if (AnonymousClass7Kx.A0R(r14) && (obj = r14.A01) != null && AnonymousClass7Kx.A0R(C86104wH.A0R(A022))) {
            obj.getClass();
            CredentialResponseImpl.Credential credential = (CredentialResponseImpl.Credential) ((TreeJNI) obj).getTreeValue("credential", CredentialResponseImpl.Credential.class);
            CreditCardCredentialImpl creditCardCredentialImpl = null;
            if (credential != null) {
                creditCardCredentialImpl = credential.A00();
            }
            if (creditCardCredentialImpl != null) {
                int i = 0;
                AnonymousClass7Kx A023 = A02(creditCardCredentialImpl, false);
                if (A023 != null) {
                    PaymentMethod paymentMethod = (PaymentMethod) AnonymousClass7Kx.A0D(A023);
                    C1203179r r5 = (C1203179r) AnonymousClass7Kx.A0D(C86104wH.A0R(A022));
                    List list = r5.A02;
                    C120917Dc.A00().A01(paymentMethod.Aal(), C121037Du.A01(sparseArray));
                    AnonymousClass7Kx A0R = C86104wH.A0R(A022);
                    if (A0R == null || (r0 = (C1203179r) A0R.A01) == null || !r0.A07) {
                        size = list.size();
                    } else {
                        Iterator it = list.iterator();
                        size = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                size = -1;
                                break;
                            }
                            Object obj2 = ((AnonymousClass7Kx) it.next()).A01;
                            if (obj2 instanceof CreditCard) {
                                C04220Ms.A0C(obj2, "null cannot be cast to non-null type com.facebookpay.paymentmethod.model.CreditCard");
                                CreditCardCredentialImpl creditCardCredentialImpl2 = ((CreditCard) obj2).A02;
                                AnonymousClass67L r2 = AnonymousClass67L.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                                AnonymousClass67L r1 = (AnonymousClass67L) C86104wH.A0a(creditCardCredentialImpl2, r2, "cc_type");
                                if (r1 == null) {
                                    r1 = r2;
                                }
                                if (r1 == AnonymousClass67L.CREDIT_CARD) {
                                    break;
                                }
                            }
                            size++;
                        }
                        CreditCardCredentialImpl creditCardCredentialImpl3 = ((CreditCard) paymentMethod).A02;
                        AnonymousClass67L r22 = AnonymousClass67L.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                        AnonymousClass67L r12 = (AnonymousClass67L) C86104wH.A0a(creditCardCredentialImpl3, r22, "cc_type");
                        if (r12 == null) {
                            r12 = r22;
                        }
                        if (r12 != AnonymousClass67L.DEBIT_CARD) {
                            i = size;
                            size = C86144wL.A0C(list, size);
                        }
                    }
                    if (size != 0) {
                        i++;
                    }
                    AnonymousClass7Kx.A0I(A022, C1203179r.A00(r5, paymentMethod.Aal(), AnonymousClass7BD.A02(A023, list, AnonymousClass8XP.A00, i), 478));
                    return;
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
    }

    public final synchronized void A09(AnonymousClass79R r4) {
        C880756q A022 = AnonymousClass7IT.A02(this, r4);
        A022.A0H(AnonymousClass7Kx.A03(AnonymousClass7TL.A00, C86104wH.A0R(A022)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r7 == -1) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.AnonymousClass79R r11, X.AnonymousClass7Kx r12, java.lang.String r13) {
        /*
            r10 = this;
            r2 = 0
            boolean r9 = X.C18200wM.A1Z(r13)
            X.56q r5 = X.AnonymousClass7IT.A02(r10, r11)
            X.7Kx r0 = X.C86104wH.A0R(r5)
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r0)
            X.79r r0 = (X.C1203179r) r0
            java.util.List r8 = r0.A02
            X.7Kx r0 = X.C86104wH.A0R(r5)
            java.lang.Object r4 = X.AnonymousClass7Kx.A0D(r0)
            X.79r r4 = (X.C1203179r) r4
            X.7Kx r0 = X.C86104wH.A0R(r5)
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r0 = r0.A01
            X.79r r0 = (X.C1203179r) r0
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r0.A07
            if (r0 != r9) goto L_0x00f8
            java.util.ListIterator r3 = X.C86144wL.A10(r8)
        L_0x0033:
            boolean r0 = r3.hasPrevious()
            r1 = -1
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r3.previous()
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r0 = r0.A01
            boolean r0 = r0 instanceof com.facebookpay.paymentmethod.model.PayPalCredential
            if (r0 == 0) goto L_0x0033
            int r7 = r3.nextIndex()
            if (r7 != r1) goto L_0x004d
        L_0x004c:
            r7 = 0
        L_0x004d:
            boolean r0 = X.AnonymousClass7Kx.A0R(r12)
            r6 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.Object r3 = X.AnonymousClass7Kx.A0D(r12)
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            java.lang.Class<com.facebook.graphql.impls.CredentialResponseImpl$Credential> r1 = com.facebook.graphql.impls.CredentialResponseImpl.Credential.class
            java.lang.String r0 = "credential"
            com.facebook.pando.TreeJNI r1 = r3.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x00fe
            java.lang.String r0 = "PAYPaymentPaypalBillingAgreement"
            boolean r0 = r1.isFulfilled(r0)
            if (r0 == 0) goto L_0x00fe
            java.lang.Class<com.facebook.graphql.impls.PaypalBAImpl> r0 = com.facebook.graphql.impls.PaypalBAImpl.class
            com.facebook.pando.TreeJNI r3 = r1.reinterpret(r0)
            com.facebook.graphql.impls.PaypalBAImpl r3 = (com.facebook.graphql.impls.PaypalBAImpl) r3
            if (r3 == 0) goto L_0x00fe
            com.facebookpay.paymentmethod.model.PayPalCredential r0 = new com.facebookpay.paymentmethod.model.PayPalCredential
            r0.<init>(r3, r6, r9)
            X.7Kx r1 = X.AnonymousClass7Kx.A0A(r0)
            kotlin.jvm.internal.KtLambdaShape9S1000000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape9S1000000_I2
            r0.<init>(r13, r2)
            java.util.List r2 = X.AnonymousClass7BD.A02(r1, r8, r0, r7)
            java.lang.String r0 = "credential_id"
            java.lang.String r1 = r3.getStringValue(r0)
            r0 = 478(0x1de, float:6.7E-43)
            X.79r r0 = X.C1203179r.A00(r4, r1, r2, r0)
        L_0x0094:
            X.AnonymousClass7Kx.A0I(r5, r0)
        L_0x0097:
            return
        L_0x0098:
            boolean r0 = X.AnonymousClass7Kx.A0O(r12)
            if (r0 == 0) goto L_0x00ab
            X.8XR r0 = X.AnonymousClass8XR.A00
            java.util.List r0 = X.AnonymousClass7BD.A01(r13, r8, r0)
        L_0x00a4:
            r1 = 510(0x1fe, float:7.15E-43)
            X.79r r0 = X.C1203179r.A00(r4, r6, r0, r1)
            goto L_0x0094
        L_0x00ab:
            boolean r0 = X.AnonymousClass7Kx.A0P(r12)
            if (r0 == 0) goto L_0x0097
            java.util.Iterator r9 = r8.iterator()
        L_0x00b5:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r3 = r9.next()
            r1 = r3
            X.7Kx r1 = (X.AnonymousClass7Kx) r1
            boolean r0 = X.AnonymousClass7Kx.A0P(r1)
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = r1.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = (com.facebookpay.paymentmethod.model.PaymentMethod) r0
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = r0.Aal()
        L_0x00d2:
            boolean r0 = X.C04220Ms.A0I(r0, r13)
            if (r0 == 0) goto L_0x00b5
            if (r3 != 0) goto L_0x0097
        L_0x00da:
            com.facebookpay.paymentmethod.model.PayPalCredential r0 = new com.facebookpay.paymentmethod.model.PayPalCredential
            r0.<init>(r6, r13, r2)
            X.7Kx r2 = X.AnonymousClass7Kx.A09(r0)
            java.util.ArrayList r1 = X.C18200wM.A0s(r8)
            int r0 = r8.size()
            if (r7 <= r0) goto L_0x00ee
            r7 = 0
        L_0x00ee:
            r1.add(r7, r2)
            java.util.List r0 = X.AnonymousClass00J.A0N(r1)
            goto L_0x00a4
        L_0x00f6:
            r0 = r6
            goto L_0x00d2
        L_0x00f8:
            int r7 = r8.size()
            goto L_0x004d
        L_0x00fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128167j4.A0A(X.79R, X.7Kx, java.lang.String):void");
    }

    private final M5J A00(GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000, OtcInput otcInput, C114996uJ r21, LoggingContext loggingContext, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        String str7;
        String str8;
        C1202479j r0;
        String str9 = str4;
        AnonymousClass7DP r7 = null;
        if (C04220Ms.A0I(str9, "CREATE")) {
            str7 = "pux_checkout";
        } else {
            str7 = null;
        }
        AnonymousClass7Kr r6 = AnonymousClass6XO.A00;
        C89345Dg r2 = new C89345Dg();
        r2.A04(AnonymousClass6BL.A00(AnonymousClass6BE.CREDENTIALS, r2, str9), "mutation_type");
        List A0n = C18180wK.A0n(r2);
        OtcInput otcInput2 = otcInput;
        if (otcInput != null) {
            r7 = new AnonymousClass7DP(true, otcInput2.A01);
        }
        LoggingContext loggingContext2 = loggingContext;
        r6.A0H(r7, loggingContext2, str9, str7, A0n, true);
        GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
        A002.A0F(str5, "credential_id");
        A002.A0F(str9, "mutation_type");
        GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S00000002 = gQLCallInputCInputShape0S0000000;
        if (gQLCallInputCInputShape0S0000000 != null) {
            A002.A0B(gQLCallInputCInputShape0S00000002, "save_credential_input");
        }
        if (i == 7) {
            if (str9.equals("CREATE")) {
                String str10 = str6;
                if (str6 != null) {
                    GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
                    A003.A0F(str10, "ba_token");
                    A002.A0B(A003, "complete_paypal_ba_linking_input");
                }
            }
            str8 = "PAYPAL_BA";
        } else {
            str8 = "CREDIT_CARD";
        }
        A002.A0F(str8, "credential_type");
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        A0L.A0D(str, AnonymousClass7C6.A00());
        String str11 = str2;
        C86144wL.A1I(A0L, str11, str3);
        A0L.A0B(A002, "credential_input");
        C116936xr.A01(A0L, otcInput2);
        C114996uJ r02 = r21;
        if (r21 != null) {
            r0 = C99056Hy.A00(new C114676ti(r02.A01, r02.A02), new KtLambdaShape4S1200000_I2_1(A0L, this, str11, 4), AnonymousClass8N6.A00, C86164wN.A0r(this, 36));
        } else {
            r0 = new AnonymousClass5k8(new IDxFunctionShape326S0100000_2_I2((Object) this, 24), new IDxFunctionShape17S1200000_2_I2((Object) A0L, (Object) this, str11, 6), AnonymousClass7Kz.A0C());
        }
        M5J A032 = r0.A03();
        C04220Ms.A06(A032);
        return C30821GXg.A01(A032, new KtLambdaShape1S2200000_I2(otcInput2, loggingContext2, str9, str7, 7));
    }

    public static final AnonymousClass7Kx A02(CreditCardCredentialImpl creditCardCredentialImpl, boolean z) {
        if (C04220Ms.A0I(creditCardCredentialImpl.getStringValue("__typename"), "ECPPrewarmCard") || C04220Ms.A0I(creditCardCredentialImpl.getStringValue("__typename"), "ExternalCreditCard") || C04220Ms.A0I(creditCardCredentialImpl.getStringValue("__typename"), "CreditCard")) {
            return AnonymousClass7Kx.A0A(new CreditCard(creditCardCredentialImpl, true, z));
        }
        return null;
    }

    public final M5J A05(C121207Et r7, LoggingContext loggingContext) {
        String str;
        String str2 = this.A00;
        String str3 = r7.A0A;
        boolean A1X = C86144wL.A1X(str2, str3);
        AnonymousClass79R A002 = AnonymousClass6IY.A00(r7);
        AnonymousClass7IT r3 = this.A01;
        C880756q A052 = r3.A05(A002);
        if (A1X || A052 == null) {
            this.A00 = str3;
            AnonymousClass7Kx.A0J(AnonymousClass7IT.A00(r3, A002), (Object) null);
            if (A052 == null) {
                str = "NETWORK_ONLY";
            } else if (A1X) {
                str = "PERSISTENT_UP_TO_DATE";
            }
            A01(r7, this, loggingContext, str);
        }
        return AnonymousClass7IT.A00(r3, A002);
    }

    public final AnonymousClass7Kx A06(AnonymousClass79R r2) {
        C1203179r r0;
        AnonymousClass7Kx A0R = C86104wH.A0R(AnonymousClass7IT.A00(this.A01, r2));
        if (A0R == null || (r0 = (C1203179r) A0R.A01) == null) {
            return null;
        }
        return (AnonymousClass7Kx) AnonymousClass00J.A0D(r0.A02);
    }

    public final void A08(AnonymousClass79R r4) {
        AnonymousClass7Kx A032;
        OtcInput otcInput = r4.A00;
        AnonymousClass7IT r1 = this.A01;
        if (otcInput != null) {
            r1.A00.remove(r4);
        } else if (r1.A00.containsKey(r4)) {
            C880756q A042 = r1.A04(r4);
            if (AnonymousClass7Kx.A0O(C86104wH.A0R(A042))) {
                A032 = AnonymousClass7Kx.A01();
            } else if (AnonymousClass7Kx.A0R(C86104wH.A0R(A042))) {
                A032 = AnonymousClass7Kx.A03(AnonymousClass7TM.A00, C86104wH.A0R(A042));
            } else {
                return;
            }
            A042.A0H(A032);
        }
    }

    public final M5J AHY(SparseArray sparseArray, OtcInput otcInput, OtcInput otcInput2, LoggingContext loggingContext, String str, String str2, String str3, int i) {
        String str4;
        Object obj = sparseArray.get(12);
        if (!(obj instanceof String) || (str4 = (String) obj) == null) {
            str4 = "";
        }
        OtcInput otcInput3 = otcInput;
        String str5 = str2;
        M5J A002 = A00((GQLCallInputCInputShape0S0000000) null, otcInput3, (C114996uJ) null, loggingContext, str, str5, str3, "DELETE", str4, (String) null, i);
        C880756q A022 = AnonymousClass7IT.A02(this, new AnonymousClass79R(otcInput3, str5));
        A022.A0K(A002, new IDxObserverShape24S1200000_2_I2(A022, A002, str4, 0));
        return A002;
    }

    public final M5J Ch5(SparseArray sparseArray, OtcInput otcInput, OtcInput otcInput2, LoggingContext loggingContext, String str, String str2, String str3, int i) {
        String str4;
        C114996uJ A022;
        String str5;
        String str6 = str;
        String str7 = str2;
        AnonymousClass0wJ.A1O(str6, str7);
        LoggingContext loggingContext2 = loggingContext;
        String str8 = str3;
        C18190wL.A1S(str8, 3, loggingContext2);
        SparseArray sparseArray2 = sparseArray;
        String A002 = AnonymousClass6I4.A00(sparseArray2, 12);
        C121037Du r3 = A05;
        OtcInput otcInput3 = otcInput;
        if (A002 == null || A002.length() == 0 || otcInput != null) {
            str4 = "CREATE";
        } else {
            str4 = "UPDATE";
        }
        String A0y = C86124wJ.A0y(AnonymousClass73F.A00);
        GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000 = null;
        int i2 = i;
        if (i2 == 3) {
            A022 = r3.A02(this.A04, sparseArray2, otcInput3, str8);
            str5 = null;
            gQLCallInputCInputShape0S0000000 = A022.A00;
        } else if (i2 == 7) {
            str5 = AnonymousClass6I4.A00(sparseArray2, 32);
            A022 = null;
        } else {
            throw C18240wQ.A0j();
        }
        M5J A003 = A00(gQLCallInputCInputShape0S0000000, otcInput3, A022, loggingContext2, str6, str7, str8, str4, A002, str5, i2);
        AnonymousClass79R r4 = new AnonymousClass79R(otcInput3, str7);
        C880756q A023 = AnonymousClass7IT.A02(this, r4);
        A023.A0K(A003, new C123997aH(sparseArray2, A003, A023, r4, this, str4, A0y, i2));
        return C30821GXg.A01(A003, AnonymousClass8N8.A00);
    }

    public C128167j4(Context context) {
        this.A04 = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0045 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A04(java.util.List r10) {
        /*
            java.util.Iterator r2 = r10.iterator()
            r4 = 0
        L_0x0005:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003d
            com.facebook.pando.TreeJNI r1 = X.C18210wN.A0G(r2)
            java.lang.String r0 = "PAYTokenizedCard"
            boolean r0 = r1.isFulfilled(r0)
            if (r0 == 0) goto L_0x0005
            java.lang.Class<com.facebook.graphql.impls.TokenizedCardCredentialImpl> r0 = com.facebook.graphql.impls.TokenizedCardCredentialImpl.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r0)
            if (r1 == 0) goto L_0x0005
            java.lang.String r0 = "issuer_card_art_url"
            java.lang.String r0 = r1.getStringValue(r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 != 0) goto L_0x0005
            java.lang.String r0 = "issuer_name"
            java.lang.String r0 = r1.getStringValue(r0)
            if (r0 == 0) goto L_0x0005
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 != 0) goto L_0x0005
            r4 = 1
            goto L_0x0005
        L_0x003d:
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r10 = r10.iterator()
        L_0x0045:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0149
            com.facebook.pando.TreeJNI r5 = X.C18210wN.A0G(r10)
            java.lang.String r1 = "PAYPaymentPaypalBillingAgreement"
            boolean r0 = r5.isFulfilled(r1)
            if (r0 != 0) goto L_0x0141
            r0 = 0
        L_0x0058:
            r6 = 0
            if (r0 == 0) goto L_0x0080
            boolean r0 = r5.isFulfilled(r1)
            if (r0 != 0) goto L_0x0077
            r0 = 0
        L_0x0062:
            java.lang.String r1 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.api.sharedfragment.PaypalBA"
            X.C04220Ms.A0C(r0, r1)
            r1 = 1
            com.facebookpay.paymentmethod.model.PayPalCredential r8 = new com.facebookpay.paymentmethod.model.PayPalCredential
            r8.<init>(r0, r6, r1)
        L_0x006d:
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r8)
        L_0x0071:
            if (r0 == 0) goto L_0x0045
            r3.add(r0)
            goto L_0x0045
        L_0x0077:
            java.lang.Class<com.facebook.graphql.impls.PaypalBAImpl> r0 = com.facebook.graphql.impls.PaypalBAImpl.class
            com.facebook.pando.TreeJNI r0 = r5.reinterpret(r0)
            com.facebook.graphql.impls.PaypalBAImpl r0 = (com.facebook.graphql.impls.PaypalBAImpl) r0
            goto L_0x0062
        L_0x0080:
            java.lang.String r9 = "PAYTokenizedCard"
            boolean r0 = r5.isFulfilled(r9)
            if (r0 != 0) goto L_0x00eb
            r0 = 0
        L_0x0089:
            java.lang.String r8 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.api.sharedfragment.CreditCardCredential"
            java.lang.String r2 = "PAYCreditCard"
            boolean r1 = r5.isFulfilled(r2)
            if (r1 != 0) goto L_0x00e2
            r7 = 0
        L_0x0094:
            if (r0 == 0) goto L_0x00f2
            X.C04220Ms.A0C(r7, r8)
            boolean r0 = r5.isFulfilled(r9)
            if (r0 != 0) goto L_0x00d9
            r0 = 0
        L_0x00a0:
            java.lang.String r1 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.api.sharedfragment.TokenizedCardCredential"
            X.C04220Ms.A0C(r0, r1)
            r8 = 0
            if (r0 == 0) goto L_0x00b0
            X.67K r2 = X.AnonymousClass67K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "token_status"
            java.lang.Enum r6 = X.C86104wH.A0a(r0, r2, r1)
        L_0x00b0:
            java.lang.String r1 = "__typename"
            java.lang.String r2 = r7.getStringValue(r1)
            java.lang.String r1 = "PAYFBPayCardToken"
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 == 0) goto L_0x006d
            if (r6 == 0) goto L_0x006d
            X.67K r5 = X.AnonymousClass67K.ACTIVE
            X.67K r1 = X.AnonymousClass67K.SUSPENDED
            r2 = 1
            X.67K[] r1 = new X.AnonymousClass67K[]{r5, r1}
            java.util.Set r1 = X.AnonymousClass4WM.A08(r1)
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L_0x006d
            com.facebookpay.paymentmethod.model.TokenizedCard r8 = new com.facebookpay.paymentmethod.model.TokenizedCard
            r8.<init>(r7, r0, r2, r4)
            goto L_0x006d
        L_0x00d9:
            java.lang.Class<com.facebook.graphql.impls.TokenizedCardCredentialImpl> r0 = com.facebook.graphql.impls.TokenizedCardCredentialImpl.class
            com.facebook.pando.TreeJNI r0 = r5.reinterpret(r0)
            com.facebook.graphql.impls.TokenizedCardCredentialImpl r0 = (com.facebook.graphql.impls.TokenizedCardCredentialImpl) r0
            goto L_0x00a0
        L_0x00e2:
            java.lang.Class<com.facebook.graphql.impls.CreditCardCredentialImpl> r1 = com.facebook.graphql.impls.CreditCardCredentialImpl.class
            com.facebook.pando.TreeJNI r7 = r5.reinterpret(r1)
            com.facebook.graphql.impls.CreditCardCredentialImpl r7 = (com.facebook.graphql.impls.CreditCardCredentialImpl) r7
            goto L_0x0094
        L_0x00eb:
            java.lang.Class<com.facebook.graphql.impls.TokenizedCardCredentialImpl> r0 = com.facebook.graphql.impls.TokenizedCardCredentialImpl.class
            com.facebook.pando.TreeJNI r0 = r5.reinterpret(r0)
            goto L_0x0089
        L_0x00f2:
            if (r7 == 0) goto L_0x010d
            boolean r0 = r5.isFulfilled(r2)
            if (r0 != 0) goto L_0x0104
            r0 = 0
        L_0x00fb:
            X.C04220Ms.A0C(r0, r8)
            X.7Kx r0 = A02(r0, r4)
            goto L_0x0071
        L_0x0104:
            java.lang.Class<com.facebook.graphql.impls.CreditCardCredentialImpl> r0 = com.facebook.graphql.impls.CreditCardCredentialImpl.class
            com.facebook.pando.TreeJNI r0 = r5.reinterpret(r0)
            com.facebook.graphql.impls.CreditCardCredentialImpl r0 = (com.facebook.graphql.impls.CreditCardCredentialImpl) r0
            goto L_0x00fb
        L_0x010d:
            java.lang.String r2 = "PAYAlternativePaymentMethodCredential"
            boolean r0 = r5.isFulfilled(r2)
            if (r0 == 0) goto L_0x0045
            java.lang.Class<com.facebook.graphql.impls.AlternativePaymentMethodImpl> r1 = com.facebook.graphql.impls.AlternativePaymentMethodImpl.class
            com.facebook.pando.TreeJNI r0 = r5.reinterpret(r1)
            if (r0 == 0) goto L_0x0045
            boolean r0 = r5.isFulfilled(r2)
            if (r0 != 0) goto L_0x013a
            r1 = 0
        L_0x0124:
            X.LcE r2 = X.C40307LcE.A07
            java.lang.String r0 = "credential_type"
            java.lang.Enum r2 = X.C86104wH.A0a(r5, r2, r0)
            X.LcE r2 = (X.C40307LcE) r2
            if (r1 == 0) goto L_0x0045
            if (r2 == 0) goto L_0x0045
            r0 = 1
            com.facebookpay.paymentmethod.model.APMCredential r8 = new com.facebookpay.paymentmethod.model.APMCredential
            r8.<init>(r1, r2, r0)
            goto L_0x006d
        L_0x013a:
            com.facebook.pando.TreeJNI r1 = r5.reinterpret(r1)
            com.facebook.graphql.impls.AlternativePaymentMethodImpl r1 = (com.facebook.graphql.impls.AlternativePaymentMethodImpl) r1
            goto L_0x0124
        L_0x0141:
            java.lang.Class<com.facebook.graphql.impls.PaypalBAImpl> r0 = com.facebook.graphql.impls.PaypalBAImpl.class
            com.facebook.pando.TreeJNI r0 = r5.reinterpret(r0)
            goto L_0x0058
        L_0x0149:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128167j4.A04(java.util.List):java.util.List");
    }
}
