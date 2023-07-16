package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxCListenerShape2S0110000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S2101000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2;
import kotlin.jvm.internal.KtLambdaShape67S0100000_I2_47;

/* renamed from: X.1aM  reason: invalid class name */
public final class AnonymousClass1aM extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "InviteeResponseListFragment";
    public C150388wA A00;
    public List A01;
    public final C83574rd A02;
    public final C04530Oa A03 = C80644m9.A00(this);
    public final C04530Oa A04;

    public static final void A00(View view, IgTextView igTextView, IgTextView igTextView2, IgImageView igImageView, AnonymousClass1aM r5, AnonymousClass253 r6, String str, String str2, List list) {
        view.setVisibility(0);
        AnonymousClass0wJ.A18(view, 93, r5, r6);
        if (igTextView != null) {
            igTextView.setText(str);
        }
        if (igTextView2 != null) {
            igTextView2.setText(str2);
        }
        if (igImageView != null) {
            igImageView.setImageDrawable(C25578DoE.A02(r5.requireContext(), "invitee_response_list_fragment", list));
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        C04220Ms.A0B(r5, 0);
        boolean z = requireArguments().getBoolean("is_private");
        r5.setTitle(requireContext().getString(2131834896));
        r5.CtU(C18190wL.A0H(this, HttpStatus.SC_LENGTH_REQUIRED), true);
        C25764Drc A0K = C18240wQ.A0K();
        Context requireContext = requireContext();
        int i = 2131835623;
        if (z) {
            i = 2131829223;
        }
        A0K.A0F = requireContext.getString(i);
        A0K.A0C = new IDxCListenerShape2S0110000_1_I2(4, this, z);
        A0K.A07 = 17;
        r5.A7Q(new C25435DlZ(A0K));
    }

    public final String getModuleName() {
        return "invitee_response_list_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.invitee_page_type);
        View A0K2 = AnonymousClass0wJ.A0K(view, R.id.search_progressbar);
        C18210wN.A10(AnonymousClass0wJ.A0K(AnonymousClass0wJ.A0K(view, R.id.invitee_search_bar), R.id.action_bar_search_edit_text), 2, this);
        AnonymousClass061 r4 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S0601000_I2(view, r4, this, A0K2, A0K, viewLifecycleOwner, (C146958n9) null, 15), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public static final void A01(AnonymousClass1aM r4) {
        AnonymousClass3I1 r3 = new AnonymousClass3I1();
        List list = r4.A01;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r3.A01(new AnonymousClass48D(C18220wO.A0c(it)));
            }
        }
        C150388wA r0 = r4.A00;
        if (r0 == null) {
            C04220Ms.A0E("adapter");
            throw null;
        } else {
            r0.A04(r3);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public AnonymousClass1aM() {
        KtLambdaShape67S0100000_I2_47 ktLambdaShape67S0100000_I2_47 = new KtLambdaShape67S0100000_I2_47(this, 48);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape67S0100000_I2_47(new KtLambdaShape67S0100000_I2_47(this, 45), 46));
        this.A04 = C18220wO.A0M(new KtLambdaShape67S0100000_I2_47(A012, 47), ktLambdaShape67S0100000_I2_47, C18250wR.A0d(A012, (Object) null, 34), C18210wN.A0l(AnonymousClass10H.class));
        this.A01 = AnonymousClass0wJ.A0v();
        this.A02 = new C70044Bz(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(973334212);
        super.onCreate(bundle);
        C62793ak A0N = C18200wM.A0N(this.A04);
        String string = requireArguments().getString("event_id");
        Serializable serializable = requireArguments().getSerializable("response_page_type");
        C04220Ms.A0C(serializable, "null cannot be cast to non-null type com.instagram.events.viewmodel.EventRSVPType");
        String A002 = AnonymousClass2O3.A00((AnonymousClass253) serializable);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S2101000_I2((Object) A0N, string, A002, (C146958n9) null, 7), AnonymousClass3J5.A00(A0N), 3);
        C14030oh.A09(-923448606, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-161825065);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.invitee_reponse_list, viewGroup, false);
        C14030oh.A09(-2037509314, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1993875464);
        super.onDestroyView();
        C14030oh.A09(455983438, A022);
    }
}
