package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl;
import com.facebook.graphql.impls.PaymentMethodComponentImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxFunctionShape17S1200000_2_I2;
import com.facebook.redex.IDxFunctionShape326S0100000_2_I2;
import com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.otc.models.OtcInput;
import com.fbpay.logging.LoggingContext;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape29S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape3S1210000_I2;
import kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1;

/* renamed from: X.58J  reason: invalid class name */
public final class AnonymousClass58J extends C62793ak {
    public ECPHandler A00;
    public C883057n A01;
    public LoggingContext A02;
    public AnonymousClass7Kx A03;
    public AnonymousClass7Kx A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final M5J A09;
    public final C880756q A0A;
    public final C880756q A0B;
    public final C880756q A0C;
    public final C880856r A0D;
    public final C880856r A0E = C880856r.A03();
    public final C880856r A0F = C880856r.A03();
    public final C880856r A0G;
    public final C880856r A0H;
    public final C880856r A0I;
    public final C880856r A0J;
    public final C143158gC A0K;
    public final C143158gC A0L;
    public final C143158gC A0M;
    public final C143158gC A0N;
    public final C143158gC A0O;
    public final C104866cV A0P;
    public final AnonymousClass78P A0Q;
    public final AnonymousClass588 A0R;
    public final AnonymousClass587 A0S;
    public final AnonymousClass58K A0T;
    public final Map A0U;

    public static /* synthetic */ void A03(AnonymousClass58J r6, AnonymousClass69P r7, C40307LcE lcE, String str, Throwable th, int i, boolean z) {
        Map map;
        String str2;
        String str3 = null;
        if ((i & 16) != 0) {
            th = null;
        }
        if ((i & 32) != 0) {
            lcE = null;
        }
        C04220Ms.A0B(r7, 0);
        C104866cV r3 = r6.A0P;
        LoggingContext loggingContext = r6.A02;
        if (loggingContext == null) {
            C86124wJ.A19();
            throw null;
        }
        AnonymousClass7DP A032 = r6.A0S.A03();
        if (!z && th != null) {
            str3 = C117026y0.A01(th);
        }
        LinkedHashMap A0y = C18220wO.A0y();
        C86164wN.A1K(loggingContext, A0y);
        if (str != null) {
            A0y.put("VIEW_NAME", str);
        }
        C86134wK.A1O(lcE, A0y);
        if (str3 != null) {
            AnonymousClass7Kr.A0D(str3, "error_message", A0y);
        }
        Object obj = A0y.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof C03740Kn) && !(obj instanceof AnonymousClass0WC)) || (map = (Map) obj) == null)) {
            map = C18220wO.A0y();
        }
        Map A042 = AnonymousClass7Kr.A04(A032, A0y, map);
        Object obj2 = r3.A00.get(C18180wK.A0p(r7, str));
        if (obj2 != null) {
            C110316lU r32 = (C110316lU) obj2;
            if (r32.A00 != null) {
                Map linkedHashMap = new LinkedHashMap(A042);
                A042 = linkedHashMap;
                AnonymousClass7Kr.A0D("true", "is_reload", C03940Lk.A02(linkedHashMap));
            } else {
                r32.A00 = Boolean.valueOf(z);
            }
            C128957ke A012 = AnonymousClass7JJ.A01();
            if (z) {
                str2 = r32.A04;
            } else {
                str2 = r32.A02;
            }
            A012.Bb8(str2, AnonymousClass4WJ.A0E(A042));
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void A0C(LoggingContext loggingContext, Integer num) {
        String str;
        C04220Ms.A0B(num, 0);
        if (num == AnonymousClass006.A00) {
            AnonymousClass7JJ.A00().A0H(loggingContext, "nux_checkout", AnonymousClass7Kr.A07(this.A0S));
        }
        ECPHandler eCPHandler = this.A00;
        if (eCPHandler != null) {
            C880856r r1 = this.A0H;
            Object A082 = r1.A08();
            if (A082 != null) {
                String str2 = ((ECPPaymentRequest) A082).A0A;
                Object A083 = r1.A08();
                if (A083 != null) {
                    String str3 = ((ECPPaymentRequest) A083).A08;
                    Object A084 = r1.A08();
                    if (A084 != null) {
                        String str4 = ((ECPPaymentRequest) A084).A07;
                        Object A085 = r1.A08();
                        if (A085 != null) {
                            PaymentReceiverInfo paymentReceiverInfo = ((ECPPaymentRequest) A085).A05;
                            if (paymentReceiverInfo != null) {
                                str = paymentReceiverInfo.A02;
                            } else {
                                str = null;
                            }
                            eCPHandler.BN9(new C110326lV(this.A0S.A02((AnonymousClass69P) null, true), str2, str3, str4, str), loggingContext, num);
                            return;
                        }
                        throw C18180wK.A0a("Required value was null.");
                    }
                    throw C18180wK.A0a("Required value was null.");
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public static final int A00(AnonymousClass58J r2) {
        C40307LcE lcE;
        PaymentMethodComponentImpl.NewPaymentCredentialOptions newPaymentCredentialOptions = (PaymentMethodComponentImpl.NewPaymentCredentialOptions) r2.A0F.A08();
        if (newPaymentCredentialOptions != null) {
            lcE = C122157Kv.A0I(newPaymentCredentialOptions);
        } else {
            lcE = null;
        }
        if (lcE == C40307LcE.A04) {
            return 2131826569;
        }
        return 2131826524;
    }

    public static final AnonymousClass75W A01(AnonymousClass58J r20, C92005hR r21, int i) {
        ECPPaymentConfiguration eCPPaymentConfiguration;
        KnownData knownData;
        String str;
        int indexOf;
        String str2;
        AnonymousClass58J r4 = r20;
        ECPPaymentRequest A0a = C86124wJ.A0a(r4.A0H);
        if (A0a == null || (eCPPaymentConfiguration = A0a.A03) == null || (knownData = eCPPaymentConfiguration.A01) == null) {
            return null;
        }
        List A062 = r4.A06();
        boolean z = r4.A08;
        boolean z2 = r4.A06;
        boolean z3 = r4.A05;
        int i2 = i;
        KtLambdaShape29S0201000_I2 ktLambdaShape29S0201000_I2 = new KtLambdaShape29S0201000_I2(i2, 0, r4, r21);
        C04220Ms.A0B(A062, 2);
        if (i == 0) {
            if (z) {
                str = knownData.A03;
            } else {
                str = null;
            }
            indexOf = A062.indexOf(AnonymousClass69P.CONTACT_INFORMATION);
            str2 = null;
        } else if (i2 == 1) {
            str = knownData.A01;
            if (z) {
                str2 = knownData.A03;
            } else {
                str2 = null;
            }
            indexOf = A062.indexOf(AnonymousClass69P.CONTACT_INFORMATION);
        } else if (i2 == 2) {
            str = knownData.A02;
            str2 = AnonymousClass7CM.A00(knownData, (String) null, 7, false);
            indexOf = A062.indexOf(AnonymousClass69P.SHIPPING_ADDRESS);
        } else if (i2 == 5) {
            str = AnonymousClass7CM.A00(knownData, (String) null, 3, true);
            str2 = AnonymousClass7CM.A00(knownData, (String) null, 5, false);
            indexOf = A062.indexOf(AnonymousClass69P.SHIPPING_ADDRESS);
        } else {
            throw C18180wK.A0a("Incorrectly attempting to autofill a cell that is not supported");
        }
        if (str == null) {
            return null;
        }
        int size = A062.size();
        for (int i3 = indexOf + 1; i3 < size; i3++) {
            int ordinal = ((AnonymousClass69P) A062.get(i3)).ordinal();
            if (ordinal != 5) {
                if (ordinal == 23 && z3) {
                    str2 = AnonymousClass7CM.A00(knownData, str2, 6, false);
                }
            } else if (z || z2) {
                StringBuilder A0r = C18200wM.A0r();
                if (str2 != null) {
                    A0r.append(str2);
                }
                String str3 = knownData.A01;
                String str4 = ",\n";
                str2 = null;
                if (str3 != null && z2) {
                    if (A0r.length() > 0) {
                        A0r.append(str4);
                    }
                    A0r.append(str3);
                }
                String str5 = knownData.A03;
                if (str5 != null && z) {
                    if (str3 != null) {
                        str4 = " · ";
                    } else if (A0r.length() <= 0) {
                        str4 = "";
                    }
                    A0r.append(str4);
                    A0r.append(str5);
                }
                if (A0r.length() > 0) {
                    str2 = A0r.toString();
                }
            }
        }
        C92295hw r1 = new C92295hw(str, str2, (List) null, (List) null);
        r1.A00 = ktLambdaShape29S0201000_I2;
        return new AnonymousClass75W(new C128237jC(r4, i2), C06750aI.A17(new C92275hu(), r1));
    }

    private final boolean A05() {
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest A0a = C86124wJ.A0a(this.A0H);
        if (A0a == null || (checkoutConfiguration = A0a.A01) == null) {
            return false;
        }
        return C18190wL.A1Z(checkoutConfiguration.A06, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (X.C122157Kv.A0I(r0) != r1) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r4 = this;
            X.57n r0 = r4.A01
            if (r0 == 0) goto L_0x0056
            X.LcE r1 = X.C40307LcE.A03
            X.56r r0 = r4.A0F
            java.lang.Object r0 = r0.A08()
            com.facebook.graphql.impls.PaymentMethodComponentImpl$NewPaymentCredentialOptions r0 = (com.facebook.graphql.impls.PaymentMethodComponentImpl.NewPaymentCredentialOptions) r0
            if (r0 == 0) goto L_0x0017
            X.LcE r0 = X.C122157Kv.A0I(r0)
            r3 = 1
            if (r0 == r1) goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            X.57n r1 = r4.A01
            java.lang.String r2 = "formViewModel"
            if (r1 == 0) goto L_0x0057
            r0 = 13
            X.7Ih r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0029
            r0.A0I(r3)
        L_0x0029:
            X.57n r1 = r4.A01
            if (r1 == 0) goto L_0x0057
            r0 = 28
            X.7Ih r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0038
            r0.A0I(r3)
        L_0x0038:
            X.57n r1 = r4.A01
            if (r1 == 0) goto L_0x0057
            r0 = 27
            X.7Ih r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0047
            r0.A0I(r3)
        L_0x0047:
            X.57n r1 = r4.A01
            if (r1 == 0) goto L_0x0057
            r0 = 16
            X.7Ih r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0056
            r0.A0I(r3)
        L_0x0056:
            return
        L_0x0057:
            X.C04220Ms.A0E(r2)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58J.A08():void");
    }

    public final void A0A(SparseArray sparseArray, AnonymousClass066 r31) {
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        String str;
        AnonymousClass7DP r0;
        C1202479j r02;
        GQLCallInputCInputShape0S0000000 A002;
        String str2;
        String str3;
        String str4;
        String str5;
        ECPPaymentRequest A0a;
        PaymentReceiverInfo paymentReceiverInfo;
        PaymentReceiverInfo paymentReceiverInfo2;
        C92055hW r5;
        boolean z;
        SparseArray sparseArray4;
        AnonymousClass7Ih A0L2;
        AnonymousClass7Ih A0L3;
        SparseArray A0E2;
        SparseArray sparseArray5 = sparseArray;
        if (!AnonymousClass7Kx.A0P(C86104wH.A0R(this.A0I))) {
            if (sparseArray == null) {
                C883057n r2 = this.A01;
                if (r2 == null) {
                    C04220Ms.A0E("formViewModel");
                    throw null;
                }
                AnonymousClass7Ih A012 = r2.A01(13);
                if (A012 instanceof C92035hU) {
                    r5 = (C92055hW) A012;
                    if (r5 != null) {
                        sparseArray5 = r5.A0E();
                    }
                    sparseArray5 = null;
                } else {
                    r5 = null;
                    sparseArray5 = null;
                }
                if (r5 == null || (A0L3 = r5.A0L(28)) == null || (A0E2 = A0L3.A0E()) == null || (z = A0E2.get(29)) == null) {
                    z = false;
                }
                boolean A1X = AnonymousClass0wJ.A1X(z);
                if (sparseArray5 != null) {
                    if (A1X) {
                        C883057n r1 = this.A01;
                        if (r1 == null) {
                            C04220Ms.A0E("formViewModel");
                            throw null;
                        }
                        AnonymousClass7Ih A013 = r1.A01(11);
                        if (A013 != null) {
                            sparseArray4 = A013.A0E();
                        }
                    } else if (!(r5 == null || (A0L2 = r5.A0L(28)) == null)) {
                        sparseArray4 = A0L2.A0E();
                    }
                    if (sparseArray4 != null) {
                        int size = sparseArray4.size();
                        for (int i = 0; i < size; i++) {
                            C86134wK.A1A(sparseArray4, sparseArray5, i);
                        }
                    }
                }
                A04(C40307LcE.A03, "add_card_nux");
            } else {
                A04(C40307LcE.A04, "add_paypal_nux");
            }
            C883057n r12 = this.A01;
            if (r12 == null) {
                C04220Ms.A0E("formViewModel");
                throw null;
            }
            AnonymousClass7Ih A014 = r12.A01(11);
            if (A014 != null) {
                sparseArray2 = A014.A0E();
            } else {
                sparseArray2 = null;
            }
            C883057n r22 = this.A01;
            if (r22 == null) {
                C04220Ms.A0E("formViewModel");
                throw null;
            }
            AnonymousClass7Ih A015 = r22.A01(36);
            if (A015 != null) {
                sparseArray3 = A015.A0E();
            } else {
                sparseArray3 = null;
            }
            C120927Dd r7 = AnonymousClass7Kz.A05().A06;
            C880856r r4 = this.A0H;
            Object A082 = r4.A08();
            if (A082 != null) {
                String str6 = ((ECPPaymentRequest) A082).A0A;
                Object A083 = r4.A08();
                if (A083 != null) {
                    String str7 = ((ECPPaymentRequest) A083).A08;
                    ECPPaymentRequest A0a2 = C86124wJ.A0a(r4);
                    if ((A0a2 == null || (paymentReceiverInfo2 = A0a2.A05) == null || (str = paymentReceiverInfo2.A00) == null) && ((A0a = C86124wJ.A0a(r4)) == null || (paymentReceiverInfo = A0a.A05) == null || (str = paymentReceiverInfo.A02) == null)) {
                        throw C18180wK.A0a("Required value was null.");
                    }
                    LoggingContext loggingContext = this.A02;
                    LoggingContext loggingContext2 = loggingContext;
                    if (loggingContext == null) {
                        C04220Ms.A0E("loggingContext");
                        throw null;
                    }
                    OtcInput A022 = this.A0S.A02((AnonymousClass69P) null, true);
                    GQLCallInputCInputShape1S0000000 A0L4 = C86154wM.A0L();
                    A0L4.A0D(str6, AnonymousClass7C6.A00());
                    C86144wL.A1I(A0L4, str7, str);
                    A0L4.A0B(C116936xr.A00(A022), "one_time_checkout_input");
                    String A0y = C86124wJ.A0y(AnonymousClass73F.A00);
                    AnonymousClass7Kr r222 = AnonymousClass6XO.A00;
                    ArrayList A0v = AnonymousClass0wJ.A0v();
                    if (sparseArray2 != null) {
                        A0v.add(C120927Dd.A00(AnonymousClass6BE.SHIPPING_ADDRESS));
                    }
                    if (sparseArray5 != null) {
                        A0v.add(C120927Dd.A00(AnonymousClass6BE.CREDENTIALS));
                    }
                    if (sparseArray3 != null) {
                        Object obj = sparseArray3.get(2);
                        Object obj2 = null;
                        if (!(obj instanceof String)) {
                            obj = null;
                        }
                        Object obj3 = sparseArray3.get(1);
                        if (!(obj3 instanceof String)) {
                            obj3 = null;
                        }
                        Object obj4 = sparseArray3.get(0);
                        if (obj4 instanceof String) {
                            obj2 = obj4;
                        }
                        if (obj != null) {
                            A0v.add(C120927Dd.A00(AnonymousClass6BE.NAME));
                        }
                        if (obj3 != null) {
                            A0v.add(C120927Dd.A00(AnonymousClass6BE.EMAIL));
                        }
                        if (obj2 != null) {
                            A0v.add(C120927Dd.A00(AnonymousClass6BE.PHONE));
                        }
                    }
                    if (A022 != null) {
                        r0 = new AnonymousClass7DP(true, A022.A01);
                    } else {
                        r0 = null;
                    }
                    r222.A0H(r0, loggingContext2, "CREATE", "nux_checkout", A0v, false);
                    if (sparseArray2 != null) {
                        GQLCallInputCInputShape0S0000000 A003 = C99096Ic.A00(sparseArray2, true);
                        GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
                        C86144wL.A1H(A004, "CREATE", "mutation_type");
                        A004.A0B(A003, "save_shipping_address_input");
                        A0L4.A0B(A004, "shipping_address_input");
                    }
                    if (sparseArray3 != null) {
                        C86114wI.A15(sparseArray3, A0L4, "CREATE", 2);
                        Object obj5 = sparseArray3.get(1);
                        if ((obj5 instanceof String) && (str5 = (String) obj5) != null) {
                            GQLCallInputCInputShape0S0000000 A005 = GraphQlCallInput.A00();
                            A005.A0D("skip_validation", true);
                            GQLCallInputCInputShape0S0000000 A006 = GraphQlCallInput.A00();
                            A006.A0D("is_default", true);
                            A006.A0F(str5, "user_input_email_address");
                            A005.A0B(A006, "save_email_input");
                            A005.A0F("CREATE", "mutation_type");
                            A0L4.A0B(A005, "email_input");
                        }
                        Object obj6 = sparseArray3.get(0);
                        if ((obj6 instanceof String) && (str4 = (String) obj6) != null) {
                            GQLCallInputCInputShape0S0000000 A007 = GraphQlCallInput.A00();
                            A007.A0D("skip_validation", true);
                            GQLCallInputCInputShape0S0000000 A008 = GraphQlCallInput.A00();
                            A008.A0D("is_default", true);
                            A008.A0F(str4, "raw_phone_number");
                            A008.A0F("US", "country_code");
                            A007.A0B(A008, "save_phone_input");
                            A007.A0F("CREATE", "mutation_type");
                            A0L4.A0B(A007, "phone_input");
                        }
                    }
                    C114996uJ r52 = null;
                    if (sparseArray5 != null) {
                        Object obj7 = sparseArray5.get(32);
                        if (!(obj7 instanceof String) || (str3 = (String) obj7) == null || str3.length() == 0) {
                            r52 = C128167j4.A05.A02(r7.A00, sparseArray5, A022, str);
                            A002 = GraphQlCallInput.A00();
                            A002.A0B(r52.A00, "save_credential_input");
                            A002.A0F("CREATE", "mutation_type");
                            str2 = "CREDIT_CARD";
                        } else {
                            GQLCallInputCInputShape0S0000000 A009 = GraphQlCallInput.A00();
                            A009.A0F(str3, "ba_token");
                            A002 = GraphQlCallInput.A00();
                            A002.A0B(A009, "complete_paypal_ba_linking_input");
                            A002.A0F("CREATE", "mutation_type");
                            str2 = "PAYPAL_BA";
                        }
                        A002.A0F(str2, "credential_type");
                        A0L4.A0B(A002, "credential_input");
                        if (r52 != null) {
                            r02 = C99056Hy.A00(new C114676ti(r52.A01, r52.A02), new KtLambdaShape4S1200000_I2_1(A0L4, r7, str7, 3), C139178My.A00, C86164wN.A0r(r7, 12));
                            M5J A032 = r02.A03();
                            C04220Ms.A06(A032);
                            AnonymousClass7Kx.A0G(r31, C30821GXg.A01(A032, new AnonymousClass8Ji(sparseArray5, sparseArray2, sparseArray3, r7, A022, loggingContext2, str7, A0y)), C86114wI.A0Q(this, 33));
                            return;
                        }
                    }
                    r02 = new AnonymousClass5k8(new IDxFunctionShape326S0100000_2_I2((Object) r7, 11), new IDxFunctionShape17S1200000_2_I2((Object) A0L4, (Object) r7, str7, 4), AnonymousClass7Kz.A0C());
                    M5J A0322 = r02.A03();
                    C04220Ms.A06(A0322);
                    AnonymousClass7Kx.A0G(r31, C30821GXg.A01(A0322, new AnonymousClass8Ji(sparseArray5, sparseArray2, sparseArray3, r7, A022, loggingContext2, str7, A0y)), C86114wI.A0Q(this, 33));
                    return;
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
    }

    public final void A0B(ECPHandler eCPHandler) {
        M5J D7U;
        if (eCPHandler != null) {
            ECPHandler eCPHandler2 = this.A00;
            if (eCPHandler2 == null || eCPHandler2.equals(eCPHandler)) {
                if (!C04220Ms.A0I(this.A00, eCPHandler)) {
                    AnonymousClass78P r3 = this.A0Q;
                    M5J D7U2 = eCPHandler.D7U();
                    C04220Ms.A0B(D7U2, 0);
                    r3.A09.A0K(D7U2, r3.A0B);
                }
                this.A00 = eCPHandler;
                if (A05()) {
                    C880756q r2 = this.A0B;
                    ECPHandler eCPHandler3 = this.A00;
                    if (eCPHandler3 == null || (D7U = eCPHandler3.D7U()) == null) {
                        throw AnonymousClass0wJ.A0b();
                    }
                    r2.A0K(D7U, this.A0N);
                    return;
                }
                return;
            }
            throw C18180wK.A0a("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
        }
        throw C18180wK.A0a("Attempting to set null value for EcpHandler. This will result in lossy event-handling behavior");
    }

    public final void A0E(boolean z, Throwable th) {
        C128957ke A002 = AnonymousClass7JJ.A00();
        LoggingContext loggingContext = this.A02;
        if (z) {
            if (loggingContext != null) {
                C128957ke.A03(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_load_ecpcheckout_success"), 278), loggingContext, AnonymousClass7Kr.A07(this.A0S), "nux_checkout", 28);
                return;
            }
        } else if (loggingContext != null) {
            LinkedHashMap A072 = AnonymousClass7Kr.A07(this.A0S);
            C86114wI.A1P(th, A072);
            C128957ke.A03(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_load_ecpcheckout_fail"), 276), loggingContext, A072, "nux_checkout", 26);
            return;
        }
        C04220Ms.A0E("loggingContext");
        throw null;
    }

    public AnonymousClass58J(AnonymousClass588 r14, AnonymousClass587 r15, AnonymousClass58K r16) {
        this.A0S = r15;
        this.A0R = r14;
        this.A0T = r16;
        AnonymousClass78P r0 = new AnonymousClass78P();
        this.A0Q = r0;
        this.A09 = r0.A09;
        this.A0D = C880856r.A03();
        AnonymousClass69P r2 = AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION;
        this.A0U = AnonymousClass4WJ.A0H(C18180wK.A0p(C18180wK.A0p(r2, "otc_fbpay_button"), new C1201078o(false)), C18180wK.A0p(C18180wK.A0p(r2, "otc_toggle"), new C1201078o(false)), C18180wK.A0p(C18180wK.A0p(AnonymousClass69P.TERMS, "nux_checkout"), new C1201078o(false)), C18180wK.A0p(C18180wK.A0p(AnonymousClass69P.ORDER_SUMMARY, "nux_checkout"), new C1201078o(false)), C18180wK.A0p(C18180wK.A0p(AnonymousClass69P.SHIPPING_OPTIONS, "nux_shipping_option"), new C1201078o(false)), C18180wK.A0p(C18180wK.A0p(AnonymousClass69P.SHIPPING_ADDRESS, "nux_shipping_address"), new C1201078o(false)));
        this.A0H = C880856r.A03();
        C880756q A012 = C880756q.A01();
        this.A0A = A012;
        C880756q A013 = C880756q.A01();
        this.A0B = A013;
        this.A0C = C880756q.A01();
        this.A0I = C880856r.A03();
        this.A0J = C880856r.A03();
        this.A0G = C880856r.A03();
        this.A0P = new C104866cV(AnonymousClass4WJ.A0G(C18180wK.A0p(C18180wK.A0p(AnonymousClass69P.CONTACT_INFORMATION, "nux_contact"), new C110316lU("client_load_contact_init", "client_load_contact_success", "client_load_contact_fail")), C18180wK.A0p(C18180wK.A0p(AnonymousClass69P.PAYMENT_METHOD, "nux_credential"), new C110316lU("client_load_credential_init", "client_load_credential_success", "client_load_credential_fail"))));
        AnonymousClass7Kx A092 = AnonymousClass7Kx.A09((Object) null);
        this.A04 = A092;
        AnonymousClass69U r8 = AnonymousClass69U.A0J;
        C04220Ms.A0C(A092, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A03 = AnonymousClass7Kx.A09(new PuxAccordionItem(r8, (C108826j0) null, A092, AnonymousClass0ZV.A00, false));
        AnonymousClass7Kx.A0J(A013, (Object) null);
        AnonymousClass7Kx.A0I(A012, Integer.valueOf(A00(this)));
        if (AnonymousClass7Kz.A0J().A05()) {
            AnonymousClass7JJ.A02().A00.A0E(C86114wI.A0Q(this, 29));
        }
        this.A0N = C86114wI.A0Q(this, 35);
        this.A0M = C86114wI.A0Q(this, 34);
        this.A0K = C86114wI.A0Q(this, 30);
        this.A0L = C86114wI.A0Q(this, 32);
        this.A0O = C86114wI.A0Q(this, 36);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r3 = r4.A0J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass58J r4) {
        /*
            boolean r0 = r4.A05()
            if (r0 == 0) goto L_0x001b
            com.facebookpay.expresscheckout.handler.ECPHandler r0 = r4.A00
            if (r0 == 0) goto L_0x001a
            X.M5J r0 = r0.D7U()
            if (r0 == 0) goto L_0x001a
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r0.A01
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            return
        L_0x001b:
            X.56r r3 = r4.A0J
            X.7Kx r0 = X.C86104wH.A0R(r3)
            r1 = 1
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r0.A01
            X.79r r0 = (X.C1203179r) r0
            if (r0 == 0) goto L_0x001a
            java.util.List r0 = r0.A03
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 != r1) goto L_0x001a
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x003e
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x003e
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x004b
        L_0x003e:
            X.56r r0 = r4.A0G
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r0.A01
            if (r0 != 0) goto L_0x004b
            return
        L_0x004b:
            X.56q r2 = r4.A0B
            X.7Kx r1 = X.C86104wH.A0R(r3)
            r0 = 13
            X.7Kx r0 = X.AnonymousClass7Kx.A07(r1, r4, r0)
            r2.A0H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58J.A02(X.58J):void");
    }

    private final void A04(C40307LcE lcE, String str) {
        Map map;
        C128957ke A012 = AnonymousClass7JJ.A01();
        LoggingContext loggingContext = this.A02;
        if (loggingContext == null) {
            C86124wJ.A19();
            throw null;
        }
        AnonymousClass7DP A032 = this.A0S.A03();
        LinkedHashMap A0y = C18220wO.A0y();
        C86114wI.A1K(loggingContext, str, A0y);
        A0y.put("CREDENTIAL_TYPE", lcE);
        Object obj = A0y.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof C03740Kn) && !(obj instanceof AnonymousClass0WC)) || (map = (Map) obj) == null)) {
            map = C18220wO.A0y();
        }
        A012.Bb8("user_add_credential_submit", AnonymousClass7Kr.A04(A032, A0y, map));
    }

    public final List A06() {
        AbstractCollection abstractCollection;
        FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl;
        TreeJNI treeValue;
        if (A05()) {
            return C06750aI.A17(AnonymousClass69P.ANON_CHECKOUT_BACK_BUTTON, AnonymousClass69P.ORDER_SUMMARY, AnonymousClass69P.APM, AnonymousClass69P.CONTACT_INFORMATION, AnonymousClass69P.SHIPPING_ADDRESS, AnonymousClass69P.SHIPPING_OPTIONS, AnonymousClass69P.PAYMENT_METHOD, AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION, AnonymousClass69P.PAY_BUTTON, AnonymousClass69P.TERMS);
        }
        C110336lW r0 = AnonymousClass7JJ.A02().A01;
        if (r0 == null || (fBPayCheckoutScreenConfigImpl = r0.A00) == null || (treeValue = fBPayCheckoutScreenConfigImpl.getTreeValue("ecp_ordered_components", FBPayCheckoutScreenConfigImpl.EcpOrderedComponents.class)) == null || (abstractCollection = treeValue.getEnumList("nux", AnonymousClass69P.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null) {
            List A022 = AnonymousClass7Kz.A0J().A02("NUX");
            abstractCollection = AnonymousClass0wJ.A0w(A022);
            Iterator it = A022.iterator();
            while (it.hasNext()) {
                abstractCollection.add(EnumHelper.A00(C18180wK.A0k(it), AnonymousClass69P.UNSET_OR_UNRECOGNIZED_ENUM_VALUE));
            }
        }
        return (List) abstractCollection;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x000c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A07() {
        /*
            r5 = this;
            java.util.List r0 = r5.A06()
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r4 = r0.iterator()
        L_0x000c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.69P r0 = (X.AnonymousClass69P) r0
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 1: goto L_0x003a;
                case 5: goto L_0x002c;
                case 15: goto L_0x0053;
                case 23: goto L_0x0037;
                case 24: goto L_0x0058;
                case 27: goto L_0x0025;
                default: goto L_0x0021;
            }
        L_0x0021:
            r3.add(r2)
            goto L_0x000c
        L_0x0025:
            X.587 r0 = r5.A0S
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x000c
            goto L_0x0021
        L_0x002c:
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x0021
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0021
            boolean r0 = r5.A07
            goto L_0x0072
        L_0x0037:
            boolean r0 = r5.A05
            goto L_0x0072
        L_0x003a:
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x000c
            X.56r r0 = r5.A0H
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r0)
            if (r0 == 0) goto L_0x000c
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x000c
            java.lang.Boolean r0 = r0.A03
            boolean r0 = X.C18190wL.A1Z(r0, r1)
            goto L_0x0072
        L_0x0053:
            boolean r0 = r5.A05()
            goto L_0x0072
        L_0x0058:
            boolean r0 = r5.A05()
            if (r0 == 0) goto L_0x000c
            X.56r r0 = r5.A0H
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r0)
            if (r0 == 0) goto L_0x000c
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x000c
            java.util.Set<X.68M> r1 = r0.A0B
            X.68M r0 = X.AnonymousClass68M.UX_FULFILLMENT_OPTIONS
            boolean r0 = r1.contains(r0)
        L_0x0072:
            if (r0 == 0) goto L_0x000c
            goto L_0x0021
        L_0x0075:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58J.A07():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(android.os.Bundle r26) {
        /*
            r25 = this;
            X.7HK r0 = X.AnonymousClass7Kz.A0J()
            boolean r0 = r0.A05()
            r1 = r25
            r4 = r26
            if (r0 != 0) goto L_0x001e
            X.56r r3 = r1.A0H
            java.lang.String r0 = "ECP_LAUNCH_PARAMS"
            android.os.Parcelable r2 = r4.getParcelable(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.ECPPaymentRequest"
            X.C04220Ms.A0C(r2, r0)
            r3.A0H(r2)
        L_0x001e:
            java.lang.String r0 = "logging_context"
            java.lang.Object r2 = r4.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.fbpay.logging.LoggingContext"
            X.C04220Ms.A0C(r2, r0)
            com.fbpay.logging.LoggingContext r2 = (com.fbpay.logging.LoggingContext) r2
            r1.A02 = r2
            X.56r r7 = r1.A0H
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r7)
            r3 = 0
            if (r0 == 0) goto L_0x008d
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x008d
            java.util.Set<X.68F> r2 = r0.A0C
            X.68F r0 = X.AnonymousClass68F.REQUEST_PAYER_NAME
            boolean r0 = r2.contains(r0)
        L_0x0042:
            r1.A07 = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r7)
            if (r0 == 0) goto L_0x008b
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x008b
            java.util.Set<X.68F> r2 = r0.A0C
            X.68F r0 = X.AnonymousClass68F.REQUEST_PAYER_EMAIL
            boolean r0 = r2.contains(r0)
        L_0x0056:
            r1.A06 = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r7)
            if (r0 == 0) goto L_0x0089
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0089
            java.util.Set<X.68F> r2 = r0.A0C
            X.68F r0 = X.AnonymousClass68F.REQUEST_PAYER_PHONE
            boolean r0 = r2.contains(r0)
        L_0x006a:
            r1.A08 = r0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r7)
            if (r0 == 0) goto L_0x007e
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x007e
            java.util.Set<X.68M> r2 = r0.A0B
            X.68M r0 = X.AnonymousClass68M.UX_SHIPPING_ADDRESS
            boolean r3 = r2.contains(r0)
        L_0x007e:
            r1.A05 = r3
            com.fbpay.logging.LoggingContext r5 = r1.A02
            r4 = 0
            if (r5 != 0) goto L_0x008f
            X.C86124wJ.A19()
            throw r4
        L_0x0089:
            r0 = 0
            goto L_0x006a
        L_0x008b:
            r0 = 0
            goto L_0x0056
        L_0x008d:
            r0 = 0
            goto L_0x0042
        L_0x008f:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r7)
            if (r0 == 0) goto L_0x009b
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r0.A03
            if (r0 == 0) goto L_0x009b
            com.facebookpay.expresscheckout.models.KnownData r4 = r0.A01
        L_0x009b:
            r14 = 0
            if (r4 == 0) goto L_0x00c8
            com.facebookpay.shippingaddress.model.ShippingAddress r0 = r4.A00
            if (r0 == 0) goto L_0x00b1
            X.7ke r3 = X.AnonymousClass7JJ.A00()
            X.6B4 r2 = X.AnonymousClass6B4.SHIPPING_ADDRESS
            X.587 r0 = r1.A0S
            java.util.LinkedHashMap r0 = X.AnonymousClass7Kr.A07(r0)
            r3.A08(r2, r5, r0)
        L_0x00b1:
            java.lang.String r0 = r4.A01
            if (r0 != 0) goto L_0x00b9
            java.lang.String r0 = r4.A03
            if (r0 == 0) goto L_0x00c8
        L_0x00b9:
            X.7ke r3 = X.AnonymousClass7JJ.A00()
            X.6B4 r2 = X.AnonymousClass6B4.CONTACT_INFO
            X.587 r0 = r1.A0S
            java.util.LinkedHashMap r0 = X.AnonymousClass7Kr.A07(r0)
            r3.A08(r2, r5, r0)
        L_0x00c8:
            java.lang.Object r0 = r7.A08()
            java.lang.String r13 = "Required value was null."
            if (r0 == 0) goto L_0x02a0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r0.A03
            if (r0 == 0) goto L_0x0125
            com.facebookpay.common.models.CurrencyAmount r0 = r0.A00
            if (r0 == 0) goto L_0x0125
            java.lang.Object r0 = r7.A08()
            if (r0 == 0) goto L_0x029b
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r0.A03
            if (r0 == 0) goto L_0x0125
            com.facebookpay.common.models.CurrencyAmount r0 = r0.A00
            if (r0 == 0) goto L_0x0125
            java.lang.String r19 = "REGULAR"
        L_0x00ec:
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.7j4 r6 = r0.A0B
            java.lang.Object r15 = r7.A08()
            if (r15 == 0) goto L_0x0296
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r15 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r15
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r7)
            if (r0 == 0) goto L_0x0123
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r0.A02
        L_0x0106:
            X.587 r5 = r1.A0S
            X.69P r3 = X.AnonymousClass69P.PAYMENT_METHOD
            r4 = 1
            com.facebookpay.otc.models.OtcInput r16 = r5.A02(r3, r4)
            r20 = 10
            r17 = r0
            r18 = r14
            X.7Et r2 = X.C122157Kv.A04(r14, r15, r16, r17, r18, r19, r20)
            com.fbpay.logging.LoggingContext r0 = r1.A02
            java.lang.String r12 = "loggingContext"
            if (r0 != 0) goto L_0x0128
            X.C04220Ms.A0E(r12)
            throw r14
        L_0x0123:
            r0 = r14
            goto L_0x0106
        L_0x0125:
            java.lang.String r19 = "PRE_FETCH"
            goto L_0x00ec
        L_0x0128:
            X.M5J r2 = r6.A05(r2, r0)
            X.56q r8 = r1.A0B
            X.8gC r0 = r1.A0M
            r8.A0K(r2, r0)
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x013f
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x013f
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x019b
        L_0x013f:
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.7j5 r10 = r0.A01
            java.lang.Object r6 = r7.A08()
            if (r6 == 0) goto L_0x0174
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r6 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r6
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r7)
            if (r0 == 0) goto L_0x0172
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0172
            java.lang.String r2 = r0.A02
        L_0x0159:
            X.69P r0 = X.AnonymousClass69P.CONTACT_INFORMATION
            com.facebookpay.otc.models.OtcInput r16 = r5.A02(r0, r4)
            r20 = 26
            r15 = r6
            r17 = r2
            r19 = r14
            X.7Et r11 = X.C122157Kv.A04(r14, r15, r16, r17, r18, r19, r20)
            com.fbpay.logging.LoggingContext r9 = r1.A02
            if (r9 != 0) goto L_0x0179
            X.C04220Ms.A0E(r12)
            throw r14
        L_0x0172:
            r2 = r14
            goto L_0x0159
        L_0x0174:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x0179:
            r6 = 0
            X.79R r4 = X.AnonymousClass6IY.A00(r11)
            X.7IT r2 = r10.A01
            X.56q r0 = r2.A05(r4)
            if (r0 != 0) goto L_0x0192
            X.56q r0 = X.AnonymousClass7IT.A00(r2, r4)
            X.AnonymousClass7Kx.A0J(r0, r14)
            java.lang.String r0 = "PERSISTENT_UP_TO_DATE"
            X.AnonymousClass7j5.A00(r10, r11, r9, r0, r6)
        L_0x0192:
            X.56q r2 = X.AnonymousClass7IT.A00(r2, r4)
            X.8gC r0 = r1.A0K
            r8.A0K(r2, r0)
        L_0x019b:
            java.lang.Object r0 = r7.A08()
            if (r0 == 0) goto L_0x0291
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r0 = r0.A08
            X.79R r4 = X.AnonymousClass79R.A00(r3, r5, r0)
            X.56q r3 = r1.A0C
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.7j4 r0 = r0.A0B
            X.7IT r0 = r0.A01
            X.56q r0 = X.AnonymousClass7IT.A00(r0, r4)
            X.8gC r2 = r1.A0L
            r3.A0K(r0, r2)
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x01cf
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.7j3 r0 = r0.A0D
            X.7IT r0 = r0.A00
            X.56q r0 = X.AnonymousClass7IT.A00(r0, r4)
            r3.A0K(r0, r2)
        L_0x01cf:
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x01db
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x01db
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x01ea
        L_0x01db:
            X.7JJ r0 = X.AnonymousClass7Kz.A05()
            X.7j5 r0 = r0.A01
            X.7IT r0 = r0.A01
            X.56q r0 = X.AnonymousClass7IT.A00(r0, r4)
            r3.A0K(r0, r2)
        L_0x01ea:
            X.78P r6 = r1.A0Q
            X.56q r2 = r6.A0A
            X.8gC r0 = r1.A0O
            r2.A0E(r0)
            java.lang.Object r0 = r7.A08()
            if (r0 == 0) goto L_0x028c
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x020a
            java.util.Set<X.68M> r10 = r0.A0B
        L_0x0201:
            com.fbpay.logging.LoggingContext r8 = r1.A02
            r0 = 0
            if (r8 != 0) goto L_0x020d
            X.C04220Ms.A0E(r12)
            throw r14
        L_0x020a:
            X.84Y r10 = X.AnonymousClass84Y.A00
            goto L_0x0201
        L_0x020d:
            X.58K r9 = r1.A0T
            X.588 r4 = r1.A0R
            java.lang.Object r1 = r7.A08()
            if (r1 == 0) goto L_0x0287
            java.lang.Object r1 = r7.A08()
            if (r1 == 0) goto L_0x0282
            java.lang.Object r1 = r7.A08()
            if (r1 == 0) goto L_0x027d
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            java.lang.String r3 = r1.A07
            java.lang.Object r1 = r7.A08()
            if (r1 == 0) goto L_0x0278
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r1 = r1.A05
            if (r1 == 0) goto L_0x0271
            java.lang.String r2 = r1.A02
        L_0x0235:
            java.lang.Object r1 = r7.A08()
            if (r1 == 0) goto L_0x0273
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r1
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r1 = r1.A03
            if (r1 == 0) goto L_0x0243
            java.util.ArrayList<java.lang.String> r0 = r1.A05
        L_0x0243:
            r6.A08 = r10
            r6.A06 = r8
            r6.A04 = r5
            r6.A05 = r9
            r6.A03 = r4
            if (r0 != 0) goto L_0x0251
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x0251:
            java.util.Map r24 = X.AnonymousClass4WJ.A0A()
            X.0ZV r23 = X.AnonymousClass0ZV.A00
            X.6mv r13 = new X.6mv
            r15 = r14
            r17 = r14
            r19 = r3
            r20 = r2
            r21 = r14
            r22 = r0
            r16 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r6.A02 = r13
            X.56r r0 = r4.A08
            r6.A01(r0)
            return
        L_0x0271:
            r2 = r14
            goto L_0x0235
        L_0x0273:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x0278:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x027d:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x0282:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x0287:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x028c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x0291:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x0296:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x029b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        L_0x02a0:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58J.A09(android.os.Bundle):void");
    }

    public final void A0D(String str) {
        C128957ke A002 = AnonymousClass7JJ.A00();
        LoggingContext loggingContext = this.A02;
        if (loggingContext == null) {
            C86124wJ.A19();
            throw null;
        }
        AnonymousClass587 r1 = this.A0S;
        C128957ke.A04(C18180wK.A0I(C86104wH.A0K(A002.A00, "user_click_ecpotc_atomic"), 2840), loggingContext, new KtLambdaShape3S1210000_I2(loggingContext, AnonymousClass7Kr.A07(r1), str, 3, !r1.A07()));
    }

    public final boolean A0F() {
        Integer num;
        if (A0G()) {
            num = AnonymousClass006.A00;
        } else {
            num = AnonymousClass006.A0N;
        }
        if (num != AnonymousClass006.A0N) {
            return false;
        }
        return true;
    }

    public final boolean A0G() {
        Set set;
        Set set2;
        CheckoutConfiguration checkoutConfiguration;
        CheckoutConfiguration checkoutConfiguration2;
        ECPRepositoryImpl A022 = AnonymousClass7JJ.A02();
        C880856r r3 = this.A0H;
        ECPPaymentRequest A0a = C86124wJ.A0a(r3);
        if (A0a == null || (checkoutConfiguration2 = A0a.A01) == null) {
            set = AnonymousClass84Y.A00;
        } else {
            set = checkoutConfiguration2.A0B;
        }
        ECPPaymentRequest A0a2 = C86124wJ.A0a(r3);
        if (A0a2 == null || (checkoutConfiguration = A0a2.A01) == null) {
            set2 = AnonymousClass84Y.A00;
        } else {
            set2 = checkoutConfiguration.A0C;
        }
        Object A082 = r3.A08();
        if (A082 != null) {
            return A022.A0A(((ECPPaymentRequest) A082).A08, set, set2);
        }
        throw AnonymousClass0wJ.A0b();
    }
}
