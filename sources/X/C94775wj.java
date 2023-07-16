package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObjectShape283S0100000_2_I2;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;
import kotlin.jvm.internal.KtLambdaShape29S0100000_I2_9;

/* renamed from: X.5wj  reason: invalid class name and case insensitive filesystem */
public final class C94775wj extends C34640IcN {
    public static final String __redex_internal_original_name = "ArtistSelfServeLinkingSearchFragment";
    public final C04530Oa A00 = AnonymousClass3W9.A00(this);
    public final C04530Oa A01;

    public final String getModuleName() {
        return "artist_self_serve_search";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((TextView) AnonymousClass0wJ.A0J(view, R.id.artist_self_serve_linking_value_props_search_edit_text)).addTextChangedListener(new IDxObjectShape283S0100000_2_I2(this, 3));
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.artist_self_serve_linking_search_recycler_view);
        C105436dQ r2 = new C105436dQ(this);
        C18489AgL A002 = C150388wA.A00(requireContext());
        A002.A01(new AnonymousClass60G(r2));
        C150388wA A003 = A002.A00();
        getContext();
        C18190wL.A1D(recyclerView);
        recyclerView.setAdapter(A003);
        C04530Oa r6 = this.A01;
        C18180wK.A18(this, new KtSLambdaShape5S0200000_I2(this, (C146958n9) null, 44), ((AnonymousClass580) r6.getValue()).A05);
        C18180wK.A18(this, new KtSLambdaShape5S0200000_I2((Object) A003, (C146958n9) null, 45, 42), ((AnonymousClass580) r6.getValue()).A08);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.artist_self_serve_linking_search_loading_spinner);
        C86104wH.A1C(A0K, 88, this);
        C18180wK.A18(this, new KtSLambdaShape5S0200000_I2((Object) A0K, (C146958n9) null, 46, 42), ((AnonymousClass580) r6.getValue()).A07);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public C94775wj() {
        KtLambdaShape29S0100000_I2_9 ktLambdaShape29S0100000_I2_9 = new KtLambdaShape29S0100000_I2_9(this, 30);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape29S0100000_I2_9(new KtLambdaShape29S0100000_I2_9(this, 27), 28));
        this.A01 = C18220wO.A0M(new KtLambdaShape29S0100000_I2_9(A012, 29), ktLambdaShape29S0100000_I2_9, new KtLambdaShape18S0200000_I2_2(13, (Object) null, A012), C18210wN.A0l(AnonymousClass580.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1196651186);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.artist_self_serve_linking_search_fragment, viewGroup, false);
        C14030oh.A09(727512444, A02);
        return inflate;
    }
}
