package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1300000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0100000_I2_1;
import com.instagram.api.schemas.IGShopTabMediaScrollType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.service.session.UserSession;
import com.instagram.shopping.model.destination.home.FeedMediaContent$MediaViewerConfig;
import com.instagram.shopping.model.destination.home.MerchantPreviewSection;
import com.instagram.shopping.model.destination.home.ProductFeedHeader;
import com.instagram.shopping.model.destination.home.ProductSection;
import com.instagram.shopping.model.destination.home.ShoppingHomeFeedEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape26S0201000_I2;

/* renamed from: X.7EH  reason: invalid class name */
public final class AnonymousClass7EH {
    public final KtCSuperShape0S1110000_I2 A00;
    public final UserSession A01;
    public final C106536fC A02;
    public final AnonymousClass3V6 A03 = AnonymousClass2LT.A00();
    public final HashMap A04 = AnonymousClass0wJ.A0y();

    public static final C86074wE A00(ShoppingHomeFeedEndpoint.MediaFeedEndpoint mediaFeedEndpoint, AnonymousClass7EH r23) {
        KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2;
        List A15;
        C102376Uy r0;
        AnonymousClass7EH r1 = r23;
        HashMap hashMap = r1.A04;
        String str = mediaFeedEndpoint.A00;
        Object obj = hashMap.get(str);
        if (obj == null) {
            ShoppingHomeFeedEndpoint.MediaFeedEndpoint mediaFeedEndpoint2 = new ShoppingHomeFeedEndpoint.MediaFeedEndpoint(str, (String) null, (String) null);
            KtCSuperShape0S1110000_I2 ktCSuperShape0S1110000_I2 = r1.A00;
            if (ktCSuperShape0S1110000_I2 == null || (A15 = (ArrayList) ktCSuperShape0S1110000_I2.A00) == null) {
                BKU A0W = C86114wI.A0W(r1.A01, str);
                if (A0W != null) {
                    C170679vO r9 = C170679vO.FEED_MEDIA;
                    ArrayList A14 = C06750aI.A14(C37415JrZ.A02(A0W));
                    Integer num = AnonymousClass006.A01;
                    IGShopTabMediaScrollType iGShopTabMediaScrollType = IGShopTabMediaScrollType.DEFAULT;
                    Integer num2 = AnonymousClass006.A00;
                    ktCSuperShape0S1200000_I2 = new KtCSuperShape0S1200000_I2(r9, new AnonymousClass5uG((KtCSuperShape0S1300000_I2) null, (KtCSuperShape1S0100000_I2_1) null, (C166929oT) null, new C166909oR(new FeedMediaContent$MediaViewerConfig(iGShopTabMediaScrollType, num, num2, num2), (ProductFeedHeader) null, A14), (MerchantPreviewSection) null, (C166919oS) null, (AnonymousClass65D) null, (AnonymousClass65D) null, (ProductSection) null, (C166899oQ) null, (AnonymousClass65C) null), 4);
                } else {
                    ktCSuperShape0S1200000_I2 = null;
                }
                A15 = C06750aI.A15(ktCSuperShape0S1200000_I2);
            }
            AnonymousClass0ZV r20 = AnonymousClass0ZV.A00;
            C169789tu r13 = C169789tu.Idle;
            if (ktCSuperShape0S1110000_I2 == null) {
                r0 = new AnonymousClass65F((String) null);
            } else if (ktCSuperShape0S1110000_I2.A02) {
                r0 = new AnonymousClass65F(ktCSuperShape0S1110000_I2.A01);
            } else {
                r0 = AnonymousClass65E.A00;
            }
            obj = C18190wL.A0z(new C1533793z((IgFundedIncentive) null, (C81644o8) null, r13, r13, r13, r0, mediaFeedEndpoint2, true, A15, r20, AnonymousClass4WJ.A0A(), false, false));
            hashMap.put(str, obj);
        }
        return (C86074wE) obj;
    }

    public final Object A02(AnonymousClass92Z r6, C146958n9 r7) {
        AnonymousClass3V6 r4 = this.A03;
        String str = r6.A00.A00;
        String str2 = r6.A01;
        if (str2 == null) {
            str2 = "";
        }
        return C86164wN.A0U(r4.A00(AnonymousClass00U.A0N(str, str2, '_'), r7, new KtSLambdaShape26S0201000_I2(this, r6, (C146958n9) null, 4)));
    }

    public AnonymousClass7EH(KtCSuperShape0S1110000_I2 ktCSuperShape0S1110000_I2, UserSession userSession, C106536fC r4) {
        this.A01 = userSession;
        this.A00 = ktCSuperShape0S1110000_I2;
        this.A02 = r4;
    }

    public static final void A01(ShoppingHomeFeedEndpoint.MediaFeedEndpoint mediaFeedEndpoint, AnonymousClass7EH r3, AnonymousClass0YY r4) {
        Object value = A00(mediaFeedEndpoint, r3).getValue();
        Object invoke = r4.invoke(value);
        if (!C04220Ms.A0I(invoke, value)) {
            A00(mediaFeedEndpoint, r3).CrC(invoke);
        }
    }
}
