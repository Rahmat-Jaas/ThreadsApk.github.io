package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFCallbackShape313S0100000_1_I2;
import com.facebook.redex.IDxLDelegateShape338S0100000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.unifiedfeedback.api.graphql.CXPFetchReactorsQueryResponseImpl;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112;

/* renamed from: X.1dK  reason: invalid class name */
public final class AnonymousClass1dK extends C34640IcN implements C21735BzM {
    public static final String __redex_internal_original_name = "FbReactionsFragment";
    public View A00;
    public C150388wA A01;
    public BKU A02;
    public CXPFetchReactorsQueryResponseImpl.XcxpFetchFeedback.InlineXFBFeedback.Reactors.PageInfo A03;
    public C684743y A04;
    public boolean A05;
    public RecyclerView A06;
    public C13330nS A07;
    public AnonymousClass36T A08;
    public String A09;
    public final List A0A = AnonymousClass0wJ.A0v();
    public final C04530Oa A0B = C80644m9.A00(this);
    public final AnonymousClass36U A0C = new AnonymousClass36U(this);

    public final String getModuleName() {
        return "fb_comments_reactions_sheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View inflate = ((ViewStub) AnonymousClass0wJ.A0J(view, R.id.reactions_list_container_title_bar)).inflate();
        C04220Ms.A06(inflate);
        C18200wM.A15(requireContext(), (TextView) AnonymousClass0wJ.A0J(inflate, R.id.fb_comment_thread_title), 2131827197);
        View A0K = AnonymousClass0wJ.A0K(inflate, R.id.fb_comment_thread_back_button);
        A0K.setVisibility(0);
        AnonymousClass0wJ.A0K(inflate, R.id.fb_comment_thread_more_button).setVisibility(8);
        AnonymousClass0wJ.A17(A0K, 337, this);
        View A0K2 = AnonymousClass0wJ.A0K(view, R.id.fb_reactions_list_splash);
        this.A00 = A0K2;
        A0K2.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.fb_reaction_list_rv);
        this.A06 = recyclerView;
        if (recyclerView == null) {
            str = "recyclerView";
        } else {
            requireContext();
            LinearLayoutManagerCompat linearLayoutManagerCompat = new LinearLayoutManagerCompat();
            recyclerView.setLayoutManager(linearLayoutManagerCompat);
            C150388wA r0 = this.A01;
            if (r0 == null) {
                str = "recyclerViewAdapter";
            } else {
                recyclerView.setAdapter(r0);
                M0E m0e = recyclerView.A0G;
                C04220Ms.A0C(m0e, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
                ((I7p) m0e).A00 = false;
                recyclerView.A11(new C150728wn(linearLayoutManagerCompat, new IDxLDelegateShape338S0100000_1_I2(this, 4), C19064Aq3.A0C));
                A00(this, (String) null);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A00(AnonymousClass1dK r14, String str) {
        String str2;
        if (!r14.A05) {
            r14.A05 = true;
            AnonymousClass36T r3 = r14.A08;
            if (r3 == null) {
                str2 = "feedbackApi";
            } else {
                String str3 = r14.A09;
                if (str3 == null) {
                    str2 = "feedbackId";
                } else {
                    IDxFCallbackShape313S0100000_1_I2 iDxFCallbackShape313S0100000_1_I2 = new IDxFCallbackShape313S0100000_1_I2(r14, 14);
                    C31580Grx grx = r3.A00;
                    C67463zb A002 = C67463zb.A00();
                    C67463zb A003 = C67463zb.A00();
                    A002.A05("content_id", str3);
                    A002.A05("content_source", "FB");
                    boolean z = true;
                    ImmutableList of = ImmutableList.of("FB");
                    A002.A06("content_destinations", of);
                    if (of == null) {
                        z = false;
                    }
                    A002.A04("page_size", 20);
                    A002.A05("after_cursor", str);
                    AnonymousClass7Ko.A0B(true);
                    AnonymousClass7Ko.A0B(true);
                    grx.AMA(new PandoGraphQLRequest(C63233h2.A04(z), "CXPFetchReactorsQuery", GraphQlCallInput.A03(A002), GraphQlCallInput.A03(A003), CXPFetchReactorsQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_fetch_feedback"), iDxFCallbackShape313S0100000_1_I2);
                    return;
                }
            }
            C04220Ms.A0E(str2);
            throw null;
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0B);
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A06;
        if (recyclerView != null) {
            return !recyclerView.canScrollVertically(-1);
        }
        C04220Ms.A0E("recyclerView");
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(567305834);
        super.onCreate(bundle);
        String string = requireArguments().getString("FbReactionsFragment.ARG_FEEDBACK_ID");
        if (string != null) {
            this.A09 = string;
            String string2 = requireArguments().getString("FbReactionsFragment.ARG_MEDIA_ID");
            if (string2 != null) {
                C04530Oa r4 = this.A0B;
                BKU A052 = C19462Awj.A01(AnonymousClass0wJ.A0X(r4)).A05(string2);
                this.A02 = A052;
                if (A052 == null) {
                    C10450iM.A03("UPF", "media is null during FbReactionsFragment.onCreate");
                }
                this.A07 = C18230wP.A0U(this, AnonymousClass0wJ.A0U(r4));
                this.A08 = new AnonymousClass36T(AnonymousClass0wJ.A0X(r4));
                this.A01 = C18220wO.A0Z(C18220wO.A0Y(this), new C24941ks(this, this.A0C));
                C10300i6 A0U = AnonymousClass0wJ.A0U(r4);
                C04220Ms.A0B(A0U, 0);
                this.A04 = (C684743y) A0U.A01(C684743y.class, new KtLambdaShape132S0100000_I2_112(A0U, 36));
                C14030oh.A09(-1543297846, A022);
                return;
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 993514724;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 319381699;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-953814531);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_fb_reactions_list_rv, viewGroup, false);
        C14030oh.A09(-1714235050, A022);
        return inflate;
    }
}
