package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.service.session.UserSession;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1gt  reason: invalid class name and case insensitive filesystem */
public final class C24101gt extends AnonymousClass436 {
    public C61563Ua A00;
    public final C567538k A01;
    public final C84844tx A02;
    public final C568438t A03;
    public final UserSession A04;
    public final Map A05;

    public final String getBinderGroupName() {
        return "FeedQuickPromotion";
    }

    public final int getViewTypeCount() {
        return 4;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r3, Object obj, Object obj2) {
        String str;
        C95255zj r0;
        C28291u0 r4 = (C28291u0) ((C81644o8) obj);
        C559735h r02 = r4.A08.A04;
        if (r02 == null || (r0 = r02.A00) == null) {
            str = r4.A09.A00;
        } else {
            r0.A01();
            str = "standard_bloks_megaphone_ig";
        }
        r3.A5K(C18210wN.A03((Number) this.A05.get(str)));
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((C28291u0) obj).A0B.hashCode();
    }

    public C24101gt() {
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = C14030oh.A03(-147523636);
        C28291u0 r15 = (C28291u0) obj;
        int A033 = C14030oh.A03(-20171780);
        M5O m5o = (M5O) view.getTag();
        Context context = view.getContext();
        C61563Ua r4 = this.A00;
        EnumSet copyOf = EnumSet.copyOf(r15.A0F);
        String num = Integer.toString(QuickPromotionSurface.MEGAPHONE.A00);
        UserSession userSession = this.A04;
        AnonymousClass0wJ.A1N(copyOf, num);
        AnonymousClass0wJ.A1Q(context, userSession);
        AnonymousClass1Pw A002 = r4.A00(context, (AnonymousClass3UU) null, userSession, num, copyOf, 0);
        C567538k r42 = this.A01;
        C36622Sa.A00().A02(userSession);
        if (C62573aJ.A01(r42.A01.A00(A002, new AnonymousClass18L(r15))).A02) {
            view.setVisibility(0);
            C568438t r0 = this.A03;
            C83734rt r43 = (C83734rt) r0.A00.get(i, r0.A01);
            if (m5o != null) {
                r43.AAl(m5o, this.A02, r15);
            }
        } else {
            view.setVisibility(8);
            if (m5o instanceof C202813y) {
                C202813y r3 = (C202813y) m5o;
                r3.A01.setVisibility(8);
                r3.A03.setVisibility(8);
                r3.A02.setVisibility(8);
            }
        }
        C14030oh.A0A(510710182, A033);
        C14030oh.A0A(-337618395, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = C14030oh.A03(-1595238148);
        LayoutInflater A0C = C18180wK.A0C(viewGroup);
        C568438t r0 = this.A03;
        View Bhn = ((C83734rt) r0.A00.get(i, r0.A01)).Bhn(A0C, viewGroup);
        C14030oh.A0A(-1123229947, A032);
        return Bhn;
    }

    public C24101gt(C11630kW r4, C84844tx r5, UserSession userSession) {
        C568438t r2 = new C568438t(r4, userSession);
        C567538k r1 = new C567538k();
        this.A00 = (C61563Ua) C61563Ua.A03.getValue();
        this.A04 = userSession;
        this.A02 = r5;
        this.A03 = r2;
        this.A01 = r1;
        HashMap A0y = AnonymousClass0wJ.A0y();
        this.A05 = A0y;
        A0y.put("condensed_megaphone", 1);
        A0y.put("social_context_condensed_megaphone_ig", 1);
        Integer A0d = C18220wO.A0d();
        A0y.put("standard_megaphone_ig", A0d);
        A0y.put("social_context_standard_megaphone_ig", A0d);
        A0y.put("inline_editing_standard_megaphone_ig", 2);
        A0y.put("standard_bloks_megaphone_ig", 3);
    }
}
