package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1v5  reason: invalid class name */
public final class AnonymousClass1v5 extends AnonymousClass1dQ {
    public static final String __redex_internal_original_name = "CrosspostingUserMigrationBottomSheetFragment";
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    public final String getModuleName() {
        return "crossposting_upsell_bottom_sheet";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0249, code lost:
        if (r0.intValue() != 0) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x026b, code lost:
        if (r1 == 0) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016c, code lost:
        if (r0.intValue() != 0) goto L_0x016e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r5 = 0
            X.C04220Ms.A0B(r12, r5)
            super.onViewCreated(r12, r13)
            boolean r1 = r11.A00
            r0 = 2131837462(0x7f114216, float:1.930812E38)
            if (r1 == 0) goto L_0x0011
            r0 = 2131837467(0x7f11421b, float:1.930813E38)
        L_0x0011:
            java.lang.String r8 = X.C18180wK.A0g(r11, r0)
            boolean r1 = r11.A00
            r0 = 2131837467(0x7f11421b, float:1.930813E38)
            if (r1 == 0) goto L_0x001f
            r0 = 2131837462(0x7f114216, float:1.930812E38)
        L_0x001f:
            java.lang.String r7 = X.C18180wK.A0g(r11, r0)
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x014f
            r0 = 2131299305(0x7f090be9, float:1.8216608E38)
            android.widget.TextView r1 = X.C18180wK.A0G(r12, r0)
            r3 = 1
            if (r1 == 0) goto L_0x003b
            r0 = 2131837469(0x7f11421d, float:1.9308134E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r11, r7, r0)
            r1.setText(r0)
        L_0x003b:
            r0 = 2131299304(0x7f090be8, float:1.8216606E38)
            android.widget.TextView r1 = X.C18180wK.A0G(r12, r0)
            if (r1 == 0) goto L_0x004e
            r0 = 2131837468(0x7f11421c, float:1.9308132E38)
            java.lang.String r0 = X.C18220wO.A0k(r11, r8, r7, r0)
            r1.setText(r0)
        L_0x004e:
            com.instagram.service.session.UserSession r1 = r11.getSession()
            boolean r0 = r11.A00
            if (r0 == 0) goto L_0x00b1
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r1)
            boolean r0 = r0.Apo()
            if (r0 != 0) goto L_0x00b1
            android.content.Context r2 = r11.requireContext()
            r0 = 2131299301(0x7f090be5, float:1.82166E38)
            android.widget.TextView r7 = X.C18180wK.A0G(r12, r0)
            if (r7 == 0) goto L_0x0070
            r7.setVisibility(r5)
        L_0x0070:
            r0 = 2131837463(0x7f114217, float:1.9308122E38)
            java.lang.String r0 = r2.getString(r0)
            android.text.SpannableStringBuilder r6 = X.C18200wM.A0E(r0)
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r4.<init>(r3)
            int r1 = r6.length()
            r0 = 18
            r6.setSpan(r4, r5, r1, r0)
            r0 = 2131837464(0x7f114218, float:1.9308124E38)
            java.lang.String r0 = r2.getString(r0)
            android.text.SpannableStringBuilder r4 = X.C18200wM.A0E(r0)
            r0 = 2131232624(0x7f080770, float:1.8081363E38)
            android.graphics.drawable.Drawable r9 = r2.getDrawable(r0)
            if (r9 != 0) goto L_0x0126
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
        L_0x00a2:
            java.lang.String r0 = "%1$s"
            X.AnonymousClass3P0.A01(r4, r8, r0)
            java.lang.String r0 = "%2$s"
            X.AnonymousClass3P0.A01(r4, r6, r0)
            if (r7 == 0) goto L_0x00b1
            r7.setText(r4)
        L_0x00b1:
            r1 = 2131299298(0x7f090be2, float:1.8216593E38)
            r0 = 2131299299(0x7f090be3, float:1.8216595E38)
            r11.A00(r12, r1, r0, r3)
            r1 = 2131299302(0x7f090be6, float:1.8216602E38)
            r0 = 2131299303(0x7f090be7, float:1.8216604E38)
            r11.A00(r12, r1, r0, r5)
            r4 = 2131298931(0x7f090a73, float:1.821585E38)
            r0 = 2131298081(0x7f090721, float:1.8214125E38)
            android.view.View r2 = r12.findViewById(r4)
            android.view.View r1 = r12.findViewById(r0)
            if (r2 == 0) goto L_0x00d8
            r0 = 291(0x123, float:4.08E-43)
            X.AnonymousClass0wJ.A17(r2, r0, r11)
        L_0x00d8:
            if (r1 == 0) goto L_0x00df
            r0 = 292(0x124, float:4.09E-43)
            X.AnonymousClass0wJ.A17(r1, r0, r11)
        L_0x00df:
            X.29W r0 = X.AnonymousClass29W.VIEW
            A01(r0, r11)
            com.instagram.service.session.UserSession r3 = r11.getSession()
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36323753898025006(0x810c430000202e, double:3.034626456903439E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0125
            r0 = 2131299301(0x7f090be5, float:1.82166E38)
            android.widget.TextView r1 = X.C18180wK.A0G(r12, r0)
            if (r1 == 0) goto L_0x0104
            r0 = 2131837465(0x7f114219, float:1.9308126E38)
            X.C18180wK.A10(r1, r11, r0)
        L_0x0104:
            r0 = 2131299300(0x7f090be4, float:1.8216598E38)
            android.widget.TextView r1 = X.C18180wK.A0G(r12, r0)
            if (r1 == 0) goto L_0x0113
            r0 = 2131837460(0x7f114214, float:1.9308116E38)
            X.C18180wK.A10(r1, r11, r0)
        L_0x0113:
            android.view.View r1 = r12.findViewById(r4)
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            if (r1 == 0) goto L_0x0125
            r0 = 2131837455(0x7f11420f, float:1.9308106E38)
            java.lang.String r0 = r11.getString(r0)
            r1.setText((java.lang.String) r0)
        L_0x0125:
            return
        L_0x0126:
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r8 = X.C18200wM.A0E(r0)
            int r1 = r9.getIntrinsicWidth()
            int r0 = r9.getIntrinsicHeight()
            r9.setBounds(r5, r5, r1, r0)
            r0 = 2131099961(0x7f060139, float:1.781229E38)
            X.C63393hP.A03(r2, r9, r0)
            r2 = 2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            X.4zw r1 = new X.4zw
            r1.<init>(r0, r9, r2)
            r0 = 33
            r8.setSpan(r1, r5, r3, r0)
            goto L_0x00a2
        L_0x014f:
            com.instagram.service.session.UserSession r0 = r11.getSession()
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r2 = 36328091814996245(0x81103500002915, double:3.03736977306344E-306)
            boolean r0 = X.C63803iN.A0E(r6, r0, r2)
            r10 = 2
            r4 = 1
            if (r0 != 0) goto L_0x0280
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x027c
            java.lang.Integer r0 = X.AnonymousClass006.A00
        L_0x0168:
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x02a3
        L_0x016e:
            r0 = 2131835339(0x7f1139cb, float:1.9303814E38)
        L_0x0171:
            java.lang.String r1 = X.C18180wK.A0g(r11, r0)
        L_0x0175:
            r0 = 2131299283(0x7f090bd3, float:1.8216563E38)
            android.widget.TextView r0 = X.C18180wK.A0G(r12, r0)
            if (r0 == 0) goto L_0x0181
            r0.setText(r1)
        L_0x0181:
            com.instagram.service.session.UserSession r0 = r11.getSession()
            boolean r0 = X.C63803iN.A0E(r6, r0, r2)
            if (r0 == 0) goto L_0x025e
            com.instagram.service.session.UserSession r3 = r11.getSession()
            r0 = 36609566791767005(0x821035000113dd, double:3.215375681782026E-306)
            int r1 = X.C63803iN.A01(r6, r3, r0)
            if (r1 == r4) goto L_0x025e
            if (r1 == r10) goto L_0x025e
            r0 = 3
            if (r1 == r0) goto L_0x025e
            r0 = 4
            if (r1 == r0) goto L_0x026d
            r0 = 5
            if (r1 == r0) goto L_0x026d
            java.lang.String r1 = ""
        L_0x01a7:
            r0 = 2131299282(0x7f090bd2, float:1.821656E38)
            android.widget.TextView r0 = X.C18180wK.A0G(r12, r0)
            if (r0 == 0) goto L_0x01b3
            r0.setText(r1)
        L_0x01b3:
            com.instagram.service.session.UserSession r3 = r11.getSession()
            r0 = 36328091814996245(0x81103500002915, double:3.03736977306344E-306)
            boolean r0 = X.C63803iN.A0E(r6, r3, r0)
            if (r0 == 0) goto L_0x023f
            com.instagram.service.session.UserSession r3 = r11.getSession()
            r0 = 36609566791767005(0x821035000113dd, double:3.215375681782026E-306)
            int r1 = X.C63803iN.A01(r6, r3, r0)
            if (r1 == r4) goto L_0x024b
            if (r1 == r10) goto L_0x0252
            r0 = 3
            if (r1 == r0) goto L_0x0256
            r0 = 4
            if (r1 == r0) goto L_0x023f
            r0 = 5
            if (r1 == r0) goto L_0x0252
            java.lang.String r3 = ""
        L_0x01de:
            r1 = 2131306708(0x7f0928d4, float:1.8231623E38)
            r0 = 2131306707(0x7f0928d3, float:1.823162E38)
            android.view.View r2 = r12.findViewById(r1)
            com.instagram.igds.components.button.IgdsButton r2 = (com.instagram.igds.components.button.IgdsButton) r2
            android.view.View r1 = r12.findViewById(r0)
            if (r2 == 0) goto L_0x01f8
            r2.setText((java.lang.String) r3)
            r0 = 291(0x123, float:4.08E-43)
            X.AnonymousClass0wJ.A17(r2, r0, r11)
        L_0x01f8:
            if (r1 == 0) goto L_0x01ff
            r0 = 292(0x124, float:4.09E-43)
            X.AnonymousClass0wJ.A17(r1, r0, r11)
        L_0x01ff:
            boolean r0 = r11.A02
            if (r0 != 0) goto L_0x021e
            com.instagram.service.session.UserSession r2 = r11.getSession()
            r0 = 36323753898025006(0x810c430000202e, double:3.034626456903439E-306)
            boolean r0 = X.C63803iN.A0E(r6, r2, r0)
            if (r0 != 0) goto L_0x021e
            r0 = 2131299280(0x7f090bd0, float:1.8216557E38)
            android.view.View r0 = r12.findViewById(r0)
            if (r0 == 0) goto L_0x021e
            r0.setVisibility(r5)
        L_0x021e:
            com.instagram.service.session.UserSession r2 = r11.getSession()
            r0 = 36323753898025006(0x810c430000202e, double:3.034626456903439E-306)
            boolean r0 = X.C63803iN.A0E(r6, r2, r0)
            if (r0 == 0) goto L_0x0239
            r0 = 2131299279(0x7f090bcf, float:1.8216555E38)
            android.view.View r0 = r12.findViewById(r0)
            if (r0 == 0) goto L_0x0239
            r0.setVisibility(r5)
        L_0x0239:
            X.29W r0 = X.AnonymousClass29W.VIEW
            A01(r0, r11)
            return
        L_0x023f:
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x024f
            java.lang.Integer r0 = X.AnonymousClass006.A00
        L_0x0245:
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x0252
        L_0x024b:
            r0 = 2131835333(0x7f1139c5, float:1.9303802E38)
            goto L_0x0259
        L_0x024f:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x0245
        L_0x0252:
            r0 = 2131835332(0x7f1139c4, float:1.93038E38)
            goto L_0x0259
        L_0x0256:
            r0 = 2131837267(0x7f114153, float:1.9307724E38)
        L_0x0259:
            java.lang.String r3 = X.C18180wK.A0g(r11, r0)
            goto L_0x01de
        L_0x025e:
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x0279
            java.lang.Integer r0 = X.AnonymousClass006.A00
        L_0x0264:
            int r1 = r0.intValue()
            r0 = 2131835336(0x7f1139c8, float:1.9303808E38)
            if (r1 == r5) goto L_0x0270
        L_0x026d:
            r0 = 2131835337(0x7f1139c9, float:1.930381E38)
        L_0x0270:
            java.lang.String r1 = X.C18220wO.A0k(r11, r8, r7, r0)
            X.C04220Ms.A06(r1)
            goto L_0x01a7
        L_0x0279:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x0264
        L_0x027c:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x0168
        L_0x0280:
            com.instagram.service.session.UserSession r9 = r11.getSession()
            r0 = 36609566791767005(0x821035000113dd, double:3.215375681782026E-306)
            int r1 = X.C63803iN.A01(r6, r9, r0)
            if (r1 == r4) goto L_0x016e
            if (r1 == r10) goto L_0x02a3
            r0 = 3
            if (r1 == r0) goto L_0x029e
            r0 = 4
            if (r1 == r0) goto L_0x02a3
            r0 = 5
            if (r1 == r0) goto L_0x016e
            java.lang.String r1 = ""
            goto L_0x0175
        L_0x029e:
            r0 = 2131837276(0x7f11415c, float:1.9307742E38)
            goto L_0x0171
        L_0x02a3:
            r0 = 2131835338(0x7f1139ca, float:1.9303812E38)
            goto L_0x0171
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1v5.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00(View view, int i, int i2, boolean z) {
        boolean z2;
        boolean z3;
        if (this.A02 == z) {
            z2 = true;
            z3 = this.A00;
        } else {
            z2 = false;
            z3 = this.A03;
        }
        ImageView A0K = C18220wO.A0K(view, i);
        if (A0K != null) {
            int i3 = R.drawable.instagram_x_pano_outline_24;
            if (z3) {
                i3 = R.drawable.instagram_check_pano_outline_24;
            }
            A0K.setImageResource(i3);
        }
        TextView A0G = C18180wK.A0G(view, i2);
        if (A0G != null) {
            int i4 = 2131837461;
            if (z2) {
                i4 = 2131837466;
            }
            String A0o = AnonymousClass0wJ.A0o(this, getString(i4), 2131837456);
            C04220Ms.A06(A0o);
            SpannableStringBuilder A0E = C18200wM.A0E(A0o);
            int i5 = 2131837457;
            if (z3) {
                i5 = 2131837458;
            }
            String A0g = C18180wK.A0g(this, i5);
            A0E.append(AnonymousClass00U.A0L(" ", A0g));
            A0E.setSpan(new StyleSpan(1), C18220wO.A08(A0o), C18220wO.A08(A0o) + C18220wO.A08(A0g) + 1, 18);
            A0G.setText(A0E);
        }
    }

    public AnonymousClass1v5(Bundle bundle, UserSession userSession) {
        this.A02 = userSession;
        String string = bundle.getString("args_entrypoint");
        if (string != null) {
            AnonymousClass2AC valueOf = AnonymousClass2AC.valueOf(string);
            C04220Ms.A0B(valueOf, 0);
            this.A01 = valueOf;
            this.A00 = bundle.getInt("args_num_of_views", -1);
            this.A00 = bundle.getBoolean("args_is_story_enabled", false);
            this.A03 = bundle.getBoolean("args_is_post_enabled", false);
            this.A02 = bundle.getBoolean("args_is_showing_from_story", false);
            this.A01 = bundle.getBoolean("args_is_first_wave", false);
            AnonymousClass1v4 A002 = C62753ae.A00(userSession);
            C83844s5 r0 = A002.A03;
            if (r0 == null) {
                r0 = A002.A04();
                A002.A03 = r0;
            }
            this.A03 = r0;
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final void A01(AnonymousClass29W r7, AnonymousClass1v5 r8) {
        SharedPreferences sharedPreferences;
        String str;
        int A04;
        UserSession A022 = r8.getSession();
        AnonymousClass2AC r4 = r8.A01;
        if (r4 != null) {
            AnonymousClass2AD A002 = AnonymousClass3P0.A00(r8.A02, r8.A01);
            AnonymousClass14U A003 = AnonymousClass14U.A00();
            A003.A07("newly_linked_accounts", C18180wK.A0X());
            A003.A07("is_account_linked", C18180wK.A0Y());
            C28161tl A012 = AnonymousClass3WS.A01(r8.getSession());
            int ordinal = AnonymousClass3P0.A00(r8.A02, r8.A01).ordinal();
            if (ordinal != 16) {
                if (ordinal == 17) {
                    sharedPreferences = A012.A00;
                    str = "story_xpost_user_migration_upsell_second_wave_display_count";
                } else if (ordinal == 12) {
                    sharedPreferences = A012.A00;
                    str = "feed_xpost_user_migration_upsell_display_count";
                } else if (ordinal != 13) {
                    A04 = 0;
                } else {
                    sharedPreferences = A012.A00;
                    str = "feed_xpost_user_migration_upsell_second_wave_display_count";
                }
                A04 = C18190wL.A04(sharedPreferences, str);
            } else {
                sharedPreferences = A012.A00;
                str = "story_xpost_user_migration_upsell_display_count";
                A04 = C18190wL.A04(sharedPreferences, str);
            }
            C18210wN.A1D(A003, (long) A04);
            C49322rC.A00(r4, r7, A002, A003, A022);
            return;
        }
        C04220Ms.A0E("entrypoint");
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(383071403);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments.getBoolean("args_is_story_enabled", false);
        this.A03 = requireArguments.getBoolean("args_is_post_enabled", false);
        this.A02 = requireArguments.getBoolean("args_is_showing_from_story", false);
        this.A01 = requireArguments.getBoolean("args_is_first_wave", false);
        AnonymousClass1v4 A002 = C62753ae.A00(getSession());
        C83844s5 r0 = A002.A03;
        if (r0 == null) {
            r0 = A002.A04();
            A002.A03 = r0;
        }
        this.A03 = r0;
        C14030oh.A09(997230072, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-182903013);
        C04220Ms.A0B(layoutInflater, 0);
        boolean z = this.A01;
        int i = R.layout.fragment_crossposting_upsell_second_wave_bottom_sheet;
        if (z) {
            i = R.layout.fragment_crossposting_upsell_bottom_sheet;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C14030oh.A09(-1230564493, A022);
        return inflate;
    }
}
