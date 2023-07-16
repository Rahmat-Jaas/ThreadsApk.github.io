package X;

import com.instagram.common.gallery.GalleryItem;

/* renamed from: X.7sn  reason: invalid class name and case insensitive filesystem */
public final class C131777sn implements C41882MfV {
    public final GalleryItem A00;

    public C131777sn(GalleryItem galleryItem) {
        C04220Ms.A0B(galleryItem, 1);
        this.A00 = galleryItem;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String A01 = this.A00.A01();
        C04220Ms.A06(A01);
        return A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C131777sn r3 = (C131777sn) obj;
        C04220Ms.A0B(r3, 0);
        return C04220Ms.A0I(this.A00, r3.A00);
    }
}
