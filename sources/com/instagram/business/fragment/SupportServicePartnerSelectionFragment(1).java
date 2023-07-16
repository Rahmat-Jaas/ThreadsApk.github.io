package com.instagram.business.fragment;

import X.AnonymousClass0wJ;
import X.AnonymousClass3Zw;
import X.AnonymousClass4u2;
import X.AnonymousClass5tQ;
import X.AnonymousClass5yH;
import X.AnonymousClass7IV;
import X.C04620Ok;
import X.C06810aP;
import X.C10300i6;
import X.C118176zs;
import X.C121877Ip;
import X.C14030oh;
import X.C146558mR;
import X.C18180wK;
import X.C18200wM;
import X.C18210wN;
import X.C32165H8c;
import X.C34640IcN;
import X.C82034oy;
import X.H1T;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape188S0100000_2_I2;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

public class SupportServicePartnerSelectionFragment extends C34640IcN implements C82034oy {
    public C146558mR A00;
    public SMBPartnerType A01;
    public AnonymousClass5yH A02;
    public AnonymousClass7IV A03;
    public UserSession A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mRecyclerView;

    public final String getModuleName() {
        return "service_partner_selection";
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (this.A05.equals("sticker")) {
            r3.Crs(AnonymousClass0wJ.A0B(this).getString(2131836457));
        } else {
            AnonymousClass4u2.A07(r3, 2131820908);
        }
    }

    public final C10300i6 getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(895805237);
        super.onCreate(bundle);
        this.A02 = new AnonymousClass5yH(this);
        Bundle requireArguments = requireArguments();
        this.A04 = C18180wK.A0V(requireArguments);
        this.A06 = requireArguments.getString("args_session_id");
        this.A05 = requireArguments.getString("args_entry_point");
        this.A01 = (SMBPartnerType) requireArguments.getSerializable("args_service_type");
        this.A03 = new AnonymousClass7IV(this, this.A04, this.A06, this.A05);
        UserSession userSession = this.A04;
        C04620Ok r2 = C06810aP.A01;
        this.A08 = AnonymousClass0wJ.A1W(C121877Ip.A00(this.A01, r2.A01(userSession)));
        this.A00 = C121877Ip.A00(this.A01, r2.A01(this.A04));
        C14030oh.A09(1304577856, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1720926573);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.support_service_partner_selection_fragment);
        C14030oh.A09(52117911, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        H1T A0O;
        String str;
        super.onViewCreated(view, bundle);
        this.mLoadingSpinner = (SpinnerImageView) view.findViewById(R.id.loading_indicator);
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.recycler_view);
        this.mRecyclerView = recyclerView;
        recyclerView.setAdapter(this.A02);
        if (this.A07 == null) {
            SpinnerImageView spinnerImageView = this.mLoadingSpinner;
            if (spinnerImageView != null) {
                spinnerImageView.setVisibility(0);
            }
            IDxACallbackShape112S0100000_2_I2 iDxACallbackShape112S0100000_2_I2 = new IDxACallbackShape112S0100000_2_I2(this, 8);
            SMBPartnerType sMBPartnerType = this.A01;
            if (sMBPartnerType.equals(SMBPartnerType.GIFT_CARD)) {
                A0O = C18180wK.A0O(this.A04);
                str = "business/instant_experience/get_support_button_partners_bundle/";
            } else if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                A0O = C18180wK.A0O(this.A04);
                str = "business/instant_experience/get_delivery_button_partners_bundle/";
            }
            A0O.A0J(str);
            C32165H8c A0T = C18180wK.A0T(A0O, AnonymousClass5tQ.class, C118176zs.class);
            A0T.A00 = iDxACallbackShape112S0100000_2_I2;
            schedule(A0T);
        }
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.title);
        if (this.A05.equals("sticker")) {
            i = 2131835509;
            if (this.A01.equals(SMBPartnerType.GIFT_CARD)) {
                i = 2131835510;
            }
        } else {
            i = 2131835508;
        }
        C18180wK.A10(A0L, this, i);
        TextView A0L2 = AnonymousClass0wJ.A0L(view, R.id.subtitle);
        int i2 = 2131835505;
        if (this.A05.equals("sticker")) {
            i2 = 2131835506;
            if (this.A01.equals(SMBPartnerType.GIFT_CARD)) {
                i2 = 2131835507;
            }
        }
        String string = getString(2131822797);
        SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0o(this, string, i2));
        AnonymousClass3Zw.A01(A0E, new IDxCSpanShape188S0100000_2_I2(this, C18210wN.A01(getContext()), 5), string);
        A0L2.setText(A0E);
        A0L2.setHighlightColor(0);
        C18180wK.A0z(A0L2);
    }
}
