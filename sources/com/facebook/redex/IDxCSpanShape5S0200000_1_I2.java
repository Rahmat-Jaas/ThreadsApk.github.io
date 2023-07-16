package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass1dP;
import X.C04220Ms;
import X.C10300i6;
import X.C171209wF;
import X.C18180wK;
import X.C18230wP;
import X.C18240wQ;
import X.C23971gg;
import X.C37350Jpy;
import X.C63863iT;
import android.app.Activity;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxCSpanShape5S0200000_1_I2 extends ClickableSpan {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCSpanShape5S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public final void onClick(View view) {
        C37350Jpy A0Y;
        String str;
        switch (this.A02) {
            case 0:
                Bundle A06 = C18180wK.A06();
                Activity activity = (Activity) this.A00;
                A06.putString(DialogModule.KEY_TITLE, activity.getResources().getString(2131823368));
                C63863iT.A08(activity, A06, (C10300i6) this.A01, TransparentModalActivity.class, "clips_account_settings");
                return;
            case 1:
                A0Y = C18230wP.A0Y((Activity) this.A00, (UserSession) this.A01, C171209wF.A26, "www.facebook.com/help/2808345489420767");
                str = "fb_to_ig_feed_default_audience";
                break;
            case 2:
                C04220Ms.A0B(view, 0);
                View.OnClickListener onClickListener = (View.OnClickListener) this.A00;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 3:
                ((Runnable) this.A01).run();
                return;
            case 4:
                return;
            case 5:
                ((C23971gg) this.A00).A00.A09.A03(((User) this.A01).getId());
                return;
            case 6:
                A0Y = C18230wP.A0Y(C18240wQ.A0I(this.A01), (UserSession) this.A00, C171209wF.A05, "https://help.instagram.com/517073653436611?helpref=faq_content");
                str = "privacy_switch_bottom_sheet";
                break;
            default:
                A0Y = new C37350Jpy(((View) this.A00).getContext(), AnonymousClass0wJ.A0X(((AnonymousClass1dP) this.A01).A02), C171209wF.A1L, "https://help.instagram.com/517073653436611?helpref=faq_content");
                str = "invite_collaborators_bottom_sheet_fragment";
                break;
        }
        A0Y.A07(str);
        A0Y.A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        r3.setColor(r0.getColor(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        r3.setUnderlineText(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateDrawState(android.text.TextPaint r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 1: goto L_0x0009;
                case 2: goto L_0x0016;
                case 3: goto L_0x0021;
                case 4: goto L_0x0021;
                case 5: goto L_0x0031;
                case 6: goto L_0x003a;
                case 7: goto L_0x003a;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.updateDrawState(r3)
            return
        L_0x0009:
            r1 = 0
            X.C04220Ms.A0B(r3, r1)
            super.updateDrawState(r3)
            int r0 = r3.linkColor
            r3.setColor(r0)
            goto L_0x002d
        L_0x0016:
            X.C18240wQ.A0t(r3)
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            r1 = 2131100000(0x7f060160, float:1.781237E38)
            goto L_0x0049
        L_0x0021:
            java.lang.Object r0 = r2.A00
            android.content.Context r0 = (android.content.Context) r0
            int r0 = X.C18210wN.A01(r0)
            r3.setColor(r0)
            r1 = 0
        L_0x002d:
            r3.setUnderlineText(r1)
            return
        L_0x0031:
            r0 = 0
            r3.setUnderlineText(r0)
            r0 = 1
            r3.setFakeBoldText(r0)
            return
        L_0x003a:
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r0 = r0.requireContext()
            r1 = 2131100082(0x7f0601b2, float:1.7812535E38)
        L_0x0049:
            int r0 = r0.getColor(r1)
            r3.setColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCSpanShape5S0200000_1_I2.updateDrawState(android.text.TextPaint):void");
    }
}
