package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.4VB  reason: invalid class name */
public final class AnonymousClass4VB implements C83234r0 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ ViewGroup A04;
    public final /* synthetic */ RoundedCornerImageView A05;
    public final /* synthetic */ AnonymousClass1c1 A06;
    public final /* synthetic */ IgdsListCell A07;

    public AnonymousClass4VB(View view, View view2, View view3, View view4, ViewGroup viewGroup, RoundedCornerImageView roundedCornerImageView, AnonymousClass1c1 r7, IgdsListCell igdsListCell) {
        this.A03 = view;
        this.A05 = roundedCornerImageView;
        this.A04 = viewGroup;
        this.A01 = view2;
        this.A07 = igdsListCell;
        this.A00 = view3;
        this.A02 = view4;
        this.A06 = r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r7, X.C146958n9 r8) {
        /*
            r6 = this;
            X.17E r7 = (X.AnonymousClass17E) r7
            android.view.View r2 = r6.A03
            boolean r1 = r7.A07
            r5 = 0
            int r0 = X.C18190wL.A00(r1)
            r2.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r4 = r6.A05
            X.1c1 r3 = r6.A06
            r0 = r1 ^ 1
            int r0 = X.C18190wL.A00(r0)
            r4.setVisibility(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r7.A01
            if (r0 == 0) goto L_0x0093
            r4.setUrl(r0, r3)
            r0 = 2131837646(0x7f1142ce, float:1.9308493E38)
            java.lang.String r0 = r3.getString(r0)
        L_0x0029:
            r4.setContentDescription(r0)
        L_0x002c:
            android.widget.ImageView$ScaleType r0 = r7.A00
            r4.setScaleType(r0)
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0091
            android.content.Context r1 = r3.requireContext()
            r0 = 2131231381(0x7f080295, float:1.8078841E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
        L_0x0040:
            r4.setBackground(r0)
            boolean r0 = r7.A08
            r4.setEnabled(r0)
            X.Dre r1 = new X.Dre
            r1.<init>(r4)
            X.1m2 r0 = new X.1m2
            r0.<init>(r3, r7)
            r1.A02 = r0
            r1.A03()
            android.view.ViewGroup r1 = r6.A04
            boolean r0 = r7.A09
            int r0 = X.C18190wL.A00(r0)
            r1.setVisibility(r0)
            android.view.View r1 = r6.A01
            boolean r0 = r7.A05
            int r0 = X.C18190wL.A00(r0)
            r1.setVisibility(r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r6.A07
            r0 = 104(0x68, float:1.46E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r3, r7, r0)
            r1.A0B(r0)
            android.view.View r1 = r6.A00
            boolean r0 = r7.A04
            int r0 = X.C18190wL.A00(r0)
            r1.setVisibility(r0)
            android.view.View r1 = r6.A02
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x008b
            r5 = 8
        L_0x008b:
            r1.setVisibility(r5)
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0091:
            r0 = 0
            goto L_0x0040
        L_0x0093:
            java.lang.String r2 = r7.A02
            if (r2 == 0) goto L_0x00b2
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            android.graphics.Bitmap r0 = X.C31176Gi6.A0B(r2, r1, r0)
            if (r0 == 0) goto L_0x00a9
            r4.setImageBitmap(r0)
            goto L_0x002c
        L_0x00a9:
            java.lang.String r1 = "FanClubPromoAndWelcomeVideoFragment_imageFilePath is null"
            java.lang.String r0 = ""
            X.C10450iM.A03(r1, r0)
            goto L_0x002c
        L_0x00b2:
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x002c
            X.0Oa r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r4.setImageDrawable(r0)
            X.0Oa r0 = r3.A05
            X.23Z r0 = X.C62793ak.A08(r0)
            android.content.Context r2 = r3.requireContext()
            int r1 = r0.ordinal()
            if (r1 == r5) goto L_0x00dd
            r0 = 1
            if (r1 != r0) goto L_0x00e1
            r0 = 2131837656(0x7f1142d8, float:1.9308513E38)
        L_0x00d7:
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r2, r0)
            goto L_0x0029
        L_0x00dd:
            r0 = 2131837627(0x7f1142bb, float:1.9308454E38)
            goto L_0x00d7
        L_0x00e1:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VB.emit(java.lang.Object, X.8n9):java.lang.Object");
    }
}
