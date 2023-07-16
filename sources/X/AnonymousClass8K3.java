package X;

import com.instagram.api.schemas.ProfileTheme;
import com.instagram.common.gallery.GalleryItem;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.8K3  reason: invalid class name */
public final class AnonymousClass8K3 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ProfileTheme A02;
    public final /* synthetic */ GalleryItem A03;
    public final /* synthetic */ F6t A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ AnonymousClass0YY A06;
    public final /* synthetic */ AnonymousClass0YY A07;
    public final /* synthetic */ AnonymousClass0YY A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8K3(ProfileTheme profileTheme, GalleryItem galleryItem, F6t f6t, List list, AnonymousClass0YY r6, AnonymousClass0YY r7, AnonymousClass0YY r8, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.A0B = z;
        this.A09 = z2;
        this.A05 = list;
        this.A02 = profileTheme;
        this.A07 = r6;
        this.A04 = f6t;
        this.A08 = r7;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = r8;
        this.A0A = z3;
        this.A0C = z4;
        this.A03 = galleryItem;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0YM A002;
        C145078jn A0M = C86124wJ.A0M(obj);
        if (this.A0B) {
            A002 = C103256Yk.A00;
        } else {
            boolean z = this.A09;
            List list = this.A05;
            A002 = AnonymousClass7WY.A00(new AnonymousClass8Z5(this.A02, this.A04, list, this.A07, this.A08, this.A00, this.A01, z), 757665963);
        }
        A0M.Ba2((Object) null, (Object) null, A002);
        A0M.Ba2((Object) null, (Object) null, AnonymousClass7WY.A00(new C140848Yn(this.A03, this.A06, this.A00, this.A0A, this.A0C), 1899682055));
        return Unit.A00;
    }
}
