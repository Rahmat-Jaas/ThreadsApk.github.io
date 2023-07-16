package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0110000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;
import kotlin.jvm.internal.KtLambdaShape29S0100000_I2_9;

/* renamed from: X.1Zy  reason: invalid class name and case insensitive filesystem */
public final class C22811Zy extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "ArtistSelfServeLinkingValuePropsFragment";
    public final C04530Oa A00;
    public final C04530Oa A01;
    public final C04530Oa A02;
    public final C04530Oa A03;
    public final C04530Oa A04;
    public final C04530Oa A05;
    public final C04530Oa A06;
    public final C04530Oa A07;
    public final C04530Oa A08;
    public final C04530Oa A09;
    public final C04530Oa A0A = C80644m9.A00(this);
    public final C04530Oa A0B;

    public final String getModuleName() {
        return "artist_self_serve_value_props";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0wJ.A16((View) this.A07.getValue(), 34, this);
        C04530Oa r4 = this.A0B;
        C18180wK.A18(this, new KtSLambdaShape5S0200000_I2(this, (C146958n9) null, 48), ((AnonymousClass10A) r4.getValue()).A04);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.artist_self_serve_linking_value_props_loading_spinner);
        AnonymousClass0wJ.A16(A0K, 36, this);
        C18180wK.A18(this, new KtSLambdaShape5S0200000_I2(this, (C146958n9) null, 49), ((AnonymousClass10A) r4.getValue()).A08);
        C18180wK.A18(this, new KtSLambdaShape6S0200000_I2_1((Object) A0K, (C146958n9) null, 0, 42), ((AnonymousClass10A) r4.getValue()).A0B);
        C18180wK.A18(this, new KtSLambdaShape2S0110000_I2(this, (C146958n9) null, 2), ((AnonymousClass10A) r4.getValue()).A0A);
        C18180wK.A18(this, new KtSLambdaShape2S0110000_I2(this, (C146958n9) null, 3), ((AnonymousClass10A) r4.getValue()).A09);
    }

    public static C04530Oa A00(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape29S0100000_I2_9(obj, i));
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            r3.Cqb(2131821542);
            C25764Drc A0K = C18240wQ.A0K();
            A0K.A00 = R.drawable.instagram_arrow_left_pano_outline_24;
            AnonymousClass4u2.A04(A0K, r3, this, 33);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0A);
    }

    public C22811Zy() {
        KtLambdaShape29S0100000_I2_9 ktLambdaShape29S0100000_I2_9 = new KtLambdaShape29S0100000_I2_9(this, 45);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape29S0100000_I2_9(new KtLambdaShape29S0100000_I2_9(this, 40), 41));
        this.A0B = C18220wO.A0M(new KtLambdaShape29S0100000_I2_9(A012, 42), ktLambdaShape29S0100000_I2_9, new KtLambdaShape18S0200000_I2_2(14, (Object) null, A012), C18210wN.A0l(AnonymousClass10A.class));
        this.A03 = A00(this, 35);
        this.A04 = A00(this, 36);
        this.A05 = A00(this, 37);
        this.A09 = A00(this, 44);
        this.A08 = A00(this, 43);
        this.A01 = A00(this, 33);
        this.A02 = A00(this, 34);
        this.A00 = A00(this, 32);
        this.A07 = A00(this, 39);
        this.A06 = A00(this, 38);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1930354328);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.artist_self_serve_linking_value_props_fragment, viewGroup, false);
        C14030oh.A09(-1953356668, A022);
        return inflate;
    }
}
