package X;

import android.content.Context;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.slidecardpageadapter.SlideCardViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3LK  reason: invalid class name */
public final class AnonymousClass3LK {
    public static final List A00(Context context, C10300i6 r14, AnonymousClass266 r15, boolean z) {
        int i;
        int i2;
        String str;
        String str2;
        Integer num;
        C63283hB[] r0;
        String str3;
        int i3;
        C04220Ms.A0B(r15, 0);
        int ordinal = r15.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                r0 = new C63283hB[3];
                r0[0] = C63283hB.A00(context);
                str3 = context.getString(2131834042);
                i3 = 2131834041;
            } else if (ordinal != 3) {
                return AnonymousClass0ZV.A00;
            } else {
                r0 = new C63283hB[3];
                r0[0] = new C63283hB(AnonymousClass006.A0j, context.getString(2131824604), context.getString(2131824601), R.drawable.instagram_user_pano_outline_24, R.drawable.instagram_creator_experience_assets_creator_controls_illustration);
                r0[1] = new C63283hB(AnonymousClass006.A0Y, context.getString(2131824603), context.getString(2131824600), R.drawable.instagram_direct_pano_outline_24, R.drawable.instagram_creator_experience_assets_creator_inbox_illustration);
                str2 = context.getString(2131824602);
                str = context.getString(2131824599);
                i2 = R.drawable.instagram_insights_pano_outline_24;
                i = R.drawable.instagram_creator_experience_assets_creator_insights_illustration;
                num = AnonymousClass006.A0C;
                r0[2] = new C63283hB(num, str2, str, i2, i);
                return C06750aI.A17(r0);
            }
        } else if (!z || r14 == null || !C67333zN.A06(r14, 36313252702979469L, false)) {
            r0 = new C63283hB[3];
            r0[0] = C63283hB.A00(context);
            str3 = context.getString(2131834040);
            i3 = 2131834039;
        } else {
            C63283hB r5 = new C63283hB((Uri) J61.A00.A00(), context.getString(2131829075), context.getString(2131837821));
            C63283hB r02 = new C63283hB(C15430rJ.A01("https://business.instagram.com/advertising"), context.getString(2131821193), context.getString(2131837831), context.getString(2131829574));
            ArrayList A0v = AnonymousClass0wJ.A0v();
            A0v.add(r5);
            A0v.add(r02);
            return C18180wK.A0n(new C63283hB(context.getString(2131836884), A0v));
        }
        r0[1] = new C63283hB(AnonymousClass006.A0C, str3, context.getString(i3), R.drawable.instagram_ads_pano_outline_24, R.drawable.ig_illustrations_illo_ads_megaphone);
        str2 = context.getString(2131838164);
        str = context.getString(2131838163);
        i2 = R.drawable.instagram_mail_pano_outline_24;
        i = R.drawable.ig_illustrations_illo_contact_buttons;
        num = AnonymousClass006.A0N;
        r0[2] = new C63283hB(num, str2, str, i2, i);
        return C06750aI.A17(r0);
    }

    public static final List A01(C10300i6 r17, SlideCardViewModel slideCardViewModel, List list, boolean z) {
        SlideCardViewModel slideCardViewModel2;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        SlideCardViewModel slideCardViewModel3 = slideCardViewModel;
        if (slideCardViewModel != null) {
            A0v.add(slideCardViewModel3);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63283hB r4 = (C63283hB) it.next();
            if (!z || !C67333zN.A06(r17, 36313252702979469L, false)) {
                String str = r4.A09;
                String str2 = r4.A07;
                if (!(str == null || str2 == null)) {
                    slideCardViewModel2 = new SlideCardViewModel((ImageUrl) null, str, str2, r4.A01);
                }
            } else {
                String str3 = r4.A09;
                ImmutableList<C63283hB> A0J = C18210wN.A0J(r4.A0A);
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                if (A0J != null) {
                    for (C63283hB r1 : A0J) {
                        String str4 = r1.A09;
                        String str5 = r1.A07;
                        int i = r1.A02;
                        Uri uri = r1.A05;
                        int i2 = r1.A03;
                        boolean z2 = r1.A0B;
                        int i3 = r1.A00;
                        A0v2.add(new SlideCardViewModel.SlideCardSectionViewModel(uri, r1.A04, str4, str5, r1.A08, i, i2, i3, z2));
                    }
                }
                slideCardViewModel2 = new SlideCardViewModel(str3, A0v2);
            }
            A0v.add(slideCardViewModel2);
        }
        return A0v;
    }
}
