package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.IDxSListenerShape58S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape5S1300000_1_I2;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.barcelona.R;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0100000_I2_3;
import kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2;
import kotlin.jvm.internal.KtLambdaShape69S0100000_I2_49;

/* renamed from: X.1dv  reason: invalid class name and case insensitive filesystem */
public final class C23481dv extends AnonymousClass9NU implements C82034oy, C84094sX, C82524pq {
    public static final String __redex_internal_original_name = "FanClubMemberListFragment";
    public final C04530Oa A00;
    public final C04530Oa A01 = C80644m9.A00(this);
    public final C04530Oa A02;

    public final /* synthetic */ void BhN(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        C34342Je.A00(fragmentActivity, userSession, user, str);
        throw null;
    }

    public final void CAd(User user) {
        Context A0A = C18240wQ.A0A(this, user, 0);
        String BK7 = user.BK7();
        C58963Iu r2 = new C58963Iu(AnonymousClass0wJ.A0U(this.A01));
        r2.A06(BK7);
        r2.A08(requireContext().getString(2131837631), new IDxCListenerShape5S1300000_1_I2(user, A0A, this, BK7, 5));
        new C62763ag(r2).A04(requireContext());
    }

    public final /* synthetic */ void CAe(User user) {
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        r3.Cqb(2131837638);
        if (C18190wL.A0f(this.A00).equals("SETTINGS")) {
            r3.CtT(true);
            return;
        }
        ((E2V) r3).A0P.setEnabled(true);
        AnonymousClass4u2.A06(r3);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FanClubMemberListViewModel fanClubMemberListViewModel = (FanClubMemberListViewModel) this.A02.getValue();
        C86074wE.A01(fanClubMemberListViewModel.A0B, true);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape20S0201000_I2_6(fanClubMemberListViewModel, (C146958n9) null, 9), AnonymousClass3J5.A00(fanClubMemberListViewModel), 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape14S0100000_I2_3(fanClubMemberListViewModel, (C146958n9) null, 17), AnonymousClass3J5.A00(fanClubMemberListViewModel), 3);
        View requireViewById = view.requireViewById(R.id.empty_state_headline);
        IgdsHeadline igdsHeadline = (IgdsHeadline) requireViewById;
        igdsHeadline.A08(R.drawable.instagram_users_outline_96, true);
        C04220Ms.A06(requireViewById);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.create_group_chat_button);
        AnonymousClass061 r8 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0501000_I2(igdsHeadline, viewLifecycleOwner, this, r8, A0K, (C146958n9) null, 31), AnonymousClass067.A00(viewLifecycleOwner), 3);
        AnonymousClass066 viewLifecycleOwner2 = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) viewLifecycleOwner2, (Object) r8, (Object) this, (C146958n9) null, 48), AnonymousClass067.A00(viewLifecycleOwner2), 3);
        C18190wL.A1E(getRecyclerView(), this, 2);
        getRecyclerView().A11(new IDxSListenerShape58S0100000_1_I2(this, 3));
    }

    public final Collection getDefinitions() {
        return C06750aI.A17(new AnonymousClass1l1(this, this, this, AnonymousClass0wJ.A0X(this.A01)), new AnonymousClass1kK(), new C24781kc(this), new C24771kb(this), new AnonymousClass1kH(), new AnonymousClass1kZ(this));
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C139858Po.A00);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public C23481dv() {
        KtLambdaShape69S0100000_I2_49 A0f = C18250wR.A0f(this, 47);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, C18250wR.A0f(C18250wR.A0f(this, 44), 45));
        this.A02 = C18220wO.A0M(C18250wR.A0f(A012, 46), A0f, C18250wR.A0d(A012, (Object) null, 46), C18210wN.A0l(FanClubMemberListViewModel.class));
        this.A00 = C62373Zc.A01(this, 43);
    }

    public final void BoR(FanClubCategoryType fanClubCategoryType, String str) {
        AnonymousClass24R r1;
        Bundle A06 = C18180wK.A06();
        A06.putParcelable("fan_club_category_type", fanClubCategoryType);
        A06.putString("fan_club_category_name", str);
        String str2 = ((FanClubMemberListViewModel) this.A02.getValue()).A06;
        if (C04220Ms.A0I(str2, "PROFILE")) {
            r1 = AnonymousClass24R.PROFILE_SUBSCRIPTION;
        } else {
            if (C04220Ms.A0I(str2, "SETTINGS")) {
                r1 = AnonymousClass24R.PROFESSIONAL_HOME;
            }
            C25786Drz A0Q = C18180wK.A0Q(getActivity(), AnonymousClass0wJ.A0U(this.A01));
            A0Q.A0A(A06, new C23471du());
            A0Q.A05();
        }
        A06.putSerializable("entrypoint", r1);
        C25786Drz A0Q2 = C18180wK.A0Q(getActivity(), AnonymousClass0wJ.A0U(this.A01));
        A0Q2.A0A(A06, new C23471du());
        A0Q2.A05();
    }

    public final void onPause() {
        int A022 = C14030oh.A02(2014403045);
        super.onPause();
        View A09 = C18250wR.A09(this);
        if (A09 != null) {
            Object systemService = requireContext().getSystemService("input_method");
            C04220Ms.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            C18230wP.A14(A09, (InputMethodManager) systemService);
        }
        C14030oh.A09(-1682506897, A022);
    }
}
