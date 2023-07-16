package X;

import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$getSearchResults$$inlined$map$1$2;

/* renamed from: X.86u  reason: invalid class name and case insensitive filesystem */
public final class C1372286u implements C84714tk {
    public final /* synthetic */ MiniGalleryService A00;
    public final /* synthetic */ D1X A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C84714tk A04;

    public C1372286u(MiniGalleryService miniGalleryService, D1X d1x, String str, String str2, C84714tk r5) {
        this.A04 = r5;
        this.A00 = miniGalleryService;
        this.A03 = str;
        this.A01 = d1x;
        this.A02 = str2;
    }

    public final Object collect(C83234r0 r8, C146958n9 r9) {
        return C84714tk.A00(r9, this.A04, new MiniGalleryService$getSearchResults$$inlined$map$1$2(this.A00, this.A01, this.A03, this.A02, r8));
    }
}
