package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass1YC;
import X.AnonymousClass1l3;
import X.AnonymousClass3HX;
import X.AnonymousClass48N;
import X.AnonymousClass4JW;
import X.AnonymousClass4JX;
import X.C109326jp;
import X.C127397h3;
import X.C14030oh;
import X.C202313q;
import X.C24571jc;
import X.C28291u0;
import X.C34238I9r;
import X.C84844tx;
import X.CUH;
import X.KJT;
import X.L2B;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.fragment.AccountTypeSelectionV2Fragment;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.user.model.User;

public class IDxCListenerShape41S0300000_1_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape41S0300000_1_I2(C84844tx r1, C28291u0 r2, AnonymousClass4JW r3, int i) {
        this.A03 = i;
        this.A00 = r3;
        if (52 - i != 0) {
            this.A02 = r1;
            this.A01 = r2;
        } else {
            this.A01 = r2;
            this.A02 = r1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: X.3XV} */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0a11, code lost:
        X.C14030oh.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0a14, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0cb7, code lost:
        r0 = 836908906;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0d61, code lost:
        r0.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0da9, code lost:
        r0.A0I(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0dc9, code lost:
        r0 = X.C18180wK.A06();
        r2 = r6.A01;
        r1 = X.C63863iT.A03(r2, r0, r6.A04, com.instagram.modal.TransparentModalActivity.class, r7);
        r0 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0dd9, code lost:
        if (r0 == null) goto L_0x0de0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0ddb, code lost:
        r1.A0J(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0de0, code lost:
        r1.A0H(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x1297, code lost:
        if (r2 == 0) goto L_0x1299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        X.C14030oh.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x13cf, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x1446, code lost:
        X.C14030oh.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x1449, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x14e7, code lost:
        X.C14030oh.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x14ea, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x15c9, code lost:
        X.C60113Ns.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x15cd, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019b, code lost:
        if ("native".equals(X.C15430rJ.A01(r2).getHost()) != false) goto L_0x019d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0f3c A[LOOP:2: B:286:0x0f07->B:296:0x0f3c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0f38 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.A03
            switch(r1) {
                case 0: goto L_0x0529;
                case 1: goto L_0x0535;
                case 2: goto L_0x0541;
                case 3: goto L_0x054d;
                case 4: goto L_0x0559;
                case 5: goto L_0x0565;
                case 6: goto L_0x0589;
                case 7: goto L_0x05f5;
                case 8: goto L_0x061d;
                case 9: goto L_0x063f;
                case 10: goto L_0x069d;
                case 11: goto L_0x06ca;
                case 12: goto L_0x06f7;
                case 13: goto L_0x071b;
                case 14: goto L_0x073e;
                case 15: goto L_0x0784;
                case 16: goto L_0x079f;
                case 17: goto L_0x07ba;
                case 18: goto L_0x07f1;
                case 19: goto L_0x0819;
                case 20: goto L_0x0845;
                case 21: goto L_0x0865;
                case 22: goto L_0x0891;
                case 23: goto L_0x08b1;
                case 24: goto L_0x08d0;
                case 25: goto L_0x08ed;
                case 26: goto L_0x090a;
                case 27: goto L_0x092d;
                case 28: goto L_0x0948;
                case 29: goto L_0x0963;
                case 30: goto L_0x09ce;
                case 31: goto L_0x0a15;
                case 32: goto L_0x0a52;
                case 33: goto L_0x0a76;
                case 34: goto L_0x0a97;
                case 35: goto L_0x0aae;
                case 36: goto L_0x0acc;
                case 37: goto L_0x0b3d;
                case 38: goto L_0x0c45;
                case 39: goto L_0x0c90;
                case 40: goto L_0x0df6;
                case 41: goto L_0x0e36;
                case 42: goto L_0x0e61;
                case 43: goto L_0x1529;
                case 44: goto L_0x0e80;
                case 45: goto L_0x0ef6;
                case 46: goto L_0x0036;
                case 47: goto L_0x0051;
                case 48: goto L_0x0fef;
                case 49: goto L_0x102e;
                case 50: goto L_0x0221;
                case 51: goto L_0x10b3;
                case 52: goto L_0x1119;
                case 53: goto L_0x0290;
                case 54: goto L_0x02aa;
                case 55: goto L_0x114b;
                case 56: goto L_0x1557;
                case 57: goto L_0x02c4;
                case 58: goto L_0x0035;
                case 59: goto L_0x1180;
                case 60: goto L_0x1218;
                case 61: goto L_0x126d;
                case 62: goto L_0x03c3;
                case 63: goto L_0x03e6;
                case 64: goto L_0x0423;
                case 65: goto L_0x12ca;
                case 66: goto L_0x12f0;
                case 67: goto L_0x1300;
                case 68: goto L_0x1331;
                case 69: goto L_0x1367;
                case 70: goto L_0x139d;
                case 71: goto L_0x0460;
                case 72: goto L_0x046c;
                case 73: goto L_0x0478;
                case 74: goto L_0x144c;
                case 75: goto L_0x147e;
                case 76: goto L_0x04a6;
                case 77: goto L_0x14b0;
                case 78: goto L_0x1565;
                case 79: goto L_0x14eb;
                case 80: goto L_0x158a;
                case 81: goto L_0x1525;
                case 82: goto L_0x04c3;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = -1925890958(0xffffffff8d353c72, float:-5.584769E-31)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A02
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            r1 = 0
            X.C04220Ms.A0B(r2, r1)
            java.lang.Integer r1 = X.AnonymousClass006.A0U
            X.C63583hq.A01(r2, r1)
            java.lang.Object r1 = r0.A00
            X.Jj9 r1 = (X.C37032Jj9) r1
            X.Jqm r2 = r1.A00()
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            X.1wD r0 = new X.1wD
            r0.<init>()
            X.C37383Jqm.A00(r1, r0, r2)
            r0 = 903884355(0x35e02e43, float:1.6702764E-6)
        L_0x0032:
            X.C14030oh.A0C(r0, r3)
        L_0x0035:
            return
        L_0x0036:
            java.lang.Object r3 = r0.A00
            X.3S7 r3 = (X.AnonymousClass3S7) r3
            java.lang.Object r2 = r0.A01
            com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData r2 = (com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData) r2
            java.lang.Object r1 = r0.A02
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0035
            X.Jqm r0 = r3.A00
            r0.A06()
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            X.C35452Nm.A00(r1, r0)
            return
        L_0x0051:
            java.lang.Object r2 = r0.A00
            X.1gn r2 = (X.C24041gn) r2
            java.lang.Object r1 = r0.A01
            java.lang.Object r3 = r0.A02
            X.4t0 r3 = (X.C84354t0) r3
            X.1k1 r5 = r2.A00
            X.25W r0 = X.AnonymousClass25W.A01
            r12 = 0
            if (r1 != r0) goto L_0x01e8
            X.2AP r4 = X.AnonymousClass2AP.A09
            java.lang.String r0 = "for ads manager sticky notification, this should not be null"
            X.AnonymousClass7Ko.A07(r3, r0)
            r0 = r3
            X.ELY r0 = (X.ELY) r0
            X.3Ba r6 = r0.A03
            if (r6 == 0) goto L_0x01d1
            java.lang.String r2 = r6.A03
            java.lang.String r10 = "type"
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0118
            android.net.Uri r7 = X.C15430rJ.A01(r2)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            java.lang.String r1 = r7.getScheme()     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            java.lang.String r0 = "ig"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            if (r0 != 0) goto L_0x0094
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            if (r0 != 0) goto L_0x0094
            goto L_0x0118
        L_0x0094:
            java.lang.String r1 = "native"
            java.lang.String r0 = r7.getHost()     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            boolean r0 = r1.equals(r0)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "screen"
            java.lang.String r1 = r7.getQueryParameter(r0)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            if (r0 != 0) goto L_0x0118
            java.util.Set r0 = X.AnonymousClass3XV.A01     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            boolean r0 = r0.contains(r1)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "params"
            java.lang.String r1 = r7.getQueryParameter(r0)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = "utf-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r0)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            if (r0 != 0) goto L_0x0118
            org.json.JSONObject r9 = X.C18250wR.A0j(r1)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            java.util.HashMap r8 = X.AnonymousClass0wJ.A0y()     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            java.util.Iterator r7 = r9.keys()     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
        L_0x00d8:
            boolean r0 = r7.hasNext()     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            if (r0 == 0) goto L_0x00ee
            java.lang.String r1 = X.C18180wK.A0k(r7)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            java.lang.Object r0 = r9.get(r1)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            r8.put(r1, r0)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            goto L_0x00d8
        L_0x00ee:
            boolean r0 = r8.containsKey(r10)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = X.C18220wO.A0r(r10, r8)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            java.lang.Integer r1 = X.AnonymousClass3XV.A00(r0)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            X.3XV r0 = new X.3XV     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException | SecurityException | JSONException -> 0x0102 }
            goto L_0x0117
        L_0x0102:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0118
            java.lang.String r1 = r1.getMessage()
            java.lang.String r0 = "PromoteErrorNativeUri"
            X.C10450iM.A03(r0, r1)
            goto L_0x0118
        L_0x0117:
            r12 = r0
        L_0x0118:
            com.instagram.service.session.UserSession r10 = r5.A04
            X.Jjm r1 = X.C34462Jq.A00(r10)
            if (r12 == 0) goto L_0x01a0
            java.lang.Integer r0 = r12.A00
        L_0x0122:
            java.lang.String r8 = X.AnonymousClass2RT.A00(r0)
            java.lang.String r9 = "sticky_activity_feed_notification"
            r0 = 1
            X.C04220Ms.A0B(r8, r0)
            X.0nS r1 = r1.A00
            java.lang.String r0 = "payments_tap_component"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2487(0x9b7, float:3.485E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r7 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "component"
            r7.A0T(r0, r9)
            java.lang.String r0 = "error_identifier"
            r7.A0T(r0, r8)
            X.14P r1 = new X.14P
            r1.<init>()
            java.lang.String r0 = "landing_url"
            r1.A0A(r0, r2)
            java.lang.String r0 = "configurations"
            r7.A0P(r1, r0)
            r7.Bb4()
            if (r12 == 0) goto L_0x0181
            java.lang.Integer r1 = r12.A00
        L_0x015a:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 == r0) goto L_0x01a3
            java.lang.Integer r0 = X.AnonymousClass006.A0u
            if (r1 == r0) goto L_0x01a3
            X.JY1 r2 = X.C62883b4.A02()
            java.lang.String r1 = X.AnonymousClass2RT.A00(r1)
            java.util.Map r0 = com.instagram.api.schemas.ErrorIdentifier.A01
            java.lang.Object r0 = r0.get(r1)
            com.instagram.api.schemas.ErrorIdentifier r0 = (com.instagram.api.schemas.ErrorIdentifier) r0
            if (r0 != 0) goto L_0x0176
            com.instagram.api.schemas.ErrorIdentifier r0 = com.instagram.api.schemas.ErrorIdentifier.UNRECOGNIZED
        L_0x0176:
            androidx.fragment.app.Fragment r1 = r2.A01(r0, r10)
            androidx.fragment.app.FragmentActivity r0 = r5.A01
            X.AnonymousClass0wJ.A19(r1, r0, r10)
            goto L_0x0208
        L_0x0181:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x019d
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x01bf
            android.net.Uri r0 = X.C15430rJ.A01(r2)     // Catch:{ SecurityException -> 0x01ab }
            java.lang.String r1 = "native"
            java.lang.String r0 = r0.getHost()     // Catch:{ SecurityException -> 0x01ab }
            boolean r0 = r1.equals(r0)     // Catch:{ SecurityException -> 0x01ab }
            if (r0 == 0) goto L_0x01bf
        L_0x019d:
            java.lang.Integer r1 = r6.A00
            goto L_0x015a
        L_0x01a0:
            java.lang.Integer r0 = r6.A00
            goto L_0x0122
        L_0x01a3:
            androidx.fragment.app.FragmentActivity r1 = r5.A01
            java.lang.String r0 = "instagram_sticky_notif"
            X.AnonymousClass2KP.A00(r1, r10, r0)
            goto L_0x0208
        L_0x01ab:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01bf
            java.lang.String r1 = r1.getMessage()
            java.lang.String r0 = "PromoteErrorNativeUri"
            X.C10450iM.A03(r0, r1)
        L_0x01bf:
            X.3Yi r6 = X.C62333Yi.A01()
            androidx.fragment.app.FragmentActivity r1 = r5.A01
            android.net.Uri r0 = X.C15430rJ.A01(r2)
            android.content.Intent r0 = r6.A04(r1, r0)
            X.C10650ih.A02(r1, r0)
            goto L_0x0208
        L_0x01d1:
            X.DVZ r0 = r3.AaC()
            if (r0 == 0) goto L_0x01d9
            java.lang.String r12 = r0.A03
        L_0x01d9:
            X.3GV r8 = X.C34552Jz.A00()
            androidx.fragment.app.FragmentActivity r9 = r5.A01
            com.instagram.service.session.UserSession r10 = r5.A04
            r13 = 0
            java.lang.String r11 = "activity_feed"
            r8.A01(r9, r10, r11, r12, r13)
            goto L_0x0208
        L_0x01e8:
            X.25W r0 = X.AnonymousClass25W.A02
            if (r1 != r0) goto L_0x0035
            X.2AP r4 = X.AnonymousClass2AP.A09
            android.os.Bundle r2 = X.C18180wK.A06()
            com.instagram.service.session.UserSession r10 = r5.A04
            X.C05050Qq.A00(r2, r10)
            androidx.fragment.app.FragmentActivity r0 = r5.A01
            X.Drz r1 = X.C18180wK.A0Q(r0, r10)
            X.C24016D5r.A00()
            X.CUW r0 = new X.CUW
            r0.<init>()
            X.C18180wK.A0x(r2, r0, r1)
        L_0x0208:
            if (r3 == 0) goto L_0x021f
            int r0 = r3.B10()
        L_0x020e:
            X.44a r3 = X.AnonymousClass3NS.A00(r10)
            X.17J r2 = new X.17J
            r2.<init>(r4, r0)
            X.25R r1 = X.AnonymousClass25R.ACTIVITY_FEED
            X.25P r0 = X.AnonymousClass25P.LIST_ITEM
            r3.A01(r0, r1, r2)
            return
        L_0x021f:
            r0 = 0
            goto L_0x020e
        L_0x0221:
            r1 = -82611097(0xfffffffffb137467, float:-7.6562856E35)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.254 r2 = (X.AnonymousClass254) r2
            int r1 = r2.ordinal()
            java.lang.String r4 = "contact_sheet"
            switch(r1) {
                case 0: goto L_0x0276;
                case 1: goto L_0x026a;
                case 2: goto L_0x0254;
                case 3: goto L_0x028b;
                case 4: goto L_0x028b;
                case 5: goto L_0x0235;
                case 6: goto L_0x0235;
                case 7: goto L_0x0235;
                case 8: goto L_0x0235;
                case 9: goto L_0x0235;
                case 10: goto L_0x0235;
                case 11: goto L_0x024a;
                case 12: goto L_0x028b;
                default: goto L_0x0235;
            }
        L_0x0235:
            java.lang.String r1 = "Unsupported action for Contact Option "
            java.lang.String r0 = r2.name()
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.IllegalArgumentException r7 = X.C18190wL.A0a(r0)
            r0 = -4930925(0xffffffffffb4c293, float:NaN)
            X.C14030oh.A0C(r0, r3)
            throw r7
        L_0x024a:
            java.lang.Object r1 = r0.A01
            X.4qO r1 = (X.C82864qO) r1
            java.lang.String r0 = "message_button"
            r1.C7L(r0)
            goto L_0x028b
        L_0x0254:
            java.lang.Object r2 = r0.A02
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r1 = r2.A1C()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.Object r0 = r0.A01
            X.4vu r0 = (X.C85874vu) r0
            if (r1 != 0) goto L_0x028b
            r0.BnJ(r2, r4)
            goto L_0x028b
        L_0x026a:
            java.lang.Object r1 = r0.A01
            X.4vu r1 = (X.C85874vu) r1
            java.lang.Object r0 = r0.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.BnL(r0, r4)
            goto L_0x028b
        L_0x0276:
            java.lang.Object r2 = r0.A02
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r1 = r2.A0z()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.Object r0 = r0.A01
            X.4vu r0 = (X.C85874vu) r0
            if (r1 != 0) goto L_0x028b
            r0.BnK(r2, r4)
        L_0x028b:
            r0 = 708727512(0x2a3e52d8, float:1.6904132E-13)
            goto L_0x0032
        L_0x0290:
            r1 = 886148238(0x34d18c8e, float:3.903155E-7)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A02
            X.4tx r4 = (X.C84844tx) r4
            java.lang.Object r2 = r0.A01
            X.1u0 r2 = (X.C28291u0) r2
            java.lang.Integer r1 = X.AnonymousClass006.A01
            r0 = 0
            r4.CE9(r2, r1, r0)
            r0 = 1742658767(0x67dedccf, float:2.1048771E24)
            goto L_0x0032
        L_0x02aa:
            r1 = 147175904(0x8c5b9e0, float:1.1900205E-33)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.4tx r4 = (X.C84844tx) r4
            java.lang.Object r2 = r0.A02
            X.1u0 r2 = (X.C28291u0) r2
            java.lang.Integer r1 = X.AnonymousClass006.A01
            r0 = 0
            r4.CE9(r2, r1, r0)
            r0 = 2015390771(0x78206c33, float:1.3015032E34)
            goto L_0x0032
        L_0x02c4:
            java.lang.Object r1 = r0.A00
            X.3CR r1 = (X.AnonymousClass3CR) r1
            java.lang.Object r2 = r0.A01
            X.3Ao r2 = (X.C57313Ao) r2
            java.lang.Object r7 = r0.A02
            X.1fU r7 = (X.AnonymousClass1fU) r7
            android.widget.CheckBox r1 = r1.A01
            boolean r0 = r1.isChecked()
            r5 = r0 ^ 1
            r2.A01 = r5
            r1.setChecked(r5)
            com.instagram.user.model.User r6 = r2.A02
            int r4 = r2.A00
            java.util.List r0 = r7.A05
            if (r5 == 0) goto L_0x03be
            r0.add(r6)
        L_0x02e8:
            java.util.Map r1 = r7.A07
            boolean r0 = r1.containsKey(r6)
            if (r0 == 0) goto L_0x03b5
            r1.remove(r6)
        L_0x02f3:
            android.os.Handler r3 = r7.A02
            java.lang.Runnable r2 = r7.A04
            r3.removeCallbacks(r2)
            r0 = 750(0x2ee, double:3.705E-321)
            r3.postDelayed(r2, r0)
            X.1cN r1 = r7.A03
            java.lang.String r0 = r6.getId()
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            long r2 = (long) r4
            com.instagram.service.session.UserSession r0 = r1.A04
            if (r5 == 0) goto L_0x0362
            X.Dsp r7 = X.C25567Do3.A02(r0)
            java.lang.String r4 = r1.A05
            boolean r0 = r4.isEmpty()
            r9 = r0 ^ 1
            X.27u r8 = X.C314827u.USER
            X.0nS r1 = r7.A0W
            java.lang.String r0 = "ig_camera_blacklist_hide_user"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 849(0x351, float:1.19E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r5)
            if (r0 == 0) goto L_0x0035
            X.C18190wL.A1F(r8, r5, r7)
            java.lang.String r0 = "hidden_uid"
            r5.A0S(r0, r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.String r0 = "is_from_search"
            r5.A0Q(r0, r1)
            X.D36 r1 = r7.A08
            java.lang.String r0 = "media_type"
            r5.A0O(r1, r0)
            X.0kW r0 = r7.A0T
            X.C18180wK.A1C(r5, r0)
            java.lang.String r0 = "search_text"
            r5.A0T(r0, r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "user_index"
            r5.A0S(r0, r1)
        L_0x035b:
            X.C18190wL.A1L(r5)
            r5.Bb4()
            return
        L_0x0362:
            X.Dsp r2 = X.C25567Do3.A02(r0)
            java.lang.String r0 = r1.A05
            boolean r0 = r0.isEmpty()
            r4 = r0 ^ 1
            X.27u r3 = X.C314827u.USER
            X.0nS r1 = r2.A0W
            java.lang.String r0 = "ig_camera_blacklist_unhide_user"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 851(0x353, float:1.193E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r1, r0)
            X.C18190wL.A1F(r3, r5, r2)
            java.lang.String r0 = "unhidden_uid"
            r5.A0S(r0, r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "is_from_search"
            r5.A0Q(r0, r1)
            X.D36 r1 = r2.A08
            java.lang.String r0 = "media_type"
            r5.A0O(r1, r0)
            X.0kW r0 = r2.A0T
            X.C18180wK.A1C(r5, r0)
            java.lang.String r1 = r2.A0K
            java.lang.String r0 = "camera_session_id"
            r5.A0T(r0, r1)
            java.lang.Long r1 = X.C18210wN.A0V()
            r0 = 175(0xaf, float:2.45E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            r5.A0S(r0, r1)
            X.D3Q r0 = r2.A0B
            X.C18240wQ.A13(r0, r5)
            goto L_0x035b
        L_0x03b5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.put(r6, r0)
            goto L_0x02f3
        L_0x03be:
            r0.remove(r6)
            goto L_0x02e8
        L_0x03c3:
            r1 = -1033742277(0xffffffffc262583b, float:-56.586163)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1cP r2 = (X.AnonymousClass1cP) r2
            java.lang.Object r1 = r0.A00
            X.395 r1 = (X.AnonymousClass395) r1
            java.lang.Object r0 = r0.A02
            X.3CT r0 = (X.AnonymousClass3CT) r0
            X.Ayd r0 = r0.A03
            android.view.View r0 = X.C18230wP.A0G(r0)
            com.instagram.common.ui.base.IgCheckBox r0 = (com.instagram.common.ui.base.IgCheckBox) r0
            r2.A05(r0, r1)
            r0 = 1471748906(0x57b91b2a, float:4.0705264E14)
            goto L_0x0032
        L_0x03e6:
            r1 = -571694533(0xffffffffddeca23b, float:-2.131407E18)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A00
            X.3DL r1 = (X.AnonymousClass3DL) r1
            android.widget.LinearLayout r2 = r1.A00
            r1 = 8
            r2.setVisibility(r1)
            java.lang.Object r6 = r0.A02
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            X.1tl r1 = X.AnonymousClass3WS.A01(r6)
            r4 = 1
            android.content.SharedPreferences$Editor r2 = X.C28161tl.A02(r1)
            java.lang.String r1 = "fb_feed_crossposting_like_sheet_upsell_has_dismissed"
            X.AnonymousClass0wJ.A13(r2, r1, r4)
            X.2AC r5 = X.AnonymousClass2AC.A0H
            X.2AD r4 = X.AnonymousClass2AD.A0U
            X.29W r2 = X.AnonymousClass29W.DECLINE
            X.14U r1 = X.AnonymousClass14U.A00()
            java.lang.Object r0 = r0.A01
            X.3Si r0 = (X.C61213Si) r0
            X.C61213Si.A00(r1, r0)
            X.C49322rC.A00(r5, r2, r4, r1, r6)
            r0 = 59466970(0x38b64da, float:8.19284E-37)
            goto L_0x0032
        L_0x0423:
            r1 = -1297859165(0xffffffffb2a43da3, float:-1.9120142E-8)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A00
            X.3DL r1 = (X.AnonymousClass3DL) r1
            android.widget.LinearLayout r2 = r1.A00
            r1 = 8
            r2.setVisibility(r1)
            java.lang.Object r6 = r0.A02
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            X.1tl r1 = X.AnonymousClass3WS.A01(r6)
            r4 = 1
            android.content.SharedPreferences$Editor r2 = X.C28161tl.A02(r1)
            java.lang.String r1 = "fb_feed_crossposting_like_sheet_upsell_has_dismissed"
            X.AnonymousClass0wJ.A13(r2, r1, r4)
            X.2AC r5 = X.AnonymousClass2AC.A0H
            X.2AD r4 = X.AnonymousClass2AD.A0W
            X.29W r2 = X.AnonymousClass29W.DECLINE
            X.14U r1 = X.AnonymousClass14U.A00()
            java.lang.Object r0 = r0.A01
            X.3Si r0 = (X.C61213Si) r0
            X.C61213Si.A00(r1, r0)
            X.C49322rC.A00(r5, r2, r4, r1, r6)
            r0 = -1987702957(0xffffffff89860f53, float:-3.2273737E-33)
            goto L_0x0032
        L_0x0460:
            r1 = 2040622006(0x79a16bb6, float:1.0476805E35)
            int r3 = X.AnonymousClass1lO.A01(r0, r1)
            r0 = -109977999(0xfffffffff971de71, float:-7.849095E34)
            goto L_0x0032
        L_0x046c:
            r1 = -1238487930(0xffffffffb62e2c86, float:-2.5953937E-6)
            int r3 = X.AnonymousClass1lO.A01(r0, r1)
            r0 = -1676013557(0xffffffff9c1a100b, float:-5.097506E-22)
            goto L_0x0032
        L_0x0478:
            r1 = 270777171(0x1023bb53, float:3.229039E-29)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A00
            X.13O r1 = (X.AnonymousClass13O) r1
            com.instagram.common.ui.base.IgTextView r2 = r1.A02
            r1 = 2131830082(0x7f112542, float:1.9293151E38)
            r2.setText(r1)
            java.lang.Object r1 = r0.A02
            X.1kg r1 = (X.C24821kg) r1
            X.3IU r1 = r1.A00
            java.lang.Object r0 = r0.A01
            X.48M r0 = (X.AnonymousClass48M) r0
            X.3Vc r2 = r0.A01
            X.1dM r1 = r1.A00
            java.util.Set r0 = r1.A0F
            r0.add(r2)
            X.AnonymousClass1dM.A00(r1)
            r0 = -2028222500(0xffffffff871bc7dc, float:-1.1719637E-34)
            goto L_0x0032
        L_0x04a6:
            r1 = 738995367(0x2c0c2ca7, float:1.9919984E-12)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A02
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            java.lang.Object r2 = r0.A00
            X.3D4 r2 = (X.AnonymousClass3D4) r2
            com.instagram.share.facebook.widget.FindPeopleButton r1 = r2.A04
            java.lang.Object r0 = r0.A01
            X.39E r0 = (X.AnonymousClass39E) r0
            X.C67103ys.A00(r4, r1, r2, r0)
            r0 = -1322296091(0xffffffffb12f5ce5, float:-2.5518656E-9)
            goto L_0x0032
        L_0x04c3:
            r1 = 1720911302(0x669305c6, float:3.471472E23)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.Jqm r2 = (X.C37383Jqm) r2
            java.lang.Object r1 = r0.A02
            X.DdB r1 = (X.C24974DdB) r1
            com.instagram.service.session.UserSession r1 = r1.A03
            X.Jj9 r1 = X.C18210wN.A0L(r1)
            java.lang.Object r5 = r0.A01
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            r0 = 2131830008(0x7f1124f8, float:1.9293001E38)
            java.lang.String r0 = r5.getString(r0)
            r1.A0O = r0
            r4 = 1
            X.C18250wR.A1B(r1, r4)
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.A00 = r0
            r9 = 0
            r7 = 0
            r11 = 4095(0xfff, float:5.738E-42)
            X.17a r6 = new X.17a
            r8 = r7
            r10 = r9
            r12 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 2131232411(0x7f08069b, float:1.808093E38)
            r6.A02 = r0
            r0 = 2131821803(0x7f1104eb, float:1.927636E38)
            java.lang.String r0 = X.C18180wK.A0g(r5, r0)
            r6.A07 = r0
            r0 = 349(0x15d, float:4.89E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r5, r0)
            r6.A04 = r0
            X.JPd r0 = r6.A01()
            r1.A0F = r0
            X.DaE r0 = X.C24270DFm.A00()
            r0.A00()
            X.1Xn r0 = new X.1Xn
            r0.<init>()
            r2.A0A(r0, r1, r4)
            r0 = -1383202649(0xffffffffad8e00a7, float:-1.614382E-11)
            goto L_0x0032
        L_0x0529:
            r1 = -1791772677(0xffffffff9533b7fb, float:-3.6293897E-26)
            int r5 = X.C63893iY.A00(r0, r1)
            r0 = -674957853(0xffffffffd7c4f5e3, float:-4.33120709E14)
            goto L_0x14e7
        L_0x0535:
            r1 = -85563542(0xfffffffffae6676a, float:-5.981629E35)
            int r5 = X.C63893iY.A00(r0, r1)
            r0 = -1299374586(0xffffffffb28d1e06, float:-1.6428213E-8)
            goto L_0x14e7
        L_0x0541:
            r1 = -2140640105(0xffffffff80686c97, float:-9.589846E-39)
            int r5 = X.C63893iY.A00(r0, r1)
            r0 = -1894128105(0xffffffff8f19e617, float:-7.587796E-30)
            goto L_0x14e7
        L_0x054d:
            r1 = -816731505(0xffffffffcf51aa8f, float:-3.51761587E9)
            int r5 = X.C63893iY.A00(r0, r1)
            r0 = 1270923192(0x4bc0bfb8, float:2.5263984E7)
            goto L_0x14e7
        L_0x0559:
            r1 = -905258160(0xffffffffca0adb50, float:-2275028.0)
            int r5 = X.C63893iY.A00(r0, r1)
            r0 = -544180466(0xffffffffdf90770e, float:-2.081961E19)
            goto L_0x14e7
        L_0x0565:
            r1 = 281193779(0x10c2ad33, float:7.6786363E-29)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A02
            X.7h3 r4 = (X.C127397h3) r4
            java.lang.Object r3 = r0.A00
            X.6jp r3 = (X.C109326jp) r3
            X.3VO r2 = X.AnonymousClass3VO.A00()
            java.lang.Object r1 = r0.A01
            X.3HX r1 = (X.AnonymousClass3HX) r1
            r0 = 0
            X.3iY r0 = X.C63893iY.A05(r2, r1, r0)
            X.C122047Jt.A03(r1, r4, r0, r3)
            r0 = -126316777(0xfffffffff8788f17, float:-2.0165497E34)
            goto L_0x14e7
        L_0x0589:
            r1 = -1387903615(0xffffffffad464581, float:-1.127043E-11)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            X.1cA r3 = (X.AnonymousClass1cA) r3
            java.lang.Object r1 = r0.A01
            X.3B9 r1 = (X.AnonymousClass3B9) r1
            android.view.View r1 = r1.A01
            java.lang.Object r4 = r0.A02
            X.4Mm r4 = (X.C72144Mm) r4
            android.content.Context r0 = r3.requireContext()
            android.widget.PopupMenu r2 = new android.widget.PopupMenu
            r2.<init>(r0, r1)
            r0 = 2131558400(0x7f0d0000, float:1.8742115E38)
            r2.inflate(r0)
            android.view.Menu r1 = r2.getMenu()
            r0 = 2131303110(0x7f091ac6, float:1.8224325E38)
            android.view.MenuItem r1 = r1.findItem(r0)
            r1.getClass()
            r0 = 2131834607(0x7f1136ef, float:1.930233E38)
            r1.setTitle(r0)
            X.3vk r0 = new X.3vk
            r0.<init>(r3, r4)
            r2.setOnMenuItemClickListener(r0)
            r2.show()
            com.instagram.service.session.UserSession r3 = r3.A01
            java.lang.String r0 = r4.A01()
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r0)
            X.0nS r1 = X.C18220wO.A0W(r3)
            java.lang.String r0 = "ig_my_main_account_click"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1356(0x54c, float:1.9E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            X.C77494gf.A00(r1, r3)
            java.lang.String r0 = "account_id_clicked"
            r1.A0S(r0, r2)
            r1.Bb4()
            r0 = -1736820993(0xffffffff987a36ff, float:-3.2339509E-24)
            goto L_0x14e7
        L_0x05f5:
            r1 = -1679746570(0xffffffff9be119f6, float:-3.7239904E-22)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A02
            X.7h3 r5 = (X.C127397h3) r5
            r2 = 45
            X.6jp r4 = r5.A0L(r2)
            if (r4 == 0) goto L_0x0618
            X.3VO r3 = X.AnonymousClass3VO.A00()
            r2 = 0
            X.3iY r2 = X.C63893iY.A04(r3, r5, r2)
            java.lang.Object r0 = r0.A01
            X.3HX r0 = (X.AnonymousClass3HX) r0
            X.C122047Jt.A03(r0, r5, r2, r4)
        L_0x0618:
            r0 = -1495323542(0xffffffffa6df2c6a, float:-1.5485772E-15)
            goto L_0x1446
        L_0x061d:
            r1 = 1947973580(0x741bb7cc, float:4.934899E31)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A02
            X.6jp r4 = (X.C109326jp) r4
            X.3VO r3 = X.AnonymousClass3VO.A00()
            java.lang.Object r2 = r0.A00
            r1 = 0
            X.3iY r1 = X.C63893iY.A04(r3, r2, r1)
            java.lang.Object r0 = r0.A01
            X.601 r0 = (X.AnonymousClass601) r0
            X.C61043Rr.A00(r0, r1, r4)
            r0 = 775704996(0x2e3c51a4, float:4.2818762E-11)
            goto L_0x14e7
        L_0x063f:
            r1 = -1295158068(0xffffffffb2cd74cc, float:-2.3918254E-8)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A00
            X.1cn r5 = (X.C23221cn) r5
            java.lang.Object r4 = r0.A01
            X.7h3 r4 = (X.C127397h3) r4
            java.lang.Object r6 = r0.A02
            X.6jp r6 = (X.C109326jp) r6
            X.3bW r0 = r5.A02
            if (r0 == 0) goto L_0x069a
            X.44n r0 = r0.A04
            X.7Ez r0 = r0.A01
        L_0x065a:
            if (r0 == 0) goto L_0x0695
            X.3HX r3 = r0.A02()
            if (r3 == 0) goto L_0x0695
            X.3VO r2 = X.AnonymousClass3VO.A00()
            r0 = 0
            r2.A03(r4, r0)
            r0 = 1
            X.3iY r2 = X.C63893iY.A04(r2, r3, r0)
            X.7Ez r0 = r5.A09
            if (r0 != 0) goto L_0x0691
            X.3bW r0 = r5.A02
            if (r0 == 0) goto L_0x0688
            X.44n r0 = r0.A04
            X.7Ez r0 = r0.A01
            if (r0 != 0) goto L_0x068d
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L_0x0688
            java.lang.String r2 = "IgBloksBottomSheetFragment"
            java.lang.String r0 = "runNavbarButtonExpression failed on Surface Core."
        L_0x0685:
            X.C30967GcS.A02(r2, r0)
        L_0x0688:
            r0 = -361421318(0xffffffffea7525fa, float:-7.409154E25)
            goto L_0x1446
        L_0x068d:
            X.3HX r3 = r0.A02()
        L_0x0691:
            X.C122047Jt.A03(r3, r4, r2, r6)
            goto L_0x0688
        L_0x0695:
            java.lang.String r2 = "IgBloksBottomSheetFragment"
            java.lang.String r0 = "Cannot run navbar expression without valid context"
            goto L_0x0685
        L_0x069a:
            X.7Ez r0 = r5.A09
            goto L_0x065a
        L_0x069d:
            r1 = -1429329876(0xffffffffaace282c, float:-3.6620826E-13)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r3 = (com.instagram.business.fragment.AccountTypeSelectionV2Fragment) r3
            java.lang.String r0 = "business"
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment.A02(r3, r0)
            X.266 r0 = X.AnonymousClass266.A04
            r3.A04 = r0
            X.1ju r2 = r3.A01
            r0 = 1
            r2.A02(r0)
            android.widget.RadioButton r0 = r3.mCreatorRadioButton
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x06c5
            android.widget.RadioButton r2 = r3.mCreatorRadioButton
            r0 = 0
            r2.setChecked(r0)
        L_0x06c5:
            r0 = -1732841013(0xffffffff98b6f1cb, float:-4.7290046E-24)
            goto L_0x1446
        L_0x06ca:
            r1 = -965094887(0xffffffffc679d219, float:-15988.524)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment r3 = (com.instagram.business.fragment.AccountTypeSelectionV2Fragment) r3
            java.lang.String r0 = "creator"
            com.instagram.business.fragment.AccountTypeSelectionV2Fragment.A02(r3, r0)
            X.266 r0 = X.AnonymousClass266.A05
            r3.A04 = r0
            X.1ju r2 = r3.A01
            r0 = 1
            r2.A02(r0)
            android.widget.RadioButton r0 = r3.mBusinessRadioButton
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x06f2
            android.widget.RadioButton r2 = r3.mBusinessRadioButton
            r0 = 0
            r2.setChecked(r0)
        L_0x06f2:
            r0 = 1150146633(0x448dd849, float:1134.7589)
            goto L_0x1446
        L_0x06f7:
            r1 = 1990001955(0x769d0523, float:1.5923726E33)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A02
            com.instagram.igds.components.switchbutton.IgSwitch r3 = (com.instagram.igds.components.switchbutton.IgSwitch) r3
            boolean r1 = r3.isChecked()
            r2 = r1 ^ 1
            r3.setCheckedAnimated(r2)
            java.lang.Object r1 = r0.A00
            com.instagram.business.fragment.ProfileDisplayOptionsFragment r1 = (com.instagram.business.fragment.ProfileDisplayOptionsFragment) r1
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            com.instagram.business.fragment.ProfileDisplayOptionsFragment.A02(r1, r3, r0, r2)
            r0 = 698943442(0x29a907d2, float:7.506464E-14)
            goto L_0x14e7
        L_0x071b:
            r1 = 8756380(0x859c9c, float:1.2270302E-38)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r1 = r0.A02
            com.instagram.business.promote.model.PromoteData r1 = (com.instagram.business.promote.model.PromoteData) r1
            com.instagram.service.session.UserSession r1 = r1.A0v
            X.Drz r1 = X.C18180wK.A0Q(r2, r1)
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r1.A03 = r0
            r1.A05()
            r0 = -456008467(0xffffffffe4d1dced, float:-3.0970311E22)
            goto L_0x14e7
        L_0x073e:
            r1 = 2103907888(0x7d671630, float:1.919793E37)
            int r6 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A02
            X.1bq r5 = (X.C23051bq) r5
            X.Jjm r4 = r5.A01
            r7 = 0
            if (r4 != 0) goto L_0x0754
            java.lang.String r0 = "adsManagerLogger"
        L_0x0750:
            X.C04220Ms.A0E(r0)
            throw r7
        L_0x0754:
            X.Iu2 r1 = X.C35394Iu2.A12
            java.lang.String r3 = r1.toString()
            java.lang.String r2 = r5.A05
            if (r2 != 0) goto L_0x0761
            java.lang.String r0 = "mediaId"
            goto L_0x0750
        L_0x0761:
            java.lang.String r1 = "primary_action_button"
            r4.A09(r3, r1, r2, r7)
            java.lang.Object r1 = r0.A01
            com.instagram.business.promote.model.PromoteButtonAction r1 = (com.instagram.business.promote.model.PromoteButtonAction) r1
            com.instagram.business.promote.model.PromoteButtonActionType r1 = r1.A00
            if (r1 == 0) goto L_0x077e
            java.lang.Object r0 = r0.A00
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            X.C23051bq.A00(r5, r1, r0)
            r0 = -960462606(0xffffffffc6c080f2, float:-24640.473)
            goto L_0x0a11
        L_0x077e:
            java.lang.String r0 = "type"
            X.C04220Ms.A0E(r0)
            throw r7
        L_0x0784:
            r1 = -479566485(0xffffffffe36a656b, float:-4.323846E21)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r1 = r0.A02
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r0.A01
            X.3TG r0 = (X.AnonymousClass3TG) r0
            X.C63783iL.A05(r2, r1, r0)
            r0 = -1735925542(0xffffffff9887e0da, float:-3.5123724E-24)
            goto L_0x14e7
        L_0x079f:
            r1 = -777617641(0xffffffffd1a67f17, float:-8.9387098E10)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r1 = r0.A02
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r0.A01
            X.3TG r0 = (X.AnonymousClass3TG) r0
            X.C63783iL.A04(r2, r1, r0)
            r0 = -1946722753(0xffffffff8bf75e3f, float:-9.5282745E-32)
            goto L_0x14e7
        L_0x07ba:
            r1 = 824026603(0x311da5eb, float:2.294082E-9)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r7 = r0.A02
            X.0i6 r7 = (X.C10300i6) r7
            java.lang.Object r6 = r0.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r4 = r0.A00
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r2 = X.C18180wK.A06()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131823368(0x7f110b08, float:1.9279534E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "title"
            r2.putString(r0, r1)
            java.lang.String r0 = "clips_account_settings"
            X.3iT r0 = X.C63863iT.A02(r4, r2, r7, r3, r0)
            r0.A0I(r6)
            r0 = -1729953022(0xffffffff98e30302, float:-5.868116E-24)
            goto L_0x14e7
        L_0x07f1:
            r1 = 411268949(0x18837755, float:3.39832E-24)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.7h3 r4 = (X.C127397h3) r4
            java.lang.Object r3 = r0.A02
            X.6jp r3 = (X.C109326jp) r3
            X.3VO r2 = X.AnonymousClass3VO.A00()
            r1 = 0
            r2.A03(r4, r1)
            java.lang.Object r1 = r0.A00
            X.3HX r1 = (X.AnonymousClass3HX) r1
            r0 = 1
            X.3iY r0 = X.C63893iY.A04(r2, r1, r0)
            X.C122047Jt.A03(r1, r4, r0, r3)
            r0 = 1792727172(0x6adad884, float:1.3228415E26)
            goto L_0x14e7
        L_0x0819:
            r1 = -1336402793(0xffffffffb0581c97, float:-7.862097E-10)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A02
            X.3ht r4 = (X.C63603ht) r4
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            r3 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            X.C63603ht.A03(r2, r4, r1)
            X.3ZL r1 = r4.A09
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass3ZL.A00(r1)
            java.lang.String r1 = "PREFERENCE_HAS_SEEN_SHARE_TO_FACEBOOK_NUX_FOR_CURRENT_PANAVISION_USER"
            X.AnonymousClass0wJ.A13(r2, r1, r3)
            java.lang.Object r0 = r0.A01
            X.AnonymousClass3Z9.A01(r0)
            r0 = -1648880811(0xffffffff9db81355, float:-4.8724383E-21)
            goto L_0x14e7
        L_0x0845:
            r1 = -62179719(0xfffffffffc4b3679, float:-4.2205644E36)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A02
            X.3ht r3 = (X.C63603ht) r3
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            java.lang.Boolean r1 = X.C18180wK.A0Y()
            X.C63603ht.A03(r2, r3, r1)
            java.lang.Object r0 = r0.A01
            X.AnonymousClass3Z9.A01(r0)
            r0 = 646907519(0x268f067f, float:9.924379E-16)
            goto L_0x14e7
        L_0x0865:
            r1 = 108728114(0x67b0f32, float:4.7219017E-35)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A02
            X.3ht r3 = (X.C63603ht) r3
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            java.lang.Boolean r1 = X.C18180wK.A0X()
            X.C63603ht.A03(r2, r3, r1)
            X.3ZL r1 = r3.A09
            r3 = 1
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass3ZL.A00(r1)
            java.lang.String r1 = "PREFERENCE_HAS_SEEN_SHARE_TO_FACEBOOK_NUX_FOR_CURRENT_PANAVISION_USER"
            X.AnonymousClass0wJ.A13(r2, r1, r3)
            java.lang.Object r0 = r0.A01
            X.AnonymousClass3Z9.A01(r0)
            r0 = -2146820976(0xffffffff800a1c90, float:-9.28601E-40)
            goto L_0x14e7
        L_0x0891:
            r1 = 379222381(0x169a796d, float:2.4956672E-25)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A02
            X.3ht r3 = (X.C63603ht) r3
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            java.lang.Boolean r1 = X.C18180wK.A0X()
            X.C63603ht.A03(r2, r3, r1)
            java.lang.Object r0 = r0.A01
            X.AnonymousClass3Z9.A01(r0)
            r0 = 419946228(0x1907def4, float:7.0243614E-24)
            goto L_0x14e7
        L_0x08b1:
            r1 = 1269773975(0x4baf3697, float:2.296555E7)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A02
            X.3ht r4 = (X.C63603ht) r4
            java.lang.Object r3 = r0.A00
            X.D3Q r3 = (X.D3Q) r3
            r2 = 0
            java.lang.String r1 = "https://help.instagram.com/270447560766967"
            X.C63603ht.A04(r3, r4, r2, r1)
            java.lang.Object r0 = r0.A01
            X.AnonymousClass3Z9.A01(r0)
            r0 = -1268635599(0xffffffffb4622831, float:-2.1062512E-7)
            goto L_0x14e7
        L_0x08d0:
            r1 = 1427849044(0x551b3f54, float:1.06685184E13)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A02
            X.3ht r3 = (X.C63603ht) r3
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            r1 = 0
            X.C63603ht.A03(r2, r3, r1)
            java.lang.Object r0 = r0.A01
            X.AnonymousClass3Z9.A01(r0)
            r0 = 858634676(0x332db9b4, float:4.0448597E-8)
            goto L_0x14e7
        L_0x08ed:
            r1 = -526907801(0xffffffffe0980667, float:-8.763645E19)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A02
            X.3ht r3 = (X.C63603ht) r3
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            r1 = 0
            X.C63603ht.A02(r2, r3, r1)
            java.lang.Object r0 = r0.A01
            X.AnonymousClass3Z9.A01(r0)
            r0 = 795084328(0x2f640628, float:2.0738666E-10)
            goto L_0x14e7
        L_0x090a:
            r1 = 2041045798(0x79a7e326, float:1.0896509E35)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A02
            X.3ht r3 = (X.C63603ht) r3
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            java.lang.Boolean r1 = X.C18180wK.A0Y()
            X.C63603ht.A03(r2, r3, r1)
            X.C63603ht.A07(r3)
            java.lang.Object r0 = r0.A01
            X.AnonymousClass3Z9.A01(r0)
            r0 = 6885172(0x690f34, float:9.648181E-39)
            goto L_0x14e7
        L_0x092d:
            r1 = 1239692066(0x49e43322, float:1869412.2)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A02
            X.3ht r2 = (X.C63603ht) r2
            java.lang.Object r1 = r0.A00
            X.D3Q r1 = (X.D3Q) r1
            java.lang.Object r0 = r0.A01
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            X.C63603ht.A01(r1, r2, r0)
            r0 = 762291367(0x2d6fa4a7, float:1.3622137E-11)
            goto L_0x14e7
        L_0x0948:
            r1 = -245228946(0xfffffffff1621a6e, float:-1.119609E30)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A02
            X.3ht r2 = (X.C63603ht) r2
            java.lang.Object r1 = r0.A00
            X.D3Q r1 = (X.D3Q) r1
            java.lang.Object r0 = r0.A01
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            X.C63603ht.A02(r1, r2, r0)
            r0 = -1273585071(0xffffffffb416a251, float:-1.4028889E-7)
            goto L_0x14e7
        L_0x0963:
            java.lang.Object r3 = r0.A00
            X.1bk r3 = (X.C22991bk) r3
            java.lang.Object r4 = r0.A01
            X.16t r4 = (X.C209416t) r4
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.29v r8 = X.C320129v.DEFAULT_PRIVACY_ADVANCE_SETTING_MEGA_CLICK
            com.instagram.service.session.UserSession r9 = r3.A02
            if (r4 != 0) goto L_0x09c5
            r14 = 0
            java.lang.String r10 = ""
        L_0x0978:
            android.content.Context r6 = r3.requireContext()
            com.instagram.service.session.UserSession r7 = r3.A02
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r0 = 36325317266121774(0x810daf0000242e, double:3.035615137183013E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r5, r7, r0)
            boolean r1 = r0.booleanValue()
            com.instagram.service.session.UserSession r0 = r3.A02
            int r0 = X.C18200wM.A06(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r11 = X.C63143c0.A05(r6, r0)
            com.instagram.service.session.UserSession r0 = r3.A02
            boolean r15 = X.C62183Xq.A00(r0)
            if (r4 == 0) goto L_0x09c2
            boolean r1 = r4.A05
            X.21z r0 = r4.A01
            java.lang.String r13 = r0.toString()
        L_0x09ab:
            java.lang.String r12 = "advanced_setting"
            r16 = r1
            X.C59693Lv.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.service.session.UserSession r0 = r3.A02
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r1, r0)
            r0.A03 = r2
            r0.A05()
            return
        L_0x09c2:
            r1 = 0
            r13 = 0
            goto L_0x09ab
        L_0x09c5:
            boolean r14 = r4.A00
            X.20N r0 = r4.A02
            java.lang.String r10 = r0.toString()
            goto L_0x0978
        L_0x09ce:
            r1 = -1463701737(0xffffffffa8c1af17, float:-2.1503237E-14)
            int r6 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A01
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r5 = (com.instagram.discovery.mediamap.fragment.LocationDetailFragment) r5
            java.lang.Object r4 = r0.A02
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            X.JrN r3 = X.C18220wO.A0a(r5)
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = r5.A03
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = r5.A02
            java.lang.String r0 = "instagram_map_location_detail_tap_call"
            X.C18230wP.A1L(r1, r3, r2, r0)
            java.lang.String r0 = r4.A0z()
            java.lang.String r1 = r0.trim()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0a0e
            java.lang.String r0 = "tel:"
            java.lang.String r2 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.String r0 = "android.intent.action.DIAL"
            android.content.Intent r1 = X.C18210wN.A09(r0)
            android.net.Uri r0 = X.C15430rJ.A01(r2)
            r1.setData(r0)
            X.C10650ih.A0C(r1, r5)
        L_0x0a0e:
            r0 = 465190262(0x1bba3d76, float:3.0810837E-22)
        L_0x0a11:
            X.C14030oh.A0C(r0, r6)
            return
        L_0x0a15:
            r1 = 1799445142(0x6b415a96, float:2.3375046E26)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A01
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r6 = (com.instagram.discovery.mediamap.fragment.LocationDetailFragment) r6
            java.lang.Object r4 = r0.A02
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            X.JrN r3 = X.C18220wO.A0a(r6)
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = r6.A03
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = r6.A02
            java.lang.String r0 = "instagram_map_location_detail_tap_email"
            X.C18230wP.A1L(r1, r3, r2, r0)
            java.lang.String r1 = "mailto:"
            java.lang.String r0 = r4.A1C()
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.String r0 = "android.intent.action.SENDTO"
            android.content.Intent r2 = X.C18210wN.A09(r0)
            android.net.Uri r1 = X.C15430rJ.A01(r1)
            java.lang.String r0 = "text/plain"
            r2.setDataAndType(r1, r0)
            X.C10650ih.A0C(r2, r6)
            r0 = -272656598(0xffffffffefbf972a, float:-1.1858877E29)
            goto L_0x14e7
        L_0x0a52:
            java.lang.Object r6 = r0.A00
            X.3A9 r6 = (X.AnonymousClass3A9) r6
            java.lang.Object r5 = r0.A01
            com.instagram.discovery.mediamap.model.LocationPageInformation r5 = (com.instagram.discovery.mediamap.model.LocationPageInformation) r5
            java.lang.Object r4 = r0.A02
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            X.34P r0 = r6.A01
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r0 = r0.A00
            X.JrN r3 = X.C18220wO.A0a(r0)
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = r0.A03
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = r0.A02
            java.lang.String r0 = "instagram_map_directions_bottom_sheet_tap_copy_address"
            X.C18230wP.A1L(r1, r3, r2, r0)
            X.3Xy r1 = r6.A00
            r0 = 0
            r1.A02(r4, r5, r0)
            return
        L_0x0a76:
            java.lang.Object r1 = r0.A00
            X.3A9 r1 = (X.AnonymousClass3A9) r1
            java.lang.Object r5 = r0.A01
            com.instagram.discovery.mediamap.model.MediaMapPin r5 = (com.instagram.discovery.mediamap.model.MediaMapPin) r5
            java.lang.Object r4 = r0.A02
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            X.34P r0 = r1.A01
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r0 = r0.A00
            X.JrN r3 = X.C18220wO.A0a(r0)
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = r0.A03
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = r0.A02
            java.lang.String r0 = "instagram_map_directions_bottom_sheet_tap_open_in_maps"
            X.C18230wP.A1L(r1, r3, r2, r0)
            X.C62243Xy.A01(r4, r5)
            return
        L_0x0a97:
            r1 = 1487580716(0x58aaae2c, float:1.50132031E15)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A02
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = (com.instagram.discovery.mediamap.model.MediaMapPin) r1
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.C62243Xy.A01(r0, r1)
            r0 = 1050364469(0x3e9b4a35, float:0.30330053)
            goto L_0x14e7
        L_0x0aae:
            r1 = -1116478736(0xffffffffbd73e2f0, float:-0.059542596)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A00
            X.3yl r1 = (X.C67033yl) r1
            X.3Xy r3 = r1.A00
            java.lang.Object r2 = r0.A02
            com.instagram.discovery.mediamap.model.LocationPageInformation r2 = (com.instagram.discovery.mediamap.model.LocationPageInformation) r2
            java.lang.Object r1 = r0.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            r0 = 1
            r3.A02(r1, r2, r0)
            r0 = 1579868440(0x5e2ae118, float:3.07828731E18)
            goto L_0x14e7
        L_0x0acc:
            r1 = 343656329(0x147bc789, float:1.2711613E-26)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A02
            com.instagram.discovery.mediamap.model.LocationPageInformation r2 = (com.instagram.discovery.mediamap.model.LocationPageInformation) r2
            com.instagram.user.model.User r9 = r2.A00()
            java.lang.Object r2 = r0.A00
            X.3yl r2 = (X.C67033yl) r2
            if (r9 == 0) goto L_0x0b1d
            com.instagram.service.session.UserSession r8 = r2.A02
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r6 = r2.A01
            X.0m7 r5 = r6.mFragmentManager
            r10 = 0
            com.instagram.request.IDxDCallbackShape13S0400000_1_I2 r4 = new com.instagram.request.IDxDCallbackShape13S0400000_1_I2
            r7 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10)
            if (r8 == 0) goto L_0x0b0a
            java.lang.String r3 = r9.BK7()
            java.lang.Integer r2 = X.AnonymousClass006.A0Y
            java.lang.String r0 = r6.getModuleName()
            X.H8c r0 = X.C36942Tg.A00(r8, r2, r3, r0)
            if (r0 == 0) goto L_0x0b0a
        L_0x0b00:
            r0.A00 = r4
            r6.schedule(r0)
        L_0x0b05:
            r0 = -1889683362(0xffffffff8f5db85e, float:-1.0931649E-29)
            goto L_0x1446
        L_0x0b0a:
            java.lang.String r2 = "username contains space: "
            java.lang.String r0 = r9.BK7()
            java.lang.String r2 = X.AnonymousClass00U.A0L(r2, r0)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r2)
            X.AnonymousClass3iG.A09(r6, r6, r8, r9, r0)
            goto L_0x0b05
        L_0x0b1d:
            com.instagram.service.session.UserSession r9 = r2.A02
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r6 = r2.A01
            java.lang.Object r8 = r0.A01
            com.instagram.model.venue.Venue r8 = (com.instagram.model.venue.Venue) r8
            X.0m7 r5 = r6.mFragmentManager
            r10 = 1
            com.instagram.request.IDxDCallbackShape13S0400000_1_I2 r4 = new com.instagram.request.IDxDCallbackShape13S0400000_1_I2
            r7 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.String r3 = r8.getId()
            java.lang.Integer r2 = X.AnonymousClass006.A0Y
            java.lang.String r0 = r6.getModuleName()
            X.H8c r0 = X.C36912Td.A00(r9, r2, r3, r0)
            goto L_0x0b00
        L_0x0b3d:
            r1 = 44101265(0x2a0ee91, float:2.3646817E-37)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A02
            X.1bp r4 = (X.C23041bp) r4
            X.0Oa r2 = r4.A0J
            java.lang.Object r3 = r2.getValue()
            X.495 r3 = (X.AnonymousClass495) r3
            X.0Oa r2 = r4.A0G
            java.lang.String r8 = X.C18200wM.A0q(r2)
            X.C04220Ms.A06(r8)
            X.0Oa r2 = r4.A0I
            java.lang.String r6 = X.C18200wM.A0q(r2)
            X.C04220Ms.A06(r6)
            java.lang.Object r2 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2) r2
            java.lang.String r7 = r2.A01
            r2 = 3
            X.C04220Ms.A0B(r7, r2)
            X.0nS r3 = r3.A00
            java.lang.String r2 = "ig_digital_fan_club_consideration_screen_content_preview_item_clicked"
            X.0A2 r3 = X.AnonymousClass0wJ.A0M(r3, r2)
            r2 = 1158(0x486, float:1.623E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r3, r2)
            java.lang.String r2 = "creator_management_consideration"
            X.C18230wP.A1H(r5, r2)
            java.lang.String r2 = "origin"
            r5.A0T(r2, r6)
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r8)
            X.C18250wR.A0x(r5, r2)
            java.lang.Long r3 = X.AnonymousClass0wJ.A0d(r7)
            java.lang.String r2 = "media_id"
            r5.A0S(r2, r3)
            r5.Bb4()
            X.0Oa r2 = r4.A0M
            X.0i6 r5 = X.AnonymousClass0wJ.A0U(r2)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            java.lang.String r6 = "ContextualFeedFragment.ARGUMENT_CONTEXTUAL_FEED_MODE"
            java.lang.String r2 = "Static"
            kotlin.Pair r9 = X.C18180wK.A0p(r6, r2)
            r8 = 0
            android.content.Context r6 = r4.requireContext()
            r2 = 2131832742(0x7f112fa6, float:1.9298546E38)
            java.lang.String r6 = r6.getString(r2)
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_FEED_TITLE"
            kotlin.Pair r10 = X.C18180wK.A0p(r2, r6)
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r2 = X.C23041bp.A00(r4)
            X.4wE r2 = r2.A0B
            java.lang.Object r2 = r2.getValue()
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            if (r2 == 0) goto L_0x0bf5
            java.lang.String r6 = r2.BK7()
        L_0x0bcb:
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_FEED_SUBTITLE"
            kotlin.Pair r11 = X.C18180wK.A0p(r2, r6)
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_MEDIA_INITIAL_POSITION"
            kotlin.Pair r12 = X.C18180wK.A0p(r2, r7)
            java.lang.Object r0 = r0.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0be3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0bf7
            java.lang.Object r0 = r2.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2) r0
            java.lang.String r0 = r0.A01
            r6.add(r0)
            goto L_0x0be3
        L_0x0bf5:
            r6 = 0
            goto L_0x0bcb
        L_0x0bf7:
            java.util.List r2 = X.C18180wK.A0n(r7)
            java.util.List r0 = X.AnonymousClass00J.A0U(r6, r7)
            java.util.List r2 = X.AnonymousClass00J.A0V(r0, r2)
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_MEDIA_ID_LIST"
            kotlin.Pair r13 = X.C18180wK.A0p(r0, r2)
            java.lang.String r2 = "ContextualFeedFragment.ARGUMENT_MODULE_NAME"
            java.lang.String r0 = "feed_contextual_fan_club"
            kotlin.Pair r14 = X.C18180wK.A0p(r2, r0)
            java.lang.String r2 = "FanClubFanOnboardingConsiderationFragment"
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_PRIOR_MODULE"
            kotlin.Pair r15 = X.C18180wK.A0p(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_EDIT_IN_ACTION_BAR"
            kotlin.Pair r16 = X.C18180wK.A0p(r0, r2)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r9, r10, r11, r12, r13, r14, r15, r16}
            android.os.Bundle r6 = X.C98316Fa.A00(r0)
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            r0 = 51
            java.lang.String r0 = X.I17.A00(r0)
            X.3iT r2 = X.C63863iT.A05(r2, r6, r5, r3, r0)
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            r2.A0I(r0)
            r0 = 490834677(0x1d418af5, float:2.5615176E-21)
            goto L_0x1446
        L_0x0c45:
            r1 = 1373119291(0x51d8233b, float:1.16038001E11)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            android.content.Context r2 = (android.content.Context) r2
            X.Dsm r6 = X.C18190wL.A0W(r2)
            r1 = 2131837603(0x7f1142a3, float:1.9308406E38)
            r6.A0L(r1)
            android.content.res.Resources r3 = r2.getResources()
            r2 = 2131837602(0x7f1142a2, float:1.9308404E38)
            java.lang.Object r4 = r0.A01
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r1 = r4.BK7()
            java.lang.String r1 = X.C18190wL.A0h(r3, r1, r2)
            r6.A0p(r1)
            r3 = 2131831976(0x7f112ca8, float:1.9296993E38)
            java.lang.Object r2 = r0.A02
            r1 = 26
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r2)
            X.25l r2 = X.AnonymousClass25l.DEFAULT
            r6.A0R(r0, r2, r3)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            r0 = 0
            r6.A0S(r0, r2, r1)
            X.AnonymousClass0wJ.A1K(r6)
            r0 = -227678557(0xfffffffff26de6a3, float:-4.7121133E30)
            goto L_0x14e7
        L_0x0c90:
            r1 = 211114748(0xc955afc, float:2.3011844E-31)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A02
            X.3ab r3 = (X.C62723ab) r3
            java.lang.Object r1 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3200000_I2) r1
            java.lang.Object r2 = r1.A01
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r2 = (com.instagram.api.schemas.FanClubNextStepsRecommendationsType) r2
            java.lang.Object r1 = r0.A00
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r0 = r2.toString()
            X.C62723ab.A02(r3, r1, r0)
            X.3HY r6 = r3.A01
            int r0 = r2.ordinal()
            switch(r0) {
                case 2: goto L_0x0cbc;
                case 3: goto L_0x0dbe;
                case 4: goto L_0x0d87;
                case 5: goto L_0x0d65;
                case 6: goto L_0x0db6;
                case 7: goto L_0x0dae;
                case 8: goto L_0x0d2a;
                case 9: goto L_0x0de5;
                case 10: goto L_0x0dc6;
                case 11: goto L_0x0cbc;
                case 12: goto L_0x0cb7;
                case 13: goto L_0x0dc2;
                case 14: goto L_0x0cb7;
                case 15: goto L_0x0cd0;
                default: goto L_0x0cb7;
            }
        L_0x0cb7:
            r0 = 836908906(0x31e2376a, float:6.5837655E-9)
            goto L_0x14e7
        L_0x0cbc:
            com.instagram.service.session.UserSession r4 = r6.A04
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            X.24R r1 = X.AnonymousClass24R.SETTINGS_RECOMMENDATION
            java.lang.String r0 = "entrypoint"
            android.os.Bundle r2 = X.C18180wK.A09(r0, r1)
            androidx.fragment.app.FragmentActivity r1 = r6.A01
            java.lang.String r0 = "creator_messaging_selection_screen"
            X.C63863iT.A08(r1, r2, r4, r3, r0)
            goto L_0x0cb7
        L_0x0cd0:
            X.0Ok r0 = X.C06810aP.A01
            com.instagram.service.session.UserSession r4 = r6.A04
            com.instagram.user.model.User r0 = r0.A01(r4)
            X.4tY r1 = r0.A0I()
            if (r1 == 0) goto L_0x0cb7
            java.lang.Integer r0 = r1.AZ6()
            if (r0 == 0) goto L_0x0cb7
            java.lang.Integer r0 = r1.BEi()
            if (r0 == 0) goto L_0x0cb7
            androidx.fragment.app.FragmentActivity r6 = r6.A01
            java.lang.Integer r3 = r1.BEi()
            java.lang.String r0 = "Required value was null."
            if (r3 == 0) goto L_0x0df1
            java.lang.Integer r2 = r1.AZ6()
            if (r2 == 0) goto L_0x0dec
            X.24S r7 = X.AnonymousClass24S.SUBSCRIPTION_SETTINGS
            r1 = 1
            java.lang.String r0 = "subscriber_fan_count_arg"
            kotlin.Pair r3 = X.C18180wK.A0p(r0, r3)
            java.lang.String r0 = "subscriber_connected_fan_count_arg"
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "channel_creation_entry_from_chooser"
            kotlin.Pair r1 = X.C18180wK.A0p(r0, r1)
            java.lang.String r0 = "social_channel_creation_source"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r7)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r3, r2, r1, r0}
            android.os.Bundle r2 = X.C98316Fa.A00(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "channel_creation_chooser"
            X.3iT r0 = X.C63863iT.A02(r6, r2, r4, r1, r0)
            goto L_0x0d61
        L_0x0d2a:
            X.3HA r4 = r6.A03
            android.os.Bundle r3 = X.C18180wK.A06()
            java.lang.String r1 = "subscriber_fan_count_arg"
            r0 = 1
            r3.putInt(r1, r0)
            java.lang.String r1 = "interest_based_channel_entry_point"
            java.lang.String r0 = "broadcast_chat_setup"
            r3.putString(r1, r0)
            java.lang.String r1 = "interest_based_channel_implicit_audience_type"
            r0 = 2
            r3.putInt(r1, r0)
            X.24S r1 = X.AnonymousClass24S.PROFILE
            java.lang.String r0 = "social_channel_creation_source"
            r3.putSerializable(r0, r1)
            X.20y r0 = X.AnonymousClass20y.Broadcast
            X.C35292Mw.A00(r3, r0)
            java.lang.String r1 = "channel_creation_entry_from_chooser"
            r0 = 0
            r3.putBoolean(r1, r0)
            com.instagram.service.session.UserSession r2 = r4.A02
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r6 = r4.A00
            java.lang.String r0 = "channel_creation_configure"
            X.3iT r0 = X.C63863iT.A02(r6, r3, r2, r1, r0)
        L_0x0d61:
            r0.A0G()
            goto L_0x0da9
        L_0x0d65:
            X.3HA r0 = r6.A03
            androidx.fragment.app.FragmentActivity r1 = r0.A00
            com.instagram.service.session.UserSession r0 = r0.A02
            X.Drz r3 = X.C18180wK.A0Q(r1, r0)
            r0 = 0
            X.CUJ r2 = new X.CUJ
            r2.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "ARG_IS_FROM_CONTENT_PREVIEW_NUDGE"
            android.os.Bundle r0 = X.C18180wK.A09(r0, r1)
            r2.setArguments(r0)
            X.C18180wK.A17(r2, r3)
            goto L_0x0cb7
        L_0x0d87:
            com.instagram.service.session.UserSession r4 = r6.A04
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.AnonymousClass0wJ.A0E(r4)
            java.lang.String r1 = "prior_module_name"
            java.lang.String r0 = "FanClubSettingsRecommendations"
            r2.putString(r1, r0)
            java.lang.String r0 = "is_modal"
            r1 = 1
            r2.putBoolean(r0, r1)
            java.lang.String r0 = "action_tag_upcoming_live"
            r2.putBoolean(r0, r1)
            androidx.fragment.app.FragmentActivity r6 = r6.A01
            java.lang.String r0 = "live_scheduling_creation"
            X.3iT r0 = X.C63863iT.A02(r6, r2, r4, r3, r0)
        L_0x0da9:
            r0.A0I(r6)
            goto L_0x0cb7
        L_0x0dae:
            X.3HA r1 = r6.A03
            r0 = 1
            r1.A00(r0)
            goto L_0x0cb7
        L_0x0db6:
            X.3HA r1 = r6.A03
            r0 = 1
            r1.A01(r0)
            goto L_0x0cb7
        L_0x0dbe:
            java.lang.String r7 = "fan_club_exclusive_post_or_reel"
            r4 = 3
            goto L_0x0dc9
        L_0x0dc2:
            java.lang.String r7 = "reel_user_pay_subscriber_chat_story_sticker"
            r4 = 5
            goto L_0x0dc9
        L_0x0dc6:
            java.lang.String r7 = "universal_creation_story_camera"
            r4 = 2
        L_0x0dc9:
            com.instagram.service.session.UserSession r3 = r6.A04
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r0 = X.C18180wK.A06()
            androidx.fragment.app.FragmentActivity r2 = r6.A01
            X.3iT r1 = X.C63863iT.A03(r2, r0, r3, r1, r7)
            androidx.fragment.app.Fragment r0 = r6.A00
            if (r0 == 0) goto L_0x0de0
            r1.A0J(r0, r4)
            goto L_0x0cb7
        L_0x0de0:
            r1.A0H(r2, r4)
            goto L_0x0cb7
        L_0x0de5:
            java.lang.String r0 = "next_step_recommendations"
            r6.A01(r0)
            goto L_0x0cb7
        L_0x0dec:
            java.lang.IllegalArgumentException r7 = X.C18190wL.A0a(r0)
            throw r7
        L_0x0df1:
            java.lang.IllegalArgumentException r7 = X.C18190wL.A0a(r0)
            throw r7
        L_0x0df6:
            r1 = 832813137(0x31a3b851, float:4.7648787E-9)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            android.view.View r2 = (android.view.View) r2
            android.content.Context r6 = X.C18190wL.A0A(r2)
            java.lang.Object r5 = r0.A01
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            java.lang.String r4 = r5.BK7()
            java.lang.Object r3 = r0.A02
            X.19Z r3 = (X.AnonymousClass19Z) r3
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = r3.A00
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0e33
            com.instagram.model.mediatype.ProductType r2 = com.instagram.model.mediatype.ProductType.CLIPS
        L_0x0e19:
            r0 = 0
            X.C63153fH.A00(r6, r0, r2, r4)
            com.instagram.service.session.UserSession r0 = r3.A02
            X.495 r4 = X.AnonymousClass2O7.A00(r0)
            java.lang.String r0 = r5.getId()
            long r2 = java.lang.Long.parseLong(r0)
            r4.A00(r2)
            r0 = 1372431472(0x51cda470, float:1.10403387E11)
            goto L_0x1446
        L_0x0e33:
            com.instagram.model.mediatype.ProductType r2 = com.instagram.model.mediatype.ProductType.FEED
            goto L_0x0e19
        L_0x0e36:
            r1 = -287543976(0xffffffffeedc6d58, float:-3.4109445E28)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A00
            android.content.Context r1 = (android.content.Context) r1
            android.app.Activity r3 = X.C10040hd.A00(r1)
            boolean r1 = r3 instanceof androidx.fragment.app.FragmentActivity
            if (r1 == 0) goto L_0x0e5c
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            if (r3 == 0) goto L_0x0e5c
            java.lang.Object r1 = r0.A02
            X.19Z r1 = (X.AnonymousClass19Z) r1
            com.instagram.service.session.UserSession r2 = r1.A02
            X.0kW r1 = r1.A01
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.AnonymousClass3MW.A01(r3, r1, r2, r0)
        L_0x0e5c:
            r0 = 2078689137(0x7be64771, float:2.3913546E36)
            goto L_0x14e7
        L_0x0e61:
            r1 = -2050452376(0xffffffff85c89468, float:-1.8862425E-35)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2) r1
            java.lang.Object r1 = r1.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0100000_I2_1 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0100000_I2_1) r1
            java.lang.Object r2 = r1.A00
            X.0YP r2 = (X.AnonymousClass0YP) r2
            java.lang.Object r1 = r0.A00
            java.lang.Object r0 = r0.A01
            r2.invoke(r1, r0)
            r0 = -155180228(0xfffffffff6c0233c, float:-1.9485071E33)
            goto L_0x14e7
        L_0x0e80:
            r1 = -1159794483(0xffffffffbadef0cd, float:-0.001700902)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r2 = r0.A02
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Object r6 = r0.A01
            X.EIg r6 = (X.C26492EIg) r6
            android.view.View r0 = r3.getCurrentFocus()
            if (r0 == 0) goto L_0x0e9f
            X.C09860go.A0I(r0)
            r0.clearFocus()
        L_0x0e9f:
            X.CR0 r4 = new X.CR0
            r4.<init>()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = r2.token
            X.C18190wL.A13(r1, r0)
            r1 = 6
            kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15 r0 = new kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15
            r0.<init>(r6, r1)
            r4.A01 = r0
            X.Jj9 r2 = X.C18210wN.A0L(r2)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r6.A04
            android.content.Context r1 = r0.getContext()
            r0 = 2131829416(0x7f1122a8, float:1.92918E38)
            X.C18230wP.A10(r1, r2, r0)
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            r2.A0M = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A00 = r0
            r9 = 0
            r7 = 0
            r11 = 4095(0xfff, float:5.738E-42)
            X.17a r6 = new X.17a
            r8 = r7
            r10 = r9
            r12 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 2131232258(0x7f080602, float:1.808062E38)
            r6.A02 = r0
            r0 = 481(0x1e1, float:6.74E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r3, r0)
            r6.A04 = r0
            X.JPd r0 = r6.A01()
            r2.A0F = r0
            X.C18200wM.A16(r3, r4, r2)
            r0 = -4183893(0xffffffffffc028ab, float:NaN)
            goto L_0x14e7
        L_0x0ef6:
            r1 = -998174851(0xffffffffc4810f7d, float:-1032.484)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A02
            X.1Yb r2 = (X.C22431Yb) r2
            java.util.HashMap r3 = r2.A08
            java.util.Iterator r7 = X.C18190wL.A0u(r3)
        L_0x0f07:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0f5a
            java.util.Map$Entry r4 = X.C18180wK.A0o(r7)
            java.lang.Object r12 = r4.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r6 = r4.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r13 = r6.booleanValue()
            java.util.HashMap r5 = r2.A07
            java.lang.Object r4 = r5.get(r12)
            boolean r4 = X.C04220Ms.A0I(r4, r6)
            if (r4 != 0) goto L_0x0f4d
            if (r13 == 0) goto L_0x0f4d
            java.util.ArrayList r4 = r2.A05
        L_0x0f31:
            r4.add(r12)
        L_0x0f34:
            X.3hk r8 = r2.A00
            if (r8 != 0) goto L_0x0f3c
            java.lang.String r0 = "oneTapHelper"
            goto L_0x13cf
        L_0x0f3c:
            X.43W r9 = new X.43W
            r9.<init>(r2)
            java.lang.Integer r11 = X.AnonymousClass006.A0j
            X.0Oa r4 = r2.A09
            X.0i6 r10 = X.AnonymousClass0wJ.A0U(r4)
            r8.A0B(r9, r10, r11, r12, r13)
            goto L_0x0f07
        L_0x0f4d:
            java.lang.Object r4 = r5.get(r12)
            boolean r4 = X.C04220Ms.A0I(r4, r6)
            if (r4 != 0) goto L_0x0f34
            java.util.ArrayList r4 = r2.A06
            goto L_0x0f31
        L_0x0f5a:
            java.util.ArrayList r6 = r2.A05
            int r4 = r6.size()
            if (r4 <= 0) goto L_0x0f88
            java.lang.Object r4 = r0.A00
            X.3iC r4 = (X.C63723iC) r4
            com.instagram.service.session.UserSession r7 = r4.A08
            java.util.HashMap r13 = X.AnonymousClass0wJ.A0y()
            java.lang.String r5 = r6.toString()
            java.lang.String r4 = "uids"
            r13.put(r4, r5)
            int r4 = r6.size()
            X.C18220wO.A1O(r7, r13, r4)
            java.lang.String r8 = "logout_password_saving_multiaccount_opt_in"
            java.lang.String r9 = "logout_spi"
            java.lang.String r10 = "spi"
            java.lang.String r11 = "logout_interaction"
            r12 = 0
            X.AnonymousClass3LL.A00(r7, r8, r9, r10, r11, r12, r13)
        L_0x0f88:
            java.util.ArrayList r5 = r2.A06
            int r2 = r5.size()
            if (r2 <= 0) goto L_0x0fb6
            java.lang.Object r2 = r0.A00
            X.3iC r2 = (X.C63723iC) r2
            com.instagram.service.session.UserSession r6 = r2.A08
            java.util.HashMap r12 = X.AnonymousClass0wJ.A0y()
            java.lang.String r4 = r5.toString()
            java.lang.String r2 = "uids"
            r12.put(r2, r4)
            int r2 = r5.size()
            X.C18220wO.A1O(r6, r12, r2)
            java.lang.String r7 = "logout_password_saving_multiaccount_opt_out"
            java.lang.String r8 = "logout_spi"
            java.lang.String r9 = "spi"
            java.lang.String r10 = "logout_interaction"
            r11 = 0
            X.AnonymousClass3LL.A00(r6, r7, r8, r9, r10, r11, r12)
        L_0x0fb6:
            java.lang.Object r4 = r0.A00
            X.3iC r4 = (X.C63723iC) r4
            com.instagram.service.session.UserSession r5 = r4.A08
            java.util.HashMap r11 = X.AnonymousClass0wJ.A0y()
            java.util.Set r0 = r3.keySet()
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "uids"
            r11.put(r0, r2)
            java.util.Set r0 = r3.keySet()
            int r0 = r0.size()
            X.C18220wO.A1O(r5, r11, r0)
            java.lang.String r6 = "logout_password_saving_multiaccount_logout_clicked"
            java.lang.String r7 = "logout_spi"
            java.lang.String r8 = "logout"
            java.lang.String r9 = "logout_interaction"
            r10 = 0
            X.AnonymousClass3LL.A00(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            r0 = 1
            r4.A0D(r2, r0)
            r0 = 1029085294(0x3d56986e, float:0.052391462)
            goto L_0x1446
        L_0x0fef:
            r1 = -1841346391(0xffffffff923f48a9, float:-6.0358534E-28)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A00
            X.1b1 r5 = (X.AnonymousClass1b1) r5
            java.lang.Object r4 = r0.A02
            java.lang.Object r0 = r0.A01
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            r3 = r0 ^ 1
            X.1fI r2 = r5.A00
            java.util.Set r0 = r2.A00
            if (r3 == 0) goto L_0x102a
            r0.add(r4)
        L_0x100d:
            r2.A09()
            r2.D92()
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r5.A03
            X.1fI r0 = r5.A00
            java.util.Set r0 = r0.A00
            int r2 = r0.size()
            r0 = 3
            boolean r0 = X.AnonymousClass0wJ.A1T(r2, r0)
            r3.setEnabled(r0)
            r0 = 1367011984(0x517af290, float:6.7363209E10)
            goto L_0x1446
        L_0x102a:
            r0.remove(r4)
            goto L_0x100d
        L_0x102e:
            java.lang.Object r5 = r0.A00
            X.1bw r5 = (X.C23111bw) r5
            java.lang.Object r2 = r0.A01
            X.3UT r2 = (X.AnonymousClass3UT) r2
            java.lang.Object r6 = r0.A02
            android.view.View r6 = (android.view.View) r6
            java.util.List r1 = r2.A01
            int r0 = r2.A00
            int r0 = r0 + 1
            r2.A00 = r0
            java.lang.Object r0 = r1.get(r0)
            X.3AR r0 = (X.AnonymousClass3AR) r0
            java.util.List r4 = r0.A02
            boolean r2 = r2.A01()
            r0 = 2131299080(0x7f090b08, float:1.8216151E38)
            android.view.View r1 = X.C18180wK.A0E(r6, r0)
            if (r2 == 0) goto L_0x10ad
            r0 = 8
            r1.setVisibility(r0)
            r0 = 2131305747(0x7f092513, float:1.8229674E38)
            android.view.View r0 = X.C18180wK.A0E(r6, r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = (com.instagram.ui.widget.progressbutton.ProgressButton) r0
            r1 = 0
            r0.setVisibility(r1)
            r0 = 2131298080(0x7f090720, float:1.8214123E38)
            android.view.View r0 = X.C18180wK.A0E(r6, r0)
            r0.setVisibility(r1)
        L_0x1073:
            X.0i6 r2 = r5.getSession()
            X.22g r0 = r5.A06
            if (r0 != 0) goto L_0x10a8
            java.lang.String r1 = ""
        L_0x107d:
            X.AnonymousClass0wJ.A1N(r2, r1)
            X.2AF r0 = X.AnonymousClass2AF.A0F
            r3 = 0
            X.C63003bJ.A00(r0, r2, r1, r3)
            X.0i6 r2 = r5.getSession()
            X.22g r0 = r5.A06
            if (r0 != 0) goto L_0x10a3
            java.lang.String r1 = ""
        L_0x1090:
            X.AnonymousClass0wJ.A1N(r2, r1)
            X.2AF r0 = X.AnonymousClass2AF.A0V
            X.C63003bJ.A00(r0, r2, r1, r3)
            android.view.LayoutInflater r0 = r5.getLayoutInflater()
            r5.A04(r0, r6, r4)
            r5.A05(r6)
            return
        L_0x10a3:
            java.lang.String r1 = r0.toString()
            goto L_0x1090
        L_0x10a8:
            java.lang.String r1 = r0.toString()
            goto L_0x107d
        L_0x10ad:
            r0 = 577(0x241, float:8.09E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r5)
            goto L_0x1073
        L_0x10b3:
            r1 = 1910213084(0x71db89dc, float:2.1742041E30)
            int r1 = X.C14030oh.A05(r1)
            X.AhA r3 = X.AnonymousClass3LM.A00()
            java.lang.Object r6 = r0.A02
            X.4J8 r6 = (X.AnonymousClass4J8) r6
            com.instagram.service.session.UserSession r10 = r6.A01
            X.9zz r2 = X.C171799zz.A11
            X.AfR r5 = r3.A04(r2, r10)
            java.lang.Object r3 = r0.A01
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.String r2 = "caption"
            java.lang.String r7 = r3.getQueryParameter(r2)
            java.lang.String r2 = "hashtag"
            java.lang.String r4 = r3.getQueryParameter(r2)
            r3 = 1
            if (r7 == 0) goto L_0x1106
            boolean r2 = X.AnonymousClass8bQ.A0n(r7)
            r2 = r2 ^ 1
            if (r2 != r3) goto L_0x1106
        L_0x10e5:
            r2 = 0
            X.C04220Ms.A0B(r7, r2)
            r5.A0X = r7
        L_0x10eb:
            X.9zz r8 = X.C171799zz.A2v
            X.IcN r9 = r6.A00
            androidx.fragment.app.FragmentActivity r6 = r9.requireActivity()
            android.os.Bundle r7 = r5.A00()
            r11 = 0
            r12 = r11
            X.C18656Aj9.A00(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r0.A00
            X.AnonymousClass3Z9.A01(r0)
            r0 = 1138952430(0x43e308ee, float:454.06976)
            goto L_0x1446
        L_0x1106:
            if (r4 == 0) goto L_0x10eb
            boolean r2 = X.AnonymousClass8bQ.A0n(r4)
            r2 = r2 ^ 1
            if (r2 != r3) goto L_0x10eb
            java.lang.String r3 = "#"
            r2 = 32
            java.lang.String r7 = X.AnonymousClass00U.A0M(r3, r4, r2)
            goto L_0x10e5
        L_0x1119:
            r1 = -1441477215(0xffffffffaa14cda1, float:-1.3216382E-13)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1u0 r4 = (X.C28291u0) r4
            X.1tt r2 = r4.A08
            X.3CQ r2 = r2.A02
            if (r2 == 0) goto L_0x1140
            boolean r2 = r2.A04
            if (r2 == 0) goto L_0x1140
            java.lang.Object r2 = r0.A02
            X.4tx r2 = (X.C84844tx) r2
            java.lang.Object r0 = r0.A00
            X.4JW r0 = (X.AnonymousClass4JW) r0
            boolean r0 = r0.A00
            r2.C9K(r4, r0)
        L_0x113b:
            r0 = 1934650102(0x73506af6, float:1.6512561E31)
            goto L_0x1446
        L_0x1140:
            java.lang.Object r3 = r0.A02
            X.4tx r3 = (X.C84844tx) r3
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            r0 = 0
            r3.CE9(r4, r2, r0)
            goto L_0x113b
        L_0x114b:
            r1 = -1733051393(0xffffffff98b3bbff, float:-4.6460243E-24)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A02
            X.1u0 r4 = (X.C28291u0) r4
            X.1tt r2 = r4.A08
            X.3CQ r3 = r2.A02
            java.lang.Object r2 = r0.A00
            X.4JX r2 = (X.AnonymousClass4JX) r2
            boolean r2 = r2.A00
            if (r2 == 0) goto L_0x1175
            if (r3 == 0) goto L_0x1175
            boolean r2 = r3.A04
            if (r2 == 0) goto L_0x1175
            java.lang.Object r2 = r0.A01
            X.4tx r2 = (X.C84844tx) r2
            r0 = 1
            r2.C9K(r4, r0)
        L_0x1170:
            r0 = 6533119(0x63afff, float:9.15485E-39)
            goto L_0x1446
        L_0x1175:
            java.lang.Object r3 = r0.A01
            X.4tx r3 = (X.C84844tx) r3
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            r0 = 0
            r3.CE9(r4, r2, r0)
            goto L_0x1170
        L_0x1180:
            r1 = 1705117049(0x65a20579, float:9.564054E22)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A00
            X.1YC r5 = (X.AnonymousClass1YC) r5
            java.lang.Object r6 = r0.A01
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r8 = r0.A02
            X.0BO r8 = (X.AnonymousClass0BO) r8
            com.instagram.service.session.UserSession r0 = r5.A01
            X.0nS r2 = X.C13330nS.A02(r0)
            java.lang.String r0 = "account_switch_add_account_sheet_registration_button_tapped"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r0)
            r0 = 2
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x11bb
            java.lang.String r0 = r5.A02
            X.C18210wN.A1B(r3, r0)
            java.lang.Boolean r2 = X.C18180wK.A0X()
            java.lang.String r0 = "is_short_copy"
            r3.A0Q(r0, r2)
            r3.Bb4()
        L_0x11bb:
            java.lang.String r2 = r5.A02
            java.lang.String r0 = "settings"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x1204
            com.instagram.service.session.UserSession r7 = r5.A01
            r4 = 1
            r0 = 0
            X.C04220Ms.A0B(r7, r0)
            r2 = 36310963485409615(0x8100a10000014f, double:3.026537748462608E-306)
            boolean r0 = X.C67333zN.A06(r7, r2, r4)
            if (r0 == 0) goto L_0x1204
            android.content.Intent r4 = X.C62883b4.A00(r6)
            android.os.Bundle r3 = X.C18180wK.A06()
            com.instagram.service.session.UserSession r0 = r5.A01
            java.lang.String r0 = r0.token
            X.C18190wL.A13(r3, r0)
            java.lang.String r2 = "entry_point"
            java.lang.String r0 = "add_account_bottom_sheet"
            r3.putString(r2, r0)
            java.lang.String r0 = "show_personal_account_selector"
            X.C18220wO.A13(r6, r4, r3, r0)
        L_0x11f2:
            com.instagram.service.session.UserSession r2 = r5.A01
            java.lang.String r0 = "half_sheet_create_new_account_tapped"
            X.0rn r2 = X.C63313hF.A00(r2, r0)
            com.instagram.service.session.UserSession r0 = r5.A01
            X.C18180wK.A1K(r2, r0)
            r0 = 1002480168(0x3bc0a228, float:0.0058787055)
            goto L_0x1446
        L_0x1204:
            com.instagram.service.session.UserSession r3 = r5.A01
            r2 = 1
            java.lang.String r0 = r5.A02
            X.0R6 r0 = r8.A0C(r6, r3, r0, r2)
            android.os.Bundle r4 = r0.A00
            X.3YR r3 = X.AnonymousClass3YR.A00
            com.instagram.service.session.UserSession r2 = r5.A01
            r0 = 0
            r3.A03(r6, r4, r2, r0)
            goto L_0x11f2
        L_0x1218:
            r1 = 739491653(0x2c13bf45, float:2.0996132E-12)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A00
            X.1YC r6 = (X.AnonymousClass1YC) r6
            com.instagram.service.session.UserSession r1 = r6.A01
            X.0nS r2 = X.C13330nS.A02(r1)
            java.lang.String r1 = "account_switch_add_account_sheet_login_button_tapped"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 1
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r2, r1)
            boolean r1 = X.AnonymousClass0wJ.A1U(r3)
            if (r1 == 0) goto L_0x124b
            java.lang.String r1 = r6.A02
            X.C18210wN.A1B(r3, r1)
            java.lang.Boolean r2 = X.C18180wK.A0X()
            java.lang.String r1 = "is_short_copy"
            r3.A0Q(r1, r2)
            r3.Bb4()
        L_0x124b:
            java.lang.Object r4 = r0.A01
            android.app.Activity r4 = (android.app.Activity) r4
            X.3YR r3 = X.AnonymousClass3YR.A00
            com.instagram.service.session.UserSession r2 = r6.A01
            java.lang.Object r1 = r0.A02
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0 = 0
            r3.A03(r4, r1, r2, r0)
            com.instagram.service.session.UserSession r1 = r6.A01
            java.lang.String r0 = "half_sheet_log_into_existing_account_tapped"
            X.0rn r1 = X.C63313hF.A00(r1, r0)
            com.instagram.service.session.UserSession r0 = r6.A01
            X.C18180wK.A1K(r1, r0)
            r0 = 2071666633(0x7b7b1fc9, float:1.3039112E36)
            goto L_0x14e7
        L_0x126d:
            r1 = -974487519(0xffffffffc5ea8021, float:-7504.016)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A02
            X.3z5 r5 = (X.C67193z5) r5
            com.instagram.service.session.UserSession r4 = r5.A04
            java.lang.Object r2 = r0.A00
            X.0kW r2 = (X.C11630kW) r2
            X.3Rv r8 = new X.3Rv
            r8.<init>(r2, r4)
            java.lang.Object r2 = r0.A01
            X.493 r2 = (X.AnonymousClass493) r2
            java.lang.Boolean r9 = r2.A03
            java.lang.String r0 = r2.A05
            java.lang.String r6 = r2.A04
            X.29Z r7 = X.AnonymousClass29Z.WELCOME_MESSAGE_SETTINGS_ROW_CLICK
            r3 = 0
            if (r0 == 0) goto L_0x1299
            int r2 = r0.length()
            r0 = 0
            if (r2 != 0) goto L_0x129a
        L_0x1299:
            r0 = 1
        L_0x129a:
            java.lang.Boolean r10 = X.C18240wQ.A0X(r0)
            if (r6 == 0) goto L_0x12a6
            int r0 = r6.length()
            if (r0 != 0) goto L_0x12a7
        L_0x12a6:
            r3 = 1
        L_0x12a7:
            java.lang.Boolean r11 = X.C18240wQ.A0X(r3)
            r12 = 0
            java.lang.String r13 = "source_business_options"
            r14 = r12
            X.C61083Rv.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            X.C18190wL.A10()
            X.1aY r2 = new X.1aY
            r2.<init>()
            com.instagram.base.activity.BaseFragmentActivity r0 = r5.A01
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r0, r4)
            r0.A03 = r2
            r0.A05()
            r0 = 1758977428(0x68d7dd94, float:8.1551695E24)
            goto L_0x1446
        L_0x12ca:
            r1 = -989046164(0xffffffffc50c5a6c, float:-2245.6514)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A02
            com.instagram.ui.slidecardpageadapter.SlideCardViewModel$SlideCardSectionViewModel r1 = (com.instagram.ui.slidecardpageadapter.SlideCardViewModel.SlideCardSectionViewModel) r1
            android.net.Uri r3 = r1.A04
            if (r3 == 0) goto L_0x12eb
            java.lang.String r2 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r3)
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            r0.startActivity(r1)
        L_0x12eb:
            r0 = 534927212(0x1fe2576c, float:9.585935E-20)
            goto L_0x14e7
        L_0x12f0:
            java.lang.Object r2 = r0.A00
            X.3Ux r2 = (X.C61693Ux) r2
            java.lang.Object r1 = r0.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.A02
            X.24v r0 = (X.C312424v) r0
            X.C61693Ux.A00(r1, r0, r2)
            return
        L_0x1300:
            java.lang.Object r3 = r0.A00
            X.0yP r3 = (X.C19000yP) r3
            java.lang.Object r4 = r0.A01
            X.16t r4 = (X.C209416t) r4
            java.lang.Object r5 = r0.A02
            com.instagram.igds.components.switchbutton.IgSwitch r5 = (com.instagram.igds.components.switchbutton.IgSwitch) r5
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x131c
            java.lang.String r6 = r4.A04
        L_0x1312:
            r8 = 0
            java.lang.String r7 = "share_sheet_toggle"
            r3.A04(r4, r5, r6, r7, r8)
            r0 = 1
            r3.A08 = r0
            return
        L_0x131c:
            android.content.Context r2 = r18.getContext()
            com.instagram.service.session.UserSession r1 = r3.A0P
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            int r0 = X.C63803iN.A02(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r6 = X.C63143c0.A05(r2, r0)
            goto L_0x1312
        L_0x1331:
            r1 = -2046401549(0xffffffff860663f3, float:-2.527603E-35)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A01
            X.48N r1 = (X.AnonymousClass48N) r1
            X.3Vc r3 = r1.A00
            com.instagram.unifiedfeedback.api.graphql.FBCommentImpl r1 = r3.A05
            if (r1 == 0) goto L_0x1362
            com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Feedback r1 = r1.A00()
            if (r1 == 0) goto L_0x1362
            java.lang.String r1 = X.C18220wO.A0m(r1)
            if (r1 == 0) goto L_0x1362
            java.lang.Object r1 = r0.A00
            X.13q r1 = (X.C202313q) r1
            java.lang.Object r2 = r0.A02
            X.1l3 r2 = (X.AnonymousClass1l3) r2
            com.instagram.common.ui.base.IgTextView r1 = r1.A09
            r0 = 0
            r1.setOnClickListener(r0)
            X.3IU r1 = r2.A02
            r0 = 1
            r1.A01(r3, r0)
        L_0x1362:
            r0 = 152195660(0x912524c, float:1.7612807E-33)
            goto L_0x14e7
        L_0x1367:
            r1 = 2114840012(0x7e0de5cc, float:4.715358E37)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A01
            X.48N r1 = (X.AnonymousClass48N) r1
            X.3Vc r3 = r1.A00
            com.instagram.unifiedfeedback.api.graphql.FBCommentImpl r1 = r3.A05
            if (r1 == 0) goto L_0x1398
            com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Feedback r1 = r1.A00()
            if (r1 == 0) goto L_0x1398
            java.lang.String r1 = X.C18220wO.A0m(r1)
            if (r1 == 0) goto L_0x1398
            java.lang.Object r1 = r0.A00
            X.13q r1 = (X.C202313q) r1
            java.lang.Object r2 = r0.A02
            X.1l3 r2 = (X.AnonymousClass1l3) r2
            com.instagram.common.ui.base.IgTextView r1 = r1.A09
            r0 = 0
            r1.setOnClickListener(r0)
            X.3IU r1 = r2.A02
            r0 = 0
            r1.A01(r3, r0)
        L_0x1398:
            r0 = -786535378(0xffffffffd11e6c2e, float:-4.2526237E10)
            goto L_0x14e7
        L_0x139d:
            r1 = -198559736(0xfffffffff42a3808, float:-5.3944514E31)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A02
            X.1l3 r2 = (X.AnonymousClass1l3) r2
            X.3IU r3 = r2.A02
            java.lang.Object r2 = r0.A01
            X.48N r2 = (X.AnonymousClass48N) r2
            X.3Vc r7 = r2.A00
            com.instagram.unifiedfeedback.api.graphql.FBCommentImpl r8 = r7.A05
            if (r8 == 0) goto L_0x13df
            java.lang.String r2 = X.C18220wO.A0m(r8)
        L_0x13b8:
            java.lang.Object r0 = r0.A00
            X.13q r0 = (X.C202313q) r0
            android.view.View r0 = r0.A05
            int r6 = r0.getHeight()
            r13 = 0
            if (r8 == 0) goto L_0x1443
            if (r2 == 0) goto L_0x1443
            X.1dM r5 = r3.A00
            X.8wA r0 = r5.A03
            if (r0 != 0) goto L_0x13d4
            java.lang.String r0 = "recyclerViewAdapter"
        L_0x13cf:
            X.C04220Ms.A0E(r0)
            goto L_0x15cc
        L_0x13d4:
            int r3 = r0.A02(r2)
            X.4AC r4 = r5.A08
            if (r4 != 0) goto L_0x13e2
            java.lang.String r0 = "composerController"
            goto L_0x13cf
        L_0x13df:
            java.lang.String r2 = "TEMPORARY_COMMENT_KEY"
            goto L_0x13b8
        L_0x13e2:
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Author> r2 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Author.class
            java.lang.String r0 = "author"
            com.facebook.pando.TreeJNI r0 = r8.getTreeValue(r0, r2)
            if (r0 == 0) goto L_0x144a
            java.lang.String r9 = X.C18220wO.A0l(r0)
        L_0x13f0:
            X.C18240wQ.A1I(r9)
            android.content.Context r0 = r4.A0B
            android.content.res.Resources r2 = r0.getResources()
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
            java.util.ArrayDeque r11 = new java.util.ArrayDeque
            r11.<init>()
            r0 = 2131827188(0x7f1119f4, float:1.9287282E38)
            java.lang.String r0 = r2.getString(r0)
            r8.append(r0)
            r2 = 1
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r2)
            java.lang.String r10 = "{facebook_name}"
            java.lang.Object[] r12 = new java.lang.Object[]{r0}
            X.AnonymousClass2C8.A00(r8, r9, r10, r11, r12, r13)
            com.instagram.common.ui.base.IgTextView r2 = r4.A03
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r8)
            r2.setText(r0)
            com.instagram.common.ui.base.IgLinearLayout r0 = r4.A02
            r0.setVisibility(r13)
            r4.A04 = r7
            com.instagram.common.ui.base.IgEditText r0 = r4.A01
            r0.requestFocus()
            X.C09860go.A0K(r0)
            r4.A00 = r3
            android.os.Handler r4 = r5.A0D
            X.4Sj r0 = new X.4Sj
            r0.<init>(r5, r3, r6)
            r2 = 300(0x12c, double:1.48E-321)
            r4.postDelayed(r0, r2)
        L_0x1443:
            r0 = -2065840173(0xffffffff84ddc7d3, float:-5.214036E-36)
        L_0x1446:
            X.C14030oh.A0C(r0, r1)
            return
        L_0x144a:
            r9 = 0
            goto L_0x13f0
        L_0x144c:
            r1 = 1973347851(0x759ee60b, float:4.0285582E32)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A00
            X.13p r1 = (X.C202213p) r1
            com.instagram.common.ui.base.IgTextView r2 = r1.A03
            r1 = 0
            r2.setOnClickListener(r1)
            java.lang.Object r1 = r0.A02
            X.1kr r1 = (X.C24931kr) r1
            X.3IU r1 = r1.A01
            java.lang.Object r0 = r0.A01
            X.1lH r0 = (X.AnonymousClass1lH) r0
            X.3TH r6 = r0.A00
            r4 = 1
            java.lang.String r3 = r6.A04
            if (r3 == 0) goto L_0x147a
            X.1dM r2 = r1.A00
            r1 = 36
            kotlin.jvm.internal.KtLambdaShape4S0110000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape4S0110000_I2
            r0.<init>(r1, r6, r4)
            X.AnonymousClass1dM.A03(r2, r3, r0, r4)
        L_0x147a:
            r0 = -1140161280(0xffffffffbc0a8500, float:-0.008454561)
            goto L_0x14e7
        L_0x147e:
            r1 = -1768815698(0xffffffff969203ae, float:-2.3589894E-25)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A00
            X.13p r1 = (X.C202213p) r1
            com.instagram.common.ui.base.IgTextView r2 = r1.A03
            r1 = 0
            r2.setOnClickListener(r1)
            java.lang.Object r1 = r0.A02
            X.1kr r1 = (X.C24931kr) r1
            X.3IU r1 = r1.A01
            java.lang.Object r0 = r0.A01
            X.1lH r0 = (X.AnonymousClass1lH) r0
            X.3TH r6 = r0.A00
            r4 = 0
            java.lang.String r3 = r6.A04
            if (r3 == 0) goto L_0x14ac
            X.1dM r2 = r1.A00
            r1 = 36
            kotlin.jvm.internal.KtLambdaShape4S0110000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape4S0110000_I2
            r0.<init>(r1, r6, r4)
            X.AnonymousClass1dM.A03(r2, r3, r0, r4)
        L_0x14ac:
            r0 = 1280210001(0x4c4e7451, float:5.4120772E7)
            goto L_0x14e7
        L_0x14b0:
            r1 = 965927296(0x3992e180, float:2.80153E-4)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A01
            X.3B1 r1 = (X.AnonymousClass3B1) r1
            X.Ayd r4 = r1.A02
            android.view.View r1 = r4.A08()
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r1 = r1.isChecked()
            r3 = r1 ^ 1
            java.lang.Object r2 = r0.A00
            X.4sm r2 = (X.C84234sm) r2
            java.lang.Object r1 = r0.A02
            X.3Ce r1 = (X.C57713Ce) r1
            com.instagram.user.model.User r0 = r1.A01
            boolean r0 = r2.CSB(r0, r3)
            if (r0 == 0) goto L_0x14e4
            r1.A00 = r3
            android.view.View r0 = r4.A08()
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r3)
        L_0x14e4:
            r0 = 2095949903(0x7ceda84f, float:9.8719045E36)
        L_0x14e7:
            X.C14030oh.A0C(r0, r5)
            return
        L_0x14eb:
            java.lang.Object r5 = r0.A00
            X.CUH r5 = (X.CUH) r5
            java.lang.Object r3 = r0.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.Object r4 = r0.A02
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Integer r1 = X.AnonymousClass006.A00
            com.instagram.service.session.UserSession r0 = r5.A04
            X.C60503Pj.A01(r5, r0, r1)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = r3.getId()
            java.lang.String r0 = "shared_user_id"
            r2.put(r0, r1)
            java.lang.String r0 = "com.bloks.www.ig.bloks.your_shared_activity.entry"
            X.3iE r3 = X.C63743iE.A02(r0, r2)
            com.instagram.service.session.UserSession r0 = r5.A04
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r0)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131835689(0x7f113b29, float:1.9304524E38)
            X.C18210wN.A0s(r1, r2, r0)
            r3.A0C(r4, r2)
            return
        L_0x1525:
            A00(r0)
            return
        L_0x1529:
            r1 = -2019492103(0xffffffff87a0fef9, float:-2.4223984E-34)
            X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            java.lang.Object r1 = r0.A00
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r3 = r1.getId()
            java.lang.Object r2 = r0.A02
            android.view.View r2 = (android.view.View) r2
            java.lang.String r1 = "igds_people_cell_component"
            java.lang.String r0 = "deep_link"
            X.C25586DoM.A02(r4, r3, r0, r1)
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            X.C04220Ms.A0C(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.Drz r0 = new X.Drz
            r0.<init>(r1, r4)
            goto L_0x15c9
        L_0x1557:
            r1 = -1296473381(0xffffffffb2b962db, float:-2.1581789E-8)
            X.C14030oh.A05(r1)
            java.lang.Object r0 = r0.A02
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            r0.getUserId()
            goto L_0x15c9
        L_0x1565:
            java.lang.Object r2 = r0.A00
            X.CUH r2 = (X.CUH) r2
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            com.instagram.service.session.UserSession r0 = r2.A04
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            r2.A0M = r0
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131827629(0x7f111bad, float:1.9288176E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0O = r0
            r2.A00()
            goto L_0x15c9
        L_0x158a:
            java.lang.Object r4 = r0.A00
            X.CUH r4 = (X.CUH) r4
            java.lang.Object r1 = r0.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r2 = r1.getId()
            java.lang.String r0 = "user_following_relationship_alert_mute"
            X.0rn r1 = X.C15730rn.A00(r4, r0)
            java.lang.String r0 = "target_id"
            r1.A0D(r0, r2)
            com.instagram.service.session.UserSession r0 = r4.A04
            X.C18180wK.A1K(r1, r0)
            com.instagram.service.session.UserSession r0 = r4.A04
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            r2.A0M = r0
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131827628(0x7f111bac, float:1.9288174E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0O = r0
            r2.A00()
            r4.requireActivity()
        L_0x15c9:
            X.C60113Ns.A00()
        L_0x15cc:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape41S0300000_1_I2.onClick(android.view.View):void");
    }

    public static final void A00(IDxCListenerShape41S0300000_1_I2 iDxCListenerShape41S0300000_1_I2) {
        int A05 = C14030oh.A05(-564541533);
        C34238I9r i9r = (C34238I9r) iDxCListenerShape41S0300000_1_I2.A02;
        KJT kjt = (KJT) iDxCListenerShape41S0300000_1_I2.A01;
        L2B l2b = (L2B) iDxCListenerShape41S0300000_1_I2.A00;
        TextView textView = i9r.A04;
        textView.setClickable(false);
        textView.setAlpha(0.3f);
        if (l2b != null) {
            User user = kjt.A01;
            l2b.CVC(new IDxACallbackShape35S0200000_1_I2(56, kjt, i9r), new C24571jc(i9r), user, AnonymousClass006.A00);
        }
        C14030oh.A0C(-777449981, A05);
    }

    public IDxCListenerShape41S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public IDxCListenerShape41S0300000_1_I2(ViewGroup viewGroup, ViewGroup viewGroup2, AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment, int i) {
        this.A03 = i;
        this.A00 = accountTypeSelectionV2Fragment;
        if (10 - i != 0) {
            this.A02 = viewGroup;
            this.A01 = viewGroup2;
        } else {
            this.A01 = viewGroup;
            this.A02 = viewGroup2;
        }
    }

    public IDxCListenerShape41S0300000_1_I2(C84844tx r1, C28291u0 r2, AnonymousClass4JX r3, int i) {
        this.A03 = i;
        this.A00 = r3;
        if (54 - i != 0) {
            this.A02 = r2;
            this.A01 = r1;
        } else {
            this.A01 = r1;
            this.A02 = r2;
        }
    }

    public IDxCListenerShape41S0300000_1_I2(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass1YC r3, int i) {
        this.A03 = i;
        if (58 - i != 0) {
            this.A00 = r3;
            this.A01 = fragmentActivity;
            this.A02 = bundle;
            return;
        }
        this.A00 = r3;
        this.A01 = fragmentActivity;
        this.A02 = bundle;
    }

    public IDxCListenerShape41S0300000_1_I2(AnonymousClass3HX r1, C127397h3 r2, C109326jp r3, int i) {
        this.A03 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 18:
                this.A01 = r2;
                this.A02 = r3;
                this.A00 = r1;
                break;
            default:
                this.A02 = r2;
                this.A00 = r3;
                this.A01 = r1;
                break;
        }
    }

    public IDxCListenerShape41S0300000_1_I2(AnonymousClass48N r1, C202313q r2, AnonymousClass1l3 r3, int i) {
        this.A03 = i;
        switch (i) {
            case 68:
            case 69:
                this.A01 = r1;
                this.A00 = r2;
                this.A02 = r3;
                break;
            default:
                this.A02 = r3;
                this.A01 = r1;
                this.A00 = r2;
                break;
        }
    }

    public IDxCListenerShape41S0300000_1_I2(Context context, User user, CUH cuh, int i) {
        this.A03 = i;
        this.A00 = cuh;
        if (78 - i != 0) {
            this.A01 = user;
            this.A02 = context;
            return;
        }
        this.A01 = context;
        this.A02 = user;
    }
}
