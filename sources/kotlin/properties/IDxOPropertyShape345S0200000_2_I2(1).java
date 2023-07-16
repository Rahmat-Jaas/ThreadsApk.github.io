package kotlin.properties;

import X.AnonymousClass86W;
import android.content.Context;
import com.facebookpay.widget.navibar.NavigationBar;

public class IDxOPropertyShape345S0200000_2_I2 extends AnonymousClass86W {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxOPropertyShape345S0200000_2_I2(int i, Object obj, Object obj2) {
        super((Object) null);
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r3 == null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        X.AnonymousClass7Fd.A03(r3, r8);
        r3.setLinkTextColor(X.AnonymousClass7Kz.A0G().A03((android.content.Context) r6.A00, 5));
        X.C18180wK.A0z(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e0, code lost:
        if (r4 == null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e2, code lost:
        r4.setEnabled(r3);
        r2 = X.AnonymousClass7Kz.A0G();
        r1 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00eb, code lost:
        if (r3 == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ed, code lost:
        r1 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ee, code lost:
        r0 = r0.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        if (r0 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f2, code lost:
        r0 = (android.content.Context) r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f6, code lost:
        r4.setTextColor(r2.A03(r0, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0134, code lost:
        r0 = r2.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0136, code lost:
        if (r0 != null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0138, code lost:
        r0 = (android.content.Context) r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013c, code lost:
        X.C116966xu.A00(r0, r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        X.C04220Ms.A0E(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Object r7, java.lang.Object r8, X.AnonymousClass0A5 r9) {
        /*
            r6 = this;
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x004e;
                case 1: goto L_0x001c;
                case 2: goto L_0x0029;
                case 3: goto L_0x006e;
                case 4: goto L_0x00bb;
                case 5: goto L_0x00ce;
                case 6: goto L_0x00fe;
                case 7: goto L_0x0120;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.697 r8 = (X.AnonymousClass697) r8
            java.lang.Object r2 = r6.A01
            com.facebookpay.widget.navibar.NavigationBar r2 = (com.facebookpay.widget.navibar.NavigationBar) r2
            com.facebookpay.widget.navibar.NavigationBar.A01(r2)
            com.facebookpay.widget.navibar.NavigationBar.A03(r2)
            android.widget.ImageView r1 = r2.A05
            if (r1 != 0) goto L_0x0134
            java.lang.String r1 = "rightIconButton"
        L_0x0017:
            X.C04220Ms.A0E(r1)
            r0 = 0
            throw r0
        L_0x001c:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L_0x006d
            java.lang.Object r0 = r6.A01
            com.facebookpay.widget.listcell.ListCell r0 = (com.facebookpay.widget.listcell.ListCell) r0
            android.widget.TextView r3 = r0.A0E
            java.lang.String r1 = "tertiaryTextView"
            goto L_0x0035
        L_0x0029:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L_0x006d
            java.lang.Object r0 = r6.A01
            com.facebookpay.widget.listcell.ListCell r0 = (com.facebookpay.widget.listcell.ListCell) r0
            android.widget.TextView r3 = r0.A0C
            java.lang.String r1 = "quaternaryTextView"
        L_0x0035:
            if (r3 == 0) goto L_0x0017
            X.AnonymousClass7Fd.A03(r3, r8)
            X.7Ec r2 = X.AnonymousClass7Kz.A0G()
            r1 = 5
            java.lang.Object r0 = r6.A00
            android.content.Context r0 = (android.content.Context) r0
            int r0 = r2.A03(r0, r1)
            r3.setLinkTextColor(r0)
            X.C18180wK.A0z(r3)
            return
        L_0x004e:
            android.view.View$OnClickListener r8 = (android.view.View.OnClickListener) r8
            java.lang.Object r0 = r6.A01
            com.facebookpay.widget.listcell.ListCell r0 = (com.facebookpay.widget.listcell.ListCell) r0
            android.widget.TextView r3 = r0.A0E
            java.lang.String r1 = "tertiaryTextView"
            if (r3 == 0) goto L_0x0017
            r3.setOnClickListener(r8)
            X.7Ec r2 = X.AnonymousClass7Kz.A0G()
            r1 = 5
            java.lang.Object r0 = r6.A00
            android.content.Context r0 = (android.content.Context) r0
            int r0 = r2.A03(r0, r1)
            r3.setTextColor(r0)
        L_0x006d:
            return
        L_0x006e:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r6.A01
            X.51J r0 = (X.AnonymousClass51J) r0
            android.widget.ImageView r5 = r0.A00
            java.lang.String r1 = "imageView"
            if (r5 == 0) goto L_0x0017
            r4 = 0
            if (r8 == 0) goto L_0x00ab
            X.6oc r2 = X.AnonymousClass7Kz.A0L()
            boolean r0 = r2.A00(r8)
            if (r0 == 0) goto L_0x00ab
            java.lang.String r1 = "ListCell"
            android.content.Context r0 = r2.A00
            X.5kC r2 = new X.5kC
            r2.<init>(r0, r8, r1)
            java.lang.Object r0 = r6.A00
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            float r0 = r1.getDimension(r0)
            r2.A00 = r0
            r0 = 1
            r2.A08 = r0
            r2.A02(r5)
        L_0x00a7:
            r5.setVisibility(r4)
            return
        L_0x00ab:
            X.7Ec r3 = X.AnonymousClass7Kz.A0G()
            r2 = 35
            r1 = 33
            java.lang.Object r0 = r6.A00
            android.content.Context r0 = (android.content.Context) r0
            X.C121097Ec.A01(r0, r5, r3, r2, r1)
            goto L_0x00a7
        L_0x00bb:
            boolean r3 = X.AnonymousClass0wJ.A1X(r8)
            java.lang.Object r0 = r6.A01
            com.facebookpay.widget.navibar.NavigationBar r0 = (com.facebookpay.widget.navibar.NavigationBar) r0
            com.facebookpay.widget.navibar.NavigationBar.A01(r0)
            com.facebookpay.widget.navibar.NavigationBar.A02(r0)
            android.widget.TextView r4 = r0.A0B
            java.lang.String r1 = "leftTextButton"
            goto L_0x00e0
        L_0x00ce:
            boolean r3 = X.AnonymousClass0wJ.A1X(r8)
            java.lang.Object r0 = r6.A01
            com.facebookpay.widget.navibar.NavigationBar r0 = (com.facebookpay.widget.navibar.NavigationBar) r0
            com.facebookpay.widget.navibar.NavigationBar.A01(r0)
            com.facebookpay.widget.navibar.NavigationBar.A03(r0)
            android.widget.TextView r4 = r0.A0C
            java.lang.String r1 = "rightTextButton"
        L_0x00e0:
            if (r4 == 0) goto L_0x0017
            r4.setEnabled(r3)
            X.7Ec r2 = X.AnonymousClass7Kz.A0G()
            r1 = 17
            if (r3 == 0) goto L_0x00ee
            r1 = 5
        L_0x00ee:
            X.4x8 r0 = r0.A0E
            if (r0 != 0) goto L_0x00f6
            java.lang.Object r0 = r6.A00
            android.content.Context r0 = (android.content.Context) r0
        L_0x00f6:
            int r0 = r2.A03(r0, r1)
            r4.setTextColor(r0)
            return
        L_0x00fe:
            X.697 r8 = (X.AnonymousClass697) r8
            java.lang.Object r2 = r6.A01
            com.facebookpay.widget.navibar.NavigationBar r2 = (com.facebookpay.widget.navibar.NavigationBar) r2
            com.facebookpay.widget.navibar.NavigationBar.A01(r2)
            android.widget.LinearLayout r0 = r2.A07
            if (r0 != 0) goto L_0x010f
            java.lang.String r1 = "navbarCenterContainer"
            goto L_0x0017
        L_0x010f:
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.facebook.redex.IDxLListenerShape382S0100000_2_I2 r0 = r2.A0F
            r1.addOnGlobalLayoutListener(r0)
            android.widget.ImageView r1 = r2.A06
            if (r1 != 0) goto L_0x0134
            java.lang.String r1 = "titleIconView"
            goto L_0x0017
        L_0x0120:
            X.697 r8 = (X.AnonymousClass697) r8
            java.lang.Object r2 = r6.A01
            com.facebookpay.widget.navibar.NavigationBar r2 = (com.facebookpay.widget.navibar.NavigationBar) r2
            com.facebookpay.widget.navibar.NavigationBar.A01(r2)
            com.facebookpay.widget.navibar.NavigationBar.A02(r2)
            android.widget.ImageView r1 = r2.A04
            if (r1 != 0) goto L_0x0134
            java.lang.String r1 = "leftIconButton"
            goto L_0x0017
        L_0x0134:
            X.4x8 r0 = r2.A0E
            if (r0 != 0) goto L_0x013c
            java.lang.Object r0 = r6.A00
            android.content.Context r0 = (android.content.Context) r0
        L_0x013c:
            X.C116966xu.A00(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.properties.IDxOPropertyShape345S0200000_2_I2.A02(java.lang.Object, java.lang.Object, X.0A5):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxOPropertyShape345S0200000_2_I2(Context context, NavigationBar navigationBar, Object obj, int i) {
        super(obj);
        this.A02 = i;
        this.A01 = navigationBar;
        this.A00 = context;
    }
}
