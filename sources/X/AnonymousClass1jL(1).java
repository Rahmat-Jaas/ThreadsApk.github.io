package X;

import android.content.Context;
import android.view.View;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.1jL  reason: invalid class name */
public final class AnonymousClass1jL extends C90995fQ {
    public final /* bridge */ /* synthetic */ View A0O(Context context) {
        C04220Ms.A0B(context, 0);
        return new IgdsBottomButtonLayout(context);
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        C04220Ms.A0B(context, 0);
        return new IgdsBottomButtonLayout(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        if (r7.A0T(36, false) != false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0P(android.view.View r12, X.AnonymousClass3HX r13, X.C127397h3 r14, java.lang.Object r15) {
        /*
            r11 = this;
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r12 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r12
            r5 = 0
            X.C04220Ms.A0B(r12, r5)
            X.AnonymousClass0wJ.A1O(r13, r14)
            r4 = 36
            X.7h3 r7 = r14.A0K(r4)
            r8 = 38
            X.7h3 r3 = r14.A0K(r8)
            r0 = 35
            java.util.List r0 = r14.A0Q(r0)
            X.36v r0 = X.AnonymousClass7B1.A00(r13, r14, r0)
            java.lang.CharSequence r0 = r0.A00
            r12.setFooterText(r0)
            r0 = 44
            r10 = 0
            if (r7 == 0) goto L_0x0098
            X.6jp r9 = r7.A0L(r0)
        L_0x002d:
            if (r3 == 0) goto L_0x0096
            X.6jp r6 = r3.A0L(r0)
        L_0x0033:
            r2 = 41
            if (r7 == 0) goto L_0x0094
            java.lang.String r1 = r7.A0N(r2)
        L_0x003b:
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r0.<init>((X.AnonymousClass3HX) r13, (X.C127397h3) r14, (X.C109326jp) r9, (int) r5)
            r12.setPrimaryAction(r1, r0)
            if (r3 == 0) goto L_0x0092
            java.lang.String r2 = r3.A0N(r2)
        L_0x0049:
            r1 = 1
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r0.<init>((X.AnonymousClass3HX) r13, (X.C127397h3) r14, (X.C109326jp) r6, (int) r1)
            r12.setSecondaryAction(r2, r0)
            r2 = 0
            if (r7 == 0) goto L_0x0063
            boolean r0 = r7.A0T(r8, r5)
            r12.setPrimaryActionIsLoading(r0)
            boolean r1 = r7.A0T(r4, r5)
            r0 = 1
            if (r1 == 0) goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            r12.setPrimaryButtonEnabled(r0)
            if (r3 == 0) goto L_0x0070
            boolean r0 = r3.A0T(r4, r5)
            if (r0 != 0) goto L_0x0070
            r2 = 1
        L_0x0070:
            r12.setSecondaryButtonEnabled(r2)
            r0 = 40
            java.lang.String r2 = r14.A0N(r0)
            if (r2 == 0) goto L_0x009a
            int r1 = r2.hashCode()
            r0 = 1843117444(0x6ddbbd84, float:8.500791E27)
            if (r1 != r0) goto L_0x009a
            java.lang.String r0 = "on_media"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x009a
            X.21F r0 = X.AnonymousClass21F.ON_MEDIA
            r12.setButtonType(r0)
            return r10
        L_0x0092:
            r2 = r10
            goto L_0x0049
        L_0x0094:
            r1 = r10
            goto L_0x003b
        L_0x0096:
            r6 = r10
            goto L_0x0033
        L_0x0098:
            r9 = r10
            goto L_0x002d
        L_0x009a:
            X.21F r0 = X.AnonymousClass21F.DEFAULT
            r12.setButtonType(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1jL.A0P(android.view.View, X.3HX, X.7h3, java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void A0R(View view, AnonymousClass3HX r4, C127397h3 r5, Object obj, Object obj2) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view;
        C04220Ms.A0B(igdsBottomButtonLayout, 0);
        igdsBottomButtonLayout.setPrimaryAction((CharSequence) null, (View.OnClickListener) null);
        igdsBottomButtonLayout.setSecondaryAction((CharSequence) null, (View.OnClickListener) null);
        igdsBottomButtonLayout.setOnClickListener((View.OnClickListener) null);
        igdsBottomButtonLayout.setButtonType(AnonymousClass21F.DEFAULT);
        igdsBottomButtonLayout.setSecondaryButtonEnabled(true);
        igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
        igdsBottomButtonLayout.setPrimaryActionIsLoading(false);
    }

    public AnonymousClass1jL(AnonymousClass3HX r1, C127397h3 r2) {
        super(r1, r2);
    }
}
