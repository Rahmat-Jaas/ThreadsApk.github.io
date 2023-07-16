package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.impls.EmailResponseImpl;
import com.facebook.graphql.impls.FBPayEmailImpl;
import com.facebook.graphql.impls.FBPayPhoneNumberImpl;
import com.facebook.graphql.impls.PayerNameResponseImpl;
import com.facebook.graphql.impls.PhoneResponseImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.redex.IDxFunctionShape17S1200000_2_I2;
import com.facebook.redex.IDxFunctionShape326S0100000_2_I2;
import com.facebook.redex.IDxFunctionShape3S1000000_2_I2;
import com.facebook.redex.IDxObserverShape0S2400000_2_I2;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.facebookpay.otc.models.OtcInput;
import com.fbpay.logging.LoggingContext;
import com.fbpay.util.boundresources.IDxBResourceShape0S1210000_2_I2;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape1S1310000_I2;
import kotlin.jvm.internal.KtLambdaShape2S1310000_I2;
import kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1;

/* renamed from: X.7j5  reason: invalid class name */
public final class AnonymousClass7j5 implements C145308kH {
    public final PhoneNumberUtil A00;
    public final AnonymousClass7IT A01;
    public final C111796oQ A02 = new C111796oQ();
    public final C111806oR A03 = new C111806oR();
    public final Context A04;

    public static final synchronized void A04(C880756q r3, C114696tk r4, AnonymousClass7j5 r5, String str, List list) {
        synchronized (r5) {
            AnonymousClass7Kx.A0E(new IDxFunctionShape17S1200000_2_I2((Object) list, (Object) r4, str, 3), r3, C86104wH.A0R(r3));
        }
    }

    public final void A07(AnonymousClass79R r8, AnonymousClass7Kx r9) {
        C880756q A012 = AnonymousClass7IT.A01(this, r8);
        if (AnonymousClass7Kx.A0R(r9)) {
            EmailResponseImpl emailResponseImpl = (EmailResponseImpl) AnonymousClass7Kx.A0D(r9);
            if (((EmailResponseImpl.Error) C86154wM.A0M(emailResponseImpl, EmailResponseImpl.Error.class)) == null && AnonymousClass7Kx.A0R(C86104wH.A0R(A012))) {
                List list = ((C114956uC) AnonymousClass7Kx.A0D(C86104wH.A0R(A012))).A00.A03;
                TreeJNI treeValue = emailResponseImpl.getTreeValue("email", EmailResponseImpl.Email.class);
                if (treeValue != null) {
                    FBPayEmailImpl fBPayEmailImpl = (FBPayEmailImpl) treeValue.reinterpret(FBPayEmailImpl.class);
                    C04220Ms.A06(fBPayEmailImpl);
                    C115356uv A002 = C116846xe.A00(fBPayEmailImpl);
                    int i = 1;
                    if (!(!list.isEmpty()) || !((C115356uv) list.get(0)).A03) {
                        i = 0;
                    }
                    List A022 = AnonymousClass7BD.A02(A002, list, AnonymousClass8XJ.A00, i);
                    String str = A002.A01;
                    AnonymousClass7Kx.A0E(new IDxFunctionShape17S1200000_2_I2((Object) A022, (Object) null, str, 2), A012, C86104wH.A0R(A012));
                    return;
                }
                throw AnonymousClass0wJ.A0b();
            }
        }
    }

    public final void A09(AnonymousClass79R r7, AnonymousClass7Kx r8) {
        C880756q A012 = AnonymousClass7IT.A01(this, r7);
        if (AnonymousClass7Kx.A0R(r8)) {
            PhoneResponseImpl phoneResponseImpl = (PhoneResponseImpl) AnonymousClass7Kx.A0D(r8);
            if (((PhoneResponseImpl.Error) C86154wM.A0M(phoneResponseImpl, PhoneResponseImpl.Error.class)) == null && AnonymousClass7Kx.A0R(C86104wH.A0R(A012))) {
                List list = ((C114956uC) AnonymousClass7Kx.A0D(C86104wH.A0R(A012))).A02.A03;
                TreeJNI treeValue = phoneResponseImpl.getTreeValue("phone", PhoneResponseImpl.Phone.class);
                if (treeValue != null) {
                    FBPayPhoneNumberImpl fBPayPhoneNumberImpl = (FBPayPhoneNumberImpl) treeValue.reinterpret(FBPayPhoneNumberImpl.class);
                    C04220Ms.A06(fBPayPhoneNumberImpl);
                    C115306uq A013 = C116846xe.A01(fBPayPhoneNumberImpl);
                    int i = 1;
                    if (!(!list.isEmpty()) || !((C115306uq) list.get(0)).A04) {
                        i = 0;
                    }
                    A04(A012, (C114696tk) null, this, A013.A02, AnonymousClass7BD.A02(A013, list, AnonymousClass8XK.A00, i));
                    return;
                }
                throw AnonymousClass0wJ.A0b();
            }
        }
    }

    public final M5J AHY(SparseArray sparseArray, OtcInput otcInput, OtcInput otcInput2, LoggingContext loggingContext, String str, String str2, String str3, int i) {
        Object obj = sparseArray.get(12);
        if (obj != null) {
            String str4 = (String) obj;
            String str5 = str2;
            AnonymousClass79R r5 = new AnonymousClass79R(otcInput2, str5);
            String str6 = str;
            String str7 = str3;
            int i2 = i;
            LoggingContext loggingContext2 = loggingContext;
            OtcInput otcInput3 = otcInput;
            if (i == 0) {
                GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
                C86144wL.A1H(A002, str4, "phone_id");
                A002.A0F("DELETE", "mutation_type");
                GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
                A0L.A0D(str6, AnonymousClass7C6.A00());
                C86144wL.A1I(A0L, r5.A01, str7);
                A0L.A0B(A002, "phone_input");
                A0L.A0D("", "platform_trust_token");
                C116936xr.A01(A0L, otcInput3);
                C89345Dg r1 = new C89345Dg();
                r1.A04(AnonymousClass6BL.A00(AnonymousClass6BE.PHONE, r1, "DELETE"), "mutation_type");
                C139138Mu r4 = C139138Mu.A00;
                KtLambdaShape2S1310000_I2 ktLambdaShape2S1310000_I2 = new KtLambdaShape2S1310000_I2(r1, otcInput3, loggingContext2, 2);
                KtLambdaShape1S1310000_I2 ktLambdaShape1S1310000_I2 = new KtLambdaShape1S1310000_I2(r1, otcInput3, loggingContext2, 1);
                ktLambdaShape2S1310000_I2.invoke();
                C104996ci A0C = AnonymousClass7Kz.A0C();
                M5J A012 = C30821GXg.A01(AnonymousClass5k8.A00(new AnonymousClass7SF(this, 0), new IDxFunctionShape17S1200000_2_I2((Object) A0L, (Object) this, str5, 0), A0C), new KtLambdaShape40S0200000_I2_1((AnonymousClass0YY) ktLambdaShape1S1310000_I2, (AnonymousClass0YY) r4, 48));
                A03(A012, r5, this, "DELETE", str4);
                return A012;
            } else if (i2 == 1) {
                GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
                C86144wL.A1H(A003, str4, "email_id");
                A003.A0F("DELETE", "mutation_type");
                GQLCallInputCInputShape1S0000000 A0L2 = C86154wM.A0L();
                A0L2.A0D(str6, AnonymousClass7C6.A00());
                C86144wL.A1I(A0L2, r5.A01, str7);
                A0L2.A0B(A003, "email_input");
                A0L2.A0D("", "platform_trust_token");
                C116936xr.A01(A0L2, otcInput3);
                C89345Dg r8 = new C89345Dg();
                r8.A04(AnonymousClass6BL.A00(AnonymousClass6BE.EMAIL, r8, "DELETE"), "mutation_type");
                C139128Mt r42 = C139128Mt.A00;
                KtLambdaShape2S1310000_I2 ktLambdaShape2S1310000_I22 = new KtLambdaShape2S1310000_I2(r8, otcInput3, loggingContext2, 1);
                KtLambdaShape1S1310000_I2 ktLambdaShape1S1310000_I22 = new KtLambdaShape1S1310000_I2(r8, otcInput3, loggingContext2, 0);
                ktLambdaShape2S1310000_I22.invoke();
                C104996ci A0C2 = AnonymousClass7Kz.A0C();
                M5J A013 = C30821GXg.A01(AnonymousClass5k8.A00(new AnonymousClass7SF(this, 1), new IDxFunctionShape17S1200000_2_I2((Object) A0L2, (Object) this, str5, 0), A0C2), new KtLambdaShape40S0200000_I2_1((AnonymousClass0YY) ktLambdaShape1S1310000_I22, (AnonymousClass0YY) r42, 48));
                A02(A013, r5, this, "DELETE", str4);
                return A013;
            } else {
                throw C18190wL.A0a(AnonymousClass00U.A0J("{ContactInformationRepoImpl} deleteMutation is not supported for identifier => ", i2));
            }
        } else {
            throw AnonymousClass0wJ.A0b();
        }
    }

    public final M5J Ch5(SparseArray sparseArray, OtcInput otcInput, OtcInput otcInput2, LoggingContext loggingContext, String str, String str2, String str3, int i) {
        String str4;
        String str5;
        boolean z;
        AnonymousClass7DP r0;
        String str6;
        String str7;
        String str8;
        Boolean bool;
        String str9 = str;
        String str10 = str2;
        int A022 = C18200wM.A02(1, str9, str10);
        LoggingContext loggingContext2 = loggingContext;
        String str11 = str3;
        C18190wL.A1S(str11, 3, loggingContext2);
        SparseArray sparseArray2 = sparseArray;
        Object obj = sparseArray2.get(12);
        if (obj instanceof String) {
            str4 = (String) obj;
            if (!(str4 == null || str4.length() == 0)) {
                str5 = "UPDATE";
            }
            str5 = "CREATE";
        } else {
            str4 = null;
            str5 = "CREATE";
        }
        Object obj2 = sparseArray2.get(3);
        if (!(obj2 instanceof Boolean) || (bool = (Boolean) obj2) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        A0L.A0D(str9, AnonymousClass7C6.A00());
        C86144wL.A1I(A0L, str10, str11);
        A0L.A0D("", "platform_trust_token");
        AnonymousClass73F.A00(A0L);
        OtcInput otcInput3 = otcInput;
        A0L.A0B(C116936xr.A00(otcInput3), "one_time_checkout_input");
        C86114wI.A15(sparseArray2, A0L, str5, A022);
        Object obj3 = sparseArray2.get(1);
        if ((obj3 instanceof String) && (str8 = (String) obj3) != null) {
            GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
            C86144wL.A1H(A002, str4, "email_id");
            GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
            A003.A0D("is_default", Boolean.valueOf(z));
            A003.A0F(str8, "user_input_email_address");
            A002.A0B(A003, "save_email_input");
            A002.A0F(str5, "mutation_type");
            A0L.A0B(A002, "email_input");
        }
        Object obj4 = sparseArray2.get(0);
        if ((obj4 instanceof String) && (str6 = (String) obj4) != null) {
            try {
                PhoneNumberUtil phoneNumberUtil = this.A00;
                str7 = phoneNumberUtil.A0C(phoneNumberUtil.A0A(str6, (String) null));
                C04220Ms.A06(str7);
            } catch (C32122Ah unused) {
                str7 = AnonymousClass7Kz.A0O().getCountry();
                C04220Ms.A06(str7);
            }
            GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
            C86144wL.A1H(A004, str4, "phone_id");
            GQLCallInputCInputShape0S0000000 A005 = GraphQlCallInput.A00();
            A005.A0D("is_default", Boolean.valueOf(z));
            A005.A0F(str6, "raw_phone_number");
            A005.A0F(str7, "country_code");
            A004.A0B(A005, "save_phone_input");
            A004.A0F(str5, "mutation_type");
            A0L.A0B(A004, "phone_input");
        }
        AnonymousClass7Kr r12 = AnonymousClass6XO.A00;
        List A012 = A01(sparseArray2, str5);
        if (otcInput != null) {
            r0 = new AnonymousClass7DP(true, otcInput3.A01);
        } else {
            r0 = null;
        }
        r12.A0H(r0, loggingContext2, str5, "pux_checkout", A012, false);
        C104996ci A0C = AnonymousClass7Kz.A0C();
        M5J A006 = AnonymousClass5k8.A00(new IDxFunctionShape326S0100000_2_I2((Object) this, 3), new IDxFunctionShape17S1200000_2_I2((Object) A0L, (Object) this, str10, 1), A0C);
        return C30821GXg.A01(A006, new C138618Jq(sparseArray2, A006, this, otcInput3, otcInput2, loggingContext2, str5, str10, str4));
    }

    public static final void A02(M5J m5j, AnonymousClass79R r6, AnonymousClass7j5 r7, String str, String str2) {
        C04220Ms.A0C(m5j, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.EmailResponse>>");
        M5J A012 = C30821GXg.A01(m5j, C139148Mv.A00);
        C880756q A013 = AnonymousClass7IT.A01(r7, r6);
        C04220Ms.A0C(A012, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayEmailResponse>>");
        A013.A0K(A012, new IDxObserverShape0S2400000_2_I2(A012, A013, r6, r7, str, str2, 0));
    }

    public static final void A03(M5J m5j, AnonymousClass79R r6, AnonymousClass7j5 r7, String str, String str2) {
        C04220Ms.A0C(m5j, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.PhoneResponse>>");
        M5J A012 = C30821GXg.A01(m5j, C139158Mw.A00);
        C880756q A013 = AnonymousClass7IT.A01(r7, r6);
        C04220Ms.A0C(A012, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayPhoneNumberResponse>>");
        A013.A0K(A012, new IDxObserverShape0S2400000_2_I2(A012, A013, r6, r7, str, str2, 1));
    }

    public static void A05(C021109v r3, String str, AbstractCollection abstractCollection) {
        C89345Dg r2 = new C89345Dg();
        r2.A04(r3, "mutation_data");
        r2.A04(AnonymousClass6BL.valueOf(str), "mutation_type");
        abstractCollection.add(r2);
    }

    public final void A06(AnonymousClass79R r3) {
        AnonymousClass7IT.A03(this.A01, r3.A00, r3);
    }

    public final boolean A0A(AnonymousClass79R r4) {
        C114956uC r0;
        C115146ua r02;
        AnonymousClass7Kx A0R = C86104wH.A0R(AnonymousClass7IT.A00(this.A01, r4));
        if (A0R == null || (r0 = (C114956uC) A0R.A01) == null || (r02 = r0.A00) == null || !C18190wL.A1a(r02.A03)) {
            return false;
        }
        return true;
    }

    public final boolean A0B(AnonymousClass79R r3) {
        C114956uC r0;
        String str;
        AnonymousClass7Kx A0R = C86104wH.A0R(AnonymousClass7IT.A00(this.A01, r3));
        if (A0R == null || (r0 = (C114956uC) A0R.A01) == null || (str = r0.A01.A01) == null || AnonymousClass8bQ.A0n(str)) {
            return false;
        }
        return true;
    }

    public final boolean A0C(AnonymousClass79R r4) {
        C114956uC r0;
        C115156ub r02;
        AnonymousClass7Kx A0R = C86104wH.A0R(AnonymousClass7IT.A00(this.A01, r4));
        if (A0R == null || (r0 = (C114956uC) A0R.A01) == null || (r02 = r0.A02) == null || !C18190wL.A1a(r02.A03)) {
            return false;
        }
        return true;
    }

    public AnonymousClass7j5(Context context) {
        this.A04 = context;
        this.A00 = PhoneNumberUtil.A01(context);
        this.A01 = new AnonymousClass7IT();
    }

    public static final M5J A00(AnonymousClass7j5 r18, C121207Et r19, LoggingContext loggingContext, String str, boolean z) {
        AnonymousClass7DP r1;
        C128957ke A002 = AnonymousClass7JJ.A00();
        List A0n = C18180wK.A0n(AnonymousClass69P.CONTACT_INFORMATION);
        C121207Et r9 = r19;
        String str2 = r9.A08;
        boolean A0I = C04220Ms.A0I(str2, "PRE_WARM");
        OtcInput otcInput = r9.A03;
        if (otcInput != null) {
            r1 = AnonymousClass7DP.A00(otcInput);
        } else {
            r1 = null;
        }
        LinkedHashMap A0y = C18220wO.A0y();
        if (r1 != null) {
            AnonymousClass7Kr.A0B(r1, A0y);
        }
        LoggingContext loggingContext2 = loggingContext;
        A002.A0G(loggingContext2, str2, A0n, A0y, A0I);
        AnonymousClass79R A003 = AnonymousClass6IY.A00(r9);
        AnonymousClass7j5 r8 = r18;
        AnonymousClass7IT r5 = r8.A01;
        C880756q A004 = AnonymousClass7IT.A00(r5, A003);
        C04220Ms.A0C(A004, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        A004.A0H(AnonymousClass7Kx.A03(AnonymousClass7SV.A00, C86104wH.A0R(A004)));
        M5J A032 = new IDxBResourceShape0S1210000_2_I2(C121207Et.A01(r9, "CONTACT_INFORMATION"), r8, r9, str, 0, z).A03();
        C880756q A005 = AnonymousClass7IT.A00(r5, AnonymousClass6IY.A00(r9));
        C04220Ms.A0C(A005, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        C04220Ms.A06(A032);
        C121277Fh.A02(A032, A005, new IDxObserverShape55S0300000_2_I2(A005, r9, loggingContext2, 5));
        return A005;
    }

    public static final List A01(SparseArray sparseArray, String str) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Object obj = sparseArray.get(2);
        Object obj2 = null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        Object obj3 = sparseArray.get(1);
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        Object obj4 = sparseArray.get(0);
        if (obj4 instanceof String) {
            obj2 = obj4;
        }
        if (obj != null) {
            A05(AnonymousClass6BE.NAME, str, A0v);
        }
        if (obj3 != null) {
            A05(AnonymousClass6BE.EMAIL, str, A0v);
        }
        if (obj2 != null) {
            A05(AnonymousClass6BE.PHONE, str, A0v);
        }
        return A0v;
    }

    public final void A08(AnonymousClass79R r6, AnonymousClass7Kx r7) {
        C880756q A012 = AnonymousClass7IT.A01(this, r6);
        if (AnonymousClass7Kx.A0R(r7)) {
            TreeJNI treeJNI = (TreeJNI) AnonymousClass7Kx.A0D(r7);
            if (C86154wM.A0M(treeJNI, PayerNameResponseImpl.Error.class) == null && AnonymousClass7Kx.A0R(C86104wH.A0R(A012))) {
                String stringValue = treeJNI.getStringValue("payer_name_on_file");
                if (stringValue != null) {
                    AnonymousClass7Kx.A0E(new IDxFunctionShape3S1000000_2_I2(stringValue, 0), A012, C86104wH.A0R(A012));
                    return;
                }
                throw AnonymousClass0wJ.A0b();
            }
        }
    }
}
