package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6TH  reason: invalid class name */
public final class AnonymousClass6TH {
    public static ExtendedImageUrl A00(Integer num, List list, int i) {
        Integer num2;
        Integer num3;
        int abs;
        Iterator it = list.iterator();
        int i2 = Integer.MAX_VALUE;
        ExtendedImageUrl extendedImageUrl = null;
        while (it.hasNext()) {
            ExtendedImageUrl extendedImageUrl2 = (ExtendedImageUrl) it.next();
            int height = extendedImageUrl2.getHeight();
            int width = extendedImageUrl2.getWidth();
            if (height == width) {
                num3 = AnonymousClass006.A0C;
            } else {
                num3 = AnonymousClass006.A01;
            }
            if ((num == AnonymousClass006.A00 || num == num3) && ((abs = Math.abs(((i / 20) + i) - width)) < i2 || (extendedImageUrl != null && abs == i2 && width < extendedImageUrl.getWidth()))) {
                extendedImageUrl = extendedImageUrl2;
                i2 = abs;
            }
        }
        if (extendedImageUrl != null || num == (num2 = AnonymousClass006.A00)) {
            return extendedImageUrl;
        }
        return A00(num2, list, i);
    }
}
