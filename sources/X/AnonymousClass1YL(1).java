package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxCListenerShape14S1100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.events.ui.EventStickerBottomSheetFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.textcell.IgdsImageCell;
import com.instagram.igds.components.textcell.IgdsListCell;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S1101000_I2_1;
import kotlin.jvm.internal.KtLambdaShape67S0100000_I2_47;

/* renamed from: X.1YL  reason: invalid class name */
public final class AnonymousClass1YL extends C34640IcN {
    public static final String __redex_internal_original_name = "EventStickerBottomSheetFragment";
    public String A00;
    public final C04530Oa A01 = C80644m9.A00(this);
    public final C04530Oa A02 = C18220wO.A0M(new KtLambdaShape67S0100000_I2_47(this, 39), new KtLambdaShape67S0100000_I2_47(this, 40), C18250wR.A0d(this, (Object) null, 31), C18210wN.A0l(C19340zi.class));

    public final String getModuleName() {
        return "event_sticker_bottom_sheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        View A0J = AnonymousClass0wJ.A0J(view2, R.id.content_container);
        View A0J2 = AnonymousClass0wJ.A0J(view2, R.id.loading_spinner);
        IgdsImageCell igdsImageCell = (IgdsImageCell) AnonymousClass0wJ.A0J(view2, R.id.event_title);
        View A0K = AnonymousClass0wJ.A0K(view2, R.id.hosts_social_context);
        IgTextView igTextView = (IgTextView) AnonymousClass0wJ.A0J(A0K, R.id.social_context_text);
        IgImageView igImageView = (IgImageView) AnonymousClass0wJ.A0K(A0K, R.id.social_context_facepile);
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass0wJ.A0K(view2, R.id.event_time);
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass0wJ.A0K(view2, R.id.event_location);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass0wJ.A0J(view2, R.id.invitees_social_context);
        IgTextView igTextView2 = (IgTextView) AnonymousClass0wJ.A0K(viewGroup, R.id.social_context_text);
        IgImageView igImageView2 = (IgImageView) AnonymousClass0wJ.A0K(viewGroup, R.id.social_context_facepile);
        IgImageView igImageView3 = (IgImageView) AnonymousClass0wJ.A0K(viewGroup, R.id.social_context_badge_chevron);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(view2, R.id.bottom_button);
        String str = this.A00;
        if (str != null) {
            igdsImageCell.setOnClickListener(new IDxCListenerShape14S1100000_1_I2(str, (Object) this, 7));
        }
        AnonymousClass0wJ.A16(igdsBottomButtonLayout, HttpStatus.SC_CONFLICT, this);
        AnonymousClass061 r16 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        IgImageView igImageView4 = igImageView3;
        IgImageView igImageView5 = igImageView;
        IgImageView igImageView6 = igImageView2;
        IgTextView igTextView3 = igTextView;
        IgTextView igTextView4 = igTextView2;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new EventStickerBottomSheetFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1(A0J, A0J2, viewGroup, r16, viewLifecycleOwner, igTextView3, igTextView4, igImageView5, igImageView6, igImageView4, this, igdsBottomButtonLayout, igdsImageCell, igdsListCell, igdsListCell2, (C146958n9) null), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1777982402);
        super.onCreate(bundle);
        this.A00 = C18220wO.A0j(this);
        C62793ak A0N = C18200wM.A0N(this.A02);
        String str = this.A00;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S1101000_I2_1(A0N, str, (C146958n9) null, 5), AnonymousClass3J5.A00(A0N), 3);
        C14030oh.A09(-817089136, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-528399275);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.event_sticker_bottom_sheet_fragment, viewGroup, false);
        C14030oh.A09(-2026267246, A022);
        return inflate;
    }
}
