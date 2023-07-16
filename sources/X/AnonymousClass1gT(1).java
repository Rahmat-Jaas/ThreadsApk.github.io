package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1gT  reason: invalid class name */
public final class AnonymousClass1gT extends AnonymousClass436 {
    public final C85874vu A00;
    public final UserSession A01;
    public final User A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gT(C85874vu r1, UserSession userSession, User user) {
        this.A00 = r1;
        this.A02 = user;
        this.A01 = userSession;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007c, code lost:
        r7 = android.telephony.PhoneNumberUtils.formatNumber(r7, X.C31103Gfm.A02().getCountry());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r11, android.view.View r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            r10 = this;
            r0 = 223608692(0xd53ff74, float:6.5326885E-31)
            int r2 = X.C14030oh.A03(r0)
            X.AnonymousClass0wJ.A1O(r12, r13)
            java.lang.Object r5 = r12.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.bindergroup.ContactOptionViewBinder.Holder"
            X.C04220Ms.A0C(r5, r0)
            X.3AY r5 = (X.AnonymousClass3AY) r5
            X.254 r13 = (X.AnonymousClass254) r13
            com.instagram.user.model.User r4 = r10.A02
            com.instagram.service.session.UserSession r9 = r10.A01
            X.4vu r3 = r10.A00
            java.lang.String r0 = "Cannot bind contact options with a Null User."
            X.AnonymousClass7Ko.A07(r4, r0)
            int r6 = r13.A01
            int r0 = r13.ordinal()
            r1 = 0
            java.lang.String r7 = ""
            switch(r0) {
                case 0: goto L_0x003d;
                case 1: goto L_0x003d;
                case 2: goto L_0x0098;
                case 3: goto L_0x0065;
                case 4: goto L_0x00b5;
                case 5: goto L_0x002e;
                case 6: goto L_0x002e;
                case 7: goto L_0x002e;
                case 8: goto L_0x002e;
                case 9: goto L_0x002e;
                case 10: goto L_0x002e;
                case 11: goto L_0x00cc;
                case 12: goto L_0x005b;
                default: goto L_0x002e;
            }
        L_0x002e:
            java.lang.String r1 = "Don't know how to display Contact Option: "
            java.lang.String r0 = r13.name()
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x003d:
            java.lang.String r0 = r4.A0z()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0056
            android.view.View r0 = r5.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131834836(0x7f1137d4, float:1.9302794E38)
            java.lang.String r7 = r1.getString(r0)
            goto L_0x00dd
        L_0x0056:
            java.lang.String r7 = r4.A0z()
            goto L_0x007c
        L_0x005b:
            android.view.View r0 = r5.A00
            android.content.Context r7 = r0.getContext()
            r1 = 2131824333(0x7f110ecd, float:1.928149E38)
            goto L_0x00d5
        L_0x0065:
            boolean r0 = r4.A2y()
            if (r0 == 0) goto L_0x00dd
            if (r3 == 0) goto L_0x0089
            X.0TJ r8 = X.C18250wR.A0D(r9, r1)
            r0 = 36322894904630807(0x810b7b00011e17, double:3.0340832260220586E-306)
            boolean r0 = X.C63803iN.A0E(r8, r9, r0)
            if (r0 == 0) goto L_0x0089
        L_0x007c:
            java.util.Locale r0 = X.C31103Gfm.A02()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r7 = android.telephony.PhoneNumberUtils.formatNumber(r7, r0)
            goto L_0x00dd
        L_0x0089:
            java.lang.String r0 = r4.A1N()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00dd
            java.lang.String r7 = r4.A1N()
            goto L_0x007c
        L_0x0098:
            java.lang.String r0 = r4.A1C()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00b0
            android.view.View r0 = r5.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131834834(0x7f1137d2, float:1.930279E38)
            java.lang.String r7 = r1.getString(r0)
            goto L_0x00dd
        L_0x00b0:
            java.lang.String r7 = r4.A1C()
            goto L_0x00dd
        L_0x00b5:
            android.view.View r0 = r5.A00
            android.content.Context r8 = r0.getContext()
            java.lang.String r7 = r4.A0u()
            java.lang.String r1 = r4.A0t()
            java.lang.String r0 = r4.A0s()
            java.lang.String r7 = X.C67353zP.A04(r8, r7, r1, r0)
            goto L_0x00dd
        L_0x00cc:
            android.view.View r0 = r5.A00
            android.content.Context r7 = r0.getContext()
            r1 = 2131824332(0x7f110ecc, float:1.9281489E38)
        L_0x00d5:
            java.lang.String r0 = r4.BK7()
            java.lang.String r7 = X.AnonymousClass0wJ.A0l(r7, r0, r1)
        L_0x00dd:
            android.widget.TextView r0 = r5.A01
            r0.setText(r6)
            android.widget.TextView r0 = r5.A02
            r0.setText(r7)
            if (r3 == 0) goto L_0x00f0
            android.view.View r1 = r5.A00
            r0 = 50
            X.C18200wM.A1E(r1, r13, r3, r4, r0)
        L_0x00f0:
            r0 = -675878989(0xffffffffd7b6e7b3, float:-4.02212514E14)
            X.C14030oh.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gT.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(-377396117, viewGroup);
        View A0H = AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.layout_contact_option_row);
        A0H.setTag(new AnonymousClass3AY(A0H));
        C14030oh.A0A(-1152096252, A002);
        return A0H;
    }
}
