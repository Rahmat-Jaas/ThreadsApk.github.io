package X;

import com.instagram.brandedcontent.model.BrandedContentGatingInfo;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.2Hk  reason: invalid class name and case insensitive filesystem */
public final class C33882Hk {
    public static final Object A00(AnonymousClass601 r14, C63893iY r15) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r15, r14);
        r15.A0H(0);
        Object A0B = C63893iY.A0B(r15, A1Z ? 1 : 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.collections.List<*>");
        Iterable iterable = (Iterable) A0B;
        boolean A01 = AnonymousClass3WF.A01(r15, 2);
        Object A0B2 = C63893iY.A0B(r15, 3);
        A0B2.getClass();
        C04220Ms.A0C(A0B2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A0B2;
        String str2 = (String) C63893iY.A0C(r15, "null cannot be cast to non-null type kotlin.String", 4);
        ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
        for (Object next : iterable) {
            C04220Ms.A0C(next, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
            AbstractMap abstractMap = (AbstractMap) next;
            Object obj = abstractMap.get("pk");
            C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = abstractMap.get(AnonymousClass3QH.A00(84, 8, 5));
            C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
            User user = new User((String) obj, (String) obj2);
            Object obj3 = abstractMap.get("profile_pic_url");
            C04220Ms.A0C(obj3, "null cannot be cast to non-null type kotlin.String");
            user.A2D((String) obj3);
            Object obj4 = abstractMap.get("can_boost_post");
            C04220Ms.A0C(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            boolean A1X = AnonymousClass0wJ.A1X(obj4);
            Object obj5 = abstractMap.get("is_pending");
            C04220Ms.A0C(obj5, "null cannot be cast to non-null type kotlin.Boolean");
            A0w.add(new BrandedContentTag(user, A1X, AnonymousClass0wJ.A1X(obj5)));
        }
        C25786Drz A0Q = C18180wK.A0Q(C63913ic.A05(r14), C63913ic.A0F(r14));
        C24016D5r.A00();
        A0Q.A03 = C25802DsG.A02((BrandedContentGatingInfo) null, C18190wL.A0r(Locale.ROOT, str), str2, A0w, false, A1Z, A01);
        A0Q.A05();
        return null;
    }
}
