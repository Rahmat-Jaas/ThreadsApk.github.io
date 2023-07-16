package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxObjectShape133S0200000_2_I2;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.fbpay.logging.LoggingContext;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5;
import kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1;

/* renamed from: X.7H3  reason: invalid class name */
public final class AnonymousClass7H3 {
    public static final AnonymousClass7H3 A00 = new AnonymousClass7H3();

    public final void A03(ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass69U r18, AnonymousClass69R r19, AnonymousClass69R r20, LoggingContext loggingContext, Boolean bool, String str, String str2, String str3) {
        Bundle bundle;
        Bundle A06;
        int i;
        Fragment fragment2 = fragment;
        C04220Ms.A0B(fragment2, 0);
        ContextThemeWrapper contextThemeWrapper2 = contextThemeWrapper;
        C04220Ms.A0B(contextThemeWrapper2, 1);
        AnonymousClass69U r1 = r18;
        C04220Ms.A0B(r1, 2);
        int ordinal = r1.ordinal();
        LoggingContext loggingContext2 = loggingContext;
        if (ordinal == 5) {
            A06 = C18180wK.A06();
            if (bool != null) {
                int i2 = 2131826636;
                if (bool.booleanValue()) {
                    i2 = 2131826601;
                }
                String string = contextThemeWrapper2.getString(i2);
                C04220Ms.A09(string);
                A06.putString("ECP_SELECTION_FRAGMENT_NAVIGATION_TITLE", string);
                A06.putBoolean("ECP_ENABLE_REDESIGN", false);
                bundle.putString("ECP_SELECTION_FRAGMENT_COMPONENT_ID", "FULFILLMENT_OPTION");
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        } else if (ordinal != 15) {
            if (ordinal == 2) {
                bundle = C18180wK.A06();
                bundle.putString("ECP_SELECTION_FRAGMENT_COMPONENT_ID", "PAYMENT_METHODS");
                i = 2131826598;
            } else if (ordinal == 3) {
                bundle = C18180wK.A06();
                bundle.putString("ECP_SELECTION_FRAGMENT_COMPONENT_ID", PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS);
                i = 2131826635;
            } else if (ordinal == 4) {
                bundle = C18180wK.A06();
                bundle.putString("ECP_SELECTION_FRAGMENT_COMPONENT_ID", "CONTACT_INFO");
                i = 2131826455;
            } else {
                throw C86134wK.A0s("Unsupported selection fragment type");
            }
            bundle.putString("ECP_SELECTION_FRAGMENT_NAVIGATION_TITLE", contextThemeWrapper2.getString(i));
        } else {
            A06 = C18180wK.A06();
            A06.putBoolean("ECP_ENABLE_REDESIGN", true);
            bundle.putString("ECP_SELECTION_FRAGMENT_COMPONENT_ID", "FULFILLMENT_OPTION");
        }
        bundle.putParcelable("logging_context", loggingContext2);
        bundle.putAll(AnonymousClass7I8.A02(r19, r20, loggingContext2, str, str2, str3, (String) null, 64));
        A01(bundle, fragment2, "content_selection_fragment", true, false);
    }

    public static final C110756mD A00(Context context, Fragment fragment, LoggingContext loggingContext, List list, List list2, AnonymousClass0YY r12, AnonymousClass0YY r13, boolean z) {
        KtLambdaShape40S0200000_I2_1 ktLambdaShape40S0200000_I2_1 = new KtLambdaShape40S0200000_I2_1(fragment, r12, 46);
        KtLambdaShape40S0200000_I2_1 ktLambdaShape40S0200000_I2_12 = new KtLambdaShape40S0200000_I2_1(fragment, r13, 47);
        C110756mD r2 = new C110756mD(context);
        String str = loggingContext.A02;
        Map map = r2.A04;
        map.put("upl_session_id", str);
        BitSet bitSet = r2.A02;
        bitSet.set(2);
        map.put("apply_incentive", new AnonymousClass7EF(new IDxObjectShape133S0200000_2_I2(8, ktLambdaShape40S0200000_I2_1, r2)));
        bitSet.set(0);
        map.put("remove_incentive", new AnonymousClass7EF(new IDxObjectShape133S0200000_2_I2(9, ktLambdaShape40S0200000_I2_12, r2)));
        bitSet.set(1);
        map.put("show_promocode_input", Boolean.valueOf(z));
        if (C18190wL.A1a(list) && !list.isEmpty()) {
            map.put("available_offers", list);
        }
        if (C18190wL.A1a(list2) && !list2.isEmpty()) {
            map.put("applied_offer_ids", list2);
        }
        return r2;
    }

    public static final void A01(Bundle bundle, Fragment fragment, String str, boolean z, boolean z2) {
        if (fragment != null) {
            AnonymousClass0wJ.A0F().post(new C1364382s(AnonymousClass7Kz.A05().A06(bundle, str), (C147048nI) fragment, z, z2));
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void A02(Context context, Fragment fragment, AnonymousClass69R r18, LoggingContext loggingContext, List list, List list2, AnonymousClass0YY r22, AnonymousClass0YY r23, boolean z) {
        Fragment fragment2 = fragment;
        List list3 = list2;
        C04220Ms.A0B(list3, 5);
        C04220Ms.A0B(AnonymousClass7Kz.A04(), 0);
        IgBloksScreenConfig A0N = C18190wL.A0N(C18230wP.A0Z());
        C110756mD A002 = A00(context, fragment2, loggingContext, list, list3, r22, r23, z);
        if (A002.A02.nextClearBit(0) >= 3) {
            C63743iE A06 = C63743iE.A06("com.bloks.www.ecp.incentive.offer-selection", C37067Jjv.A02(A002.A05), A002.A04);
            A06.A00 = 719983200;
            A06.A05 = null;
            A06.A01 = 0;
            A06.A03 = null;
            A06.A02 = null;
            A06.A04 = null;
            A06.A0G(A002.A03);
            Fragment A0B = A06.A0B(A002.A01, A0N);
            AnonymousClass5qq r6 = (AnonymousClass5qq) fragment2;
            C86024w9 r1 = r6.A0B;
            AnonymousClass0A5[] r5 = AnonymousClass5qq.A0V;
            C86124wJ.A1U(r6, r1, r5, 19, false);
            C86114wI.A1L(r6, (Object) null, r6.A0C, r5, 1);
            C86114wI.A1L(r6, (Object) null, r6.A0P, r5, 6);
            C86114wI.A1L(r6, r18.A00, r6.A0E, r5, 2);
            C86114wI.A1L(r6, C18190wL.A0H(new KtLambdaShape25S0100000_I2_5(r6, 9), 14), r6.A0F, r5, 11);
            AnonymousClass0wJ.A0F().post(new C1364382s(A0B, (C147048nI) fragment2, true, false));
            return;
        }
        throw C18180wK.A0a("Missing Required Props");
    }
}
