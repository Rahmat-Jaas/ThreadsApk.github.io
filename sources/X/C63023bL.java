package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape2S1600000_1_I2;
import com.instagram.common.api.base.IDxACallbackShape0S1500000_1_I2;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.service.session.UserSession;

/* renamed from: X.3bL  reason: invalid class name and case insensitive filesystem */
public final class C63023bL {
    public static final C63023bL A00 = new C63023bL();

    public static final void A00(Context context, C34640IcN icN, BKU bku, UserSession userSession, C61213Si r17, AnonymousClass3DL r18, CUV cuv, String str) {
        C61213Si r1 = r17;
        r1.A00 = true;
        CUV cuv2 = cuv;
        cuv2.A0B.notifyDataSetChanged();
        BKU bku2 = r1.A02;
        if (!C18180wK.A1Z(bku2.A2I(), AnonymousClass24M.SHARED) && bku2.A2I() != AnonymousClass24M.SHARING) {
            AnonymousClass3DL r8 = r18;
            IgdsButton igdsButton = r8.A09;
            igdsButton.setLoading(true);
            igdsButton.setEnabled(false);
            cuv2.A0B.notifyDataSetChanged();
            C34640IcN icN2 = icN;
            FragmentActivity requireActivity = icN.requireActivity();
            AnonymousClass2AC r14 = AnonymousClass2AC.A0H;
            Context context2 = context;
            BKU bku3 = bku;
            UserSession userSession2 = userSession;
            String str2 = str;
            IDxCListenerShape2S1600000_1_I2 iDxCListenerShape2S1600000_1_I2 = new IDxCListenerShape2S1600000_1_I2(context2, icN2, bku3, userSession2, r8, cuv2, str2, 0);
            C04220Ms.A0B(r14, 2);
            if (!AnonymousClass1v3.A06.A03(requireActivity, context, r14, userSession2, iDxCListenerShape2S1600000_1_I2, true)) {
                A02(context2, icN2, bku3, userSession2, r8, cuv2, str2);
            }
        }
    }

    public static final void A02(Context context, C34640IcN icN, BKU bku, UserSession userSession, AnonymousClass3DL r14, CUV cuv, String str) {
        BKU bku2 = bku;
        if (bku != null) {
            String str2 = str;
            IDxACallbackShape0S1500000_1_I2 iDxACallbackShape0S1500000_1_I2 = new IDxACallbackShape0S1500000_1_I2(context, bku2, userSession, r14, cuv, str2, 1);
            ShareLaterMedia shareLaterMedia = new ShareLaterMedia(bku);
            shareLaterMedia.A07 = true;
            bku.A3g(AnonymousClass24M.SHARING);
            C32165H8c A002 = C36952Th.A00(shareLaterMedia, userSession, str2, "likes_sheet");
            A002.A00 = iDxACallbackShape0S1500000_1_I2;
            icN.schedule(A002);
        }
    }

    public static final void A01(Context context, C34640IcN icN, BKU bku, UserSession userSession, AnonymousClass3DL r8, CUV cuv, String str) {
        if (AnonymousClass0wJ.A0Y(userSession).Apo()) {
            A02(context, icN, bku, userSession, r8, cuv, str);
        } else if (C63803iN.A0F(userSession)) {
            C49222r2.A00(userSession).A04(new C71824Kk(context, icN, bku, userSession, r8, cuv, str), "likes_sheet", "FEED");
        } else {
            C67303zK.A05(userSession, new AnonymousClass3D3(context, icN, bku, userSession, r8, cuv, str), AnonymousClass006.A0F);
        }
    }
}
