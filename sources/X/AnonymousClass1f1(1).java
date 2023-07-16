package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxCListenerShape512S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.business.fragment.BusinessAttributeSyncBaseFragment;
import com.instagram.business.model.BusinessAttribute;

/* renamed from: X.1f1  reason: invalid class name */
public final class AnonymousClass1f1 extends BusinessAttributeSyncBaseFragment {
    public static final String __redex_internal_original_name = "BusinessAttributeSyncAddressFragment";
    public C10300i6 A00;

    public final String getModuleName() {
        return "business_attribute_address_review";
    }

    public static void A00(AnonymousClass1f1 r1, BusinessAttribute businessAttribute, boolean z) {
        BusinessAttribute businessAttribute2 = r1.A04;
        String str = businessAttribute.A06;
        if (str != null) {
            businessAttribute2.A06 = str;
        }
        String str2 = businessAttribute.A07;
        if (str2 != null) {
            businessAttribute2.A07 = str2;
        }
        String str3 = businessAttribute.A00;
        if (str3 != null) {
            businessAttribute2.A00 = str3;
        }
        if (z) {
            String str4 = businessAttribute.A03;
            if (str4 != null) {
                businessAttribute2.A03 = str4;
                return;
            }
            return;
        }
        String str5 = businessAttribute.A02;
        if (str5 != null) {
            businessAttribute2.A02 = str5;
        }
    }

    public final void CCX() {
        this.A01.Abi();
        synchronized (((AnonymousClass3S4) C18180wK.A0c(this.A00, AnonymousClass3S4.class, 7)).A00) {
        }
        super.CCX();
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1705735583);
        super.onCreate(bundle);
        this.A00 = C18190wL.A0S(this.mArguments);
        A01();
        C14030oh.A09(1994589071, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onViewCreated(view, bundle);
        AnonymousClass0wJ.A0L(view, R.id.subtitle).setText(2131821559);
        AnonymousClass0wJ.A0L(view, R.id.contact_review_header).setText(2131821190);
        BusinessAttribute businessAttribute = this.A02;
        if (C18210wN.A1U(businessAttribute.A00)) {
            str = C67353zP.A04(getContext(), businessAttribute.A06, businessAttribute.A07, businessAttribute.A00);
        } else {
            str = "";
        }
        BusinessAttribute businessAttribute2 = this.A03;
        if (C18210wN.A1U(businessAttribute2.A00)) {
            str2 = C67353zP.A04(getContext(), businessAttribute2.A06, businessAttribute2.A07, businessAttribute2.A00);
        } else {
            str2 = "";
        }
        A03(str, str2);
        this.A00.setOnCheckedChangeListener(new IDxCListenerShape512S0100000_1_I2(this, 0));
        if (C18210wN.A1U(this.A03.A00)) {
            A00(this, this.A03, true);
            str3 = "instagram";
        } else {
            A00(this, this.A02, false);
            str3 = "facebook";
        }
        this.A05 = str3;
        A02(AnonymousClass0wJ.A0B(this).getString(2131821568));
    }
}
