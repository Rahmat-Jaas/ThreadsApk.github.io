package X;

import androidx.compose.foundation.lazy.LazyListState;
import com.instagram.api.schemas.ProfileTheme;
import com.instagram.common.gallery.GalleryItem;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.8U0  reason: invalid class name */
public final class AnonymousClass8U0 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ LazyListState A02;
    public final /* synthetic */ ProfileTheme A03;
    public final /* synthetic */ GalleryItem A04;
    public final /* synthetic */ F6t A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ AnonymousClass0YY A07;
    public final /* synthetic */ AnonymousClass0YY A08;
    public final /* synthetic */ AnonymousClass0YY A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8U0(LazyListState lazyListState, ProfileTheme profileTheme, GalleryItem galleryItem, F6t f6t, List list, AnonymousClass0YY r7, AnonymousClass0YY r8, AnonymousClass0YY r9, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.A02 = lazyListState;
        this.A06 = list;
        this.A0C = z;
        this.A03 = profileTheme;
        this.A08 = r7;
        this.A07 = r8;
        this.A0B = z2;
        this.A0D = z3;
        this.A05 = f6t;
        this.A0A = z4;
        this.A09 = r9;
        this.A04 = galleryItem;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        LazyListState lazyListState = this.A02;
        List list = this.A06;
        boolean z = this.A0C;
        ProfileTheme profileTheme = this.A03;
        AnonymousClass0YY r12 = this.A08;
        AnonymousClass0YY r13 = this.A07;
        boolean z2 = this.A0B;
        boolean z3 = this.A0D;
        F6t f6t = this.A05;
        boolean z4 = this.A0A;
        boolean z5 = z2;
        boolean z6 = z;
        C122077Ka.A02(lazyListState, A0H, profileTheme, this.A04, f6t, list, r12, r13, this.A09, C115796vv.A00(this.A00), C115796vv.A01(this.A01), z6, z5, z3, z4);
        return Unit.A00;
    }
}
