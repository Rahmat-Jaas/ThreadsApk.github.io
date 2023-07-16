package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.5yU  reason: invalid class name */
public final class AnonymousClass5yU extends AnonymousClass436 {
    public final C11630kW A00;
    public final GenericSurveyFragment A01;
    public final UserSession A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass5yU(C11630kW r1, GenericSurveyFragment genericSurveyFragment, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = r1;
        this.A01 = genericSurveyFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r13, android.view.View r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r12 = this;
            r0 = -135031263(0xfffffffff7f39621, float:-9.88104E33)
            int r2 = X.C14030oh.A03(r0)
            r8 = 1
            int r1 = X.C18200wM.A02(r8, r14, r15)
            if (r13 != 0) goto L_0x00c6
            com.instagram.service.session.UserSession r0 = r12.A02
            java.lang.Object r6 = r14.getTag()
            if (r6 == 0) goto L_0x00d4
            X.6mG r6 = (X.C110776mG) r6
            X.BKU r15 = (X.BKU) r15
            X.0kW r11 = r12.A00
            com.instagram.genericsurvey.fragment.GenericSurveyFragment r5 = r12.A01
            r10 = 0
            X.C04220Ms.A0B(r6, r8)
            X.C04220Ms.A0B(r15, r1)
            com.instagram.feed.widget.IgProgressImageView r4 = r6.A04
            android.content.Context r9 = r4.getContext()
            com.instagram.user.model.User r3 = r15.A2Z(r0)
            if (r3 == 0) goto L_0x00c1
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r6.A03
            com.instagram.common.typedurl.ImageUrl r0 = r3.B4M()
            r1.setUrl(r0, r11)
            android.widget.TextView r7 = r6.A02
            java.lang.String r0 = r3.BK7()
            r7.setText(r0)
            r4.setAdjustViewBounds(r8)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r15.A2J(r9)
            if (r0 == 0) goto L_0x004f
            r4.setUrl(r0, r11)
        L_0x004f:
            boolean r0 = r15.BSA()
            if (r0 == 0) goto L_0x00ab
            X.0Oa r0 = r6.A05
            java.lang.Object r3 = r0.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 2131231713(0x7f0803e1, float:1.8079515E38)
        L_0x0060:
            r3.setImageResource(r0)
        L_0x0063:
            android.widget.TextView r8 = r6.A01
            boolean r1 = r15.BYi()
            r0 = 1
            java.lang.String r3 = X.C28174Ezk.A00(r0)
            if (r1 == 0) goto L_0x009a
            r8.setVisibility(r10)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131824842(0x7f1110ca, float:1.9282523E38)
            java.lang.String r0 = r1.getString(r0)
            r8.setText(r0)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            X.C04220Ms.A0C(r1, r3)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 48
        L_0x008c:
            r1.gravity = r0
            r0 = 17
            X.C86144wL.A1C(r4, r15, r5, r6, r0)
            r0 = 2069380761(0x7b583e99, float:1.12280575E36)
            X.C14030oh.A0A(r0, r2)
            return
        L_0x009a:
            r0 = 8
            r8.setVisibility(r0)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            X.C04220Ms.A0C(r1, r3)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 16
            goto L_0x008c
        L_0x00ab:
            boolean r1 = r15.BZm()
            X.0Oa r0 = r6.A05
            java.lang.Object r3 = r0.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r1 == 0) goto L_0x00bd
            r0 = 2131231695(0x7f0803cf, float:1.8079478E38)
            goto L_0x0060
        L_0x00bd:
            X.C09860go.A0J(r3)
            goto L_0x0063
        L_0x00c1:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            throw r1
        L_0x00c6:
            r0 = 16
            java.lang.String r0 = X.I17.A00(r0)
            java.lang.UnsupportedOperationException r1 = X.C86134wK.A0s(r0)
            r0 = 1039208076(0x3df10e8c, float:0.11770353)
            goto L_0x00db
        L_0x00d4:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            r0 = 116318244(0x6eee024, float:8.9854995E-35)
        L_0x00db:
            X.C14030oh.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5yU.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(760225488, viewGroup);
        if (i == 0) {
            View A0D = C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.feed_preview_content_view, false);
            A0D.setTag(new C110776mG(A0D));
            C14030oh.A0A(-1490544750, A002);
            return A0D;
        }
        UnsupportedOperationException A0s = C86134wK.A0s(I17.A00(43));
        C14030oh.A0A(1688248671, A002);
        throw A0s;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }
}
