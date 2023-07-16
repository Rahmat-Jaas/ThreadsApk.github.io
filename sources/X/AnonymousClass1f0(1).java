package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.facebook.redex.IDxCListenerShape512S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.business.fragment.BusinessAttributeSyncBaseFragment;
import com.instagram.business.model.BusinessAttribute;

/* renamed from: X.1f0  reason: invalid class name */
public final class AnonymousClass1f0 extends BusinessAttributeSyncBaseFragment {
    public static final String __redex_internal_original_name = "BusinessAttributeSyncPhoneFragment";
    public C10300i6 A00;

    public final String getModuleName() {
        return "business_attribute_phone_review";
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
        int A02 = C14030oh.A02(-797903685);
        super.onCreate(bundle);
        this.A00 = C18190wL.A0S(this.mArguments);
        A01();
        C14030oh.A09(-489248715, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        AnonymousClass0wJ.A0L(view, R.id.subtitle).setText(2131821571);
        AnonymousClass0wJ.A0L(view, R.id.contact_review_header).setText(2131832467);
        boolean isEmpty = TextUtils.isEmpty(this.A03.A05);
        BusinessAttribute businessAttribute = this.A04;
        if (isEmpty) {
            String str2 = this.A02.A05;
            if (str2 != null) {
                businessAttribute.A05 = str2;
            }
            str = "facebook";
        } else {
            String str3 = this.A03.A05;
            if (str3 != null) {
                businessAttribute.A05 = str3;
            }
            str = "instagram";
        }
        this.A05 = str;
        A03(this.A02.A05, this.A03.A05);
        A02(AnonymousClass0wJ.A0B(this).getString(2131821570));
        this.A00.setOnCheckedChangeListener(new IDxCListenerShape512S0100000_1_I2(this, 2));
    }
}
