package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1c6  reason: invalid class name */
public final class AnonymousClass1c6 extends C34640IcN implements C82424pb, C82034oy {
    public static final String A0B = AnonymousClass00U.A0L(AnonymousClass1c6.class.getName(), ".EXTRA_SHOULD_SHOW_IN_MODAL");
    public static final String __redex_internal_original_name = "BusinessLocationFragment";
    public EditText A00;
    public TextView A01;
    public BusinessFlowAnalyticsLogger A02;
    public C84654td A03;
    public Address A04;
    public UserSession A05;
    public String A06;
    public boolean A07;
    public TextView A08;
    public BusinessNavBar A09;
    public boolean A0A;

    public final String getModuleName() {
        return "business_location";
    }

    private Map A00() {
        String str;
        String str2;
        Address address = this.A04;
        String str3 = null;
        if (address == null) {
            str = null;
            str2 = null;
        } else {
            str = address.A04;
            str2 = address.A01;
            str3 = address.A02;
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("address", str);
        A0y.put(ServerW3CShippingAddressConstants.CITY, str2);
        A0y.put("zip_code", str3);
        return A0y;
    }

    public static void A01(AnonymousClass1c6 r10) {
        String str;
        C82224pH r1;
        Address address;
        Address address2;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r10.A02;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("page_import_info_location", r10.A06, "continue", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if ((!TextUtils.isEmpty(AnonymousClass0wJ.A0n(r10.A00)) || !TextUtils.isEmpty(C18210wN.A0c(r10.A01))) && ((address2 = r10.A04) == null || TextUtils.isEmpty(address2.A01))) {
            String string = r10.getString(2131832596);
            C63813iO.A0F(string);
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger2 = r10.A02;
            if (businessFlowAnalyticsLogger2 != null) {
                businessFlowAnalyticsLogger2.Bdy(new C37408JrQ("page_import_info_location", r10.A06, (String) null, string, "NO_CITY", (Map) null, (Map) null, (Map) null));
                return;
            }
            return;
        }
        C18240wQ.A10(r10);
        if (r10.A04 == null) {
            r1 = (C82224pH) r10.getTargetFragment();
            address = null;
        } else {
            String A0n = AnonymousClass0wJ.A0n(r10.A00);
            Address address3 = r10.A04;
            String str2 = null;
            if (address3 == null) {
                str = null;
            } else {
                str = address3.A01;
                str2 = address3.A00;
            }
            String A0c = C18210wN.A0c(r10.A01);
            r10.A04 = new Address(A0n, str, str2, A0c, C67353zP.A04(r10.getContext(), A0n, A0c, str));
            r1 = (C82224pH) r10.getTargetFragment();
            address = r10.A04;
        }
        r1.D9K(address);
        r10.A0A = true;
        if (r10.A03 == null) {
            C18180wK.A12(r10);
        } else {
            A03(r10, r10.A04);
            r10.mFragmentManager.A0d();
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger3 = r10.A02;
        if (businessFlowAnalyticsLogger3 != null) {
            businessFlowAnalyticsLogger3.BcE(new C37408JrQ("page_import_info_location", r10.A06, (String) null, (String) null, (String) null, (Map) null, r10.A00(), (Map) null));
        }
    }

    public static void A02(AnonymousClass1c6 r3) {
        Address address = r3.A04;
        if (address != null) {
            r3.A00.setText(address.A04);
            r3.A01.setText(r3.A04.A02);
            boolean isEmpty = TextUtils.isEmpty(r3.A04.A01);
            TextView textView = r3.A08;
            if (!isEmpty) {
                textView.setText(r3.A04.A01);
            } else {
                C18180wK.A0s(r3.getContext(), textView, R.color.grey_5);
            }
        }
    }

    public static void A03(AnonymousClass1c6 r4, Address address) {
        C84654td r0 = r4.A03;
        if (r0 != null) {
            BusinessInfo businessInfo = AnonymousClass0wJ.A0R(r0).A06;
            C67133yv A0R = AnonymousClass0wJ.A0R(r4.A03);
            C62163Xl r1 = new C62163Xl(businessInfo);
            r1.A00 = address;
            A0R.A06 = new BusinessInfo(r1);
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        IDxCListenerShape201S0100000_1_I2 A0H = C18190wL.A0H(this, 124);
        if (this.A07) {
            r5.Crr(new C25348Dk8(A0H, AnonymousClass0wJ.A0B(this).getString(2131830091), R.drawable.instagram_arrow_back_24));
            return;
        }
        r5.Cqb(2131830091);
        AnonymousClass4u2.A04(C18190wL.A0K(), r5, this, 125);
        if (!(!"edit_profile".equals(this.A06))) {
            int i = 2131826219;
            if (this.A03 == null) {
                i = 2131835122;
            }
            String string = getString(i);
            C25764Drc A0K = C18240wQ.A0K();
            A0K.A0F = string;
            AnonymousClass4u2.A01(A0H, A0K, r5);
        }
    }

    public final C10300i6 getSession() {
        return this.A05;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (this.A0A || (businessFlowAnalyticsLogger = this.A02) == null) {
            return false;
        }
        businessFlowAnalyticsLogger.BbZ(new C37408JrQ("page_import_info_location", this.A06, (String) null, (String) null, (String) null, (Map) null, A00(), (Map) null));
        return false;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A03 = C67293zJ.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(522683282);
        super.onCreate(bundle);
        C24731jw.A01(this);
        this.A06 = C18190wL.A0k(this);
        this.A04 = (Address) requireArguments().getParcelable(AnonymousClass1cS.A0H);
        C84654td r0 = this.A03;
        if (r0 != null) {
            this.A04 = AnonymousClass0wJ.A0R(r0).A06.A00;
        }
        this.A07 = requireArguments().getBoolean(A0B);
        UserSession A0V = C18180wK.A0V(this.mArguments);
        this.A05 = A0V;
        BusinessFlowAnalyticsLogger A002 = C67293zJ.A00(this.A03, this, A0V);
        this.A02 = A002;
        if (A002 != null) {
            A002.Bdt(new C37408JrQ("page_import_info_location", this.A06, (String) null, (String) null, (String) null, A00(), (Map) null, (Map) null));
        }
        C14030oh.A09(1215196383, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-267122108);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.business_location_fragment);
        C14030oh.A09(1307725469, A022);
        return A0H;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1443604154);
        super.onPause();
        C18190wL.A0F(this).setSoftInputMode(48);
        C14030oh.A09(-1840966242, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1717970123);
        super.onResume();
        C18190wL.A0F(this).setSoftInputMode(16);
        C14030oh.A09(1553737362, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-1523405357);
        super.onStop();
        C18240wQ.A10(this);
        C14030oh.A09(-2007910827, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.remove_container);
        View requireViewById2 = view.requireViewById(R.id.remove_button);
        Address address = this.A04;
        if (address == null || TextUtils.isEmpty(address.A03)) {
            requireViewById.setVisibility(C18230wP.A03(view, R.id.remove_button_bottom_divider));
        } else {
            AnonymousClass0wJ.A16(requireViewById2, 121, this);
        }
        this.A00 = (EditText) view.findViewById(R.id.street_address);
        this.A08 = AnonymousClass0wJ.A0L(view, R.id.city_state);
        this.A01 = C18180wK.A0G(view, R.id.zip);
        A02(this);
        AnonymousClass0wJ.A16(this.A08, 122, this);
        BusinessNavBar A0N = C18240wQ.A0N(view);
        this.A09 = A0N;
        if (this.A03 != null) {
            A0N.setPrimaryButtonText(2131835122);
        }
        if (!"edit_profile".equals(this.A06)) {
            this.A09.setVisibility(0);
            this.A09.setPrimaryButtonOnclickListeners(C18190wL.A0H(this, 123));
        }
    }
}
