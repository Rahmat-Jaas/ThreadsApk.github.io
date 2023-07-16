package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.business.fragment.OnboardingCheckListFragment;

/* renamed from: X.1ki  reason: invalid class name and case insensitive filesystem */
public final class C24841ki extends AnonymousClass1lO {
    public final OnboardingCheckListFragment A00;
    public final boolean A01;

    public final Class modelClass() {
        return AnonymousClass48A.class;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C41882MfV r9, X.M5O r10) {
        /*
            r8 = this;
            X.48A r9 = (X.AnonymousClass48A) r9
            X.13d r10 = (X.C201013d) r10
            X.AnonymousClass0wJ.A1N(r9, r10)
            X.3HW r3 = r9.A00
            java.lang.String r0 = r3.A05
            X.C04220Ms.A06(r0)
            java.lang.Integer r2 = X.AnonymousClass2K7.A00(r0)
            if (r2 == 0) goto L_0x0074
            android.widget.TextView r1 = r10.A05
            java.lang.String r0 = r3.A02
            r1.setText(r0)
            android.widget.ImageView r1 = r10.A01
            int r0 = r2.intValue()
            switch(r0) {
                case 1: goto L_0x009f;
                case 2: goto L_0x00a3;
                case 3: goto L_0x00a7;
                case 4: goto L_0x00ac;
                case 5: goto L_0x00ac;
                case 6: goto L_0x00b1;
                case 7: goto L_0x00b6;
                case 8: goto L_0x00bb;
                case 9: goto L_0x00bb;
                case 10: goto L_0x00c0;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = 2131233129(0x7f080969, float:1.8082387E38)
        L_0x0027:
            r1.setImageResource(r0)
            java.lang.String r1 = r3.A04
            if (r1 == 0) goto L_0x0035
            android.widget.TextView r0 = r10.A04
            if (r0 == 0) goto L_0x0035
            r0.setText(r1)
        L_0x0035:
            android.view.View r5 = r10.A00
            android.content.Context r6 = r5.getContext()
            X.3BH r2 = r3.A00
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "complete"
            boolean r0 = r0.equals(r1)
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0075
            android.widget.ImageView r1 = r10.A02
            r0 = 2131232400(0x7f080690, float:1.8080908E38)
            r1.setImageResource(r0)
            r0 = 2131100117(0x7f0601d5, float:1.7812606E38)
            X.C18240wQ.A0r(r6, r1, r0)
            r0 = 0
            r5.setOnClickListener(r0)
        L_0x005b:
            r7 = 0
        L_0x005c:
            r0 = 34
            X.AnonymousClass0wJ.A18(r5, r0, r8, r9)
            android.widget.ImageView r1 = r10.A02
            r0 = 0
            if (r7 == 0) goto L_0x0068
            r0 = 8
        L_0x0068:
            r1.setVisibility(r0)
            android.widget.TextView r0 = r10.A03
            if (r7 != 0) goto L_0x0071
            r4 = 8
        L_0x0071:
            r0.setVisibility(r4)
        L_0x0074:
            return
        L_0x0075:
            if (r2 == 0) goto L_0x0090
            int r3 = r2.A00
            if (r3 <= 0) goto L_0x0090
            int r0 = r2.A01
            if (r3 >= r0) goto L_0x0090
            android.widget.TextView r2 = r10.A03
            r1 = 2131838120(0x7f1144a8, float:1.9309454E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r6, r0, r1)
            r2.setText(r0)
            goto L_0x005c
        L_0x0090:
            android.widget.ImageView r1 = r10.A02
            r0 = 2131232418(0x7f0806a2, float:1.8080945E38)
            r1.setImageResource(r0)
            r0 = 2131099962(0x7f06013a, float:1.7812292E38)
            X.C18240wQ.A0r(r6, r1, r0)
            goto L_0x005b
        L_0x009f:
            r0 = 2131232347(0x7f08065b, float:1.80808E38)
            goto L_0x0027
        L_0x00a3:
            r0 = 2131232841(0x7f080849, float:1.8081803E38)
            goto L_0x0027
        L_0x00a7:
            r0 = 2131232915(0x7f080893, float:1.8081953E38)
            goto L_0x0027
        L_0x00ac:
            r0 = 2131233122(0x7f080962, float:1.8082373E38)
            goto L_0x0027
        L_0x00b1:
            r0 = 2131232536(0x7f080718, float:1.8081184E38)
            goto L_0x0027
        L_0x00b6:
            r0 = 2131232729(0x7f0807d9, float:1.8081575E38)
            goto L_0x0027
        L_0x00bb:
            r0 = 2131232900(0x7f080884, float:1.8081922E38)
            goto L_0x0027
        L_0x00c0:
            r0 = 2131232464(0x7f0806d0, float:1.8081038E38)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24841ki.bind(X.MfV, X.M5O):void");
    }

    public C24841ki(OnboardingCheckListFragment onboardingCheckListFragment, boolean z) {
        this.A01 = z;
        this.A00 = onboardingCheckListFragment;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1Y = AnonymousClass0wJ.A1Y(viewGroup, layoutInflater);
        boolean z = this.A01;
        int i = R.layout.onboarding_check_list_item_row;
        if (z) {
            i = R.layout.onboarding_check_list_item_row_with_subtitle;
        }
        return new C201013d(C18180wK.A0D(layoutInflater, viewGroup, i, A1Y));
    }
}
