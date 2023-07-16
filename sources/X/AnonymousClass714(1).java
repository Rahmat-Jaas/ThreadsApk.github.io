package X;

import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.714  reason: invalid class name */
public final class AnonymousClass714 {
    public static AndroidLink parseFromJson(MMo mMo) {
        return (AndroidLink) C86104wH.A0e(mMo, 95);
    }

    public static void A00(MMp mMp, AndroidLink androidLink) {
        mMp.A0J();
        String str = androidLink.A06;
        if (str != null) {
            mMp.A0d("androidClass", str);
        }
        String str2 = androidLink.A07;
        if (str2 != null) {
            mMp.A0d("appId", str2);
        }
        Integer num = androidLink.A03;
        if (num != null) {
            mMp.A0b("appInstallObjectiveInvalidationBehavior", num.intValue());
        }
        String str3 = androidLink.A08;
        if (str3 != null) {
            mMp.A0d("callToActionTitle", str3);
        }
        String str4 = androidLink.A09;
        if (str4 != null) {
            mMp.A0d("canvasData", str4);
        }
        String str5 = androidLink.A0A;
        if (str5 != null) {
            mMp.A0d("canvasDocId", str5);
        }
        String str6 = androidLink.A0B;
        if (str6 != null) {
            mMp.A0d("contentId", str6);
        }
        String str7 = androidLink.A0C;
        if (str7 != null) {
            mMp.A0d("deeplinkUri", str7);
        }
        String str8 = androidLink.A0D;
        if (str8 != null) {
            mMp.A0d("destinationContext", str8);
        }
        String str9 = androidLink.A0E;
        if (str9 != null) {
            mMp.A0d("igUserId", str9);
        }
        Boolean bool = androidLink.A00;
        if (bool != null) {
            mMp.A0e("isAndroidAppLink", bool.booleanValue());
        }
        Boolean bool2 = androidLink.A01;
        if (bool2 != null) {
            mMp.A0e("isUniversalLink", bool2.booleanValue());
        }
        Boolean bool3 = androidLink.A02;
        if (bool3 != null) {
            mMp.A0e("isVtOdirEligible", bool3.booleanValue());
        }
        String str10 = androidLink.A0F;
        if (str10 != null) {
            mMp.A0d("leadGenFormId", str10);
        }
        Integer num2 = androidLink.A04;
        if (num2 != null) {
            mMp.A0b("linkType", num2.intValue());
        }
        String str11 = androidLink.A05;
        if (str11 != null) {
            mMp.A0d("package", str11);
        }
        String str12 = androidLink.A0G;
        if (str12 != null) {
            mMp.A0d("productPageId", str12);
        }
        String str13 = androidLink.A0H;
        if (str13 != null) {
            mMp.A0d("redirectUri", str13);
        }
        String str14 = androidLink.A0I;
        if (str14 != null) {
            mMp.A0d("referrerData", str14);
        }
        String str15 = androidLink.A0J;
        if (str15 != null) {
            mMp.A0d("tapAndHoldContext", str15);
        }
        String str16 = androidLink.A0K;
        if (str16 != null) {
            mMp.A0d("webUri", str16);
        }
        mMp.A0G();
    }
}
