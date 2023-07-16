package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.barcelona.R;

/* renamed from: X.1ky  reason: invalid class name and case insensitive filesystem */
public final class C25001ky extends AnonymousClass1lO {
    public final int A00;
    public final C11630kW A01;
    public final AnonymousClass1ap A02;

    public final Class modelClass() {
        return AnonymousClass197.class;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C41882MfV r7, X.M5O r8) {
        /*
            r6 = this;
            X.197 r7 = (X.AnonymousClass197) r7
            X.13e r8 = (X.C201113e) r8
            boolean r4 = X.AnonymousClass0wJ.A1Y(r7, r8)
            com.instagram.common.typedurl.ImageUrl r3 = r7.A01
            r5 = 0
            if (r3 == 0) goto L_0x0024
            com.instagram.common.typedurl.ImageUrl r2 = r7.A02
            if (r2 != 0) goto L_0x001d
            java.lang.Integer r0 = r7.A04
            r1 = 32
            if (r0 == 0) goto L_0x0086
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0086
        L_0x001d:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r8.A05
            X.0kW r0 = r6.A01
            r1.A0A(r3, r2, r0)
        L_0x0024:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r8.A05
            r1.setGradientSpinnerVisible(r4)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r8.A03
            android.content.Context r0 = r3.getContext()
            r2 = 8
            int r0 = X.C18210wN.A02(r0)
            X.C09860go.A0W(r1, r0)
            android.widget.CheckBox r1 = r8.A00
            r1.setVisibility(r2)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r8.A04
            r0.setVisibility(r2)
            r1.setOnCheckedChangeListener(r5)
            X.4rF r0 = r7.A00
            if (r0 == 0) goto L_0x0077
            int r1 = r0.ARt()
            r0 = 2
            if (r1 != r0) goto L_0x0077
        L_0x0050:
            r0 = 1
        L_0x0051:
            android.widget.TextView r2 = r8.A01
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r7.A06
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r0)
            android.content.Context r0 = X.C18190wL.A0A(r2)
            X.C63153fH.A01(r0, r1, r4)
        L_0x0062:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.setText(r1)
            android.widget.TextView r1 = r8.A02
            java.lang.String r0 = r7.A07
            r1.setText(r0)
            r0 = 70
            X.AnonymousClass0wJ.A18(r3, r0, r6, r7)
            return
        L_0x0074:
            java.lang.String r1 = r7.A06
            goto L_0x0062
        L_0x0077:
            java.lang.Integer r0 = r7.A04
            r1 = 28
            if (r0 == 0) goto L_0x0084
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0084
            goto L_0x0050
        L_0x0084:
            r0 = 0
            goto L_0x0051
        L_0x0086:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r8.A05
            X.0kW r0 = r6.A01
            r1.A09(r3, r0)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25001ky.bind(X.MfV, X.M5O):void");
    }

    public C25001ky(C11630kW r1, AnonymousClass1ap r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.edit_channels_channel_item, viewGroup, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater));
        C04220Ms.A0C(inflate, C28174Ezk.A00(2));
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        constraintLayout.setBackgroundColor(this.A00);
        C201113e r3 = new C201113e(constraintLayout);
        C09860go.A0e(r3.A00, r3.A03, R.dimen.account_section_text_margin_horizontal);
        return r3;
    }
}
