package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0700000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0110000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;
import kotlin.jvm.internal.KtLambdaShape29S0100000_I2_9;
import kotlin.jvm.internal.KtLambdaShape30S0100000_I2_10;

/* renamed from: X.1bO  reason: invalid class name */
public final class AnonymousClass1bO extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "ArtistSelfServeLinkingVerificationFragment";
    public final C04530Oa A00 = C80644m9.A00(this);
    public final C04530Oa A01;

    public final String getModuleName() {
        return "artist_self_serve_verification";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass0wJ.A0K(view, R.id.artist_self_serve_linking_verification_find_account_text_cell);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.artist_self_serve_linking_value_props_isrc_input);
        C04530Oa r2 = this.A01;
        textView.setText((CharSequence) ((AnonymousClass109) r2.getValue()).A08.getValue());
        C18230wP.A17(textView, this, 2);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.artist_self_serve_linking_verification_cta_button);
        AnonymousClass0wJ.A16(A0K, 39, this);
        C18180wK.A18(this, new KtSLambdaShape2S0110000_I2(A0K, (C146958n9) null, 4), ((AnonymousClass109) r2.getValue()).A04);
        C18180wK.A18(this, new KtSLambdaShape2S0110000_I2(A0K, (C146958n9) null, 5), ((AnonymousClass109) r2.getValue()).A07);
        igdsListCell.A0F(AnonymousClass24V.TYPE_CHEVRON, true);
        AnonymousClass0wJ.A16(igdsListCell, 40, this);
        C18180wK.A18(this, new KtSLambdaShape6S0200000_I2_1(this, (C146958n9) null, 2), ((AnonymousClass109) r2.getValue()).A05);
        View A0K2 = AnonymousClass0wJ.A0K(view, R.id.artist_self_serve_linking_verification_selected_artist);
        View A0K3 = AnonymousClass0wJ.A0K(A0K2, R.id.artists_search_list_item_image_view);
        View A0K4 = AnonymousClass0wJ.A0K(A0K2, R.id.artists_search_list_item_image_artist_name);
        View A0K5 = AnonymousClass0wJ.A0K(A0K2, R.id.artists_search_list_item_image_close_button);
        A0K5.setVisibility(0);
        C18180wK.A18(this, new KtSLambdaShape1S0700000_I2(A0K2, igdsListCell, this, A0K3, A0K4, A0K5, (C146958n9) null, 0), ((AnonymousClass109) r2.getValue()).A09);
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            r3.Cqb(2131821542);
            C25764Drc A0K = C18240wQ.A0K();
            A0K.A00 = R.drawable.instagram_arrow_left_pano_outline_24;
            AnonymousClass4u2.A04(A0K, r3, this, 38);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final boolean onBackPressed() {
        C62793ak A0N = C18200wM.A0N(this.A01);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0101000_I2_1(A0N, (C146958n9) null, 25), AnonymousClass3J5.A00(A0N), 3);
        return true;
    }

    public AnonymousClass1bO() {
        KtLambdaShape30S0100000_I2_10 ktLambdaShape30S0100000_I2_10 = new KtLambdaShape30S0100000_I2_10(this, 1);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape29S0100000_I2_9(new KtLambdaShape29S0100000_I2_9(this, 48), 49));
        this.A01 = C18220wO.A0M(new KtLambdaShape30S0100000_I2_10(A012, 0), ktLambdaShape30S0100000_I2_10, new KtLambdaShape18S0200000_I2_2(15, (Object) null, A012), C18210wN.A0l(AnonymousClass109.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1847590307);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.artist_self_serve_linking_verification_fragment, viewGroup, false);
        C14030oh.A09(1265870823, A02);
        return inflate;
    }
}
