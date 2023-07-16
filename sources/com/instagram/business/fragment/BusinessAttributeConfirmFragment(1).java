package com.instagram.business.fragment;

import X.AnonymousClass0wJ;
import X.AnonymousClass1iP;
import X.AnonymousClass3L2;
import X.AnonymousClass3QD;
import X.AnonymousClass3S4;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C11630kW;
import X.C14030oh;
import X.C18180wK;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C21971Sw;
import X.C24711ju;
import X.C32165H8c;
import X.C34640IcN;
import X.C61033Rq;
import X.C63813iO;
import X.C67353zP;
import X.C82034oy;
import X.C82424pb;
import X.C84114sZ;
import X.C84264sr;
import X.C84274ss;
import X.H1T;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessAttributeSyncActivity;
import com.instagram.business.model.BusinessAttribute;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.service.session.UserSession;

public class BusinessAttributeConfirmFragment extends C34640IcN implements C11630kW, C82424pb, C84274ss, C82034oy, C84264sr {
    public C84114sZ A00;
    public BusinessAttribute A01;
    public UserSession A02;
    public BusinessNavBar mBusinessNavBar;
    public C24711ju mBusinessNavBarHelper;
    public IgdsStepperHeader mStepperHeader;

    public final void CJ9() {
    }

    public final String getModuleName() {
        return "business_attribute_sync_contact_review";
    }

    public final void AHz() {
        this.mBusinessNavBar.setPrimaryButtonEnabled(false);
    }

    public final void AJV() {
        this.mBusinessNavBar.setPrimaryButtonEnabled(true);
    }

    public final void CCX() {
        this.A00.Abi();
        synchronized (((AnonymousClass3S4) C18180wK.A0c(this.A02, AnonymousClass3S4.class, 7)).A00) {
        }
        UserSession userSession = this.A02;
        BusinessAttribute businessAttribute = this.A01;
        String str = businessAttribute.A01;
        String str2 = businessAttribute.A05;
        String str3 = businessAttribute.A06;
        String str4 = businessAttribute.A07;
        String str5 = businessAttribute.A00;
        String str6 = businessAttribute.A02;
        String str7 = businessAttribute.A03;
        Context context = getContext();
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("business/account/enable_sync_business_attributes/");
        A0N.A0B(C21971Sw.class, AnonymousClass3L2.class);
        A0N.A06();
        String str8 = "";
        String str9 = str8;
        if (str != null) {
            str9 = str;
        }
        A0N.A0O("email", str9);
        String str10 = str8;
        if (str2 != null) {
            str10 = str2;
        }
        A0N.A0O(AnonymousClass3QD.A00(9, 12, 42), str10);
        String str11 = str8;
        if (str3 != null) {
            str11 = str3;
        }
        A0N.A0O("street_address", str11);
        if (str4 != null) {
            str8 = str4;
        }
        A0N.A0O("zip_code", str8);
        if (str7 != null) {
            if (str6 == null) {
                A0N.A0O("ig_city_page_id", str7);
            }
        } else if (str6 != null) {
            A0N.A0O("fb_location_city_id", str6);
        }
        C32165H8c A022 = A0N.A02();
        A022.A00 = new AnonymousClass1iP(context, this, userSession, str, str3, str4, str5, str2);
        schedule(A022);
    }

    public final void CGO() {
        this.mBusinessNavBarHelper.A00();
    }

    public final void CGY() {
        this.mBusinessNavBarHelper.A01();
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        this.A00.CfF();
        return true;
    }

    public static void A00(View view, String str, int i, int i2) {
        view.findViewById(i).setVisibility(0);
        C18180wK.A0G(view.findViewById(i), R.id.label).setText(i2);
        C18180wK.A0G(view.findViewById(i), R.id.content).setText(str);
    }

    public final void CGF() {
        if (getContext() != null) {
            C63813iO.A01(getContext(), C18230wP.A0l(this));
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.Crs(AnonymousClass0wJ.A0B(this).getString(2131821558));
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 116);
    }

    public final void onAttach(Context context) {
        C84114sZ r1;
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof C84114sZ) {
            r1 = (C84114sZ) activity;
        } else {
            r1 = null;
        }
        r1.getClass();
        this.A00 = r1;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1647085326);
        super.onCreate(bundle);
        this.A02 = C18180wK.A0V(C18250wR.A07(this));
        BusinessAttribute businessAttribute = (BusinessAttribute) this.mArguments.get("sync_attributes");
        this.A01 = businessAttribute;
        businessAttribute.getClass();
        C14030oh.A09(-1129793690, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String string2;
        int A022 = C14030oh.A02(-1909567591);
        View inflate = layoutInflater.inflate(R.layout.business_contact_review_fragment, viewGroup, false);
        if (!TextUtils.isEmpty(this.A01.A01)) {
            string = this.A01.A01;
        } else {
            string = getString(2131821569);
        }
        if (!TextUtils.isEmpty(this.A01.A05)) {
            string2 = this.A01.A05;
        } else {
            string2 = getString(2131821570);
        }
        Context context = getContext();
        BusinessAttribute businessAttribute = this.A01;
        String A04 = C67353zP.A04(context, businessAttribute.A06, businessAttribute.A07, businessAttribute.A00);
        if (TextUtils.isEmpty(A04)) {
            A04 = getString(2131821568);
        }
        A00(inflate, string, R.id.row_email, 2131829283);
        A00(inflate, string2, R.id.row_phone, 2131830175);
        A00(inflate, A04, R.id.row_address, 2131821190);
        View requireViewById = inflate.requireViewById(R.id.contact_confirmation_header);
        requireViewById.setVisibility(0);
        ((TextView) requireViewById).setText(2131821560);
        C18180wK.A0G(inflate, R.id.title).setText(2131821562);
        C18180wK.A0G(inflate, R.id.subtitle).setText(2131821561);
        View findViewById = inflate.findViewById(R.id.scroll_container);
        BusinessNavBar A0N = C18240wQ.A0N(inflate);
        this.mBusinessNavBar = A0N;
        this.mBusinessNavBarHelper = new C24711ju(A0N, (C84264sr) this, 2131824237, -1);
        this.mBusinessNavBar.A01(findViewById);
        registerLifecycleListener(this.mBusinessNavBarHelper);
        C14030oh.A09(-1795180848, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(641809781);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        this.mBusinessNavBarHelper = null;
        this.mBusinessNavBar = null;
        this.mStepperHeader = null;
        C14030oh.A09(-103392039, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
        this.mStepperHeader = igdsStepperHeader;
        igdsStepperHeader.setVisibility(0);
        IgdsStepperHeader igdsStepperHeader2 = this.mStepperHeader;
        C61033Rq r1 = (C61033Rq) ((BusinessAttributeSyncActivity) this.A00).A02.getValue();
        int A002 = C61033Rq.A00(r1, r1.A00.A00 + 1) - 1;
        C61033Rq r12 = (C61033Rq) ((BusinessAttributeSyncActivity) this.A00).A02.getValue();
        igdsStepperHeader2.A01(A002, C61033Rq.A00(r12, r12.A00.A01.size()));
    }

    public final void CGe(C21971Sw r1) {
        C18220wO.A18(this);
    }
}
