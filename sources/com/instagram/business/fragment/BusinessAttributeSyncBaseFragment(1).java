package com.instagram.business.fragment;

import X.AnonymousClass0wJ;
import X.AnonymousClass24J;
import X.AnonymousClass3S4;
import X.AnonymousClass4u2;
import X.C14030oh;
import X.C18180wK;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C24711ju;
import X.C34640IcN;
import X.C61033Rq;
import X.C62563aI;
import X.C63393hP;
import X.C82034oy;
import X.C82424pb;
import X.C84114sZ;
import X.C84264sr;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessAttributeSyncActivity;
import com.instagram.business.model.BusinessAttribute;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import java.util.ArrayList;
import java.util.List;

public abstract class BusinessAttributeSyncBaseFragment extends C34640IcN implements C82424pb, C82034oy, C84264sr {
    public RadioGroup A00;
    public C84114sZ A01;
    public BusinessAttribute A02;
    public BusinessAttribute A03;
    public BusinessAttribute A04;
    public String A05;
    public List A06;
    public BusinessNavBar mBusinessNavBar;
    public C24711ju mBusinessNavBarHelper;
    public IgdsStepperHeader mStepperHeader;

    public final void A02(String str) {
        for (int i = 0; i < this.A06.size(); i++) {
            C62563aI r9 = (C62563aI) this.A06.get(i);
            int i2 = i + 1;
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2, 16.0f);
            CompoundButton compoundButton = (CompoundButton) C18240wQ.A0E(C18230wP.A0F(this), R.layout.row_check_radio_button_item);
            String str2 = r9.A01;
            boolean equals = "instagram".equals(str2);
            int i3 = R.drawable.instagram_facebook_circle_pano_outline_24;
            if (equals) {
                i3 = R.drawable.instagram_app_instagram_outline_24;
            }
            Drawable drawable = getContext().getDrawable(i3);
            C63393hP.A03(getContext(), drawable, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
            compoundButton.setButtonDrawable(drawable);
            compoundButton.setLayoutParams(layoutParams);
            compoundButton.setId(i2);
            String str3 = r9.A02;
            if (TextUtils.isEmpty(str3)) {
                compoundButton.setText(str);
                compoundButton.setEnabled(false);
            } else {
                compoundButton.setText(str3);
                if (this.A05.equals(str2)) {
                    compoundButton.setChecked(true);
                }
            }
            this.A00.addView(compoundButton);
            if (i != this.A06.size() - 1) {
                C18230wP.A0F(this).inflate(R.layout.row_divider, this.A00);
            }
        }
    }

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final void CJ9() {
    }

    public void CCX() {
        C84114sZ r0 = this.A01;
        if (r0 != null) {
            r0.Bek();
        }
    }

    public final boolean onBackPressed() {
        C84114sZ r0 = this.A01;
        if (r0 == null) {
            return false;
        }
        r0.CfF();
        BusinessAttributeSyncActivity businessAttributeSyncActivity = (BusinessAttributeSyncActivity) this.A01;
        AnonymousClass24J Abi = businessAttributeSyncActivity.Abi();
        if (Abi == null || Abi.A00 == null) {
            return true;
        }
        synchronized (((AnonymousClass3S4) C18180wK.A0c(AnonymousClass0wJ.A0U(businessAttributeSyncActivity.A00), AnonymousClass3S4.class, 7)).A00) {
        }
        return true;
    }

    public final void A01() {
        Bundle A07 = C18250wR.A07(this);
        this.A02 = (BusinessAttribute) A07.get("fb_attributes");
        this.A03 = (BusinessAttribute) A07.get("ig_attributes");
        BusinessAttribute businessAttribute = (BusinessAttribute) A07.get("sync_attributes");
        this.A04 = businessAttribute;
        this.A02.getClass();
        this.A03.getClass();
        businessAttribute.getClass();
    }

    public final void A03(String str, String str2) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A06 = A0v;
        C62563aI.A01("instagram", str2, A0v);
        this.A06.add(new C62563aI("facebook", str));
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.Crs(AnonymousClass0wJ.A0B(this).getString(2131821558));
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 117);
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
        this.A01 = r1;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(520151692);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.base_contact_review_layout);
        AnonymousClass0wJ.A0L(A0H, R.id.title).setText(2131821572);
        BusinessNavBar businessNavBar = (BusinessNavBar) A0H.findViewById(R.id.navigation_bar);
        this.mBusinessNavBar = businessNavBar;
        C24711ju r0 = new C24711ju(businessNavBar, (C84264sr) this, 2131831737, -1);
        this.mBusinessNavBarHelper = r0;
        registerLifecycleListener(r0);
        C14030oh.A09(461372335, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1846455959);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        this.mBusinessNavBar = null;
        this.mBusinessNavBarHelper = null;
        this.A00 = null;
        this.mStepperHeader = null;
        C14030oh.A09(-90797797, A022);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RadioGroup radioGroup = (RadioGroup) view.requireViewById(R.id.contact_preference_group);
        this.A00 = radioGroup;
        radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        this.A00.removeAllViews();
        if (this.A01 != null) {
            IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
            this.mStepperHeader = igdsStepperHeader;
            igdsStepperHeader.setVisibility(0);
            IgdsStepperHeader igdsStepperHeader2 = this.mStepperHeader;
            C61033Rq r1 = (C61033Rq) ((BusinessAttributeSyncActivity) this.A01).A02.getValue();
            int A002 = C61033Rq.A00(r1, r1.A00.A00 + 1) - 1;
            C61033Rq r12 = (C61033Rq) ((BusinessAttributeSyncActivity) this.A01).A02.getValue();
            igdsStepperHeader2.A01(A002, C61033Rq.A00(r12, r12.A00.A01.size()));
        }
    }
}
