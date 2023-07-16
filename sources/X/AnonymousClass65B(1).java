package X;

import android.content.Context;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape3S1300000_I2;
import kotlin.jvm.internal.KtLambdaShape4S1300000_I2;

/* renamed from: X.65B  reason: invalid class name */
public final class AnonymousClass65B extends C134267xL implements C142528fA {
    public final Context A00;
    public final C19473Aww A01;
    public final C18539AhF A02;
    public final Ah2 A03;
    public final C2W A04;
    public final UserSession A05;

    public static final void A01(AnonymousClass9CN r12, FeaturedProductPermissionStatus featuredProductPermissionStatus, AnonymousClass65B r14, String str) {
        C2W c2w = r14.A04;
        C19457Awe A0T = C86154wM.A0T(c2w);
        C18022AWq aWq = c2w.BDY().A05;
        C04220Ms.A06(aWq);
        FeaturedProductPermissionStatus featuredProductPermissionStatus2 = featuredProductPermissionStatus;
        A0T.A05 = new C18022AWq(aWq.A01, featuredProductPermissionStatus, C170829vd.LOADING, aWq.A03);
        C86154wM.A1O(c2w, A0T);
        AnonymousClass9CN r7 = r12;
        String str2 = str;
        r14.A02.A03(r7, featuredProductPermissionStatus2, new KtLambdaShape4S1300000_I2(r12, featuredProductPermissionStatus, r14, str2, 17), new KtLambdaShape3S1300000_I2((Object) featuredProductPermissionStatus2, (Object) r7, (Object) r14, str2, 36));
    }

    public static final void A00(BKU bku, AnonymousClass65B r11) {
        C2W c2w = r11.A04;
        C19457Awe A0T = C86154wM.A0T(c2w);
        C18022AWq aWq = c2w.BDY().A05;
        C04220Ms.A06(aWq);
        A0T.A05 = new C18022AWq(FeaturedProductPermissionStatus.DECLINED, (FeaturedProductPermissionStatus) null, C170829vd.LOADED, aWq.A03);
        C19174Arq arq = new C19174Arq(c2w.BDY().A06);
        UserSession userSession = r11.A05;
        Product product = c2w.BDY().A01;
        List A012 = c2w.BDY().A06.A01(c2w.BDY().A01, userSession);
        C04220Ms.A06(A012);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : A012) {
            C18483AgF agF = (C18483AgF) next;
            if (!(agF instanceof C167269pF) || !C04220Ms.A0I(((C167269pF) agF).A01.A0f.A4Y, bku.A0f.A4Y)) {
                A0v.add(next);
            }
        }
        arq.A00(product, userSession, A0v);
        A0T.A06 = new C19455Awc(arq);
        C109506k7 r2 = c2w.BDY().A07;
        C04220Ms.A06(r2);
        new HashMap();
        new HashMap();
        new HashMap();
        Map map = r2.A00;
        C04220Ms.A0C(map, AnonymousClass000.A00(HttpStatus.SC_REQUEST_URI_TOO_LONG));
        Map A022 = C03940Lk.A02(map);
        Map map2 = r2.A02;
        Map map3 = r2.A01;
        Iterator A0z = AnonymousClass0wJ.A0z(A022);
        while (A0z.hasNext()) {
            BPC bpc = (BPC) C18180wK.A0o(A0z).getValue();
            bpc.A0B(bku);
            bpc.A07();
        }
        A0T.A07 = new C109506k7(A022, map2, map3);
        C86154wM.A1O(c2w, A0T);
    }

    public static final void A02(AnonymousClass65B r6) {
        C2W c2w = r6.A04;
        C19457Awe A0T = C86154wM.A0T(c2w);
        C18022AWq aWq = c2w.BDY().A05;
        C04220Ms.A06(aWq);
        A0T.A05 = new C18022AWq(FeaturedProductPermissionStatus.APPROVED, (FeaturedProductPermissionStatus) null, C170829vd.LOADED, aWq.A03);
        C86154wM.A1O(c2w, A0T);
    }

    public static final void A03(AnonymousClass65B r6) {
        C2W c2w = r6.A04;
        C19457Awe A0T = C86154wM.A0T(c2w);
        C18022AWq aWq = c2w.BDY().A05;
        C04220Ms.A06(aWq);
        A0T.A05 = new C18022AWq(aWq.A01, (FeaturedProductPermissionStatus) null, C170829vd.FAILED, aWq.A03);
        C86154wM.A1O(c2w, A0T);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass65B(Context context, UserSession userSession, C19473Aww aww, C18539AhF ahF, Ah2 ah2, C2W c2w, C19399Avh avh) {
        super(avh);
        AnonymousClass0wJ.A1Q(userSession, avh);
        C18190wL.A1S(ahF, 4, aww);
        this.A00 = context;
        this.A05 = userSession;
        this.A02 = ahF;
        this.A01 = aww;
        this.A04 = c2w;
        this.A03 = ah2;
    }
}
