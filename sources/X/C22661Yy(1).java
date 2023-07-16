package X;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11;

/* renamed from: X.1Yy  reason: invalid class name and case insensitive filesystem */
public final class C22661Yy extends C34640IcN {
    public static final String __redex_internal_original_name = "ReelsShareToFbUpsellFragment";
    public C312724y A00;
    public IgLinearLayout A01;
    public IgdsBottomButtonLayout A02;
    public IgdsHeadline A03;
    public AnonymousClass3TG A04;
    public boolean A05;
    public final C04530Oa A06 = C80644m9.A00(this);

    public final String getModuleName() {
        return "reels_share_to_fb_upsell_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = (IgdsHeadline) AnonymousClass0wJ.A0J(requireView(), R.id.headline);
        this.A02 = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(requireView(), R.id.bottom_buttons);
        this.A01 = (IgLinearLayout) AnonymousClass0wJ.A0J(requireView(), R.id.inverted_button_container);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape14S0101000_I2_11(this, (C146958n9) null, 24), C18200wM.A0M(this), 3);
    }

    private final void A01() {
        String str;
        if (this.A05) {
            IgLinearLayout igLinearLayout = this.A01;
            str = "invertedBottomButtonContainer";
            if (igLinearLayout != null) {
                C18200wM.A1D(igLinearLayout, R.id.footer_above_action);
                IgLinearLayout igLinearLayout2 = this.A01;
                if (igLinearLayout2 != null) {
                    TextView textView = (TextView) AnonymousClass0wJ.A0J(igLinearLayout2, R.id.bb_footer);
                    C18180wK.A10(textView, this, 2131834522);
                    textView.setVisibility(0);
                    return;
                }
            }
        } else {
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
            if (igdsBottomButtonLayout == null) {
                str = "bottomButtons";
            } else {
                igdsBottomButtonLayout.setFooterText(getString(2131834522));
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A02(AnonymousClass29W r7, UserSession userSession, AnonymousClass3TG r9) {
        long j;
        AnonymousClass2AD r6 = r9.A02;
        if (r6.ordinal() == 4) {
            j = (long) C18190wL.A04(AnonymousClass3Zu.A02(userSession), "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_VIEW_COUNT");
        } else {
            j = 0;
        }
        AnonymousClass2AC r5 = r9.A01;
        AnonymousClass14U A002 = AnonymousClass14U.A00();
        A002.A0A("waterfall_id", r9.A06);
        C67343zO.A00(A002, userSession);
        C18210wN.A1D(A002, j);
        C49322rC.A00(r5, r7, r6, A002, userSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r0.ordinal() != 1) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 r7) {
        /*
            r6 = this;
            java.lang.String r5 = "headlineView"
            r4 = 0
            if (r7 == 0) goto L_0x0082
            com.instagram.igds.components.headline.IgdsHeadline r0 = r6.A03
            if (r0 == 0) goto L_0x0012
            r0.setVisibility(r4)
        L_0x000c:
            X.3TG r0 = r6.A04
            if (r0 != 0) goto L_0x0017
            java.lang.String r5 = "params"
        L_0x0012:
            X.C04220Ms.A0E(r5)
            r0 = 0
            throw r0
        L_0x0017:
            X.2AC r1 = r0.A01
            X.2AC r0 = X.AnonymousClass2AC.A0J
            if (r1 == r0) goto L_0x0062
            if (r7 == 0) goto L_0x002f
            java.lang.Object r0 = r7.A00
            X.24X r0 = (X.AnonymousClass24X) r0
            if (r0 == 0) goto L_0x002f
            int r1 = r0.ordinal()
            r0 = 1
            r2 = 2131834526(0x7f11369e, float:1.9302165E38)
            if (r1 == r0) goto L_0x0032
        L_0x002f:
            r2 = 2131834525(0x7f11369d, float:1.9302163E38)
        L_0x0032:
            java.lang.String r3 = r6.getString(r2)
            X.C04220Ms.A09(r3)
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0063
            com.instagram.common.ui.base.IgLinearLayout r1 = r6.A01
            java.lang.String r5 = "invertedBottomButtonContainer"
            if (r1 == 0) goto L_0x0012
            r0 = 2131297360(0x7f090450, float:1.8212663E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.instagram.common.ui.base.IgLinearLayout r1 = r6.A01
            if (r1 == 0) goto L_0x0012
            r0 = 2131297363(0x7f090453, float:1.8212669E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.setText(r3)
            r0 = 2131831869(0x7f112c3d, float:1.9296776E38)
            X.C18180wK.A10(r1, r6, r0)
        L_0x0062:
            return
        L_0x0063:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r6.A02
            java.lang.String r5 = "bottomButtons"
            if (r0 == 0) goto L_0x0012
            r0.setVisibility(r4)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r6.A02
            if (r0 == 0) goto L_0x0012
            r0.setPrimaryActionText(r3)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r6.A02
            if (r1 == 0) goto L_0x0012
            r0 = 2131834527(0x7f11369f, float:1.9302167E38)
            java.lang.String r0 = r6.getString(r0)
            r1.setSecondaryActionText(r0)
            return
        L_0x0082:
            com.instagram.igds.components.headline.IgdsHeadline r1 = r6.A03
            if (r1 == 0) goto L_0x0012
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22661Yy.A03(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2):void");
    }

    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r3v0, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 r9, X.C22661Yy r10) {
        /*
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x005a
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r10.A02
            if (r1 != 0) goto L_0x000f
            java.lang.String r5 = "bottomButtons"
        L_0x000a:
            X.C04220Ms.A0E(r5)
            r0 = 0
            throw r0
        L_0x000f:
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.common.ui.base.IgLinearLayout r0 = r10.A01
            java.lang.String r5 = "invertedBottomButtonContainer"
            if (r0 == 0) goto L_0x000a
            r3 = 0
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgLinearLayout r1 = r10.A01
            if (r1 == 0) goto L_0x000a
            r0 = 2131297360(0x7f090450, float:1.8212663E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.instagram.common.ui.base.IgLinearLayout r1 = r10.A01
            if (r1 == 0) goto L_0x000a
            r0 = 2131297361(0x7f090451, float:1.8212665E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r1, r0)
            com.instagram.common.ui.base.IgLinearLayout r1 = r10.A01
            if (r1 == 0) goto L_0x000a
            r0 = 2131297363(0x7f090453, float:1.8212669E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 297(0x129, float:4.16E-43)
            X.AnonymousClass0wJ.A17(r2, r0, r10)
            r0 = 2131821268(0x7f1102d4, float:1.9275274E38)
            X.C18180wK.A10(r4, r10, r0)
            r0 = 298(0x12a, float:4.18E-43)
            X.AnonymousClass0wJ.A17(r1, r0, r10)
            r0 = 2131831869(0x7f112c3d, float:1.9296776E38)
            X.C18180wK.A10(r1, r10, r0)
            goto L_0x00b7
        L_0x005a:
            com.instagram.common.ui.base.IgLinearLayout r1 = r10.A01
            if (r1 != 0) goto L_0x0065
            java.lang.String r2 = "invertedBottomButtonContainer"
        L_0x0060:
            X.C04220Ms.A0E(r2)
            r0 = 0
            throw r0
        L_0x0065:
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r10.A02
            java.lang.String r2 = "bottomButtons"
            if (r0 == 0) goto L_0x0060
            r3 = 0
            r0.setVisibility(r3)
            X.3TG r0 = r10.A04
            if (r0 != 0) goto L_0x007b
            java.lang.String r2 = "params"
            goto L_0x0060
        L_0x007b:
            X.2AC r1 = r0.A01
            X.2AC r0 = X.AnonymousClass2AC.A0J
            boolean r0 = X.C18180wK.A1Z(r1, r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r10.A02
            if (r0 == 0) goto L_0x00be
            if (r1 == 0) goto L_0x0060
            r0 = 2131834529(0x7f1136a1, float:1.930217E38)
            X.C18210wN.A15(r10, r1, r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r10.A02
            if (r1 == 0) goto L_0x0060
            r0 = 2131834528(0x7f1136a0, float:1.9302169E38)
        L_0x0096:
            java.lang.String r0 = r10.getString(r0)
            r1.setSecondaryActionText(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r10.A02
            if (r1 == 0) goto L_0x0060
            r0 = 295(0x127, float:4.13E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r10, r0)
            r1.setPrimaryActionOnClickListener(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r10.A02
            if (r1 == 0) goto L_0x0060
            r0 = 296(0x128, float:4.15E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r10, r0)
            r1.setSecondaryActionOnClickListener(r0)
        L_0x00b7:
            X.24y r0 = r10.A00
            if (r0 != 0) goto L_0x00ce
            java.lang.String r2 = "designVariant"
            goto L_0x0060
        L_0x00be:
            if (r1 == 0) goto L_0x0060
            r0 = 2131821268(0x7f1102d4, float:1.9275274E38)
            X.C18210wN.A15(r10, r1, r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r10.A02
            if (r1 == 0) goto L_0x0060
            r0 = 2131831869(0x7f112c3d, float:1.9296776E38)
            goto L_0x0096
        L_0x00ce:
            int r0 = r0.ordinal()
            r5 = 1
            if (r0 == r3) goto L_0x024c
            if (r0 == r5) goto L_0x00fe
            r7 = 2
            if (r0 == r7) goto L_0x00e7
            java.lang.String r8 = "headlineView"
            r2 = 0
            if (r9 == 0) goto L_0x015c
            com.instagram.igds.components.headline.IgdsHeadline r0 = r10.A03
            if (r0 != 0) goto L_0x015e
            X.C04220Ms.A0E(r8)
            throw r2
        L_0x00e7:
            r10.A03(r9)
            X.0Ok r1 = X.C06810aP.A01
            X.0Oa r0 = r10.A06
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.9tz r2 = X.C18200wM.A0a(r0, r1)
            com.instagram.igds.components.headline.IgdsHeadline r1 = r10.A03
            if (r1 != 0) goto L_0x023f
            java.lang.String r2 = "headlineView"
            goto L_0x0060
        L_0x00fe:
            r10.A03(r9)
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x0142
            com.instagram.common.ui.base.IgLinearLayout r1 = r10.A01
            java.lang.String r2 = "invertedBottomButtonContainer"
            if (r1 == 0) goto L_0x0060
            r0 = 2131297358(0x7f09044e, float:1.8212659E38)
            X.C18200wM.A1D(r1, r0)
            com.instagram.common.ui.base.IgLinearLayout r1 = r10.A01
            if (r1 == 0) goto L_0x0060
            r0 = 2131300741(0x7f091185, float:1.821952E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r10)
            X.C04220Ms.A06(r1)
            r0 = 2131834521(0x7f113699, float:1.9302155E38)
            android.text.SpannableStringBuilder r0 = r10.A00(r1, r0)
            r2.setText(r0)
            r2.setVisibility(r3)
        L_0x0132:
            X.0Ok r1 = X.C06810aP.A01
            X.0Oa r0 = r10.A06
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.9tz r0 = X.C18200wM.A0a(r0, r1)
            r10.A05(r9, r0, r3, r3)
            return
        L_0x0142:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r10.A02
            if (r2 != 0) goto L_0x014a
            java.lang.String r2 = "bottomButtons"
            goto L_0x0060
        L_0x014a:
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r10)
            X.C04220Ms.A06(r1)
            r0 = 2131834521(0x7f113699, float:1.9302155E38)
            android.text.SpannableStringBuilder r0 = r10.A00(r1, r0)
            r2.setFooterAboveActionText(r0)
            goto L_0x0132
        L_0x015c:
            r0 = r2
            goto L_0x0163
        L_0x015e:
            r0.setVisibility(r3)
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x0163:
            r6 = 4
            if (r0 != 0) goto L_0x0171
            com.instagram.igds.components.headline.IgdsHeadline r0 = r10.A03
            if (r0 != 0) goto L_0x016e
            X.C04220Ms.A0E(r8)
            throw r2
        L_0x016e:
            r0.setVisibility(r6)
        L_0x0171:
            com.instagram.igds.components.headline.IgdsHeadline r1 = r10.A03
            if (r1 != 0) goto L_0x0179
            X.C04220Ms.A0E(r8)
            throw r2
        L_0x0179:
            r0 = 2131834480(0x7f113670, float:1.9302072E38)
            r1.setHeadline((int) r0)
            android.content.res.Resources r4 = X.AnonymousClass0wJ.A0B(r10)
            r1 = 2131834472(0x7f113668, float:1.9302055E38)
            if (r9 == 0) goto L_0x018c
            java.lang.String r0 = r9.A03
            if (r0 != 0) goto L_0x018e
        L_0x018c:
            java.lang.String r0 = ""
        L_0x018e:
            android.text.Spanned r4 = X.C18210wN.A0C(r4, r0, r1)
            if (r9 == 0) goto L_0x01f1
            java.lang.Object r0 = r9.A00
            X.24X r0 = (X.AnonymousClass24X) r0
            if (r0 == 0) goto L_0x01f1
            int r1 = r0.ordinal()
            if (r1 == r5) goto L_0x01e2
            if (r1 == r7) goto L_0x01d3
            r0 = 3
            if (r1 == r0) goto L_0x01c4
            if (r1 != r6) goto L_0x01f2
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r10)
            X.C04220Ms.A06(r1)
            r0 = 2131834475(0x7f11366b, float:1.9302061E38)
            android.text.SpannableStringBuilder r6 = r10.A00(r1, r0)
        L_0x01b5:
            r0 = 2131834478(0x7f11366e, float:1.9302067E38)
            java.lang.String r5 = X.C18180wK.A0g(r10, r0)
            com.instagram.igds.components.headline.IgdsHeadline r3 = r10.A03
            if (r3 != 0) goto L_0x020e
            X.C04220Ms.A0E(r8)
            throw r2
        L_0x01c4:
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r10)
            X.C04220Ms.A06(r1)
            r0 = 2131834474(0x7f11366a, float:1.930206E38)
            android.text.SpannableStringBuilder r6 = r10.A00(r1, r0)
            goto L_0x01b5
        L_0x01d3:
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r10)
            X.C04220Ms.A06(r1)
            r0 = 2131834473(0x7f113669, float:1.9302057E38)
            android.text.SpannableStringBuilder r6 = r10.A00(r1, r0)
            goto L_0x01b5
        L_0x01e2:
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r10)
            X.C04220Ms.A06(r1)
            r0 = 2131834477(0x7f11366d, float:1.9302065E38)
            android.text.SpannableStringBuilder r6 = r10.A00(r1, r0)
            goto L_0x01b5
        L_0x01f1:
            r1 = -1
        L_0x01f2:
            r0 = 5
            android.content.res.Resources r5 = X.AnonymousClass0wJ.A0B(r10)
            if (r1 == r0) goto L_0x0203
            r1 = 2131834479(0x7f11366f, float:1.930207E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            android.text.Spanned r6 = X.C16370sw.A00(r5, r0, r1)
            goto L_0x01b5
        L_0x0203:
            X.C04220Ms.A06(r5)
            r0 = 2131834476(0x7f11366c, float:1.9302063E38)
            android.text.SpannableStringBuilder r6 = r10.A00(r5, r0)
            goto L_0x01b5
        L_0x020e:
            android.content.Context r0 = r10.requireContext()
            X.3Ya r1 = X.C62263Ya.A00(r0)
            r0 = 2131232607(0x7f08075f, float:1.8081328E38)
            r1.A03(r2, r4, r0)
            r0 = 2131233118(0x7f08095e, float:1.8082364E38)
            r1.A03(r2, r6, r0)
            r0 = 2131232915(0x7f080893, float:1.8081953E38)
            java.util.List r0 = X.C62263Ya.A01(r1, r2, r5, r0)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0231:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x023b
            X.C18210wN.A1P(r2, r1)
            goto L_0x0231
        L_0x023b:
            r3.setBulletList(r2)
            return
        L_0x023f:
            r0 = 2131232008(0x7f080508, float:1.8080113E38)
            r1.A08(r0, r3)
            r10.A05(r9, r2, r5, r3)
            r10.A01()
            return
        L_0x024c:
            r10.A01()
            X.0Ok r1 = X.C06810aP.A01
            X.0Oa r0 = r10.A06
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.9tz r0 = X.C18200wM.A0a(r0, r1)
            r10.A05(r9, r0, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22661Yy.A04(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2, X.1Yy):void");
    }

    private final void A05(KtCSuperShape0S4110000_I2 ktCSuperShape0S4110000_I2, C169839tz r10, boolean z, boolean z2) {
        Unit unit;
        Object obj;
        int i;
        AnonymousClass24X r0;
        Spanned A0C;
        SpannableStringBuilder A002;
        CharSequence A0g;
        if (ktCSuperShape0S4110000_I2 != null) {
            IgdsHeadline igdsHeadline = this.A03;
            if (igdsHeadline == null) {
                C04220Ms.A0E("headlineView");
                throw null;
            } else {
                igdsHeadline.setVisibility(0);
                unit = Unit.A00;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            IgdsHeadline igdsHeadline2 = this.A03;
            if (igdsHeadline2 == null) {
                C04220Ms.A0E("headlineView");
                throw null;
            }
            igdsHeadline2.setVisibility(4);
        }
        IgdsHeadline igdsHeadline3 = this.A03;
        if (igdsHeadline3 == null) {
            C04220Ms.A0E("headlineView");
            throw null;
        }
        igdsHeadline3.setHeadlineStyle(R.style.igds_headline_1_emphasized);
        IgdsHeadline igdsHeadline4 = this.A03;
        if (igdsHeadline4 == null) {
            C04220Ms.A0E("headlineView");
            throw null;
        }
        if (z2) {
            i = 2131834480;
        } else {
            if (ktCSuperShape0S4110000_I2 != null) {
                obj = ktCSuperShape0S4110000_I2.A00;
            } else {
                obj = null;
            }
            i = 2131834523;
            if (obj == AnonymousClass24X.A06) {
                i = 2131834524;
            }
        }
        igdsHeadline4.setHeadline(i);
        String str = "";
        if (!(ktCSuperShape0S4110000_I2 == null || (r0 = (AnonymousClass24X) ktCSuperShape0S4110000_I2.A00) == null)) {
            int ordinal = r0.ordinal();
            if (ordinal == 1) {
                Resources A0B = AnonymousClass0wJ.A0B(this);
                String str2 = ktCSuperShape0S4110000_I2.A03;
                if (str2 != null) {
                    str = str2;
                }
                A0C = C18210wN.A0C(A0B, str, 2131834509);
                C04220Ms.A06(A0C);
                Resources A0B2 = AnonymousClass0wJ.A0B(this);
                C04220Ms.A06(A0B2);
                A002 = A00(A0B2, 2131834514);
                if (r10 == C169839tz.PrivacyStatusPrivate) {
                    if (z) {
                        Resources A0B3 = AnonymousClass0wJ.A0B(this);
                        C04220Ms.A06(A0B3);
                        A0g = A00(A0B3, 2131834520);
                    } else {
                        A0g = C18180wK.A0g(this, 2131834519);
                    }
                } else if (z) {
                    Resources A0B4 = AnonymousClass0wJ.A0B(this);
                    C04220Ms.A06(A0B4);
                    A0g = A00(A0B4, 2131834518);
                } else {
                    A0g = C18180wK.A0g(this, 2131834517);
                }
            } else if (ordinal == 2) {
                Resources A0B5 = AnonymousClass0wJ.A0B(this);
                String str3 = ktCSuperShape0S4110000_I2.A03;
                if (str3 != null) {
                    str = str3;
                }
                A0C = C18210wN.A0C(A0B5, str, 2131834507);
                C04220Ms.A06(A0C);
                Resources A0B6 = AnonymousClass0wJ.A0B(this);
                C04220Ms.A06(A0B6);
                A002 = A00(A0B6, 2131834512);
                if (z) {
                    Resources A0B7 = AnonymousClass0wJ.A0B(this);
                    C04220Ms.A06(A0B7);
                    A0g = A00(A0B7, 2131834516);
                } else {
                    A0g = C18180wK.A0g(this, 2131834515);
                }
            } else if (ordinal == 3) {
                Resources A0B8 = AnonymousClass0wJ.A0B(this);
                String str4 = ktCSuperShape0S4110000_I2.A03;
                if (str4 != null) {
                    str = str4;
                }
                A0C = C18210wN.A0C(A0B8, str, 2131834507);
                C04220Ms.A06(A0C);
                Resources A0B9 = AnonymousClass0wJ.A0B(this);
                C04220Ms.A06(A0B9);
                A002 = A00(A0B9, 2131834510);
                if (z) {
                    Resources A0B10 = AnonymousClass0wJ.A0B(this);
                    C04220Ms.A06(A0B10);
                    A0g = A00(A0B10, 2131834516);
                } else {
                    A0g = C18180wK.A0g(this, 2131834515);
                }
            } else if (ordinal == 4) {
                Resources A0B11 = AnonymousClass0wJ.A0B(this);
                String str5 = ktCSuperShape0S4110000_I2.A03;
                if (str5 != null) {
                    str = str5;
                }
                A0C = C18210wN.A0C(A0B11, str, 2131834507);
                C04220Ms.A06(A0C);
                Resources A0B12 = AnonymousClass0wJ.A0B(this);
                C04220Ms.A06(A0B12);
                A002 = A00(A0B12, 2131834511);
                if (z) {
                    Resources A0B13 = AnonymousClass0wJ.A0B(this);
                    C04220Ms.A06(A0B13);
                    A0g = A00(A0B13, 2131834516);
                } else {
                    A0g = C18180wK.A0g(this, 2131834515);
                }
            } else if (ordinal == 5) {
                Resources A0B14 = AnonymousClass0wJ.A0B(this);
                String str6 = ktCSuperShape0S4110000_I2.A03;
                if (str6 != null) {
                    str = str6;
                }
                A0C = C18210wN.A0C(A0B14, str, 2131834508);
                C04220Ms.A06(A0C);
                Resources A0B15 = AnonymousClass0wJ.A0B(this);
                C04220Ms.A06(A0B15);
                A002 = A00(A0B15, 2131834513);
                if (z) {
                    Resources A0B16 = AnonymousClass0wJ.A0B(this);
                    C04220Ms.A06(A0B16);
                    A0g = A00(A0B16, 2131834516);
                } else {
                    A0g = C18180wK.A0g(this, 2131834515);
                }
            }
            IgdsHeadline igdsHeadline5 = this.A03;
            if (igdsHeadline5 == null) {
                C04220Ms.A0E("headlineView");
                throw null;
            }
            C62263Ya A003 = C62263Ya.A00(requireContext());
            A003.A03((CharSequence) null, A0C, R.drawable.instagram_facebook_circle_pano_outline_24);
            A003.A03((CharSequence) null, A002, R.drawable.instagram_user_circle_pano_outline_24);
            List A012 = C62263Ya.A01(A003, (CharSequence) null, A0g, R.drawable.instagram_remix_pano_outline_24);
            ArrayList A0w = AnonymousClass0wJ.A0w(A012);
            Iterator it = A012.iterator();
            while (it.hasNext()) {
                C18210wN.A1P(A0w, it);
            }
            igdsHeadline5.setBulletList(A0w);
            return;
        }
        IgdsHeadline igdsHeadline6 = this.A03;
        if (igdsHeadline6 == null) {
            C04220Ms.A0E("headlineView");
            throw null;
        } else {
            igdsHeadline6.setVisibility(8);
        }
    }

    public static final void A06(C22661Yy r12) {
        String str;
        C04530Oa r3 = r12.A06;
        if (C67343zO.A08(AnonymousClass0wJ.A0X(r3))) {
            C25831Dsp A022 = C25567Do3.A02(AnonymousClass0wJ.A0X(r3));
            AnonymousClass3TG r0 = r12.A04;
            str = "params";
            if (r0 != null) {
                C23949D2u d2u = r0.A03;
                String str2 = r0.A05;
                C312724y r02 = r12.A00;
                if (r02 == null) {
                    str = "designVariant";
                } else {
                    A022.A1e(d2u, true, str2, r02.A00, true);
                    AnonymousClass29W r2 = AnonymousClass29W.ACCEPT;
                    UserSession A0X = AnonymousClass0wJ.A0X(r3);
                    AnonymousClass3TG r03 = r12.A04;
                    if (r03 != null) {
                        A02(r2, A0X, r03);
                        UserSession A0X2 = AnonymousClass0wJ.A0X(r3);
                        C04220Ms.A0B(A0X2, 0);
                        AnonymousClass3Zu.A03(A0X2).A05(false);
                        C49252r5.A00(A0X2).A04(true);
                        AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(r3)).A04(new E6U(AnonymousClass006.A01, AnonymousClass006.A00, true, true));
                        r12.requireActivity().setResult(1);
                        C18180wK.A13(r12);
                        return;
                    }
                }
            }
        } else {
            IgdsBottomButtonLayout igdsBottomButtonLayout = r12.A02;
            if (igdsBottomButtonLayout == null) {
                str = "bottomButtons";
            } else {
                igdsBottomButtonLayout.setVisibility(8);
                IgLinearLayout igLinearLayout = r12.A01;
                if (igLinearLayout == null) {
                    str = "invertedBottomButtonContainer";
                } else {
                    igLinearLayout.setVisibility(8);
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A07(C22661Yy r11) {
        AnonymousClass29W r2;
        C04530Oa r4 = r11.A06;
        C25831Dsp A022 = C25567Do3.A02(AnonymousClass0wJ.A0X(r4));
        AnonymousClass3TG r0 = r11.A04;
        String str = "params";
        if (r0 != null) {
            C23949D2u d2u = r0.A03;
            Boolean A0Y = C18180wK.A0Y();
            String str2 = r0.A05;
            C312724y r02 = r11.A00;
            if (r02 == null) {
                str = "designVariant";
            } else {
                A022.A1e(d2u, A0Y, str2, r02.A00, false);
                AnonymousClass3TG r03 = r11.A04;
                if (r03 != null) {
                    if (r03.A01 == AnonymousClass2AC.A0J) {
                        r2 = AnonymousClass29W.OTHER;
                    } else {
                        r2 = AnonymousClass29W.DECLINE;
                    }
                    UserSession A0X = AnonymousClass0wJ.A0X(r4);
                    AnonymousClass3TG r04 = r11.A04;
                    if (r04 != null) {
                        A02(r2, A0X, r04);
                        r11.requireActivity().setResult(2);
                        C18180wK.A12(r11);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A06);
    }

    private final SpannableStringBuilder A00(Resources resources, int i) {
        String A0g = C18180wK.A0g(this, 2131834481);
        SpannableStringBuilder A0E = C18200wM.A0E(C18210wN.A0C(resources, A0g, i));
        AnonymousClass3Zw.A02(A0E, this, A0g, 17);
        return A0E;
    }

    public final void afterOnStart() {
        super.afterOnStart();
        C04530Oa r3 = this.A06;
        SharedPreferences A022 = AnonymousClass3Zu.A02(AnonymousClass0wJ.A0X(r3));
        AnonymousClass0wJ.A14(A022, "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_VIEW_COUNT", 0);
        AnonymousClass0wJ.A12(A022.edit(), "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_LAST_SEEN_TIME_MS", System.currentTimeMillis());
        C25831Dsp A023 = C25567Do3.A02(AnonymousClass0wJ.A0X(r3));
        AnonymousClass3TG r0 = this.A04;
        String str = "params";
        if (r0 != null) {
            C23949D2u d2u = r0.A03;
            Boolean A0Y = C18180wK.A0Y();
            String str2 = r0.A05;
            C312724y r02 = this.A00;
            if (r02 == null) {
                str = "designVariant";
            } else {
                String str3 = r02.A00;
                boolean A032 = C67343zO.A03(AnonymousClass0wJ.A0X(r3));
                if (str2 == null) {
                    str2 = A023.A0T.getModuleName();
                }
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A023.A0W, "ig_camera_clips_share_to_facebook_primer_impression"), 892);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    C18230wP.A1C(A023.A06, A0I);
                    C18240wQ.A13(D3Q.POST_CAPTURE, A0I);
                    A0I.A0O(D36.VIDEO, "media_type");
                    A0I.A0O(d2u, "media_source");
                    A0I.A0O(D3K.CLIPS, "capture_type");
                    A0I.A0T("camera_session_id", A023.A0K);
                    C18240wQ.A15(A0I, str2);
                    A0I.A0Q("is_crosspost", A0Y);
                    C18190wL.A1L(A0I);
                    A0I.A0Q("do_not_use_is_fb_connected", C18190wL.A0Z(A0I, ClientCookie.VERSION_ATTR, str3, A032));
                    A0I.Bb4();
                }
                AnonymousClass29W r2 = AnonymousClass29W.VIEW;
                UserSession A0X = AnonymousClass0wJ.A0X(r3);
                AnonymousClass3TG r03 = this.A04;
                if (r03 != null) {
                    A02(r2, A0X, r03);
                    UserSession A0X2 = AnonymousClass0wJ.A0X(r3);
                    AnonymousClass3TG r04 = this.A04;
                    if (r04 != null) {
                        C63423hS.A01(r04.A01, r04.A02, A0X2);
                        Object value = r3.getValue();
                        AnonymousClass3TG r05 = this.A04;
                        if (r05 != null) {
                            int i = r05.A00;
                            C04220Ms.A0B(value, 0);
                            AnonymousClass01V r22 = AnonymousClass01V.A0p;
                            C04220Ms.A06(r22);
                            r22.markerEnd(383649364, i, 2);
                            return;
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(-529128341);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C04530Oa r1 = this.A06;
        C10300i6 A0U = AnonymousClass0wJ.A0U(r1);
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
        this.A05 = C63803iN.A0E(r4, A0U, 36323835502927985L);
        String string = requireArguments.getString("ARG_MEDIA_SOURCE_TYPE");
        if (string != null) {
            C23949D2u valueOf = C23949D2u.valueOf(string);
            String string2 = requireArguments.getString("ARG_UPSELL_ENTRY_POINT");
            if (string2 != null) {
                AnonymousClass2AC valueOf2 = AnonymousClass2AC.valueOf(string2);
                String string3 = requireArguments.getString("ARG_UPSELL_VARIANT");
                if (string3 != null) {
                    this.A04 = new AnonymousClass3TG(valueOf2, AnonymousClass2AD.valueOf(string3), valueOf, requireArguments.getString("ARG_WATERFALL_ID"), requireArguments.getString("ARG_MODULE_NAME"), (String) null, requireArguments.getInt("ARG_NUX_ATTEMPT_QPL_INSTANCE_KEY"));
                    C10300i6 A0U2 = AnonymousClass0wJ.A0U(r1);
                    C04220Ms.A0B(A0U2, 0);
                    C312724y r0 = (C312724y) C312724y.A02.get(Long.valueOf(C63803iN.A03(r4, A0U2, 36599989014891913L)));
                    if (r0 == null) {
                        r0 = C312724y.UPSELL_DESIGN_VARIANT_1;
                    }
                    this.A00 = r0;
                    C14030oh.A09(136747579, A022);
                    return;
                }
                illegalStateException = C18180wK.A0a("Required value was null.");
                i = -877062833;
            } else {
                illegalStateException = C18180wK.A0a("Required value was null.");
                i = 1273695415;
            }
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 1873880389;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(910060484);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_share_to_fb_upsell_bottom_sheet, viewGroup, false);
        C14030oh.A09(182780355, A022);
        return inflate;
    }
}
