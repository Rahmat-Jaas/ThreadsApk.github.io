package X;

import com.instagram.common.gallery.GalleryItem;
import kotlin.Unit;

/* renamed from: X.8Yn  reason: invalid class name and case insensitive filesystem */
public final class C140848Yn extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GalleryItem A01;
    public final /* synthetic */ AnonymousClass0YY A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140848Yn(GalleryItem galleryItem, AnonymousClass0YY r3, int i, boolean z, boolean z2) {
        super(3);
        this.A02 = r3;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = galleryItem;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147188nY r2 = (C147188nY) obj2;
        if ((AnonymousClass0wJ.A04(obj3) & 81) != 16 || !r2.BCM()) {
            AnonymousClass0YY r4 = this.A02;
            boolean z = this.A03;
            boolean z2 = this.A04;
            GalleryItem galleryItem = this.A01;
            int i = this.A00 >> 15;
            C122077Ka.A0A(r2, galleryItem, r4, C86154wM.A02(i, (i & 14) | 4096), z, z2);
        } else {
            r2.CuJ();
        }
        return Unit.A00;
    }
}
