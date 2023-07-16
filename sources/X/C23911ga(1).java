package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1ga  reason: invalid class name and case insensitive filesystem */
public final class C23911ga extends AnonymousClass436 {
    public final C11630kW A00;
    public final AnonymousClass4L1 A01;
    public final UserSession A02;
    public final C67233zC A03;
    public final boolean A04;

    public final int getViewTypeCount() {
        return 1;
    }

    public C23911ga(C11630kW r1, AnonymousClass4L1 r2, UserSession userSession, C67233zC r4, boolean z) {
        this.A02 = userSession;
        this.A03 = r4;
        this.A04 = z;
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        if (X.C67253zE.A02(r7) != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r7, 36328096109963542L) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003c, code lost:
        if (X.C67253zE.A02(r7) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r15, android.view.View r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r14 = this;
            r0 = 1016780039(0x3c9ad507, float:0.018900407)
            int r3 = X.C14030oh.A03(r0)
            r0 = r16
            r1 = r17
            X.AnonymousClass0wJ.A1O(r0, r1)
            java.lang.Object r4 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.YourStoryRowViewBinder.Holder"
            X.C04220Ms.A0C(r4, r0)
            X.3Cz r4 = (X.C57913Cz) r4
            com.instagram.service.session.UserSession r7 = r14.A02
            X.0kW r2 = r14.A00
            boolean r6 = X.AnonymousClass0wJ.A1X(r1)
            boolean r1 = r14.A04
            X.3zC r0 = r14.A03
            boolean r13 = r0.A06()
            X.4L1 r8 = r14.A01
            r9 = 0
            X.C04220Ms.A0B(r4, r9)
            boolean r0 = X.C67373zR.A08(r7)
            if (r0 == 0) goto L_0x003e
            if (r1 == 0) goto L_0x003e
            boolean r0 = X.C67253zE.A02(r7)
            r12 = 1
            if (r0 == 0) goto L_0x003f
        L_0x003e:
            r12 = 0
        L_0x003f:
            boolean r0 = X.C67373zR.A08(r7)
            if (r0 != 0) goto L_0x004e
            if (r1 == 0) goto L_0x004e
            boolean r1 = X.C67253zE.A02(r7)
            r0 = 1
            if (r1 == 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r11 = 1
            if (r0 == 0) goto L_0x0060
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r0 = 36328096109963542(0x81103600002916, double:3.037372489218053E-306)
            boolean r0 = X.C63803iN.A0E(r5, r7, r0)
            r10 = 1
            if (r0 != 0) goto L_0x0061
        L_0x0060:
            r10 = 0
        L_0x0061:
            android.widget.ImageView r5 = r4.A04
            if (r6 == 0) goto L_0x00f8
            android.graphics.drawable.Drawable r0 = r4.A01
            r5.setImageDrawable(r0)
            if (r12 != 0) goto L_0x00f3
            if (r10 != 0) goto L_0x00f3
            android.view.View r1 = r4.A03
            r0 = 0
        L_0x0071:
            r1.setOnClickListener(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r4.A06
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r7)
            X.C18220wO.A1L(r2, r1, r0)
            if (r6 == 0) goto L_0x00f0
            android.graphics.drawable.Drawable r0 = r4.A01
        L_0x0081:
            r5.setImageDrawable(r0)
            if (r12 == 0) goto L_0x00ee
            if (r13 == 0) goto L_0x00ee
        L_0x0088:
            X.14I r6 = new X.14I
            r6.<init>()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r11)
            java.lang.String r0 = "is_xpost_enabled"
            r6.A07(r0, r5)
            if (r12 == 0) goto L_0x00c7
            java.lang.Boolean r0 = r4.A00
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x00a9
            X.2AC r2 = X.AnonymousClass2AC.IG_STORY_SHARE_SHEET_SHARING_OPTIONS
            X.29d r1 = X.C318329d.VIEW
            X.293 r0 = X.AnonymousClass293.STORY
            X.C49212r1.A00(r1, r0, r2, r6, r7)
        L_0x00a9:
            android.widget.TextView r1 = r4.A05
            r1.setVisibility(r9)
            r0 = 2131834104(0x7f1134f8, float:1.9301309E38)
            if (r13 == 0) goto L_0x00b6
            r0 = 2131834105(0x7f1134f9, float:1.930131E38)
        L_0x00b6:
            r1.setText(r0)
            r0 = 289(0x121, float:4.05E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r8)
        L_0x00be:
            r4.A00 = r5
            r0 = 1384306887(0x5282d8c7, float:2.80991334E11)
            X.C14030oh.A0A(r0, r3)
            return
        L_0x00c7:
            if (r10 == 0) goto L_0x00d5
            android.widget.TextView r1 = r4.A05
            r1.setVisibility(r9)
            r0 = 2131834104(0x7f1134f8, float:1.9301309E38)
            r1.setText(r0)
            goto L_0x00be
        L_0x00d5:
            java.lang.Boolean r0 = r4.A00
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x00e6
            X.2AC r2 = X.AnonymousClass2AC.IG_STORY_SHARE_SHEET_SHARING_OPTIONS
            X.29d r1 = X.C318329d.UNAVAILABLE
            X.293 r0 = X.AnonymousClass293.STORY
            X.C49212r1.A00(r1, r0, r2, r6, r7)
        L_0x00e6:
            android.widget.TextView r1 = r4.A05
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00be
        L_0x00ee:
            r11 = 0
            goto L_0x0088
        L_0x00f0:
            android.graphics.drawable.Drawable r0 = r4.A02
            goto L_0x0081
        L_0x00f3:
            android.view.View r1 = r4.A03
            r0 = 287(0x11f, float:4.02E-43)
            goto L_0x0101
        L_0x00f8:
            android.graphics.drawable.Drawable r0 = r4.A02
            r5.setImageDrawable(r0)
            android.view.View r1 = r4.A03
            r0 = 288(0x120, float:4.04E-43)
        L_0x0101:
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r8, r0)
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23911ga.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(454402940, viewGroup);
        Context context = viewGroup.getContext();
        View A0D = C18180wK.A0D(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_add_to_story, false);
        C04220Ms.A06(context);
        A0D.setTag(new C57913Cz(A0D, context));
        C14030oh.A0A(1845121093, A002);
        return A0D;
    }
}
