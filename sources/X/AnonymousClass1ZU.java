package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2;
import kotlin.jvm.internal.IDxRImplShape188S0000000_1_I2;
import kotlin.jvm.internal.KtLambdaShape32S0200000_I2_16;
import kotlin.jvm.internal.KtLambdaShape91S0100000_I2_71;

/* renamed from: X.1ZU  reason: invalid class name */
public final class AnonymousClass1ZU extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "PublisherControlBlockedCategoriesFragment";
    public final C04530Oa A00;
    public final C04530Oa A01 = C80644m9.A00(this);
    public final C04530Oa A02;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        r3.Cqb(2131828584);
        r3.CtU(C18210wN.A0H(this, 42), true);
    }

    public final String getModuleName() {
        return "publisher_control_blocked_categories";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        IDxRImplShape188S0000000_1_I2 iDxRImplShape188S0000000_1_I2;
        String A0k;
        SpannableStringBuilder A0E;
        int A04;
        int i;
        String quantityString;
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view2, R.id.blocked_category_disclaimer_text);
        C04530Oa r5 = this.A02;
        IGRevShareProductType iGRevShareProductType = ((AnonymousClass10M) r5.getValue()).A02;
        IGRevShareProductType iGRevShareProductType2 = IGRevShareProductType.PROFILE_ADS;
        Object value = r5.getValue();
        if (iGRevShareProductType == iGRevShareProductType2) {
            iDxRImplShape188S0000000_1_I2 = new IDxRImplShape188S0000000_1_I2(value, 12);
            A0k = AnonymousClass0wJ.A0k(requireContext(), 2131828588);
            int i2 = ((AnonymousClass10M) r5.getValue()).A01;
            if (i2 == -1) {
                quantityString = AnonymousClass0wJ.A0l(requireContext(), A0k, 2131828593);
            } else {
                quantityString = AnonymousClass0wJ.A0B(this).getQuantityString(R.plurals.ig_profile_publisher_control_non_revshare_blocked_categories_screen_description_text, i2, C18210wN.A1Y(A0k, i2));
            }
            A0E = C18200wM.A0E(quantityString);
            A04 = C18220wO.A04(this);
            i = 46;
        } else {
            iDxRImplShape188S0000000_1_I2 = new IDxRImplShape188S0000000_1_I2(value, 13);
            int i3 = ((AnonymousClass10M) r5.getValue()).A01;
            A0k = AnonymousClass0wJ.A0k(requireContext(), 2131828588);
            A0E = C18200wM.A0E(AnonymousClass0wJ.A0B(this).getQuantityString(R.plurals.ig_overlay_ads_publisher_control_revshare_blocked_categories_screen_description_text, i3, C18210wN.A1Y(A0k, i3)));
            A04 = C18220wO.A04(this);
            i = 45;
        }
        C18730xl.A01(A0E, iDxRImplShape188S0000000_1_I2, A0k, A04, i);
        textView.setText(A0E);
        C18180wK.A0z(textView);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0K(view2, R.id.recycler_view);
        requireContext();
        C18190wL.A1D(recyclerView);
        AnonymousClass110 r11 = new AnonymousClass110(new IDxRImplShape188S0000000_1_I2(r5.getValue(), 14));
        recyclerView.setAdapter(r11);
        AnonymousClass061 r9 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S0601000_I2(view2, r9, this, r11, recyclerView, viewLifecycleOwner, (C146958n9) null, 20), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public AnonymousClass1ZU() {
        KtLambdaShape91S0100000_I2_71 ktLambdaShape91S0100000_I2_71 = new KtLambdaShape91S0100000_I2_71(this, 43);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape91S0100000_I2_71(new KtLambdaShape91S0100000_I2_71(this, 40), 41));
        this.A02 = C18220wO.A0M(new KtLambdaShape91S0100000_I2_71(A012, 42), ktLambdaShape91S0100000_I2_71, new KtLambdaShape32S0200000_I2_16(3, (Object) null, A012), C18210wN.A0l(AnonymousClass10M.class));
        this.A00 = C62373Zc.A03(new KtLambdaShape91S0100000_I2_71(this, 39));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(60368995);
        super.onCreate(bundle);
        C25683Dq7 dq7 = ((AnonymousClass9K7) this.A00.getValue()).A01;
        C04220Ms.A05(dq7);
        C25683Dq7.A00(dq7);
        C14030oh.A09(1412940939, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1927008881);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.creator_blocked_category, false);
        C14030oh.A09(1061087750, A022);
        return A0D;
    }
}
