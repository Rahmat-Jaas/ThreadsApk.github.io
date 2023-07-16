package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;

/* renamed from: X.1cY  reason: invalid class name */
public final class AnonymousClass1cY extends C34640IcN implements C82424pb, C81404nj {
    public static final String __redex_internal_original_name = "PanavisionCCPNuxBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public PrimerBottomSheetConfig A03;
    public CharSequence A04;
    public final C04530Oa A05 = C80644m9.A00(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public final boolean onBackPressed() {
        return isVisible();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(768359051);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.primer_bottom_sheet, viewGroup, false);
        C14030oh.A09(-155579344, A022);
        return inflate;
    }

    public final void onResume() {
        int i;
        int i2;
        int A022 = C14030oh.A02(1383165557);
        super.onResume();
        View view = this.mView;
        if (view != null) {
            C04530Oa r10 = this.A05;
            boolean A1X = C18190wL.A1X(AnonymousClass3Zu.A03(AnonymousClass0wJ.A0X(r10)).A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED");
            boolean A08 = AnonymousClass3Zu.A03(AnonymousClass0wJ.A0X(r10)).A08();
            C695949f A002 = C49252r5.A00(AnonymousClass0wJ.A0X(r10));
            InfoItem infoItem = null;
            if (!A1X || !AnonymousClass0wJ.A1X(A002.A07.getValue())) {
                if (A08) {
                    i = 2131823615;
                } else if (C67343zO.A07(AnonymousClass0wJ.A0X(r10))) {
                    UserSession A0X = AnonymousClass0wJ.A0X(r10);
                    C04220Ms.A0B(A0X, 0);
                    if (C62183Xq.A00(A0X) && !AnonymousClass3Zu.A03(A0X).A08()) {
                        i = 2131823621;
                    }
                }
                infoItem = new InfoItem(C18230wP.A0b(), C18230wP.A0e(), C18180wK.A0g(this, i), (String) null);
            } else {
                KtCSuperShape0S4110000_I2 A003 = C59583Lj.A00(AnonymousClass0wJ.A0X(r10), A002);
                if (A003 != null) {
                    int ordinal = ((AnonymousClass24X) A003.A00).ordinal();
                    if (ordinal == 1) {
                        i2 = 2131823620;
                    } else if (ordinal == 2) {
                        infoItem = new InfoItem(C18230wP.A0b(), C18230wP.A0e(), C18180wK.A0g(this, 2131823618), (String) null);
                    } else if (ordinal == 3) {
                        i2 = 2131823617;
                    } else if (ordinal == 5) {
                        i2 = 2131823619;
                    }
                    infoItem = new InfoItem(C18230wP.A0b(), C18230wP.A0e(), C18180wK.A0g(this, i2), (String) null);
                }
            }
            TitleIcon titleIcon = new TitleIcon(new ColorTint(0, R.color.igds_creation_tools_red, R.color.igds_creation_tools_purple), R.drawable.instagram_reels_outline_96);
            String A0g = C18180wK.A0g(this, 2131823601);
            IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
            Integer A0e = C18230wP.A0e();
            PrimerBottomSheetConfig primerBottomSheetConfig = new PrimerBottomSheetConfig(titleIcon, __redex_internal_original_name, C18180wK.A0g(this, 2131831976), C18180wK.A0g(this, 2131827999), AnonymousClass8AP.A0A(new InfoItem[]{new InfoItem(simpleIconConfig, A0e, A0g, (String) null), C18190wL.A0Y(A0e, C18180wK.A0g(this, 2131823602), R.drawable.instagram_user_circle_pano_outline_24), C18190wL.A0Y(A0e, C18180wK.A0g(this, 2131823616), R.drawable.instagram_remix_pano_outline_24), infoItem}), 2131823624, false, false, false);
            this.A03 = primerBottomSheetConfig;
            IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0J(view, R.id.headline);
            Context requireContext = requireContext();
            TitleIcon titleIcon2 = primerBottomSheetConfig.A01;
            Drawable drawable = requireContext.getDrawable(titleIcon2.A00);
            if (drawable != null) {
                ColorTint colorTint = titleIcon2.A01;
                if (colorTint != null && colorTint.A02 == 0) {
                    drawable = C19587Ayn.A05(requireContext, drawable, requireContext.getColor(colorTint.A01), requireContext.getColor(colorTint.A00));
                }
                igdsHeadline.setImageDrawable(drawable);
                igdsHeadline.setHeadline(2131823624);
                ((RecyclerView) view.requireViewById(R.id.info_list)).setAdapter(new AnonymousClass119(primerBottomSheetConfig.A05));
                TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.primary_action);
                textView.setText(primerBottomSheetConfig.A03);
                textView.setOnClickListener(this.A01);
                IgdsButton igdsButton = (IgdsButton) AnonymousClass0wJ.A0J(view, R.id.secondary_action_v2);
                String str = primerBottomSheetConfig.A04;
                igdsButton.setText(str);
                igdsButton.setOnClickListener(this.A02);
                TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view, R.id.secondary_action_v1);
                textView2.setText(str);
                textView2.setOnClickListener(this.A02);
                textView2.setVisibility(0);
                igdsButton.setVisibility(8);
                TextView textView3 = (TextView) AnonymousClass0wJ.A0J(view, R.id.footer_text);
                textView3.setVisibility(8);
                if (this.A04 != null) {
                    textView3.setVisibility(0);
                    textView3.setMovementMethod(C28241F2t.A00);
                    textView3.setClickable(AnonymousClass0wJ.A1W(this.A00));
                    textView3.setOnClickListener(this.A00);
                    textView3.setLongClickable(false);
                    textView3.setText(this.A04);
                }
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        C14030oh.A09(1795259151, A022);
    }
}
