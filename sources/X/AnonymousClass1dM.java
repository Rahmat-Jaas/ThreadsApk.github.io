package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxBDelegateShape506S0100000_1_I2;
import com.facebook.redex.IDxComparatorShape94S0000000_1_I2;
import com.facebook.redex.IDxFCallbackShape113S0200000_1_I2;
import com.facebook.redex.IDxFCallbackShape12S0210000_1_I2;
import com.facebook.redex.IDxIListenerShape487S0100000_2_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import com.instagram.service.session.UserSession;
import com.instagram.unifiedfeedback.api.graphql.CXPCommentHideMutationResponseImpl;
import com.instagram.unifiedfeedback.api.graphql.CXPCommentReactMutationResponseImpl;
import com.instagram.unifiedfeedback.api.graphql.FBCommentImpl;
import com.instagram.unifiedfeedback.api.graphql.FBFeedbackImpl;
import com.instagram.unifiedfeedback.api.graphql.TopLevelCommentsImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112;

/* renamed from: X.1dM  reason: invalid class name */
public final class AnonymousClass1dM extends C34640IcN implements C21735BzM {
    public static final String __redex_internal_original_name = "FbCommentThreadBottomSheetFragment";
    public View A00;
    public View A01;
    public C13330nS A02;
    public C150388wA A03;
    public RefreshableRecyclerViewLayout A04;
    public BKU A05;
    public AnonymousClass36T A06;
    public C684743y A07;
    public AnonymousClass4AC A08;
    public boolean A09;
    public boolean A0A;
    public View A0B;
    public E2V A0C;
    public final Handler A0D = AnonymousClass0wJ.A0F();
    public final AnonymousClass3G3 A0E = new AnonymousClass3G3();
    public final Set A0F = C18200wM.A0u();
    public final Set A0G = C18200wM.A0u();
    public final Set A0H = C18200wM.A0u();
    public final C04530Oa A0I = C80644m9.A00(this);
    public final C82034oy A0J = new IDxBDelegateShape506S0100000_1_I2(this, 5);
    public final C30938GbW A0K = C29781Fu1.A00();
    public final AnonymousClass3IU A0L = new AnonymousClass3IU(this);

    public final String getModuleName() {
        return "facebook_comments_bottom_sheet";
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        FBFeedbackImpl.OwningProfile owningProfile;
        TreeJNI treeValue;
        FBFeedbackImpl.OwningProfile owningProfile2;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A092 = C18250wR.A09(this);
        if (A092 != null) {
            Object systemService = requireContext().getSystemService("input_method");
            C04220Ms.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(A092.getWindowToken(), 0);
            A092.clearFocus();
        }
        this.A01 = AnonymousClass0wJ.A0K(view, R.id.layout_fb_comment_thread_root);
        AnonymousClass03G.A00(C18180wK.A0F(this), false);
        View view2 = this.A01;
        if (view2 == null) {
            C04220Ms.A0E("rootView");
            throw null;
        }
        C006002r.A00(view2, new IDxIListenerShape487S0100000_2_I2(this, 2));
        E2V e2v = new E2V(C18210wN.A0H(this, 336), C18220wO.A0J(view, R.id.layout_fb_comment_thread_action_bar));
        this.A0C = e2v;
        e2v.A0S(this.A0J);
        this.A00 = AnonymousClass0wJ.A0I(view, R.id.fb_comment_composer_container);
        Context context = getContext();
        C04220Ms.A0C(context, "null cannot be cast to non-null type android.content.Context");
        View view3 = this.A00;
        if (view3 == null) {
            C04220Ms.A0E("composerView");
            throw null;
        }
        this.A08 = new AnonymousClass4AC(context, view3, this);
        AnonymousClass3G3 r1 = this.A0E;
        AnonymousClass3TH r0 = r1.A01;
        if (r0 == null || (owningProfile2 = r0.A03) == null) {
            str = null;
        } else {
            str = C18220wO.A0l(owningProfile2);
        }
        AnonymousClass3TH r02 = r1.A01;
        if (r02 == null || (owningProfile = r02.A03) == null || (treeValue = owningProfile.getTreeValue("profile_picture(scale:1,width:150)", FBFeedbackImpl.OwningProfile.ProfilePicture.class)) == null) {
            str2 = null;
        } else {
            str2 = C18250wR.A0Y(treeValue);
        }
        if (!(str == null || str2 == null)) {
            AnonymousClass4AC r03 = this.A08;
            if (r03 == null) {
                C04220Ms.A0E("composerController");
                throw null;
            }
            r03.A00(str, str2);
        }
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = (RefreshableRecyclerViewLayout) AnonymousClass0wJ.A0J(view, 16908298);
        this.A04 = refreshableRecyclerViewLayout;
        if (refreshableRecyclerViewLayout == null) {
            C04220Ms.A0E("refreshableRecyclerViewLayout");
            throw null;
        }
        RecyclerView recyclerView = refreshableRecyclerViewLayout.A0P;
        requireContext();
        LinearLayoutManagerCompat linearLayoutManagerCompat = new LinearLayoutManagerCompat();
        recyclerView.setLayoutManager(linearLayoutManagerCompat);
        C150388wA r04 = this.A03;
        if (r04 == null) {
            C04220Ms.A0E("recyclerViewAdapter");
            throw null;
        }
        recyclerView.setAdapter(r04);
        M0E m0e = recyclerView.A0G;
        C04220Ms.A0C(m0e, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((I7p) m0e).A00 = false;
        recyclerView.A11(new C150728wn(linearLayoutManagerCompat, new AnonymousClass4CG(this), C19064Aq3.A0C));
        C30938GbW gbW = this.A0K;
        C35004Ikn A002 = C35004Ikn.A00(this);
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout2 = this.A04;
        if (refreshableRecyclerViewLayout2 == null) {
            C04220Ms.A0E("refreshableRecyclerViewLayout");
            throw null;
        }
        gbW.A04(refreshableRecyclerViewLayout2.A0P, A002);
        View A0K2 = AnonymousClass0wJ.A0K(view, R.id.layout_fb_comment_thread_splash);
        this.A0B = A0K2;
        if (!this.A09) {
            A0K2.setVisibility(0);
            A04(this, (String) null, true);
        }
    }

    public static final void A00(AnonymousClass1dM r12) {
        Set set = r12.A0H;
        boolean A1a = C18190wL.A1a(set);
        String str = "composerView";
        View view = r12.A00;
        if (A1a) {
            if (view != null) {
                view.setVisibility(8);
            }
            C04220Ms.A0E(str);
            throw null;
        }
        if (view != null) {
            view.setVisibility(0);
        }
        C04220Ms.A0E(str);
        throw null;
        E2V e2v = r12.A0C;
        if (e2v == null) {
            str = "actionBarService";
        } else {
            E2V.A0G(e2v);
            AnonymousClass3I1 r6 = new AnonymousClass3I1();
            r6.A01(new AnonymousClass1l8());
            r6.A01(new AnonymousClass488());
            AnonymousClass3G3 r2 = r12.A0E;
            AnonymousClass3TH r1 = r2.A01;
            if (r1 != null) {
                r6.A01(new AnonymousClass1lH(r1));
            }
            for (C61723Vc r5 : r2.A03) {
                if (r5.A05 != null && !r5.A04) {
                    r6.A01(new AnonymousClass48N(r5, set.contains(r5), A1a));
                    Integer num = r5.A03;
                    if (num != null && num.intValue() > 0) {
                        if (r12.A0F.contains(r5)) {
                            r6.A01(new AnonymousClass48M(r5, 0));
                        } else {
                            List list = ((AnonymousClass3G3) r5.A0A.getValue()).A03;
                            ArrayList A0v = AnonymousClass0wJ.A0v();
                            for (Object next : list) {
                                C18240wQ.A1N(next, A0v, ((C61723Vc) next).A04 ? 1 : 0);
                            }
                            List<C61723Vc> A0W = AnonymousClass00J.A0W(A0v, new IDxComparatorShape94S0000000_1_I2(9));
                            ArrayList A0w = AnonymousClass0wJ.A0w(A0W);
                            for (C61723Vc r22 : A0W) {
                                A0w.add(new AnonymousClass48N(r22, set.contains(r22), A1a));
                            }
                            r6.A01(new AnonymousClass48M(r5, A0w.size()));
                            r6.A02(A0w);
                        }
                    }
                }
            }
            C150388wA r0 = r12.A03;
            if (r0 == null) {
                str = "recyclerViewAdapter";
            } else {
                r0.A04(r6);
                View view2 = r12.A0B;
                if (view2 == null) {
                    str = "splashScreen";
                } else {
                    view2.setVisibility(8);
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A01(AnonymousClass1dM r14, C61723Vc r15) {
        FBCommentImpl.Feedback A002;
        String A0m;
        FBCommentImpl fBCommentImpl = r15.A05;
        if (fBCommentImpl != null && (A002 = fBCommentImpl.A00()) != null && (A0m = C18220wO.A0m(A002)) != null) {
            boolean A022 = r15.A02();
            Boolean A0X = C18240wQ.A0X(A022);
            r15.A01 = A0X;
            r14.A0A = true;
            AnonymousClass36T r0 = r14.A06;
            if (r0 == null) {
                C04220Ms.A0E("feedbackApi");
                throw null;
            }
            IDxFCallbackShape12S0210000_1_I2 iDxFCallbackShape12S0210000_1_I2 = new IDxFCallbackShape12S0210000_1_I2(r14, r15, 1, A022);
            C31580Grx grx = r0.A00;
            C67463zb A003 = C67463zb.A00();
            C67463zb A004 = C67463zb.A00();
            GQLCallInputCInputShape0S0000000 A012 = GraphQlCallInput.A01(A003, A0m);
            GraphQlCallInput.A05(A012, A0X, "hidden");
            A003.A02(A012, "params");
            AnonymousClass7Ko.A0B(true);
            grx.AMA(new PandoGraphQLRequest(C63233h2.A04(true), "CXPCommentHideMutation", GraphQlCallInput.A03(A003), GraphQlCallInput.A03(A004), CXPCommentHideMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_dispatch_comment_hide"), iDxFCallbackShape12S0210000_1_I2);
        }
    }

    public static final void A02(AnonymousClass1dM r9, C61723Vc r10, boolean z) {
        FBCommentImpl.Feedback A002;
        String A0m;
        TopLevelCommentsImpl.PageInfo pageInfo;
        AnonymousClass36T r5 = r9.A06;
        String str = null;
        if (r5 == null) {
            C04220Ms.A0E("feedbackApi");
            throw null;
        }
        FBCommentImpl fBCommentImpl = r10.A05;
        if (fBCommentImpl != null && (A002 = fBCommentImpl.A00()) != null && (A0m = C18220wO.A0m(A002)) != null) {
            if (!z && (pageInfo = ((AnonymousClass3G3) r10.A0A.getValue()).A00) != null && pageInfo.getBooleanValue("has_next_page")) {
                str = pageInfo.getStringValue("end_cursor");
            }
            IDxFCallbackShape12S0210000_1_I2 iDxFCallbackShape12S0210000_1_I2 = new IDxFCallbackShape12S0210000_1_I2(r9, r10, 0, z);
            C31580Grx grx = r5.A00;
            C67463zb A003 = C67463zb.A00();
            C67463zb A004 = C67463zb.A00();
            A003.A05("content_id", A0m);
            A003.A05("content_source", "FB");
            boolean z2 = true;
            ImmutableList of = ImmutableList.of("FB");
            A003.A06("content_destinations", of);
            if (of == null) {
                z2 = false;
            }
            A003.A03("fetch_post_info", false);
            A003.A04("page_size", 3);
            A003.A05("after_cursor", str);
            grx.AMA(C18230wP.A0N(C67483zd.A00(A003, A004, z2, true)), iDxFCallbackShape12S0210000_1_I2);
        }
    }

    public static final void A04(AnonymousClass1dM r8, String str, boolean z) {
        String A33;
        AnonymousClass36T r2 = r8.A06;
        if (r2 == null) {
            C04220Ms.A0E("feedbackApi");
            throw null;
        }
        BKU bku = r8.A05;
        if (bku != null && (A33 = bku.A33()) != null) {
            C679441h r4 = new C679441h(r8, z);
            C31580Grx grx = r2.A00;
            C67463zb A002 = C67463zb.A00();
            C67463zb A003 = C67463zb.A00();
            A002.A05("content_id", A33);
            A002.A05("content_source", "IG");
            boolean z2 = true;
            ImmutableList of = ImmutableList.of("FB");
            A002.A06("content_destinations", of);
            if (of == null) {
                z2 = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            A002.A03("fetch_post_info", valueOf);
            boolean A1W = AnonymousClass0wJ.A1W(valueOf);
            A002.A04("page_size", 20);
            A002.A05("after_cursor", str);
            grx.AMA(C18230wP.A0N(C67483zd.A00(A002, A003, z2, A1W)), r4);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0I);
    }

    public final boolean isScrolledToTop() {
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = this.A04;
        if (refreshableRecyclerViewLayout != null) {
            return !refreshableRecyclerViewLayout.A0P.canScrollVertically(-1);
        }
        C04220Ms.A0E("refreshableRecyclerViewLayout");
        throw null;
    }

    public static final void A03(AnonymousClass1dM r10, String str, AnonymousClass0ZU r12, boolean z) {
        String str2;
        int A0A2 = (int) C18200wM.A0A();
        AnonymousClass36T r2 = r10.A06;
        if (r2 == null) {
            C04220Ms.A0E("feedbackApi");
            throw null;
        }
        IDxFCallbackShape113S0200000_1_I2 iDxFCallbackShape113S0200000_1_I2 = new IDxFCallbackShape113S0200000_1_I2(7, r10, r12);
        C31580Grx grx = r2.A00;
        C67463zb A002 = C67463zb.A00();
        C67463zb A003 = C67463zb.A00();
        GQLCallInputCInputShape0S0000000 A012 = GraphQlCallInput.A01(A002, str);
        if (z) {
            str2 = "LIKE";
        } else {
            str2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
        GraphQlCallInput.A05(A012, str2, "reaction");
        GraphQlCallInput.A05(A012, Integer.valueOf(A0A2), "action_timestamp");
        A002.A02(A012, "params");
        AnonymousClass7Ko.A0B(true);
        grx.AMA(new PandoGraphQLRequest(C63233h2.A04(true), "CXPCommentReactMutation", GraphQlCallInput.A03(A002), GraphQlCallInput.A03(A003), CXPCommentReactMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_dispatch_comment_react"), iDxFCallbackShape113S0200000_1_I2);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = C14030oh.A02(-1961033973);
        super.onCreate(bundle);
        C18180wK.A15(this);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            i = -42769608;
        } else {
            String string = bundle2.getString("CommentThreadFragment.MEDIA_ID");
            C04530Oa r7 = this.A0I;
            this.A02 = C18230wP.A0U(this, AnonymousClass0wJ.A0U(r7));
            BKU A052 = C19462Awj.A01(AnonymousClass0wJ.A0X(r7)).A05(string);
            this.A05 = A052;
            if (A052 == null) {
                C10450iM.A03("UPF", "media is null during FbCommentThreadBottomSheetFragment.onCreate");
            }
            C18489AgL A0Y = C18220wO.A0Y(this);
            AnonymousClass3IU r8 = this.A0L;
            A0Y.A01(new C24811kf(r8));
            A0Y.A01(new AnonymousClass1kS());
            A0Y.A01(new C24931kr(this, r8));
            UserSession A0X = AnonymousClass0wJ.A0X(r7);
            Context requireContext = requireContext();
            C30938GbW gbW = this.A0K;
            C13330nS r2 = this.A02;
            if (r2 == null) {
                C18240wQ.A0p();
                throw null;
            }
            A0Y.A01(new AnonymousClass1l3(this, A0X, r8, new AnonymousClass39C(requireContext, r2, gbW, this.A05)));
            this.A03 = C18220wO.A0Z(A0Y, new C24821kg(r8));
            this.A06 = new AnonymousClass36T(AnonymousClass0wJ.A0X(r7));
            C10300i6 A0U = AnonymousClass0wJ.A0U(r7);
            C04220Ms.A0B(A0U, 0);
            this.A07 = (C684743y) A0U.A01(C684743y.class, new KtLambdaShape132S0100000_I2_112(A0U, 36));
            i = 2137599911;
        }
        C14030oh.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1137843841);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_fb_comment_thread_rv, viewGroup, false);
        C14030oh.A09(-1083146052, A022);
        return inflate;
    }
}
