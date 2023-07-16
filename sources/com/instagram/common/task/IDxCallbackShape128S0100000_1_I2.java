package com.instagram.common.task;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.AnonymousClass1jB;
import X.AnonymousClass250;
import X.AnonymousClass4OD;
import X.AnonymousClass4OE;
import X.C04220Ms;
import X.C10650ih;
import X.C11630kW;
import X.C146958n9;
import X.C18180wK;
import X.C18210wN;
import X.C18250wR;
import X.C19440zs;
import X.C22651Yx;
import X.C30809GWj;
import X.C61693Ux;
import X.C62903b6;
import X.C63673i6;
import X.C63813iO;
import X.C72894Qd;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95;

public class IDxCallbackShape128S0100000_1_I2 extends C30809GWj {
    public Object A00;
    public final int A01;

    public IDxCallbackShape128S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void A02(Exception exc) {
        Exception exc2 = exc;
        switch (this.A01) {
            case 0:
                NametagController nametagController = ((C72894Qd) this.A00).A00;
                nametagController.A09.post(new AnonymousClass4OE(this));
                UserSession userSession = nametagController.A0F;
                C63673i6.A09(nametagController.A0E, userSession, userSession.getUserId(), "nametag_view", "system_share_sheet", exc2);
                return;
            case 1:
            case 2:
                C04220Ms.A0B(exc, 0);
                ((C146958n9) this.A00).resumeWith(new AnonymousClass1jB(exc));
                return;
            case 3:
                C22651Yx r2 = (C22651Yx) this.A00;
                C22651Yx.A02(r2);
                C22651Yx.A05(r2, new KtLambdaShape115S0100000_I2_95(r2, 31));
                return;
            case 4:
                C63813iO.A03(((C61693Ux) this.A00).A05, "SAVE_QR_CODE_error", 2131826851, 0);
                return;
            default:
                super.A02(exc);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        Object A03;
        int i;
        String str;
        switch (this.A01) {
            case 0:
                Uri uri = (Uri) obj;
                C72894Qd r2 = (C72894Qd) this.A00;
                NametagController nametagController = r2.A00;
                nametagController.A09.post(new AnonymousClass4OD(this));
                String str2 = r2.A01;
                Intent A05 = C18250wR.A05("android.intent.action.SEND");
                String str3 = nametagController.A02;
                if (str3 == null) {
                    str3 = StringFormatUtil.formatStrLocaleSafe("https://www.instagram.com/%s?r=nametag", (Object) str2);
                }
                A05.putExtra("android.intent.extra.TEXT", str3);
                A05.putExtra("ShareHandlerActivity.IS_FROM_INSTAGRAM", true);
                if (uri != null) {
                    A05.setType("image/png");
                    A05.putExtra(AnonymousClass000.A00(45), uri);
                    A05.setFlags(1);
                    A05.setClipData(ClipData.newRawUri("profile", uri));
                } else {
                    A05.setType(HTTP.PLAIN_TEXT_TYPE);
                }
                Activity activity = nametagController.A07;
                C10650ih.A0B(activity, Intent.createChooser(A05, activity.getString(2131835647)));
                UserSession userSession = nametagController.A0F;
                C11630kW r4 = nametagController.A0E;
                String userId = userSession.getUserId();
                String str4 = nametagController.A02;
                if (str4 == null) {
                    str4 = StringFormatUtil.formatStrLocaleSafe("https://www.instagram.com/%s?r=nametag", (Object) str2);
                }
                C63673i6.A0A(r4, userSession, userId, "nametag_view", "system_share_sheet", str4);
                return;
            case 1:
            case 2:
                C146958n9 r1 = (C146958n9) this.A00;
                if (obj != null) {
                    A03 = new AnonymousClass1jB(obj);
                } else {
                    A03 = C62903b6.A03();
                }
                r1.resumeWith(A03);
                return;
            case 3:
                String A0f = C18210wN.A0f(obj);
                C22651Yx r12 = (C22651Yx) this.A00;
                C22651Yx.A02(r12);
                C22651Yx.A01(r12);
                AnonymousClass250 r0 = (AnonymousClass250) ((C19440zs) r12.A0O.getValue()).A01.A08();
                if (r0 != null) {
                    C22651Yx.A04(r12, A0f, r0.A00);
                    return;
                }
                return;
            case 4:
                C61693Ux r3 = (C61693Ux) this.A00;
                Context context = r3.A05;
                if (((Boolean) obj).booleanValue()) {
                    i = 2131835213;
                    str = null;
                } else {
                    i = 2131826851;
                    str = "SAVE_QR_CODE result is null";
                }
                C63813iO.A03(context, str, i, 0);
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r3.A08, "ig_qr_code_download"), 1411);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    A0I.A0T("color", StringFormatUtil.formatStrLocaleSafe("#%06X", (Object) Integer.valueOf(16777215 & r3.A03.A01[0])));
                    A0I.A0S("entity_id", Long.valueOf(r3.A04));
                    A0I.A0T("source", r3.A07.getModuleName());
                    A0I.Bb4();
                    return;
                }
                return;
            default:
                super.A03(obj);
                return;
        }
    }

    public final void onStart() {
        switch (this.A01) {
            case 3:
                C22651Yx.A03((C22651Yx) this.A00);
                return;
            case 4:
                return;
            default:
                super.onStart();
                return;
        }
    }
}
