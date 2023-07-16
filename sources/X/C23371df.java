package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.facebook.redex.IDxTListenerShape545S0100000_1_I2;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Map;

/* renamed from: X.1df  reason: invalid class name and case insensitive filesystem */
public final class C23371df extends I5x implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "CitySearchFragment";
    public C84654td A00;
    public AnonymousClass1fL A01;
    public BusinessFlowAnalyticsLogger A02;
    public SearchEditText A03;
    public String A04;
    public String A05;
    public boolean A06;
    public UserSession A07;
    public boolean A08;
    public final Handler A09 = new C18530xL(Looper.getMainLooper(), this);

    public final String getModuleName() {
        return "business_city_search";
    }

    public final C10300i6 A0I() {
        return this.A07;
    }

    public final void configureActionBar(AnonymousClass4u2 r4) {
        IDxCListenerShape201S0100000_1_I2 A0H = C18190wL.A0H(this, 130);
        if (this.A08) {
            ActionButton A002 = AnonymousClass4u2.A00(A0H, r4, AnonymousClass0wJ.A0B(this).getString(2131823295));
            A002.setButtonResource(R.drawable.instagram_arrow_cw_pano_outline_24);
            A002.setContentDescription(getString(2131834537));
            return;
        }
        r4.Cqb(2131823295);
        r4.CtT(true);
        r4.CtQ(A0H, true);
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (this.A06 || (businessFlowAnalyticsLogger = this.A02) == null) {
            return false;
        }
        businessFlowAnalyticsLogger.BbZ(new C37408JrQ("page_import_info_city_town", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void A0L(String str) {
        if (!TextUtils.isEmpty(str)) {
            Handler handler = this.A09;
            if (handler.hasMessages(1)) {
                handler.removeMessages(1);
            }
            handler.sendMessageDelayed(handler.obtainMessage(1, str), 300);
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A00 = C67293zJ.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-512637828);
        super.onCreate(bundle);
        this.A05 = C18190wL.A0k(this);
        this.A01 = new AnonymousClass1fL(getContext(), this);
        this.A08 = requireArguments().getBoolean(AnonymousClass1c6.A0B);
        this.A07 = C18180wK.A0V(this.mArguments);
        C37063Jjq jjq = new C37063Jjq();
        jjq.A0D(new C24731jw(getActivity()));
        A0K(jjq);
        BusinessFlowAnalyticsLogger A002 = C67293zJ.A00(this.A00, this, this.A07);
        this.A02 = A002;
        if (A002 != null) {
            A002.Bdt(new C37408JrQ("page_import_info_city_town", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        C14030oh.A09(-799310722, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1561778261);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.city_search_fragment);
        C14030oh.A09(-1785230283, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1058252905);
        super.onResume();
        this.A03.requestFocus();
        C09860go.A0K(this.A03);
        C14030oh.A09(159950364, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(1191392317);
        super.onStop();
        C18240wQ.A10(this);
        C14030oh.A09(-1973735218, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A03 = (SearchEditText) view.requireViewById(R.id.search_edit_text);
        ColorFilter A012 = C63393hP.A01(getContext(), R.color.grey_5);
        this.A03.setClearButtonColorFilter(A012);
        this.A03.getCompoundDrawablesRelative()[0].mutate().setColorFilter(A012);
        this.A03.addTextChangedListener(C64543mW.A00(this.A07));
        this.A03.A06 = new IDxTListenerShape545S0100000_1_I2(this, 0);
        A0F(this.A01);
        C018908v.A00(this);
        this.A05.setOnScrollListener(new C65653u0(this));
    }
}
