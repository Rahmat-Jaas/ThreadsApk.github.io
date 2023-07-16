package com.facebook.redex;

import X.C04220Ms;
import X.C121907Is;
import X.C18220wO;
import X.C18240wQ;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import com.instagram.barcelona.R;

public class IDxCSpanShape0S1100000_1_I2 extends ClickableSpan {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxCSpanShape0S1100000_1_I2(String str, Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        r1.A07(r0);
        r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005d, code lost:
        com.instagram.simplewebview.SimpleWebViewActivity.A00(r3, r2, new X.C36941JhV(r4.A01).A00());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r5) {
        /*
            r4 = this;
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x0024;
                case 1: goto L_0x003d;
                case 2: goto L_0x0048;
                case 3: goto L_0x0053;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A00
            X.1x8 r0 = (X.AnonymousClass1x8) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0Oa r0 = r0.A01
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            java.lang.String r1 = r4.A01
            X.9wF r0 = X.C171209wF.A11
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r0, r1)
            java.lang.String r0 = "embeds_opt_out"
        L_0x001d:
            r1.A07(r0)
            r1.A04()
            return
        L_0x0024:
            java.lang.Object r0 = r4.A00
            X.1Zb r0 = (X.C22691Zb) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0Oa r0 = r0.A05
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            java.lang.String r1 = r4.A01
            X.9wF r0 = X.C171209wF.A1m
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r0, r1)
            java.lang.String r0 = "ProductEligibilityStatusFragment"
            goto L_0x001d
        L_0x003d:
            java.lang.Object r0 = r4.A00
            X.1bH r0 = (X.AnonymousClass1bH) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0i6 r2 = r0.A00
            goto L_0x005d
        L_0x0048:
            java.lang.Object r0 = r4.A00
            X.1Yr r0 = (X.C22591Yr) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0i6 r2 = r0.A02
            goto L_0x005d
        L_0x0053:
            java.lang.Object r0 = r4.A00
            X.1bw r0 = (X.C23111bw) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0i6 r2 = r0.A02
        L_0x005d:
            java.lang.String r1 = r4.A01
            X.JhV r0 = new X.JhV
            r0.<init>((java.lang.String) r1)
            com.instagram.simplewebview.SimpleWebViewConfig r0 = r0.A00()
            com.instagram.simplewebview.SimpleWebViewActivity.A00(r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCSpanShape0S1100000_1_I2.onClick(android.view.View):void");
    }

    public final void updateDrawState(TextPaint textPaint) {
        Context context;
        int i;
        switch (this.A02) {
            case 0:
                C04220Ms.A0B(textPaint, 0);
                context = C18240wQ.A0C(this.A00);
                if (context != null) {
                    textPaint.setUnderlineText(false);
                    i = C121907Is.A02(context, R.attr.textColorRegularLink);
                    break;
                } else {
                    return;
                }
            case 4:
                C04220Ms.A0B(textPaint, 0);
                context = C18220wO.A0A(this.A00);
                textPaint.setUnderlineText(false);
                i = R.color.igds_link;
                break;
            default:
                super.updateDrawState(textPaint);
                return;
        }
        textPaint.setColor(context.getColor(i));
    }
}
