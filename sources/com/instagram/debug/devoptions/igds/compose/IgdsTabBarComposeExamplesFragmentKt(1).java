package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YM;
import X.AnonymousClass0ZU;
import X.AnonymousClass54z;
import X.AnonymousClass671;
import X.AnonymousClass74X;
import X.AnonymousClass7Ad;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7Kq;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.C06750aI;
import X.C101136Qa;
import X.C101176Qe;
import X.C122847Ub;
import X.C123327Wm;
import X.C132817uY;
import X.C132827uZ;
import X.C145548kg;
import X.C146288ly;
import X.C147178nW;
import X.C147188nY;
import X.C98236Es;
import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import com.instagram.user.model.User;

public final class IgdsTabBarComposeExamplesFragmentKt {
    public static /* synthetic */ C132827uZ createExploreButton$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return createExploreButton(z);
    }

    public static /* synthetic */ C132827uZ createHomeButton$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return createHomeButton(z);
    }

    public static /* synthetic */ C132817uY createProfileButton$default(User user, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return createProfileButton(user, z);
    }

    public static /* synthetic */ C132827uZ createReelsButton$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return createReelsButton(z);
    }

    public static /* synthetic */ C132827uZ createShoppingButton$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return createShoppingButton(z);
    }

    public static final void IgdsTabBarComposeExamples(User user, C147188nY r26, int i) {
        C147188nY r11 = r26;
        r11.Cvd(1842425399);
        C122847Ub A00 = AnonymousClass7Ad.A00(r11);
        C123327Wm r1 = Modifier.A00;
        AnonymousClass54z r0 = AnonymousClass7Kq.A02;
        Modifier A01 = AnonymousClass7Ad.A01(A00, r1.Cx6(r0));
        C146288ly A05 = AnonymousClass7KV.A05(r11);
        Object A0p = C147188nY.A0p(r11);
        Object A0n = C147188nY.A0n(r11);
        Object A0m = C147188nY.A0m(r11);
        AnonymousClass0ZU r5 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A01);
        AnonymousClass7W3 r3 = (AnonymousClass7W3) r11;
        C147188nY.A0w(r11, r3, r5);
        AnonymousClass7W3.A0a(r11, r3, A05, A0p);
        AnonymousClass7KP.A07(r11, A0n, A0m, A002);
        r11.Cvb(211126701);
        C101176Qe.A00(r11, (Modifier) null, (AnonymousClass671) null, "Tab bar", (String) null, (AnonymousClass0ZU) null, 6, 126, false, false);
        User user2 = user;
        C147188nY r52 = r11;
        C101136Qa.A00(r52, r1.Cx6(r0), (C145548kg) null, C06750aI.A17(createHomeButton(false), createExploreButton(false), createReelsButton(false), createShoppingButton(false), createProfileButton(user2, false)), 440, 0);
        C101176Qe.A00(r11, (Modifier) null, (AnonymousClass671) null, "Active button", (String) null, (AnonymousClass0ZU) null, 6, 126, false, false);
        C132827uZ createHomeButton = createHomeButton(false);
        C147188nY r19 = r11;
        C101136Qa.A00(r19, r1.Cx6(r0), createHomeButton, C06750aI.A17(createHomeButton, createExploreButton(false), createReelsButton(false), createShoppingButton(false), createProfileButton(user2, false)), 392, 0);
        C101176Qe.A00(r11, (Modifier) null, (AnonymousClass671) null, "Active profile button", (String) null, (AnonymousClass0ZU) null, 6, 126, false, false);
        C132817uY createProfileButton = createProfileButton(user2, false);
        C147188nY r21 = r11;
        C101136Qa.A00(r21, r1.Cx6(r0), createProfileButton, C06750aI.A17(createHomeButton, createExploreButton(false), createReelsButton(false), createShoppingButton(false), createProfileButton), 392, 0);
        C101176Qe.A00(r11, (Modifier) null, (AnonymousClass671) null, "Badged buttons", (String) null, (AnonymousClass0ZU) null, 6, 126, false, false);
        C132827uZ createShoppingButton = createShoppingButton(true);
        C101136Qa.A00(r11, r1.Cx6(r0), createShoppingButton, C06750aI.A17(createHomeButton(true), createExploreButton(false), createReelsButton(false), createShoppingButton, createProfileButton(user2, true)), 392, 0);
        AnonymousClass7W3.A0v(r3, true);
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsTabBarComposeExamplesFragmentKt$IgdsTabBarComposeExamples$2(user2, i));
        }
    }

    public static final C132827uZ createExploreButton(boolean z) {
        return new C132827uZ(IgdsTabBarComposeExamplesFragmentKt$createExploreButton$1.INSTANCE, R.drawable.instagram_search_pano_outline_24, R.drawable.instagram_search_pano_filled_24, z);
    }

    public static final C132827uZ createHomeButton(boolean z) {
        return new C132827uZ(IgdsTabBarComposeExamplesFragmentKt$createHomeButton$1.INSTANCE, R.drawable.instagram_home_pano_outline_24, R.drawable.instagram_home_pano_filled_24, z);
    }

    public static final C132817uY createProfileButton(User user, boolean z) {
        return new C132817uY(user.B4M(), IgdsTabBarComposeExamplesFragmentKt$createProfileButton$1.INSTANCE, z);
    }

    public static final C132827uZ createReelsButton(boolean z) {
        return new C132827uZ(IgdsTabBarComposeExamplesFragmentKt$createReelsButton$1.INSTANCE, R.drawable.instagram_reels_pano_outline_24, R.drawable.instagram_reels_pano_filled_24, z);
    }

    public static final C132827uZ createShoppingButton(boolean z) {
        return new C132827uZ(IgdsTabBarComposeExamplesFragmentKt$createShoppingButton$1.INSTANCE, R.drawable.instagram_shopping_bag_pano_outline_24, R.drawable.instagram_shopping_bag_pano_filled_24, z);
    }
}
