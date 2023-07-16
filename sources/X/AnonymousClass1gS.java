package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1gS  reason: invalid class name */
public final class AnonymousClass1gS extends AnonymousClass436 {
    public final AnonymousClass4L1 A00;
    public final UserSession A01;
    public final C67233zC A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gS(AnonymousClass4L1 r1, UserSession userSession, C67233zC r3) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (X.C67373zR.A0H(r6) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r9, android.view.View r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r8 = this;
            r0 = -2005509291(0xffffffff88765b55, float:-7.4135293E-34)
            int r4 = X.C14030oh.A03(r0)
            X.AnonymousClass0wJ.A1O(r10, r11)
            java.lang.Object r3 = r10.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.CloseFriendsStoryRowViewBinder.Holder"
            X.C04220Ms.A0C(r3, r0)
            X.3Cy r3 = (X.C57903Cy) r3
            com.instagram.service.session.UserSession r6 = r8.A01
            boolean r7 = X.AnonymousClass0wJ.A1X(r11)
            X.3zC r0 = r8.A02
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x002a
            boolean r0 = X.C67373zR.A0H(r6)
            r2 = 1
            if (r0 != 0) goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            X.4L1 r5 = r8.A00
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            android.widget.ImageView r1 = r3.A03
            if (r7 == 0) goto L_0x0072
            android.graphics.drawable.Drawable r0 = r3.A00
            r1.setImageDrawable(r0)
            android.view.View r1 = r3.A02
            r0 = 280(0x118, float:3.92E-43)
        L_0x003e:
            X.AnonymousClass0wJ.A16(r1, r0, r5)
            if (r2 == 0) goto L_0x0057
            android.widget.TextView r3 = r3.A04
            r0 = 2131832803(0x7f112fe3, float:1.929867E38)
        L_0x0048:
            r3.setText(r0)
        L_0x004b:
            r0 = 282(0x11a, float:3.95E-43)
            X.AnonymousClass0wJ.A16(r3, r0, r5)
            r0 = 721609867(0x2b02e48b, float:4.6502445E-13)
            X.C14030oh.A0A(r0, r4)
            return
        L_0x0057:
            int r2 = X.AnonymousClass3LT.A00(r6)
            android.widget.TextView r3 = r3.A04
            if (r2 <= 0) goto L_0x006e
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131689704(0x7f0f00e8, float:1.900843E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0m(r1, r2, r0)
            r3.setText(r0)
            goto L_0x004b
        L_0x006e:
            r0 = 2131832809(0x7f112fe9, float:1.9298682E38)
            goto L_0x0048
        L_0x0072:
            android.graphics.drawable.Drawable r0 = r3.A01
            r1.setImageDrawable(r0)
            android.view.View r1 = r3.A02
            r0 = 281(0x119, float:3.94E-43)
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gS.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(-1697673870, viewGroup);
        Context context = viewGroup.getContext();
        View A0D = C18180wK.A0D(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_add_to_favorites_story, false);
        C04220Ms.A06(context);
        A0D.setTag(new C57903Cy(A0D, context));
        C14030oh.A0A(1490891376, A002);
        return A0D;
    }
}
