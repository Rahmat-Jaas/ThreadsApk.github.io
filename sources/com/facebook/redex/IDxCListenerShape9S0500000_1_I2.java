package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass06E;
import X.AnonymousClass0BO;
import X.AnonymousClass0wJ;
import X.AnonymousClass1j3;
import X.AnonymousClass25S;
import X.AnonymousClass3R0;
import X.AnonymousClass3W8;
import X.AnonymousClass3WJ;
import X.AnonymousClass7Ja;
import X.BKU;
import X.C04220Ms;
import X.C10300i6;
import X.C10650ih;
import X.C11630kW;
import X.C13330nS;
import X.C146958n9;
import X.C15430rJ;
import X.C18180wK;
import X.C18230wP;
import X.C18250wR;
import X.C25237DiI;
import X.C27952Ew2;
import X.C31155GhB;
import X.C32165H8c;
import X.C41026Luf;
import X.C41174LyD;
import X.C58533Ga;
import X.C62423Zt;
import X.C63493hb;
import X.C63873iU;
import X.C81224nO;
import X.C84854ty;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2;

public class IDxCListenerShape9S0500000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public IDxCListenerShape9S0500000_1_I2(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A05 = i;
        this.A01 = obj4;
        this.A04 = obj5;
        this.A00 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        switch (this.A05) {
            case 0:
                C41174LyD lyD = (C41174LyD) this.A04;
                C81224nO r8 = (C81224nO) this.A02;
                C84854ty r10 = (C84854ty) this.A01;
                Object obj = this.A03;
                Context context = (Context) this.A00;
                C41026Luf luf = new C41026Luf(context);
                luf.A08("Force Mode Options");
                Integer[] numArr = lyD.A01;
                int length = numArr.length;
                CharSequence[] charSequenceArr = new CharSequence[length];
                for (int i2 = 0; i2 < length; i2++) {
                    switch (numArr[i2].intValue()) {
                        case 1:
                            str = "Force On";
                            break;
                        case 2:
                            str = "Force Off";
                            break;
                        case 3:
                            str = "Ignore Enable Time";
                            break;
                        default:
                            str = ServerW3CShippingAddressConstants.DEFAULT;
                            break;
                    }
                    charSequenceArr[i2] = str;
                }
                luf.A06(new IDxCListenerShape7S0600000_1_I2(context, obj, lyD, r8, charSequenceArr, r10, 0), charSequenceArr, ((SharedPreferences) ((IGDevToolPersistentStateHandler) r10).A02.getValue()).getInt(AnonymousClass00U.A0L("/QP/force_mode/", Uri.encode(AnonymousClass1j3.A02(r8))), 0));
                C18250wR.A0u(luf);
                return;
            case 1:
                ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository = (ClipsDraftPreviewItemRepository) this.A01;
                String str2 = ((BKU) this.A04).A0f.A4Y;
                C04220Ms.A06(str2);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1101000_I2(clipsDraftPreviewItemRepository, str2, (C146958n9) null, 30), AnonymousClass7Ja.A03(clipsDraftPreviewItemRepository.A02), 3);
                C63873iU r1 = (C63873iU) this.A00;
                if (r1 != null) {
                    ((C32165H8c) this.A02).A00 = r1;
                }
                Fragment fragment = (Fragment) this.A03;
                C31155GhB.A01(fragment.requireContext(), AnonymousClass06E.A00(fragment), (C32165H8c) this.A02);
                return;
            case 2:
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) this.A03, "subscription_content_public_preview_upsell_cta"), 2745);
                C18230wP.A1H(A0I, ((C11630kW) this.A01).getModuleName());
                User user = (User) this.A02;
                C18250wR.A0x(A0I, AnonymousClass0wJ.A0d(user.getId()));
                A0I.Bb4();
                AnonymousClass3WJ.A01().A04((FragmentActivity) this.A00, (UserSession) this.A04, (Boolean) null, (Boolean) null, user.getId(), AnonymousClass3R0.A00(AnonymousClass006.A0A));
                return;
            case 3:
                if (i == 0) {
                    ((C58533Ga) this.A01).A00(AnonymousClass006.A0u);
                    C62423Zt.A02((C10300i6) this.A04);
                    Context context2 = (Context) this.A00;
                    C10650ih.A06(context2, C15430rJ.A01(AnonymousClass3W8.A01(context2.getApplicationContext(), "https://help.instagram.com/192435014247952?ref=igapp")));
                    return;
                }
                if (i != 1) {
                    ((C58533Ga) this.A01).A00(AnonymousClass006.A0C);
                }
                UserSession userSession = (UserSession) this.A04;
                C62423Zt.A02(userSession);
                Context context3 = (Context) this.A02;
                int i3 = 2131834026;
                if (i == 1) {
                    i3 = 2131835484;
                }
                String string = context3.getString(i3);
                int i4 = 2131822724;
                if (i == 1) {
                    i4 = 2131828982;
                }
                C63493hb.A01((Activity) this.A00, (AnonymousClass25S) this.A03, userSession, string, context3.getString(i4));
                return;
            case 4:
                Activity activity = (Activity) this.A01;
                ((AnonymousClass0BO) this.A00).A0J(activity, (Intent) this.A04, (UserSession) this.A02, (User) this.A03, "horizontal_switch", true, true);
                if (activity.isTaskRoot()) {
                    activity.finish();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
