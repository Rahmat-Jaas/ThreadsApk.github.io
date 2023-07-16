package X;

import com.facebook.graphql.impls.ExternalShippingAddressImpl;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;
import com.facebook.graphql.impls.ShippingAddressesImpl;
import com.facebook.graphql.impls.TermsComponentImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7BG  reason: invalid class name */
public final class AnonymousClass7BG {
    public static final boolean A02(AnonymousClass69P r3, List list) {
        C04220Ms.A0B(r3, 1);
        for (Object obj : list) {
            if (obj == r3) {
                return true;
            }
        }
        return false;
    }

    public static final PuxTermsConditionItem A00(TermsComponentImpl termsComponentImpl) {
        PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl;
        PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl2;
        PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl3;
        ArrayList arrayList;
        if (termsComponentImpl == null) {
            return new PuxTermsConditionItem((PAYLinkableTextFragmentImpl) null, (PAYLinkableTextFragmentImpl) null, (PAYLinkableTextFragmentImpl) null, (PAYLinkableTextFragmentImpl) null, AnonymousClass69U.A0f, (String) null, (String) null, (List) null, (List) null);
        }
        PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl4 = null;
        String stringValue = termsComponentImpl.getStringValue("body_text");
        TreeJNI treeValue = termsComponentImpl.getTreeValue("cta_text", TermsComponentImpl.CtaText.class);
        if (treeValue != null) {
            pAYLinkableTextFragmentImpl = (PAYLinkableTextFragmentImpl) treeValue.reinterpret(PAYLinkableTextFragmentImpl.class);
        } else {
            pAYLinkableTextFragmentImpl = null;
        }
        String stringValue2 = termsComponentImpl.getStringValue("sheet_header");
        ImmutableList stringList = termsComponentImpl.getStringList("sheet_body_text");
        TreeJNI treeValue2 = termsComponentImpl.getTreeValue("payments_terms", TermsComponentImpl.PaymentsTerms.class);
        if (treeValue2 != null) {
            pAYLinkableTextFragmentImpl2 = (PAYLinkableTextFragmentImpl) treeValue2.reinterpret(PAYLinkableTextFragmentImpl.class);
        } else {
            pAYLinkableTextFragmentImpl2 = null;
        }
        TreeJNI treeValue3 = termsComponentImpl.getTreeValue("privacy_policy_terms", TermsComponentImpl.PrivacyPolicyTerms.class);
        if (treeValue3 != null) {
            pAYLinkableTextFragmentImpl3 = (PAYLinkableTextFragmentImpl) treeValue3.reinterpret(PAYLinkableTextFragmentImpl.class);
        } else {
            pAYLinkableTextFragmentImpl3 = null;
        }
        ImmutableList A0P = C18230wP.A0P(termsComponentImpl, TermsComponentImpl.TermsActions.class, "terms_actions");
        if (C18250wR.A1K(A0P)) {
            arrayList = AnonymousClass0wJ.A0w(A0P);
            Iterator it = A0P.iterator();
            while (it.hasNext()) {
                TreeJNI reinterpret = C18210wN.A0G(it).reinterpret(PAYLinkableTextFragmentImpl.class);
                C04220Ms.A06(reinterpret);
                arrayList.add(reinterpret);
            }
        } else {
            arrayList = null;
        }
        TreeJNI treeValue4 = termsComponentImpl.getTreeValue("body_text_with_multiple_actions", TermsComponentImpl.BodyTextWithMultipleActions.class);
        if (treeValue4 != null) {
            pAYLinkableTextFragmentImpl4 = (PAYLinkableTextFragmentImpl) treeValue4.reinterpret(PAYLinkableTextFragmentImpl.class);
        }
        return new PuxTermsConditionItem(pAYLinkableTextFragmentImpl, pAYLinkableTextFragmentImpl2, pAYLinkableTextFragmentImpl3, pAYLinkableTextFragmentImpl4, AnonymousClass69U.A0f, stringValue, stringValue2, stringList, arrayList);
    }

    public static final ShippingAddress A01(ShippingAddressesImpl shippingAddressesImpl, boolean z) {
        boolean z2;
        String str;
        TreeJNI reinterpret;
        TreeJNI reinterpret2;
        ShippingAddressesImpl shippingAddressesImpl2 = shippingAddressesImpl;
        if (shippingAddressesImpl != null) {
            String A0X = C18250wR.A0X(shippingAddressesImpl2);
            String A0j = C86154wM.A0j(shippingAddressesImpl2);
            String stringValue = shippingAddressesImpl2.getStringValue("care_of");
            String stringValue2 = shippingAddressesImpl2.getStringValue("street1");
            String stringValue3 = shippingAddressesImpl2.getStringValue("street2");
            String stringValue4 = shippingAddressesImpl2.getStringValue("city_name");
            String stringValue5 = shippingAddressesImpl2.getStringValue("state_name");
            String stringValue6 = shippingAddressesImpl2.getStringValue("country_name");
            String stringValue7 = shippingAddressesImpl2.getStringValue("postal_code");
            boolean hasFieldValue = shippingAddressesImpl2.hasFieldValue("verified");
            boolean booleanValue = shippingAddressesImpl2.getBooleanValue("verified");
            boolean booleanValue2 = shippingAddressesImpl2.getBooleanValue("is_default");
            if (!shippingAddressesImpl2.isFulfilled("ExternalMailingAddress") || (reinterpret2 = shippingAddressesImpl2.reinterpret(ExternalShippingAddressImpl.class)) == null) {
                z2 = true;
            } else {
                z2 = reinterpret2.getBooleanValue("is_editable");
            }
            if (!shippingAddressesImpl2.isFulfilled("ExternalMailingAddress") || (reinterpret = shippingAddressesImpl2.reinterpret(ExternalShippingAddressImpl.class)) == null) {
                str = null;
            } else {
                str = reinterpret.getStringValue("external_source_label");
            }
            return new ShippingAddress(A0X, A0j, stringValue, stringValue2, stringValue3, stringValue4, stringValue5, stringValue6, stringValue7, str, hasFieldValue, booleanValue, booleanValue2, z, z2);
        }
        throw C18180wK.A0a("Cannot convert null object to a valid shipping address");
    }
}
