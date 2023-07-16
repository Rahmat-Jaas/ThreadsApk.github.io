package X;

/* renamed from: X.6zm  reason: invalid class name and case insensitive filesystem */
public final class C118116zm {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.view.View r4, X.C118116zm r5, java.lang.StringBuilder r6) {
        /*
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x001a
            r2 = 0
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r1 = r4.getChildCount()
        L_0x000b:
            if (r2 >= r1) goto L_0x0090
            android.view.View r0 = r4.getChildAt(r2)
            X.C04220Ms.A06(r0)
            A00(r0, r5, r6)
            int r2 = r2 + 1
            goto L_0x000b
        L_0x001a:
            boolean r0 = r4 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "w:"
            r6.append(r0)
            r1 = r4
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r0 = r1.getWidth()
            r6.append(r0)
            java.lang.String r0 = ",h:"
            r6.append(r0)
            int r0 = r1.getHeight()
            r6.append(r0)
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            boolean r0 = r1 instanceof X.C144458iX
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = ",image:"
            r6.append(r0)
            X.8iX r1 = (X.C144458iX) r1
            java.lang.String r0 = r1.AoM()
        L_0x004c:
            r6.append(r0)
        L_0x004f:
            boolean r0 = r4 instanceof com.instagram.common.ui.widget.imageview.IgImageView
            if (r0 == 0) goto L_0x008b
            com.instagram.common.ui.widget.imageview.IgImageView r4 = (com.instagram.common.ui.widget.imageview.IgImageView) r4
            com.instagram.common.typedurl.ImageUrl r0 = r4.A0D
            if (r0 == 0) goto L_0x00a6
            java.lang.String r5 = r0.getUrl()
            if (r5 == 0) goto L_0x007f
            java.lang.String r0 = "oh="
            r4 = 0
            r1 = 6
            int r3 = X.AnonymousClass8bP.A0I(r5, r0)
            r2 = -1
            if (r3 == r2) goto L_0x0091
            r1 = 38
            r0 = 4
            int r0 = X.AnonymousClass8bP.A0G(r5, r1, r3, r0)
            if (r0 == r2) goto L_0x009e
            java.lang.String r1 = X.C18230wP.A0s(r5, r4, r3)
            java.lang.String r0 = X.C86134wK.A0q(r5, r0)
            java.lang.String r5 = X.AnonymousClass00U.A0L(r1, r0)
        L_0x007f:
            java.lang.String r0 = ",url:"
            r6.append(r0)
            if (r5 != 0) goto L_0x0088
            java.lang.String r5 = " not set"
        L_0x0088:
            r6.append(r5)
        L_0x008b:
            java.lang.String r0 = "\n"
            r6.append(r0)
        L_0x0090:
            return
        L_0x0091:
            r0 = 63
            int r0 = X.AnonymousClass8bP.A0G(r5, r0, r4, r1)
            if (r0 == r2) goto L_0x007f
            java.lang.String r5 = r5.substring(r4, r0)
            goto L_0x00a2
        L_0x009e:
            java.lang.String r5 = r5.substring(r4, r3)
        L_0x00a2:
            X.C04220Ms.A06(r5)
            goto L_0x007f
        L_0x00a6:
            r5 = 0
            goto L_0x007f
        L_0x00a8:
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x00cd
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r1 = r1.getBitmap()
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = ",bmp:"
            r6.append(r0)
            int r0 = r1.getWidth()
            r6.append(r0)
            java.lang.String r0 = "x"
            r6.append(r0)
            int r0 = r1.getHeight()
            r6.append(r0)
            goto L_0x004f
        L_0x00cd:
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = ",drawable (no bitmap info):"
            r6.append(r0)
            java.lang.String r0 = X.C18220wO.A0q(r1)
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118116zm.A00(android.view.View, X.6zm, java.lang.StringBuilder):void");
    }
}
