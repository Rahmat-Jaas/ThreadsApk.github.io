package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.ui.text.IDxCSpanShape183S0100000_1_I2;

/* renamed from: X.1YW  reason: invalid class name */
public final class AnonymousClass1YW extends C34640IcN {
    public static final String __redex_internal_original_name = "PromoteAdFormatPreferencesBottomSheetFragment";
    public LinearLayout A00;
    public C37741K2b A01;
    public PromoteData A02;
    public PromoteState A03;
    public C37383Jqm A04;
    public final C04530Oa A05 = C80644m9.A00(this);

    public final String getModuleName() {
        return "promote_ad_format_preferences_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        LinearLayout linearLayout;
        boolean z;
        LinearLayout linearLayout2;
        boolean z2;
        C04220Ms.A0B(view, 0);
        View inflate = ((ViewStub) AnonymousClass0wJ.A0I(view, R.id.main_cointainer_stub_ad_format_preferences)).inflate();
        ((TextView) AnonymousClass0wJ.A0J(inflate, R.id.ad_format_preferences_header_text)).setText(2131833566);
        LinearLayout linearLayout3 = (LinearLayout) inflate.requireViewById(R.id.ad_format_preferences_toggle_group);
        this.A00 = linearLayout3;
        if (linearLayout3 != null) {
            linearLayout3.removeAllViews();
        }
        PromoteData promoteData = this.A02;
        String str = "promoteData";
        if (promoteData != null) {
            if (promoteData.A2a && (linearLayout2 = this.A00) != null) {
                IgdsListCell igdsListCell = new IgdsListCell(requireContext(), (AttributeSet) null);
                igdsListCell.A0F(AnonymousClass24V.TYPE_SWITCH, true);
                igdsListCell.A0H(AnonymousClass0wJ.A0k(igdsListCell.getContext(), 2131833569));
                IDxCSpanShape183S0100000_1_I2 iDxCSpanShape183S0100000_1_I2 = new IDxCSpanShape183S0100000_1_I2(this, C18180wK.A00(this), 4);
                String A0k = AnonymousClass0wJ.A0k(requireContext(), 2131833563);
                String A0l = AnonymousClass0wJ.A0l(requireContext(), A0k, 2131833567);
                C04220Ms.A06(A0l);
                SpannableStringBuilder A0E = C18200wM.A0E(A0l);
                AnonymousClass3Zw.A01(A0E, iDxCSpanShape183S0100000_1_I2, A0k);
                igdsListCell.A0G(A0E);
                MovementMethod instance = LinkMovementMethod.getInstance();
                C04220Ms.A06(instance);
                igdsListCell.A0A(instance);
                if (this.A03 == null) {
                    C04220Ms.A0E("promoteState");
                    throw null;
                }
                PromoteData promoteData2 = this.A02;
                if (promoteData2 == null) {
                    C04220Ms.A0E(str);
                    throw null;
                }
                AnonymousClass22P r1 = promoteData2.A0r;
                if (r1 == null || !(r1 == AnonymousClass22P.OPT_IN || r1 == AnonymousClass22P.DEFAULT_OPT_IN)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                igdsListCell.setChecked(z2);
                C18230wP.A1N(igdsListCell, this, 9);
                linearLayout2.addView(igdsListCell);
            }
            PromoteData promoteData3 = this.A02;
            if (promoteData3 != null) {
                if (promoteData3.A2c && (linearLayout = this.A00) != null) {
                    IgdsListCell igdsListCell2 = new IgdsListCell(requireContext(), (AttributeSet) null);
                    igdsListCell2.A0F(AnonymousClass24V.TYPE_SWITCH, true);
                    igdsListCell2.A0H(AnonymousClass0wJ.A0k(igdsListCell2.getContext(), 2131833598));
                    IDxCSpanShape183S0100000_1_I2 iDxCSpanShape183S0100000_1_I22 = new IDxCSpanShape183S0100000_1_I2(this, C18180wK.A00(this), 5);
                    String A0k2 = AnonymousClass0wJ.A0k(requireContext(), 2131833565);
                    String A0l2 = AnonymousClass0wJ.A0l(requireContext(), A0k2, 2131833597);
                    C04220Ms.A06(A0l2);
                    SpannableStringBuilder A0E2 = C18200wM.A0E(A0l2);
                    AnonymousClass3Zw.A01(A0E2, iDxCSpanShape183S0100000_1_I22, A0k2);
                    igdsListCell2.A0G(A0E2);
                    MovementMethod instance2 = LinkMovementMethod.getInstance();
                    C04220Ms.A06(instance2);
                    igdsListCell2.A0A(instance2);
                    if (this.A03 == null) {
                        C04220Ms.A0E("promoteState");
                        throw null;
                    }
                    PromoteData promoteData4 = this.A02;
                    if (promoteData4 == null) {
                        C04220Ms.A0E(str);
                        throw null;
                    }
                    AnonymousClass22P r12 = promoteData4.A0s;
                    if (r12 == null || !(r12 == AnonymousClass22P.OPT_IN || r12 == AnonymousClass22P.DEFAULT_OPT_IN)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    igdsListCell2.setChecked(z);
                    C18230wP.A1N(igdsListCell2, this, 10);
                    linearLayout.addView(igdsListCell2);
                }
                PromoteData promoteData5 = this.A02;
                if (promoteData5 != null) {
                    promoteData5.A1y = true;
                    C37741K2b k2b = this.A01;
                    if (k2b == null) {
                        str = "promoteLogger";
                    } else {
                        k2b.A0L(C35394Iu2.A06, "ad_formats_preference_bottom_sheet");
                        super.onViewCreated(view, bundle);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(1786906477);
        super.onCreate(bundle);
        C37741K2b A012 = C37741K2b.A01(AnonymousClass0wJ.A0X(this.A05));
        C04220Ms.A06(A012);
        this.A01 = A012;
        C39846L2w l2w = (C39846L2w) getActivity();
        if (l2w != null) {
            this.A02 = l2w.B4m();
            C82264pL r0 = (C82264pL) getActivity();
            if (r0 != null) {
                this.A03 = r0.B4o();
                C14030oh.A09(2118391985, A022);
                return;
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -1887118406;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 359768837;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1670390018);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_ad_format_preferences_view, viewGroup, false);
        C14030oh.A09(1632759222, A022);
        return inflate;
    }
}
