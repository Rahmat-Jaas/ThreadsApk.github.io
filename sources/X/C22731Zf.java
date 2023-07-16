package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxTListenerShape181S0200000_1_I2;
import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.barcelona.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.service.session.UserSession;
import java.util.Iterator;

/* renamed from: X.1Zf  reason: invalid class name and case insensitive filesystem */
public final class C22731Zf extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "PromoteProfileVisitSettingFragment";
    public C37741K2b A00;
    public PromoteData A01;
    public UserSession A02;
    public String A03 = "";

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        r2.setTitle(this.A03);
        AnonymousClass4u2.A03(C18180wK.A0N(), r2);
    }

    public final String getModuleName() {
        return "promote_profile_visit_setting";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        int i;
        int i2;
        String str;
        Integer num2;
        int i3;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        PromoteData promoteData = this.A01;
        if (promoteData == null) {
            str = "promoteData";
        } else {
            InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations = (InstagramProfileCallToActionDestinations) promoteData.A1X.get(0);
            C04220Ms.A04(instagramProfileCallToActionDestinations);
            int ordinal = instagramProfileCallToActionDestinations.ordinal();
            if (ordinal == 5 || ordinal != 6) {
                num = AnonymousClass006.A00;
            } else {
                num = AnonymousClass006.A01;
            }
            TextView A0L = AnonymousClass0wJ.A0L(view, R.id.promote_header);
            int intValue = num.intValue();
            if (intValue != 0) {
                i = 2131833362;
            } else {
                i = 2131833363;
            }
            A0L.setText(i);
            if (intValue != 0) {
                i2 = 2131833360;
            } else {
                i2 = 2131833361;
            }
            String A0o = AnonymousClass0wJ.A0o(this, this.A03, i2);
            C04220Ms.A06(A0o);
            TextView A0L2 = AnonymousClass0wJ.A0L(view, R.id.promote_subheader);
            String str2 = this.A03;
            SpannableStringBuilder A0E = C18200wM.A0E(A0o);
            AnonymousClass3Zw.A00(A0E, new StyleSpan(1), str2);
            A0L2.setText(A0E);
            ((IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(view, R.id.bottom_button_layout)).setPrimaryAction(getString(2131833358), C18190wL.A0H(this, 200));
            ViewGroup viewGroup = (ViewGroup) AnonymousClass0wJ.A0J(view, R.id.secondary_cta_options_container);
            viewGroup.removeAllViews();
            PromoteData promoteData2 = this.A01;
            str = "promoteData";
            if (promoteData2 != null) {
                Iterator it = promoteData2.A1X.iterator();
                while (true) {
                    if (it.hasNext()) {
                        InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations2 = (InstagramProfileCallToActionDestinations) it.next();
                        C04220Ms.A04(instagramProfileCallToActionDestinations2);
                        int ordinal2 = instagramProfileCallToActionDestinations2.ordinal();
                        if (ordinal2 == 5) {
                            num2 = AnonymousClass006.A00;
                        } else if (ordinal2 == 6) {
                            num2 = AnonymousClass006.A01;
                        } else {
                            continue;
                        }
                        boolean z = false;
                        View inflate = LayoutInflater.from(requireActivity()).inflate(R.layout.promote_toggle_row, viewGroup, false);
                        AnonymousClass0wJ.A0L(inflate, R.id.toggle_row_title).setText(2131833355);
                        TextView A0L3 = AnonymousClass0wJ.A0L(inflate, R.id.toggle_row_subtitle);
                        if (num2.intValue() != 0) {
                            i3 = 2131833353;
                        } else {
                            i3 = 2131833354;
                        }
                        A0L3.setText(i3);
                        IgSwitch igSwitch = (IgSwitch) AnonymousClass0wJ.A0J(inflate, R.id.toggle_row_switch);
                        PromoteData promoteData3 = this.A01;
                        if (promoteData3 == null) {
                            break;
                        }
                        if (promoteData3.A1i.contains(instagramProfileCallToActionDestinations2)) {
                            PromoteData promoteData4 = this.A01;
                            if (promoteData4 == null) {
                                break;
                            } else if (C37318JpL.A02(instagramProfileCallToActionDestinations2, promoteData4)) {
                                z = true;
                            }
                        }
                        igSwitch.setChecked(z);
                        igSwitch.A07 = new IDxTListenerShape181S0200000_1_I2(1, (Object) instagramProfileCallToActionDestinations2, (Object) this);
                        viewGroup.addView(inflate);
                    } else {
                        C37741K2b k2b = this.A00;
                        if (k2b == null) {
                            str = "promoteLogger";
                        } else {
                            k2b.A0P(C35394Iu2.A10.toString());
                            return;
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        UserSession userSession = this.A02;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(895115839);
        super.onCreate(bundle);
        this.A01 = C18190wL.A0P(this);
        UserSession A0W = C18180wK.A0W(this, AnonymousClass0RA.A0C);
        this.A02 = A0W;
        C37741K2b A012 = C37741K2b.A01(A0W);
        C04220Ms.A06(A012);
        this.A00 = A012;
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString(I17.A00(815))) == null) {
            str = C18180wK.A0g(this, 2131833345);
        }
        this.A03 = str;
        C14030oh.A09(-1962557312, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1826161608);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_profile_visit_setting_view, viewGroup, false);
        C14030oh.A09(1871052396, A022);
        return inflate;
    }

    public final void onDestroyView() {
        String str;
        int A022 = C14030oh.A02(1789062174);
        super.onDestroyView();
        C37741K2b k2b = this.A00;
        if (k2b == null) {
            str = "promoteLogger";
        } else {
            PromoteData promoteData = this.A01;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                k2b.A0E(C35394Iu2.A10, promoteData);
                C14030oh.A09(1299343847, A022);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
