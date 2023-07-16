package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UserMonetizationProductType;
import java.util.List;

/* renamed from: X.6OV  reason: invalid class name */
public final class AnonymousClass6OV {
    public static final Object A00(AnonymousClass601 r7, C63893iY r8) {
        UserMonetizationProductType userMonetizationProductType;
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r7);
        Object A0B = C63893iY.A0B(r8, 0);
        A0B.getClass();
        String A0h = C86164wN.A0h(A0B);
        String str = (String) A0B;
        C35387Itt itt = (C35387Itt) C35387Itt.A01.get(str);
        if (itt != null) {
            String str2 = (String) C63893iY.A0C(r8, A0h, A1Z ? 1 : 0);
            List list = r8.A00;
            String A0q = C18190wL.A0q(list, 2);
            String A0q2 = C18190wL.A0q(list, 3);
            switch (itt.ordinal()) {
                case 0:
                    userMonetizationProductType = UserMonetizationProductType.REVSHARE;
                    break;
                case 1:
                case 2:
                    userMonetizationProductType = UserMonetizationProductType.USER_PAY;
                    break;
                case 3:
                    userMonetizationProductType = UserMonetizationProductType.AFFILIATE;
                    break;
                case 4:
                    userMonetizationProductType = UserMonetizationProductType.INCENTIVE_PLATFORM;
                    break;
                case 5:
                    userMonetizationProductType = UserMonetizationProductType.FAN_CLUB_CREATOR;
                    break;
                case 6:
                    userMonetizationProductType = UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR;
                    break;
                case 7:
                    userMonetizationProductType = UserMonetizationProductType.BRANDED_CONTENT_DEAL_BRAND;
                    break;
                case 8:
                    userMonetizationProductType = UserMonetizationProductType.REELS_OVERLAY_ADS;
                    break;
                case 9:
                    userMonetizationProductType = UserMonetizationProductType.CONTENT_APPRECIATION;
                    break;
                case 10:
                    userMonetizationProductType = UserMonetizationProductType.INCENTIVE_PLATFORM_SPEAKER_ENGAGEMENT;
                    break;
                default:
                    throw AnonymousClass4VZ.A00();
            }
            C35355ItJ A00 = AnonymousClass2SD.A00(str2);
            FragmentActivity A05 = C63913ic.A05(r7);
            C10300i6 A0F = C63913ic.A0F(r7);
            C18200wM.A1R(A0F);
            C25786Drz A0Q = C18180wK.A0Q(A05, A0F);
            A0Q.A03 = AnonymousClass6S1.A00(userMonetizationProductType, A00, A0q, A0q2, A1Z);
            A0Q.A05();
            return null;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L(I17.A00(24), str));
    }
}
