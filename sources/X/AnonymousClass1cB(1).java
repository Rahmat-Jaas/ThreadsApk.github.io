package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.1cB  reason: invalid class name */
public final class AnonymousClass1cB extends C34640IcN implements C82424pb, C82034oy, C82024ox {
    public static final String __redex_internal_original_name = "AccountLinkingMainGroupManagementFragment";
    public AnonymousClass1fJ A00;
    public C62813an A01;
    public C82394pY A02;
    public UserSession A03;
    public List A04;
    public boolean A05;
    public AnonymousClass3Fo A06;
    public AnonymousClass4u2 A07;
    public String A08;
    public Set A09;
    public boolean A0A;

    public final String getModuleName() {
        return "account_linking_main_group_management";
    }

    public static void A00(AnonymousClass378 r4, AnonymousClass1cB r5) {
        ArrayList A0s = C18200wM.A0s(r5.A00.A04);
        A04(r5, true);
        AnonymousClass4KQ r42 = new AnonymousClass4KQ(r5.getContext(), AnonymousClass06E.A00(r5), new IDxACallbackShape35S0200000_1_I2(1, r5, r4), A0s);
        String userId = r5.A03.getUserId();
        if (!AnonymousClass0RA.A0C.A09(new AnonymousClass4KE(), (C04850Pk) null, r42, userId)) {
            AnonymousClass3JQ.A00(r5.getContext(), (DialogInterface.OnClickListener) null);
            A04(r5, false);
        }
        C15730rn A002 = C15730rn.A00(r5, "ig_manage_main_account_attempt");
        A03(r5, A002);
        A02(r5, A002);
        C32592Cl.A00(A002, r5.A03);
    }

    public static void A02(AnonymousClass1cB r4, C15730rn r5) {
        List list = r4.A04;
        ArrayList A0t = C18200wM.A0t(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C72144Mm.A00(A0t, it);
        }
        C39113Kn0 A012 = C37358JqB.A01(new HashSet(A0t), r4.A09);
        C39113Kn0 A013 = C37358JqB.A01(r4.A00.A04, r4.A09);
        r5.A0E("array_currently_connected_account_ids", new LinkedList(r4.A09));
        r5.A0E("array_currently_unconnected_account_ids", new LinkedList(A012));
        r5.A0E("array_new_connected_account_ids", new LinkedList(A013));
    }

    public static void A03(AnonymousClass1cB r2, C15730rn r3) {
        r3.A09("is_removing", C18240wQ.A0X(r2.A00.A04.containsAll(r2.A09)));
    }

    public static void A04(AnonymousClass1cB r1, boolean z) {
        r1.A05 = z;
        C18190wL.A0M(r1).setIsLoading(z);
        AnonymousClass4u2 r0 = r1.A07;
        if (r0 != null) {
            ((E2V) r0).A0P.setEnabled(!z);
        }
    }

    public static void A05(AnonymousClass1cB r4, boolean z) {
        for (C72144Mm A012 : C50492t5.A00(C62813an.A02(r4.A01, r4.A03).A03)) {
            r4.A00.A09(A012.A01(), true);
        }
        if (z) {
            r4.A09 = new HashSet(r4.A00.A04);
        }
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    public final boolean onBackPressed() {
        if (this.A05) {
            return true;
        }
        boolean z = this.A0A;
        C12560m7 r2 = this.mFragmentManager;
        if (z) {
            r2.A0d();
            return true;
        }
        r2.A11("UserOptionsFragment.USER_OPTIONS_FRAGMENT_BACKSTATE_NAME", 0);
        return true;
    }

    public static void A01(AnonymousClass1cB r4) {
        LinkedHashMap A0y = C18220wO.A0y();
        AccountFamily A022 = C62813an.A02(r4.A01, r4.A03);
        if (A022 != null) {
            for (C72144Mm r1 : C50492t5.A00(A022.A03)) {
                A0y.put(r1.A01(), r1);
            }
            r4.A04 = new LinkedList(A0y.values());
        }
    }

    public final void CAL(String str, String str2) {
        this.A08 = str;
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.setTitle(requireActivity().getString(2131820851));
        r3.Crj((View.OnClickListener) null, R.drawable.zero_size_shape).setEnabled(false);
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 26);
        ((E2V) r3).A0P.setEnabled(!this.A05);
        r3.setIsLoading(this.A05);
        this.A07 = r3;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1748545269);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        UserSession A0V = C18180wK.A0V(bundle2);
        this.A03 = A0V;
        this.A01 = C62813an.A01(A0V);
        this.A06 = new AnonymousClass3Fo(this.A03);
        this.A0A = C18240wQ.A1S(bundle2, "should_pop_back_stack_without_name");
        this.A00 = new AnonymousClass1fJ(getActivity(), this, this, this);
        A01(this);
        this.A00.A0A(this.A04);
        A05(this, true);
        this.A02 = C18220wO.A0P(this, 2);
        C14030oh.A09(582711279, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-740378673);
        View inflate = layoutInflater.inflate(R.layout.account_linking_main_group_management_fragment, viewGroup, false);
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.main_account_explanation_textview);
        Resources resources = requireActivity().getResources();
        UserSession userSession = this.A03;
        C04620Ok r8 = C06810aP.A01;
        A0L.setText(C16370sw.A01(resources, new String[]{C18200wM.A0k(userSession, r8), C18200wM.A0k(this.A03, r8)}, 2131820864));
        View findViewById = inflate.findViewById(R.id.main_account_row);
        Context context = getContext();
        User A012 = r8.A01(this.A03);
        CircularImageView circularImageView = (CircularImageView) findViewById.findViewById(R.id.avatar_imageview);
        circularImageView.A09();
        A012.B4M();
        if (A012.A34()) {
            C18180wK.A0r(context, circularImageView, R.drawable.profile_anonymous_user);
        } else {
            C18220wO.A1L(this, circularImageView, A012);
        }
        circularImageView.A0F(1, C121907Is.A00(context, R.attr.avatarInnerStroke));
        findViewById.setBackgroundResource(C121907Is.A02(context, R.attr.accountLinkingMainAccountBackground));
        AnonymousClass0wJ.A0L(findViewById, R.id.username_textview).setText(A012.BK7());
        C19577Ayd A0U = C18190wL.A0U(findViewById, R.id.checkbox_viewstub);
        A0U.A08().setBackgroundDrawable(C19587Ayn.A00(context, R.color.blue_5_30_transparent));
        ((CompoundButton) A0U.A08()).setChecked(true);
        A0U.A08().setClickable(false);
        ((AbsListView) inflate.requireViewById(R.id.list_view)).setAdapter(this.A00);
        C14030oh.A09(-86861325, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1801854969);
        super.onResume();
        if (!TextUtils.isEmpty(this.A08)) {
            String str = this.A08;
            this.A08 = null;
            AnonymousClass378 r6 = (AnonymousClass378) this.A00.A03.get(str);
            C63813iO.A0D(getContext(), C18220wO.A0k(this, r6.A01.A02(), AnonymousClass0wJ.A0Y(this.A03).BK7(), 2131820846), 1);
            this.A00.A09(str, false);
            C38040KHr.A01.A03(this.A02, AnonymousClass45E.class);
            A00(r6, this);
        }
        C14030oh.A09(-55098823, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(1273376474);
        super.onStart();
        this.A06.A00(requireActivity(), true);
        C14030oh.A09(772709542, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-557261066);
        super.onStop();
        C38040KHr.A01.A04(this.A02, AnonymousClass45E.class);
        this.A07 = null;
        C14030oh.A09(-133428674, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.A00.isEmpty()) {
            AnonymousClass3JQ.A00(getContext(), C18220wO.A0O(this, 3));
        }
        C15730rn A002 = C15730rn.A00(this, "ig_manage_main_account_impression");
        A02(this, A002);
        C32592Cl.A00(A002, this.A03);
    }
}
