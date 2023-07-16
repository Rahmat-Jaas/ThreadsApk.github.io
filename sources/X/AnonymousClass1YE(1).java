package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1YE  reason: invalid class name */
public final class AnonymousClass1YE extends C34640IcN {
    public static final String __redex_internal_original_name = "ReelDashboardActionsFragment";
    public C19359Av2 A00;
    public AnonymousClass114 A01;
    public C568838x A02;
    public User A03;
    public UserSession A04;

    public final String getModuleName() {
        return "reel_dashboard_actions_fragment";
    }

    public final C10300i6 getSession() {
        return this.A04;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = 1357862385(0x50ef55f1, float:3.2123095E10)
            int r3 = X.C14030oh.A02(r0)
            super.onCreate(r6)
            android.os.Bundle r1 = X.C18250wR.A07(r5)
            com.instagram.service.session.UserSession r0 = X.C18180wK.A0V(r1)
            r5.A04 = r0
            java.lang.String r0 = "ReelDashboardActionsFragment.VIEWER_USER_ID"
            java.lang.String r1 = X.C18190wL.A0j(r1, r0)
            com.instagram.service.session.UserSession r0 = r5.A04
            com.instagram.user.model.User r2 = X.C18210wN.A0P(r0, r1)
            r2.getClass()
            r5.A03 = r2
            X.38x r1 = r5.A02
            java.lang.String r0 = "delegate is expected to be set after the fragment is created"
            X.AnonymousClass7Ko.A07(r1, r0)
            X.114 r0 = new X.114
            r0.<init>(r1, r2)
            r5.A01 = r0
            X.Av2 r0 = r5.A00
            if (r0 == 0) goto L_0x0074
            X.BKH r0 = r0.A0E
            X.BKU r0 = r0.A0M
            if (r0 == 0) goto L_0x0074
            X.D1i r1 = r0.ARp()
            X.D1i r0 = X.C23920D1i.CUSTOM
            if (r1 != r0) goto L_0x0074
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            X.Av2 r0 = r5.A00
            r0.getClass()
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0071
            X.22s r0 = X.C307422s.ADD_TO_PRIVATE_STORY
        L_0x0054:
            r4.add(r0)
            X.114 r1 = r5.A01
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x006a
            java.util.List r0 = r1.A00
            r0.clear()
            r0.addAll(r4)
            r1.notifyDataSetChanged()
        L_0x006a:
            r0 = 1818055300(0x6c5d5284, float:1.0702491E27)
            X.C14030oh.A09(r0, r3)
            return
        L_0x0071:
            X.22s r0 = X.C307422s.REMOVE_FROM_PRIVATE_STORY
            goto L_0x0054
        L_0x0074:
            com.instagram.user.model.User r0 = r5.A03
            int r2 = r0.Apb()
            r1 = 1
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            com.instagram.user.model.User r0 = r5.A03
            boolean r0 = r0.BRq()
            if (r2 != r1) goto L_0x00a1
            if (r0 != 0) goto L_0x008e
            X.22s r0 = X.C307422s.BLOCK_FB_STORY_VIEWER
        L_0x008b:
            r4.add(r0)
        L_0x008e:
            com.instagram.user.model.User r0 = r5.A03
            boolean r0 = r0.A3C()
            if (r0 != 0) goto L_0x009e
            X.22s r0 = X.C307422s.HIDE_STORY
        L_0x0098:
            r4.add(r0)
            X.22s r0 = X.C307422s.VIEW_PROFILE
            goto L_0x0054
        L_0x009e:
            X.22s r0 = X.C307422s.UNHIDE_STORY
            goto L_0x0098
        L_0x00a1:
            if (r0 != 0) goto L_0x00a8
            X.22s r0 = X.C307422s.BLOCK
            r4.add(r0)
        L_0x00a8:
            com.instagram.user.model.User r0 = r5.A03
            boolean r0 = r0.A3Q()
            if (r0 == 0) goto L_0x008e
            X.22s r0 = X.C307422s.REMOVE_FOLLOWER
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YE.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1181874556);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.layout_reel_dashboard_actions);
        getContext();
        C18190wL.A1D(recyclerView);
        recyclerView.setAdapter(this.A01);
        C14030oh.A09(1213558362, A022);
        return recyclerView;
    }
}
