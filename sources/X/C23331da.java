package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.1da  reason: invalid class name and case insensitive filesystem */
public final class C23331da extends I5x implements C82034oy, C84104sY, CallerContextable {
    public static final CallerContext A07 = CallerContext.A00(C23331da.class);
    public static final String __redex_internal_original_name = "FBIGTVPageListFragment";
    public View A00;
    public View A01;
    public ImageView A02;
    public AnonymousClass1fO A03;
    public AnonymousClass3IK A04;
    public UserSession A05;
    public boolean A06;

    public final void BsT() {
    }

    public final String getModuleName() {
        return "fb_igtv_page_list_fragment";
    }

    public static void A01(C23331da r7) {
        String A012;
        UserSession userSession = r7.A05;
        CallerContext callerContext = A07;
        C35802Ow.A00(userSession, "token_access", "ig_to_fb_video_crossposting", callerContext.A02);
        boolean A3D = AnonymousClass0wJ.A0Y(r7.A05).A3D();
        UserSession userSession2 = r7.A05;
        if (A3D) {
            A012 = C61853Wb.A00(callerContext, userSession2, "ig_to_fb_video_crossposting");
        } else {
            A012 = C62963bD.A01(callerContext, userSession2, "ig_to_fb_video_crossposting");
        }
        if (A012 != null) {
            Context context = r7.getContext();
            AnonymousClass06E A002 = AnonymousClass06E.A00(r7);
            IDxACallbackShape111S0100000_1_I2 A062 = C63873iU.A06(r7, 13);
            C26241qH r1 = new C26241qH(StringFormatUtil.formatStrLocaleSafe("{\"%s\":\"%s\"}", "0", "ADMINISTER"));
            C31082GfJ gfJ = new C31082GfJ(A012);
            gfJ.A07(r1);
            C32165H8c A032 = gfJ.A03();
            A032.A00 = A062;
            C31155GhB.A01(context, A002, A032);
        }
    }

    public final C10300i6 A0I() {
        return this.A05;
    }

    public final void CA7(AnonymousClass3IK r3) {
        this.A04 = r3;
        AnonymousClass1fO r1 = this.A03;
        r1.A01 = r1.A00;
        r1.A00 = r3;
        AnonymousClass1fO.A00(r1);
    }

    public final void Crt(AnonymousClass3IK r3) {
        this.A04 = r3;
        AnonymousClass1fO r1 = this.A03;
        r1.A01 = r1.A00;
        r1.A00 = r3;
        AnonymousClass1fO.A00(r1);
    }

    public final void configureActionBar(AnonymousClass4u2 r4) {
        AnonymousClass4u2.A04(C18180wK.A0N(), r4, this, 139);
        C25764Drc A0K = C18240wQ.A0K();
        A0K.A0F = getString(2131826219);
        AnonymousClass4u2.A01(C18190wL.A0H(this, 140), A0K, r4);
        C58763Hc r2 = new C58763Hc(AnonymousClass006.A00);
        r2.A01(getContext().getColor(R.color.design_dark_default_color_on_background));
        r4.Cro(r2.A00());
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-693724464);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A05 = C18180wK.A0V(requireArguments);
        Context context = getContext();
        this.A03 = new AnonymousClass1fO(context, this, this, requireArguments.getString("pages_connect_header_subtitle"), context.getString(2131831743), context.getResources().getString(2131824304), false);
        C14030oh.A09(-998037026, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1337441966);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.igtv_page_list_fragment);
        C14030oh.A09(-2026288108, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1028534278);
        super.onResume();
        if (!this.A06) {
            this.A06 = true;
            A01(this);
        }
        C14030oh.A09(247803771, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = view.findViewById(R.id.page_list_group);
        this.A02 = C18200wM.A0J(view, R.id.refresh);
        View requireViewById = view.requireViewById(R.id.no_admin_pages_view);
        this.A00 = requireViewById;
        requireViewById.setVisibility(8);
        Bundle requireArguments = requireArguments();
        C18250wR.A0q(requireArguments, AnonymousClass0wJ.A0L(this.A00, R.id.title_text), "pages_no_admin_pages_header_string");
        C18250wR.A0q(requireArguments, AnonymousClass0wJ.A0L(this.A00, R.id.explanation_text), "pages_no_admin_pages_explanation_string");
        this.A02.setVisibility(8);
        AnonymousClass0wJ.A16(this.A02, 138, this);
        this.A03.A02 = true;
        this.A01.setVisibility(0);
        A0F(this.A03);
        C50242sg.A00(this.mView, this.A03.isEmpty());
    }
}
