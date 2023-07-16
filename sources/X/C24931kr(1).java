package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1kr  reason: invalid class name and case insensitive filesystem */
public final class C24931kr extends AnonymousClass1lO {
    public final C11630kW A00;
    public final AnonymousClass3IU A01;

    public C24931kr(C11630kW r2, AnonymousClass3IU r3) {
        C04220Ms.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final Class modelClass() {
        return AnonymousClass1lH.class;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C41882MfV r11, X.M5O r12) {
        /*
            r10 = this;
            X.1lH r11 = (X.AnonymousClass1lH) r11
            X.13p r12 = (X.C202213p) r12
            r2 = 0
            boolean r8 = X.AnonymousClass0wJ.A1Z(r11, r12)
            X.3TH r3 = r11.A00
            com.instagram.unifiedfeedback.api.graphql.FBFeedbackImpl$OwningProfile r9 = r3.A03
            r7 = 0
            if (r9 == 0) goto L_0x002b
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBFeedbackImpl$OwningProfile$ProfilePicture> r1 = com.instagram.unifiedfeedback.api.graphql.FBFeedbackImpl.OwningProfile.ProfilePicture.class
            java.lang.String r0 = "profile_picture(scale:1,width:150)"
            com.facebook.pando.TreeJNI r0 = r9.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = X.C18250wR.A0Y(r0)
            if (r0 == 0) goto L_0x002b
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r4 = r12.A06
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C18250wR.A0K(r0)
            X.0kW r0 = r10.A00
            r4.A09(r1, r0)
        L_0x002b:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r4 = r12.A06
            android.graphics.drawable.Drawable r0 = r12.A01
            r4.setBottomBadgeDrawable(r0)
            android.content.Context r6 = r12.A00
            r0 = 2
            float r0 = X.C09860go.A03(r6, r0)
            r4.A01 = r0
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165252(0x7f070044, float:1.7944716E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r4.A06 = r0
            r4.A05 = r2
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView.A02(r4)
            r0 = 226(0xe2, float:3.17E-43)
            X.AnonymousClass0wJ.A18(r4, r0, r10, r11)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            java.lang.String r4 = ""
            if (r9 == 0) goto L_0x0061
            java.lang.String r0 = X.C18220wO.A0l(r9)
            if (r0 != 0) goto L_0x0062
        L_0x0061:
            r0 = r4
        L_0x0062:
            r5.append(r0)
            int r9 = r5.length()
            r0 = 2131887420(0x7f12053c, float:1.9409447E38)
            android.text.style.TextAppearanceSpan r1 = new android.text.style.TextAppearanceSpan
            r1.<init>(r6, r0)
            r0 = 33
            r5.setSpan(r1, r2, r9, r0)
            int r0 = r5.length()
            X.C36062Pw.A00(r6, r5, r0)
            java.lang.String r1 = r3.A05
            if (r1 == 0) goto L_0x0093
            boolean r0 = X.AnonymousClass8bQ.A0n(r1)
            if (r0 != 0) goto L_0x0093
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r5.append(r0)
            r5.append(r1)
        L_0x0093:
            com.instagram.common.ui.base.IgTextView r0 = r12.A02
            r0.setText(r5)
            com.instagram.common.ui.base.IgTextView r5 = r12.A03
            r5.setVisibility(r2)
            java.lang.Integer r0 = r3.A01
            java.lang.String r1 = r3.A02
            if (r0 == 0) goto L_0x0122
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0122
            if (r0 != r8) goto L_0x0113
            r0 = 2131829614(0x7f11236e, float:1.9292202E38)
            r5.setText(r0)
        L_0x00b1:
            android.content.Context r1 = r5.getContext()
            r0 = 2130970053(0x7f0405c5, float:1.7548805E38)
            int r0 = X.C121907Is.A02(r1, r0)
            X.C18180wK.A0s(r1, r5, r0)
            r0 = 75
        L_0x00c1:
            X.C18200wM.A1E(r5, r12, r11, r10, r0)
            r1 = 7
            com.facebook.redex.IDxCListenerShape447S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape447S0100000_1_I2
            r0.<init>(r12, r1)
            r5.setOnLongClickListener(r0)
        L_0x00cd:
            java.lang.Integer r0 = r3.A00
            if (r0 == 0) goto L_0x0108
            int r5 = r0.intValue()
            if (r5 <= 0) goto L_0x0108
            com.instagram.common.ui.base.IgTextView r4 = r12.A04
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131689797(0x7f0f0145, float:1.900862E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0m(r1, r5, r0)
            r4.setText(r0)
            r4.setVisibility(r2)
            r1 = 6
            com.facebook.redex.IDxCListenerShape6S0201000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape6S0201000_1_I2
            r0.<init>(r5, r1, r10, r11)
            r4.setOnClickListener(r0)
        L_0x00f3:
            java.lang.String r1 = r3.A06
            if (r1 == 0) goto L_0x0107
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r0 = r12.A07
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r12.A05
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C18250wR.A0K(r1)
            X.0kW r0 = r10.A00
            r2.setUrl(r1, r0)
        L_0x0107:
            return
        L_0x0108:
            com.instagram.common.ui.base.IgTextView r1 = r12.A04
            r1.setText(r4)
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00f3
        L_0x0113:
            if (r1 == 0) goto L_0x0119
            r5.setText(r1)
            goto L_0x00b1
        L_0x0119:
            r5.setOnClickListener(r7)
            r0 = 8
            r5.setVisibility(r0)
            goto L_0x00cd
        L_0x0122:
            r0 = 2131829608(0x7f112368, float:1.929219E38)
            r5.setText(r0)
            android.content.Context r1 = r5.getContext()
            r0 = 2130970056(0x7f0405c8, float:1.7548811E38)
            int r0 = X.C121907Is.A02(r1, r0)
            X.C18180wK.A0s(r1, r5, r0)
            r0 = 74
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24931kr.bind(X.MfV, X.M5O):void");
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C202213p(C18180wK.A0D(layoutInflater, viewGroup, R.layout.row_fbcomment, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
