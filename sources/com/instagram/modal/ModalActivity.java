package com.instagram.modal;

import X.AnonymousClass099;
import X.AnonymousClass2B9;
import X.C10220hv;
import X.C10300i6;
import X.C12560m7;
import X.C18180wK;
import X.C18200wM;
import X.C18230wP;
import X.C25556Dns;
import X.C25582DoI;
import X.C25776Drp;
import X.C25786Drz;
import X.C37220Jmj;
import X.C37235Jn1;
import X.C37348Jpw;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.Constants;
import com.facebook.redex.IDxCListenerShape222S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.service.session.UserSession;
import java.util.Set;

public class ModalActivity extends BaseFragmentActivity {
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public View A00;
    public C10300i6 A01;
    public String A02;
    public final Set A03 = C18200wM.A0u();

    static {
        int[] iArr;
        int[] iArr2 = {0, 0, 0, 0};
        A06 = iArr2;
        boolean z = AnonymousClass2B9.A00;
        if (z) {
            iArr = new int[]{R.anim.fade_in, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.fade_out};
        } else {
            iArr = iArr2;
        }
        A04 = iArr;
        if (z) {
            iArr2 = new int[]{R.anim.fade_in, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.modal_empty_animation};
        }
        A05 = iArr2;
    }

    public boolean A0J() {
        return true;
    }

    private void A00(Bundle bundle, Fragment fragment, String str) {
        if (fragment != null) {
            C25786Drz A0Q = C18180wK.A0Q(this, this.A01);
            A0Q.A0A(bundle, fragment);
            if (str != null) {
                A0Q.A07 = str;
                C12560m7 supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.A0v(new IDxCListenerShape222S0200000_1_I2(1, (Object) supportFragmentManager, (Object) this));
            } else {
                A0Q.A0C = false;
            }
            A0Q.A05();
        }
    }

    public final C37348Jpw A08() {
        C10300i6 r0 = this.A01;
        if (r0 != null) {
            return C37348Jpw.A00(r0);
        }
        return null;
    }

    public final C37220Jmj getGnvGestureHandler() {
        if (!C25556Dns.A02(this.A01)) {
            return null;
        }
        C37220Jmj A002 = C37220Jmj.A00(this.A01);
        C37235Jn1 A003 = C37235Jn1.A00(this.A01);
        A002.A03(A003);
        A002.A02(A003);
        return A002;
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:179:0x05ab, code lost:
        X.C37383Jqm.A00(r7, r4, r1.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02f9, code lost:
        r12 = r3.getString("media_id");
        r1 = X.C19462Awj.A01(r2).A05(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0307, code lost:
        if (r1 != null) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0309, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x030a, code lost:
        r9 = r3.getString("url");
        r21 = r3.getString(X.I17.A00(106));
        r4 = X.C18230wP.A0y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x031f, code lost:
        r11 = r1.A2Z(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r6 = X.C18230wP.A0y();
        r6.put("url", r9);
        r4.put("in_app_browser", r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r7 = r22
            r0 = r23
            super.onPostCreate(r0)
            java.lang.String r1 = r7.A02
            java.lang.String r0 = "bottom_sheet"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x05b0
            X.3S7 r1 = X.AnonymousClass3S7.A01
            X.0i6 r2 = r7.A01
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r12 = "fragment_arguments"
            android.os.Bundle r3 = r0.getBundleExtra(r12)
            r3.getClass()
            java.lang.String r0 = "bottom_sheet_content_fragment"
            java.lang.String r8 = r3.getString(r0)
            if (r8 == 0) goto L_0x0574
            X.Jj9 r6 = X.C18210wN.A0L(r2)
            java.lang.String r10 = "bottom_sheet_title"
            java.lang.String r0 = r3.getString(r10)
            r6.A0O = r0
            java.lang.String r4 = "finish_host_activity_on_dismissed"
            r0 = 0
            boolean r4 = r3.getBoolean(r4, r0)
            r6.A0b = r4
            r16 = -1
            int r4 = r8.hashCode()
            r5 = 1
            switch(r4) {
                case -1219817557: goto L_0x0061;
                case -1056252145: goto L_0x006c;
                case -906172105: goto L_0x0077;
                case -859550963: goto L_0x0082;
                case -589943698: goto L_0x008d;
                case -409684267: goto L_0x0098;
                case 93832589: goto L_0x00a3;
                case 95317024: goto L_0x00ae;
                case 336903147: goto L_0x00b9;
                case 612094377: goto L_0x00c4;
                case 724050716: goto L_0x00d0;
                case 880031440: goto L_0x00dc;
                case 884871936: goto L_0x00e8;
                case 961040044: goto L_0x00f4;
                case 1061998152: goto L_0x0100;
                case 1082739744: goto L_0x010c;
                case 1128454515: goto L_0x0118;
                case 1199839646: goto L_0x0124;
                case 1558628473: goto L_0x0130;
                case 1682498069: goto L_0x013c;
                case 1757072946: goto L_0x0148;
                case 1761075538: goto L_0x0154;
                default: goto L_0x004b;
            }
        L_0x004b:
            java.lang.String r15 = "No valid bottom sheet content fragment specified"
            java.lang.String r4 = "ARG_MODULE_NAME"
            java.lang.String r8 = "ARG_WATERFALL_ID"
            java.lang.String r9 = "ARG_UPSELL_VARIANT"
            java.lang.String r11 = "ARG_UPSELL_ENTRY_POINT"
            java.lang.String r14 = "ARG_MEDIA_SOURCE_TYPE"
            java.lang.String r13 = "product"
            switch(r16) {
                case 0: goto L_0x0160;
                case 1: goto L_0x01a6;
                case 2: goto L_0x01c7;
                case 3: goto L_0x0256;
                case 4: goto L_0x0492;
                case 5: goto L_0x027b;
                case 6: goto L_0x027e;
                case 7: goto L_0x04c2;
                case 8: goto L_0x048e;
                case 9: goto L_0x04c7;
                case 10: goto L_0x02e4;
                case 11: goto L_0x04cc;
                case 12: goto L_0x04d6;
                case 13: goto L_0x02f7;
                case 14: goto L_0x04aa;
                case 15: goto L_0x037f;
                case 16: goto L_0x03ce;
                case 17: goto L_0x04fc;
                case 18: goto L_0x057b;
                case 19: goto L_0x0418;
                case 20: goto L_0x0501;
                case 21: goto L_0x045b;
                default: goto L_0x005c;
            }
        L_0x005c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r15)
            throw r0
        L_0x0061:
            java.lang.String r4 = "direct_wb_upsell_sheet"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 0
            goto L_0x004b
        L_0x006c:
            java.lang.String r4 = "NEW_REMIX_INTRODUCTION_NUX_MANAGER"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 1
            goto L_0x004b
        L_0x0077:
            java.lang.String r4 = "primer_bottom_sheet"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 2
            goto L_0x004b
        L_0x0082:
            java.lang.String r4 = "direct_share_reaction_upsell"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 3
            goto L_0x004b
        L_0x008d:
            java.lang.String r4 = "SEPARATE_SEQUENCE_INTRODUCTION_NUX"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 4
            goto L_0x004b
        L_0x0098:
            java.lang.String r4 = "start_website_report"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 5
            goto L_0x004b
        L_0x00a3:
            java.lang.String r4 = "bloks"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 6
            goto L_0x004b
        L_0x00ae:
            java.lang.String r4 = "direct_poll_message_details"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 7
            goto L_0x004b
        L_0x00b9:
            java.lang.String r4 = "crossposting_upsell_action_sheet"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 8
            goto L_0x004b
        L_0x00c4:
            java.lang.String r4 = "direct_share_sheet"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 9
            goto L_0x004b
        L_0x00d0:
            java.lang.String r4 = "value_picker"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 10
            goto L_0x004b
        L_0x00dc:
            java.lang.String r4 = "social_avatar_stickers_disclaimer"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 11
            goto L_0x004b
        L_0x00e8:
            java.lang.String r4 = "message_merchant"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 12
            goto L_0x004b
        L_0x00f4:
            java.lang.String r4 = "start_media_report"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 13
            goto L_0x004b
        L_0x0100:
            java.lang.String r4 = "direct_shared_stack_upsell"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 14
            goto L_0x004b
        L_0x010c:
            java.lang.String r4 = "crossposting_upsell_bottom_sheet"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 15
            goto L_0x004b
        L_0x0118:
            java.lang.String r4 = "link_history_opt_in_nux"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 16
            goto L_0x004b
        L_0x0124:
            java.lang.String r4 = "direct_interop_mini_upgrade_bottom_sheet"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 17
            goto L_0x004b
        L_0x0130:
            java.lang.String r4 = "dogfood_assistant"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 18
            goto L_0x004b
        L_0x013c:
            java.lang.String r4 = "shopping_product_multi_variant_picker"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 19
            goto L_0x004b
        L_0x0148:
            java.lang.String r4 = "direct_channels_gated_content_upsell"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 20
            goto L_0x004b
        L_0x0154:
            java.lang.String r4 = "reels_share_to_fb_upsell"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x004b
            r16 = 21
            goto L_0x004b
        L_0x0160:
            java.lang.String r9 = "DIRECT_WELL_BEING_UPSELL_BOTTOM_SHEET_DATA_KEY"
            android.os.Parcelable r8 = X.C18240wQ.A0D(r3, r9)
            com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData r8 = (com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData) r8
            X.C04220Ms.A0B(r8, r0)
            X.1Y4 r4 = new X.1Y4
            r4.<init>()
            android.os.Bundle r0 = X.C18180wK.A06()
            r0.putParcelable(r9, r8)
            r4.setArguments(r0)
            r6.A0b = r5
            java.lang.String r0 = r8.A02
            r6.A0R = r0
            r10 = 12
            com.facebook.redex.IDxCListenerShape15S0400000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape15S0400000_1_I2
            r9 = r0
            r11 = r7
            r12 = r2
            r13 = r1
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            r6.A0A = r0
            java.lang.String r0 = r8.A03
            r6.A0S = r0
            r3 = 46
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r0.<init>((int) r3, (java.lang.Object) r1, (java.lang.Object) r8, (java.lang.Object) r2)
            r6.A0B = r0
            X.Jqm r0 = r6.A00()
            r1.A00 = r0
            r0.A0J(r5, r5)
            goto L_0x05ab
        L_0x01a6:
            java.lang.String r4 = "KEY_IS_NEW_REMIX_VERSION"
            boolean r3 = r3.getBoolean(r4, r0)
            X.C04220Ms.A0B(r2, r0)
            android.os.Bundle r2 = X.AnonymousClass0wJ.A0E(r2)
            r2.putBoolean(r4, r3)
            X.1Xw r4 = new X.1Xw
            r4.<init>()
            r4.setArguments(r2)
            r6.A0d = r0
            r6.A0b = r5
            X.AnonymousClass3S7.A00(r6, r1)
            goto L_0x05ab
        L_0x01c7:
            java.lang.String r6 = X.C18190wL.A0j(r3, r14)
            X.D2u r12 = X.C23949D2u.valueOf(r6)
            java.lang.String r6 = X.C18190wL.A0j(r3, r11)
            X.2AC r10 = X.AnonymousClass2AC.valueOf(r6)
            java.lang.String r6 = X.C18190wL.A0j(r3, r9)
            X.2AD r11 = X.AnonymousClass2AD.valueOf(r6)
            java.lang.String r13 = r3.getString(r8)
            java.lang.String r14 = r3.getString(r4)
            r4 = 0
            X.3TG r9 = new X.3TG
            r15 = r4
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            android.content.Context r3 = r7.getApplicationContext()
            X.C04220Ms.A0B(r3, r0)
            X.C04220Ms.A0B(r2, r5)
            X.3Z9 r6 = X.C63783iL.A02(r3, r4, r2, r9)
            com.instagram.ui.primer.PrimerBottomSheetConfig r4 = r6.A05
            X.C04220Ms.A0B(r4, r5)
            android.os.Bundle r5 = X.AnonymousClass0wJ.A0E(r2)
            java.lang.String r3 = "arg_config"
            r5.putParcelable(r3, r4)
            X.1b2 r4 = new X.1b2
            r4.<init>()
            r4.setArguments(r5)
            r11 = 2
            com.facebook.redex.IDxCListenerShape5S0500000_1_I2 r3 = new com.facebook.redex.IDxCListenerShape5S0500000_1_I2
            r10 = r3
            r12 = r6
            r13 = r7
            r14 = r2
            r15 = r9
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r4.A01 = r3
            r11 = 3
            com.facebook.redex.IDxCListenerShape5S0500000_1_I2 r3 = new com.facebook.redex.IDxCListenerShape5S0500000_1_I2
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r4.A02 = r3
            java.lang.CharSequence r3 = r6.A06
            r4.A04 = r3
            X.C63783iL.A0B(r4, r2, r9)
            com.instagram.service.session.UserSession r2 = r6.A04
            X.Jj9 r3 = X.C18210wN.A0L(r2)
            boolean r2 = r6.A07
            r3.A0T = r2
            r3.A0U = r0
            boolean r0 = r6.A08
            r3.A0c = r0
            boolean r0 = r6.A09
            r3.A0a = r0
            X.Jqm r2 = r3.A00()
            r6.A03 = r2
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.igds.components.bottomsheet.BottomSheet"
            X.C04220Ms.A0C(r2, r0)
            r1.A00 = r2
            goto L_0x05ab
        L_0x0256:
            java.lang.String r4 = "REACTION_UPSELL_KEY_MEDIA_ID"
            java.lang.String r3 = r3.getString(r4)
            X.C04220Ms.A0B(r2, r0)
            android.os.Bundle r2 = X.AnonymousClass0wJ.A0E(r2)
            r2.putString(r4, r3)
            X.1dT r4 = new X.1dT
            r4.<init>()
            r4.setArguments(r2)
            r6.A0d = r0
            r6.A0b = r5
            r6.A0T = r5
            r6.A0J = r4
            X.AnonymousClass3S7.A00(r6, r1)
            goto L_0x05ab
        L_0x027b:
            X.Fg3 r13 = X.C29008Fg3.A0J
            goto L_0x02f9
        L_0x027e:
            java.lang.String r4 = "bloks_screen_config"
            android.os.Bundle r6 = r3.getBundle(r4)
            if (r6 == 0) goto L_0x02bf
            X.1cn r5 = new X.1cn
            r5.<init>()
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = com.instagram.bloks.hosting.IgBloksScreenConfig.A00(r6, r2)
            X.0i6 r4 = r2.A0C
            java.lang.String r3 = r2.A0S
            int r2 = r2.A00
            r14 = 50
            r9 = 0
            r10 = r9
            r11 = r5
            r12 = r3
            r13 = r9
            r15 = r2
            r16 = r0
            r8 = r4
            X.Jj9 r2 = X.M6q.A08(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.Jqm r2 = r2.A00()
            r5.A0C = r2
            r5.setArguments(r6)
            X.C37383Jqm.A00(r7, r5, r2)
        L_0x02b0:
            X.DrH r3 = X.C18220wO.A0b(r7)
            if (r3 == 0) goto L_0x05b0
            com.instagram.ui.bottomsheet.intf.IDxCListenerShape60S0200000_1_I2 r2 = new com.instagram.ui.bottomsheet.intf.IDxCListenerShape60S0200000_1_I2
            r2.<init>(r0, r7, r1)
            r3.A0A(r2)
            return
        L_0x02bf:
            java.lang.String r4 = "bloks_data"
            int r4 = r3.getInt(r4)
            X.49P r3 = X.AnonymousClass49P.A00(r2)
            java.lang.Object r5 = r3.A02(r4)
            X.7h3 r5 = (X.C127397h3) r5
            if (r5 == 0) goto L_0x05b0
            X.43X r4 = new X.43X
            r4.<init>(r5)
            r3 = 0
            X.7qT r8 = X.C130667qT.A00(r3, r7, r4, r2)
            r9 = r3
            r10 = r3
            r11 = r5
            r12 = r2
            r13 = r3
            X.M6q.A0A(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x02b0
        L_0x02e4:
            X.9PM r4 = new X.9PM
            r4.<init>()
            android.os.Bundle r0 = r3.getBundle(r12)
            r4.setArguments(r0)
            r6.A0I = r4
            X.AnonymousClass3S7.A00(r6, r1)
            goto L_0x05ab
        L_0x02f7:
            X.Fg3 r13 = X.C29008Fg3.A0U
        L_0x02f9:
            java.lang.String r1 = "media_id"
            java.lang.String r12 = r3.getString(r1)
            X.Awj r1 = X.C19462Awj.A01(r2)
            X.BKU r1 = r1.A05(r12)
            if (r1 != 0) goto L_0x031f
            r11 = 0
        L_0x030a:
            java.lang.String r8 = "url"
            java.lang.String r9 = r3.getString(r8)
            r1 = 106(0x6a, float:1.49E-43)
            java.lang.String r1 = X.I17.A00(r1)
            java.lang.String r21 = r3.getString(r1)
            org.json.JSONObject r4 = X.C18230wP.A0y()
            goto L_0x0324
        L_0x031f:
            com.instagram.user.model.User r11 = r1.A2Z(r2)
            goto L_0x030a
        L_0x0324:
            org.json.JSONObject r6 = X.C18230wP.A0y()     // Catch:{ JSONException -> 0x0330 }
            r6.put(r8, r9)     // Catch:{ JSONException -> 0x0330 }
            java.lang.String r1 = "in_app_browser"
            r4.put(r1, r6)     // Catch:{ JSONException -> 0x0330 }
        L_0x0330:
            java.lang.String r1 = "tracking"
            android.os.Bundle r1 = r3.getBundle(r1)
            X.753 r8 = new X.753
            r8.<init>(r1)
            X.43Y r6 = new X.43Y
            r6.<init>(r8)
            X.Fg3 r1 = X.C29008Fg3.A0U
            if (r13 != r1) goto L_0x037a
            r12.getClass()
        L_0x0347:
            X.Fg4 r18 = X.C29009Fg4.A0m
            X.Jmy r4 = new X.Jmy
            r14 = r4
            r15 = r7
            r16 = r6
            r17 = r2
            r19 = r13
            r20 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r1 = r3.getString(r10)
            X.C04220Ms.A0B(r1, r0)
            r4.A04 = r1
            r4.A01 = r11
            X.1z3 r0 = new X.1z3
            r16 = r0
            r17 = r6
            r18 = r8
            r19 = r2
            r20 = r9
            r16.<init>(r17, r18, r19, r20, r21)
            r4.A03 = r0
            r4.A08 = r5
            r4.A06()
            return
        L_0x037a:
            java.lang.String r12 = r4.toString()
            goto L_0x0347
        L_0x037f:
            java.lang.String r4 = "is_for_omni_format_xposters"
            boolean r5 = r3.getBoolean(r4, r0)
            boolean r4 = X.C63363hM.A05(r2)
            if (r4 != 0) goto L_0x03b4
            if (r5 != 0) goto L_0x03b4
            r5 = r2
            X.C04220Ms.A0B(r2, r0)
            X.0RG r0 = X.AnonymousClass0RA.A0C
            com.instagram.service.session.UserSession r0 = r0.A07(r3)
            if (r0 == 0) goto L_0x039a
            r5 = r0
        L_0x039a:
            X.1v5 r4 = new X.1v5
            r4.<init>(r3, r5)
            r4.setArguments(r3)
            X.1v4 r2 = X.C62753ae.A00(r2)
        L_0x03a6:
            r0 = r4
            X.BzM r0 = (X.C21735BzM) r0
            r6.A0I = r0
            r0 = 7
            X.C18250wR.A1A(r6, r2, r0)
            X.AnonymousClass3S7.A00(r6, r1)
            goto L_0x05ab
        L_0x03b4:
            r5 = r2
            X.C04220Ms.A0B(r2, r0)
            X.0RG r0 = X.AnonymousClass0RA.A0C
            com.instagram.service.session.UserSession r0 = r0.A07(r3)
            if (r0 == 0) goto L_0x03c1
            r5 = r0
        L_0x03c1:
            X.1v6 r4 = new X.1v6
            r4.<init>(r3, r5)
            r4.setArguments(r3)
            X.1v3 r2 = X.AnonymousClass3ZC.A00(r2)
            goto L_0x03a6
        L_0x03ce:
            java.lang.String r4 = "iab_session_id"
            java.lang.String r8 = r3.getString(r4)
            if (r8 == 0) goto L_0x05b0
            java.util.HashMap r10 = X.AnonymousClass0wJ.A0y()
            r10.put(r4, r8)
            X.0TJ r0 = X.C18250wR.A0D(r2, r0)
            r3 = 36322186235747571(0x810ad6000c1cf3, double:3.0336350609667196E-306)
            boolean r9 = X.C63803iN.A0E(r0, r2, r3)
            com.instagram.bloks.hosting.IgBloksScreenConfig r4 = X.C18190wL.A0N(r2)
            java.lang.String r3 = "com.bloks.www.bloks.link_history.nux.opt_in_screen"
            r4.A0Q = r3
            if (r9 == 0) goto L_0x03fb
            com.instagram.modal.fragmentfactory.impl.ModalBottomSheetFactoryImpl$3 r0 = new com.instagram.modal.fragmentfactory.impl.ModalBottomSheetFactoryImpl$3
            r0.<init>(r1, r2)
            r4.A06 = r0
        L_0x03fb:
            X.3iE r0 = X.C63743iE.A02(r3, r10)
            X.1cn r4 = X.C62853b1.A01(r4, r0)
            java.lang.String r0 = "in_app_browser_v2"
            X.JiE r3 = new X.JiE
            r3.<init>(r2, r8, r0, r5)
            r6.A0T = r5
            X.KWa r0 = new X.KWa
            r0.<init>(r3, r1, r2, r9)
            r6.A0J = r0
            X.AnonymousClass3S7.A00(r6, r1)
            goto L_0x05ab
        L_0x0418:
            android.os.Parcelable r4 = r3.getParcelable(r13)
            com.instagram.model.shopping.Product r4 = (com.instagram.model.shopping.Product) r4
            java.lang.String r0 = "product_group"
            android.os.Parcelable r9 = r3.getParcelable(r0)
            com.instagram.model.shopping.ProductGroup r9 = (com.instagram.model.shopping.ProductGroup) r9
            X.AnonymousClass3S7.A00(r6, r1)
            X.AyA r8 = new X.AyA
            r8.<init>(r7, r2, r5)
            X.Jqm r6 = r1.A00
            X.AeD r0 = new X.AeD
            r0.<init>(r4)
            X.AX7 r4 = new X.AX7
            r4.<init>(r0)
            if (r9 == 0) goto L_0x0450
            X.3Av r3 = r8.A05
            r3.A00 = r9
            java.util.List r2 = r9.A00()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r2)
            r3.A01 = r0
            java.util.Map r0 = r3.A02
            r0.clear()
        L_0x0450:
            r8.A02 = r5
            r8.A00 = r6
            r0 = 0
            androidx.fragment.app.Fragment r4 = X.C19549AyA.A00(r0, r4, r8)
            goto L_0x05ab
        L_0x045b:
            java.lang.String r2 = X.C18190wL.A0j(r3, r14)
            X.D2u r12 = X.C23949D2u.valueOf(r2)
            java.lang.String r2 = X.C18190wL.A0j(r3, r11)
            X.2AC r10 = X.AnonymousClass2AC.valueOf(r2)
            java.lang.String r2 = X.C18190wL.A0j(r3, r9)
            X.2AD r11 = X.AnonymousClass2AD.valueOf(r2)
            java.lang.String r13 = r3.getString(r8)
            java.lang.String r14 = r3.getString(r4)
            r15 = 0
            X.3TG r9 = new X.3TG
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            X.1Yy r4 = X.C49372rH.A00(r9)
            r6.A0d = r0
            X.AnonymousClass3S7.A00(r6, r1)
            goto L_0x05ab
        L_0x048e:
            X.AnonymousClass3ZC.A00(r2)
            return
        L_0x0492:
            X.C04220Ms.A0B(r2, r0)
            android.os.Bundle r2 = X.AnonymousClass0wJ.A0E(r2)
            X.1Xx r4 = new X.1Xx
            r4.<init>()
            r4.setArguments(r2)
            r6.A0d = r0
            r6.A0b = r5
            X.AnonymousClass3S7.A00(r6, r1)
            goto L_0x05ab
        L_0x04aa:
            X.C04220Ms.A0B(r2, r0)
            android.os.Bundle r2 = X.AnonymousClass0wJ.A0E(r2)
            X.1Xz r4 = new X.1Xz
            r4.<init>()
            r4.setArguments(r2)
            r6.A0d = r0
            r6.A0b = r5
            X.AnonymousClass3S7.A00(r6, r1)
            goto L_0x05ab
        L_0x04c2:
            java.lang.NullPointerException r0 = X.C18200wM.A0d()
            throw r0
        L_0x04c7:
            java.lang.NullPointerException r0 = X.C18200wM.A0d()
            throw r0
        L_0x04cc:
            java.lang.String r0 = "sticker_preview_url"
            r3.getString(r0)
            java.lang.NullPointerException r0 = X.C18200wM.A0d()
            throw r0
        L_0x04d6:
            java.lang.String r0 = "DirectGenericInterstitialReplyModalFragment.product"
            android.os.Parcelable r0 = r3.getParcelable(r0)
            com.instagram.model.shopping.Product r0 = (com.instagram.model.shopping.Product) r0
            com.instagram.model.shopping.ProductDetailsProductItemDict r0 = r0.A00
            com.instagram.model.shopping.Merchant r3 = r0.A0C
            if (r3 == 0) goto L_0x04fa
            java.lang.String r2 = r3.A06
        L_0x04e6:
            java.lang.String r0 = r3.A08
            com.instagram.user.model.User r1 = new com.instagram.user.model.User
            r1.<init>(r2, r0)
            com.instagram.common.typedurl.ImageUrl r0 = r3.A02
            r0.getClass()
            r1.A1z(r0)
            java.lang.NullPointerException r0 = X.C18200wM.A0d()
            throw r0
        L_0x04fa:
            r2 = 0
            goto L_0x04e6
        L_0x04fc:
            java.lang.NullPointerException r0 = X.C18200wM.A0d()
            throw r0
        L_0x0501:
            java.lang.String r4 = "channel_thread_key"
            java.lang.String r4 = r3.getString(r4)
            X.C04220Ms.A0B(r2, r0)
            X.C04220Ms.A0B(r4, r5)
            X.H8D r3 = X.C60883Qx.A00(r2)
            X.C04220Ms.A06(r3)
            X.HEL r4 = X.H8D.A01(r3, r4)
            if (r4 == 0) goto L_0x056f
            java.lang.String r10 = r4.BGL()
            java.lang.String r9 = r4.BGS()
            monitor-enter(r4)
            X.GDN r3 = r4.A0g     // Catch:{ all -> 0x056c }
            if (r3 == 0) goto L_0x052a
            int r8 = r3.A00     // Catch:{ all -> 0x056c }
            goto L_0x052b
        L_0x052a:
            r8 = 0
        L_0x052b:
            monitor-exit(r4)
            X.1of r4 = new X.1of
            r4.<init>()
            android.os.Bundle r3 = X.AnonymousClass0wJ.A0E(r2)
            java.lang.String r2 = "thread_id"
            r3.putString(r2, r10)
            java.lang.String r2 = "thread_v2_id"
            r3.putString(r2, r9)
            java.lang.String r2 = "audience_type"
            r3.putInt(r2, r8)
            r4.setArguments(r3)
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            r6.A00 = r2
            r6.A0e = r5
            r6.A0Y = r5
            r6.A0V = r5
            X.C18250wR.A1B(r6, r0)
            boolean r2 = X.C31156GhE.A06()
            if (r2 == 0) goto L_0x056a
            int r3 = X.C31156GhE.A00()
        L_0x055f:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r0, r0, r0, r3)
            r6.A09 = r2
            X.AnonymousClass3S7.A00(r6, r1)
            goto L_0x05ab
        L_0x056a:
            r3 = 0
            goto L_0x055f
        L_0x056c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x056f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0574:
            java.lang.String r0 = "No bottom sheet content fragment specified"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x057b:
            java.lang.String r2 = "dogfooding_assistant_surface"
            java.lang.String r4 = r3.getString(r2)
            com.instagram.dogfoodingassistant.impl.DogfoodingAssistantPluginImpl r2 = com.instagram.dogfoodingassistant.impl.DogfoodingAssistantPluginImpl.A00
            if (r2 == 0) goto L_0x05b0
            if (r4 == 0) goto L_0x05b0
            java.lang.String r2 = "product_detail"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x05b1
            java.lang.String r2 = "discovery"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x05cc
            X.1xg r4 = new X.1xg
            r4.<init>()
        L_0x059c:
            r6.A0d = r0
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r6.A00 = r0
            r0 = r4
            X.BzM r0 = (X.C21735BzM) r0
            r6.A0I = r0
            X.AnonymousClass3S7.A00(r6, r1)
        L_0x05ab:
            X.Jqm r0 = r1.A00
            X.C37383Jqm.A00(r7, r4, r0)
        L_0x05b0:
            return
        L_0x05b1:
            java.lang.String r5 = "dogfooding_assistant_url"
            java.lang.String r3 = r3.getString(r5)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            X.1dH r4 = new X.1dH
            r4.<init>()
            android.os.Bundle r2 = X.C18180wK.A06()
            r2.putString(r5, r3)
            r4.setArguments(r2)
            goto L_0x059c
        L_0x05cc:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.modal.ModalActivity.onPostCreate(android.os.Bundle):void");
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        this.A03.add(Integer.valueOf(i));
        super.startActivityForResult(intent, i, bundle);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.A03.add(Integer.valueOf(i));
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void A0D(Bundle bundle) {
        if (C18230wP.A0I(this) != null) {
            return;
        }
        if (getIntent().getStringExtra("fragment_name") == null) {
            finish();
            return;
        }
        String stringExtra = getIntent().getStringExtra("fragment_name");
        String stringExtra2 = getIntent().getStringExtra("initial_fragment_backstack_name");
        if ("bottom_sheet".equals(stringExtra)) {
            this.A02 = stringExtra;
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS);
        bundleExtra.getClass();
        bundleExtra.putAll(C18180wK.A06());
        Fragment A002 = C25582DoI.A00(bundleExtra, this, this.A01, stringExtra);
        if (A002 == null) {
            return;
        }
        if (A002 instanceof AnonymousClass099) {
            ((AnonymousClass099) A002).A0A(getSupportFragmentManager(), "dialog_fragment");
        } else {
            A00(bundleExtra, A002, stringExtra2);
        }
    }

    public void A0I(Intent intent) {
        if ((intent.getComponent() == null || !intent.getComponent().getShortClassName().equals("com.instagram.modal.TransparentOutOfAppPictureInPictureModalActivity") || !C25776Drp.A03((UserSession) this.A01) || (intent.getFlags() & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 131072) && (intent.getFlags() & 268435456) == 268435456) {
            String stringExtra = intent.getStringExtra("fragment_name");
            stringExtra.getClass();
            Bundle bundleExtra = intent.getBundleExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS);
            bundleExtra.getClass();
            A00(bundleExtra, C25582DoI.A00(bundleExtra, this, this.A01, stringExtra), intent.getStringExtra("initial_fragment_backstack_name"));
        }
    }

    public void finish() {
        super.finish();
        C18200wM.A11(this, getIntent(), "fragment_animation");
    }

    public final void finishAndRemoveTask() {
        super.finishAndRemoveTask();
        C18200wM.A11(this, getIntent(), "fragment_animation");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Fragment A0I;
        super.onActivityResult(i, i2, intent);
        if (this.A03.remove(Integer.valueOf(i)) && (A0I = C18230wP.A0I(this)) != null) {
            A0I.onActivityResult(i, i2, intent);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        if (A0J()) {
            C10220hv.A00(this, configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r0 = 974291974(0x3a128406, float:5.589131E-4)
            int r3 = X.C14030oh.A00(r0)
            r8 = r14
            X.0i6 r0 = X.C18200wM.A0W(r14)
            r14.A01 = r0
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "fragment_animation"
            int[] r2 = r1.getIntArrayExtra(r0)
            if (r2 == 0) goto L_0x002b
            int r1 = r2.length
            r0 = 4
            if (r1 != r0) goto L_0x002b
        L_0x001e:
            android.content.Intent r4 = r14.getIntent()
            java.lang.String r1 = "fragment_arguments"
            android.os.Bundle r0 = r4.getBundleExtra(r1)
            if (r0 == 0) goto L_0x0053
            goto L_0x002d
        L_0x002b:
            r2 = 0
            goto L_0x001e
        L_0x002d:
            android.os.Bundle r1 = r4.getBundleExtra(r1)     // Catch:{ RuntimeException -> 0x004b }
            java.lang.String r0 = "DirectFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_CREATE_BACKSTACK"
            boolean r0 = r1.getBoolean(r0)     // Catch:{ RuntimeException -> 0x004b }
            if (r0 == 0) goto L_0x0053
            boolean r0 = r14.isTaskRoot()
            if (r0 != 0) goto L_0x0053
            X.KJ8 r4 = X.KJ8.A0G
            android.content.Intent r1 = r14.getIntent()
            X.0i6 r0 = r14.A01
            r4.A0F(r14, r1, r0)
            goto L_0x0080
        L_0x004b:
            r4 = move-exception
            java.lang.String r1 = "ModalActivity"
            java.lang.String r0 = "Swallowing RuntimeException related to unmarshalling"
            X.AnonymousClass0LU.A0E(r1, r0, r4)
        L_0x0053:
            X.KJ8 r10 = X.KJ8.A0G
            X.0i6 r5 = r14.A01
            if (r5 == 0) goto L_0x0080
            boolean r0 = r5 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x0080
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 36326150489908671(0x810e71000225bf, double:3.0361420712609695E-306)
            boolean r0 = X.C63803iN.A0E(r4, r5, r0)
            if (r0 == 0) goto L_0x0127
            java.lang.Boolean r0 = X.C691847d.A03
            boolean r0 = X.C18210wN.A1T(r0)
        L_0x0070:
            if (r0 == 0) goto L_0x0080
            java.lang.Integer r11 = X.AnonymousClass006.A01
            r12 = -1
            android.os.MessageQueue r9 = android.os.Looper.myQueue()
            X.C04220Ms.A06(r9)
            X.KJ8.A01(r8, r9, r10, r11, r12)
        L_0x0080:
            super.onCreate(r15)
            android.content.Intent r6 = r14.getIntent()
            java.lang.String r0 = "translucent_navigation_bar"
            r5 = 0
            boolean r1 = r6.getBooleanExtra(r0, r5)
            java.lang.String r0 = "will_hide_system_ui"
            boolean r0 = r6.getBooleanExtra(r0, r5)
            r4 = 1
            if (r1 == 0) goto L_0x00ec
            android.view.Window r1 = r14.getWindow()
            r1.getClass()
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1.addFlags(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r0)
        L_0x00a8:
            java.lang.String r1 = "status_bar_color"
            boolean r0 = r6.hasExtra(r1)
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 == 0) goto L_0x00c0
            int r1 = r6.getIntExtra(r1, r7)
            android.view.Window r0 = r14.getWindow()
            r0.getClass()
            r0.setStatusBarColor(r1)
        L_0x00c0:
            boolean r0 = X.C30975Gcb.A03()
            r0 = r0 ^ 1
            X.C31164GhX.A05(r14, r0)
            java.lang.String r1 = "navigation_bar_color"
            boolean r0 = r6.hasExtra(r1)
            if (r0 == 0) goto L_0x00e8
            int r0 = r6.getIntExtra(r1, r7)
            X.AnonymousClass7IE.A03(r14, r0)
        L_0x00d8:
            if (r2 == 0) goto L_0x00e1
            r1 = r2[r5]
            r0 = r2[r4]
            r14.overridePendingTransition(r1, r0)
        L_0x00e1:
            r0 = 23611305(0x16847a9, float:4.2663084E-38)
            X.C14030oh.A07(r0, r3)
            return
        L_0x00e8:
            X.AnonymousClass7IE.A01(r14)
            goto L_0x00d8
        L_0x00ec:
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "will_fit_system_windows"
            boolean r1 = r6.getBooleanExtra(r0, r4)
            r0 = 2131302404(0x7f091804, float:1.8222893E38)
            android.view.View r0 = r14.findViewById(r0)
            r14.A00 = r0
            if (r0 == 0) goto L_0x0102
            r0.setFitsSystemWindows(r1)
        L_0x0102:
            if (r1 != 0) goto L_0x010c
            X.4Ma r0 = new X.4Ma
            r0.<init>(r14)
            X.C31156GhE.A04(r14, r0)
        L_0x010c:
            r1 = 1280(0x500, float:1.794E-42)
            java.lang.String r0 = "will_hide_navigation_bar"
            boolean r0 = r6.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x0118
            r1 = 1792(0x700, float:2.511E-42)
        L_0x0118:
            android.view.Window r0 = r14.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            r0.setSystemUiVisibility(r1)
            goto L_0x00a8
        L_0x0127:
            boolean r0 = X.C691847d.A05()
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.modal.ModalActivity.onCreate(android.os.Bundle):void");
    }
}
