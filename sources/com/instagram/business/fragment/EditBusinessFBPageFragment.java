package com.instagram.business.fragment;

import X.AnonymousClass06E;
import X.AnonymousClass0wJ;
import X.AnonymousClass1cM;
import X.AnonymousClass1f3;
import X.AnonymousClass1fO;
import X.AnonymousClass2KX;
import X.AnonymousClass3IK;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C15730rn;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C23661ex;
import X.C24731jw;
import X.C25435DlZ;
import X.C25764Drc;
import X.C25786Drz;
import X.C311924p;
import X.C34522Jw;
import X.C37063Jjq;
import X.C37076Jk8;
import X.C37408JrQ;
import X.C50242sg;
import X.C61853Wb;
import X.C62883b4;
import X.C63813iO;
import X.C67173yz;
import X.C67243zD;
import X.C67353zP;
import X.C82034oy;
import X.C82424pb;
import X.C84104sY;
import X.C84284st;
import X.I17;
import X.I5x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.barcelona.R;
import com.instagram.business.activity.FbConnectPageActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Map;

public final class EditBusinessFBPageFragment extends I5x implements C82424pb, C82034oy, C84284st, C84104sY {
    public static final CallerContext A0E = CallerContext.A01(EditBusinessFBPageFragment.class.getName());
    public View A00;
    public ImageView A01;
    public ViewSwitcher A02;
    public AnonymousClass1fO A03;
    public BusinessFlowAnalyticsLogger A04;
    public AnonymousClass3IK A05;
    public AnonymousClass3IK A06;
    public UserSession A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public TextView A0C;
    public boolean A0D;

    public static void A02(EditBusinessFBPageFragment editBusinessFBPageFragment) {
        String A18;
        editBusinessFBPageFragment.A0D = true;
        if (editBusinessFBPageFragment.getActivity() instanceof FbConnectPageActivity) {
            Intent A0B2 = C18230wP.A0B();
            AnonymousClass3IK r0 = editBusinessFBPageFragment.A05;
            if (r0 != null) {
                A18 = r0.A0A;
            } else {
                A18 = AnonymousClass0wJ.A0Y(editBusinessFBPageFragment.A07).A18();
            }
            if (!TextUtils.isEmpty(A18)) {
                A0B2.putExtra("page_name", A18);
                editBusinessFBPageFragment.getActivity().setResult(-1, A0B2);
            }
            editBusinessFBPageFragment.getActivity().finish();
            return;
        }
        C18180wK.A12(editBusinessFBPageFragment);
    }

    public static void A03(EditBusinessFBPageFragment editBusinessFBPageFragment, AnonymousClass3IK r11) {
        EditBusinessFBPageFragment editBusinessFBPageFragment2 = editBusinessFBPageFragment;
        if (r11 == null || !r11.A00(AnonymousClass0wJ.A0Y(editBusinessFBPageFragment.A07))) {
            EditBusinessFBPageFragment editBusinessFBPageFragment3 = editBusinessFBPageFragment2;
            AnonymousClass2KX.A00(editBusinessFBPageFragment.getContext(), editBusinessFBPageFragment2, editBusinessFBPageFragment3, editBusinessFBPageFragment2.A07, r11.A08, r11.A05, C61853Wb.A00(A0E, editBusinessFBPageFragment.A07, "ig_professional_fb_page_linking"), editBusinessFBPageFragment.A09, "edit_profile_flow");
            return;
        }
        String str = r11.A09;
        String A0l = AnonymousClass0wJ.A0l(editBusinessFBPageFragment.requireContext(), str, 2131832110);
        C67353zP.A06(editBusinessFBPageFragment.requireContext(), str);
        editBusinessFBPageFragment.A05(r11.A08, A0l);
    }

    public final void A0L() {
        UserSession userSession = this.A07;
        Context context = getContext();
        String str = this.A09;
        AnonymousClass3IK r8 = this.A05;
        C67173yz.A00(getContext(), AnonymousClass06E.A00(this), new C23661ex(context, this.A04, this, r8, userSession, str), this.A07, (String) null);
    }

    public final void BsT() {
        User A0Y = AnonymousClass0wJ.A0Y(this.A07);
        if (!TextUtils.isEmpty(A0Y.A17()) || !A0Y.A3Z()) {
            String string = requireArguments().getString("edit_profile_entry");
            this.A0B = true;
            this.A08 = null;
            C62883b4.A04();
            String str = this.A09;
            C04220Ms.A0B(str, 0);
            Bundle A062 = C18180wK.A06();
            C18210wN.A0x(A062, str);
            A062.putString("edit_profile_entry", string);
            A062.putBoolean("from_null_state", false);
            A062.putBoolean("business_profile_edit_entry", true);
            A062.putParcelable("EXTRA_FB_OVERRIDE_DATA", (Parcelable) null);
            AnonymousClass1cM r2 = new AnonymousClass1cM();
            r2.setArguments(A062);
            r2.setTargetFragment(this, 0);
            C25786Drz A0Q = C18180wK.A0Q(getActivity(), this.A07);
            A0Q.A03 = r2;
            A0Q.A07 = "com.instagram.business.fragment.EditBusinessFBPageFragment";
            A0Q.A05();
            return;
        }
        C67243zD.A01(getContext(), this, new AnonymousClass1f3(getContext(), this, this, this.A07, this.A09), this.A07, true);
    }

    public final void CGO() {
        this.A03.A03 = false;
        this.A02.setDisplayedChild(0);
    }

    public final void CGY() {
        this.A03.A03 = true;
        this.A02.setDisplayedChild(1);
    }

    public final String getModuleName() {
        return "edit_business_fb_page";
    }

    public static void A04(EditBusinessFBPageFragment editBusinessFBPageFragment, String str) {
        if (editBusinessFBPageFragment.A0B) {
            UserSession userSession = editBusinessFBPageFragment.A07;
            String str2 = editBusinessFBPageFragment.A09;
            String str3 = editBusinessFBPageFragment.A08;
            C15730rn A002 = C34522Jw.A00();
            C18250wR.A19(A002, "create_page");
            A002.A0D("entry_point", str2);
            A002.A0D("page_id", str3);
            A002.A0D(I17.A00(595), str);
            if (userSession != null) {
                C18180wK.A1K(A002, userSession);
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
    }

    private void A05(String str, String str2) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A04;
        if (businessFlowAnalyticsLogger != null) {
            String str3 = null;
            String str4 = this.A09;
            AnonymousClass3IK r0 = this.A06;
            if (r0 != null) {
                str3 = r0.A08;
            }
            businessFlowAnalyticsLogger.Bdy(new C37408JrQ("page_change", str4, (String) null, str2, (String) null, Collections.singletonMap("page_id", str3), Collections.singletonMap("page_id", str), (Map) null));
        }
    }

    public final C10300i6 A0I() {
        return this.A07;
    }

    public final void CA7(AnonymousClass3IK r4) {
        if (r4.A00(AnonymousClass0wJ.A0Y(this.A07))) {
            String str = r4.A09;
            String A0l = AnonymousClass0wJ.A0l(requireContext(), str, 2131832110);
            C67353zP.A06(requireContext(), str);
            A05(r4.A08, A0l);
            return;
        }
        this.A06 = this.A05;
        this.A05 = r4;
        AnonymousClass1fO r1 = this.A03;
        r1.A01 = r1.A00;
        r1.A00 = r4;
        AnonymousClass1fO.A00(r1);
        A01();
    }

    public final void CGh(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A04;
        if (businessFlowAnalyticsLogger != null) {
            String str2 = null;
            String str3 = this.A09;
            AnonymousClass3IK r0 = this.A06;
            if (r0 != null) {
                str2 = r0.A08;
            }
            businessFlowAnalyticsLogger.Bdx(new C37408JrQ("page_change", str3, (String) null, (String) null, (String) null, Collections.singletonMap("page_id", str2), Collections.singletonMap("page_id", str), (Map) null));
        }
        A02(this);
    }

    public final void Crt(AnonymousClass3IK r6) {
        String str;
        AnonymousClass3IK r0 = this.A05;
        this.A06 = r0;
        AnonymousClass1fO r4 = this.A03;
        if (r0 == null) {
            str = this.A0A;
        } else {
            str = r0.A08;
        }
        if (str != null) {
            for (AnonymousClass3IK r2 : r4.A05) {
                if (r2.A08.equals(str)) {
                    r4.A01 = r4.A00;
                    r4.A00 = r2;
                    return;
                }
            }
        }
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A0D && (businessFlowAnalyticsLogger = this.A04) != null) {
            businessFlowAnalyticsLogger.BbZ(new C37408JrQ("page_change", this.A09, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        FragmentActivity activity = getActivity();
        if (!(activity instanceof FbConnectPageActivity)) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0.A08.equals(r4.A0A) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r4 = this;
            boolean r0 = r4.isResumed()
            if (r0 == 0) goto L_0x0030
            android.widget.ViewSwitcher r2 = r4.A02
            if (r2 == 0) goto L_0x0030
            X.3IK r0 = r4.A05
            if (r0 == 0) goto L_0x0019
            java.lang.String r1 = r0.A08
            java.lang.String r0 = r4.A0A
            boolean r0 = r1.equals(r0)
            r3 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r2.setEnabled(r3)
            android.widget.TextView r2 = r4.A0C
            android.content.res.ColorStateList r1 = r2.getTextColors()
            r0 = 64
            if (r3 == 0) goto L_0x0029
            r0 = 255(0xff, float:3.57E-43)
        L_0x0029:
            android.content.res.ColorStateList r0 = r1.withAlpha(r0)
            r2.setTextColor(r0)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.EditBusinessFBPageFragment.A01():void");
    }

    public final void CGK(String str, String str2, String str3, String str4) {
        C63813iO.A0F(str);
        A05(str4, str2);
    }

    public final void configureActionBar(AnonymousClass4u2 r4) {
        r4.Cqb(2131838165);
        AnonymousClass4u2.A04(C18180wK.A0N(), r4, this, 135);
        C25764Drc A0K = C18240wQ.A0K();
        A0K.A08 = R.layout.business_text_action_button;
        A0K.A04 = 2131826219;
        A0K.A0C = C18190wL.A0H(this, 136);
        ViewSwitcher viewSwitcher = (ViewSwitcher) r4.A7T(new C25435DlZ(A0K));
        this.A02 = viewSwitcher;
        TextView textView = (TextView) viewSwitcher.getChildAt(0);
        this.A0C = textView;
        textView.setText(2131826219);
        A01();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(2107892518);
        super.onCreate(bundle);
        this.A09 = C18190wL.A0k(this);
        C37063Jjq jjq = new C37063Jjq();
        jjq.A0D(new C24731jw(getActivity()));
        A0K(jjq);
        UserSession A0V = C18180wK.A0V(this.mArguments);
        this.A07 = A0V;
        this.A0A = AnonymousClass0wJ.A0Y(A0V).A17();
        this.A03 = new AnonymousClass1fO(getContext(), this, this, getString(2131835421), (CharSequence) null, (String) null, true);
        this.A04 = C37076Jk8.A00(C311924p.EDIT_PROFILE, this, this.A07, C18180wK.A0e());
        C14030oh.A09(-75179511, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(381946027);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.edit_business_fb_page_view);
        C14030oh.A09(1490347579, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-26026926);
        super.onResume();
        A01();
        C14030oh.A09(-540530219, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A00 = view.findViewById(R.id.page_list_group);
        this.A03.A02 = false;
        A0L();
        A0F(this.A03);
        C50242sg.A00(this.mView, this.A03.isEmpty());
        this.A03.A02 = true;
        ImageView A0J = C18200wM.A0J(view, R.id.refresh);
        this.A01 = A0J;
        A0J.setVisibility(8);
        AnonymousClass0wJ.A16(this.A01, 134, this);
    }
}
