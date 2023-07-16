package X;

import android.content.Context;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageLoggingData;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import java.util.List;

/* renamed from: X.7Ju  reason: invalid class name and case insensitive filesystem */
public final class C122057Ju {
    public static final ImageUrl A01(C146478mJ r3, Integer num) {
        C04220Ms.A0B(r3, 0);
        Context context = C10600ic.A00;
        C04220Ms.A06(context);
        int min = Math.min((C09860go.A08(context) - (context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing) << 1)) / 3, 240);
        List AWI = r3.AWI();
        if (AWI == null) {
            AWI = AnonymousClass0ZV.A00;
        }
        return AnonymousClass6TH.A00(num, AWI, min);
    }

    public static final ExtendedImageUrl A02(Context context, ImageInfo imageInfo) {
        C04220Ms.A0B(context, 1);
        if (imageInfo == null) {
            return null;
        }
        return A03(context, imageInfo, AnonymousClass006.A00);
    }

    public static final ExtendedImageUrl A03(Context context, ImageInfo imageInfo, Integer num) {
        C04220Ms.A0B(num, 2);
        return A04(imageInfo, num, Math.min(C09860go.A08(context), 1080));
    }

    public static final ExtendedImageUrl A04(ImageInfo imageInfo, Integer num, int i) {
        AnonymousClass0wJ.A1M(imageInfo, 0, num);
        List list = imageInfo.A05;
        if (list == null) {
            list = AnonymousClass0ZV.A00;
        }
        return AnonymousClass6TH.A00(num, list, i);
    }

    public static final ImageInfo A05(ImageInfo imageInfo, List list) {
        AdditionalCandidates additionalCandidates;
        SpriteSheetInfoCandidates spriteSheetInfoCandidates;
        C04220Ms.A0B(list, 1);
        List list2 = imageInfo.A05;
        if (list2 == null || list2.isEmpty() || AnonymousClass3WG.A02((ImageUrl) C18240wQ.A0b(list2))) {
            C10450iM.A03(C28174Ezk.A00(139), "ImageInfo must have at least 1 valid URL");
        }
        SpriteSheetInfoCandidates spriteSheetInfoCandidates2 = null;
        C144758jE APW = imageInfo.APW();
        C144768jF AQk = imageInfo.AQk();
        imageInfo.AWI();
        C144768jF B9A = imageInfo.B9A();
        Boolean BCS = imageInfo.BCS();
        String BHl = imageInfo.BHl();
        if (APW != null) {
            additionalCandidates = APW.D4r();
        } else {
            additionalCandidates = null;
        }
        if (AQk != null) {
            spriteSheetInfoCandidates = AQk.D4u();
        } else {
            spriteSheetInfoCandidates = null;
        }
        if (B9A != null) {
            spriteSheetInfoCandidates2 = B9A.D4u();
        }
        return new ImageInfo(additionalCandidates, spriteSheetInfoCandidates, spriteSheetInfoCandidates2, BCS, BHl, list);
    }

    public static final void A06(ImageLoggingData imageLoggingData, C146478mJ r3) {
        C04220Ms.A0B(r3, 0);
        List<ExtendedImageUrl> AWI = r3.AWI();
        if (AWI != null) {
            for (ExtendedImageUrl extendedImageUrl : AWI) {
                extendedImageUrl.A00 = imageLoggingData;
            }
        }
    }

    public static final void A07(C146478mJ r2, boolean z) {
        C04220Ms.A0B(r2, 0);
        List<ExtendedImageUrl> AWI = r2.AWI();
        if (AWI != null) {
            for (ExtendedImageUrl extendedImageUrl : AWI) {
                extendedImageUrl.A02 = Boolean.valueOf(z);
            }
        }
    }

    public static final float A00(ImageInfo imageInfo) {
        List list;
        ExtendedImageUrl extendedImageUrl;
        int height;
        if (imageInfo == null || (list = imageInfo.A05) == null || (extendedImageUrl = (ExtendedImageUrl) AnonymousClass00J.A0G(list, 0)) == null || (height = extendedImageUrl.getHeight()) == 0) {
            return 1.0f;
        }
        return ((float) extendedImageUrl.getWidth()) / ((float) height);
    }
}
