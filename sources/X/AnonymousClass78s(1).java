package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2;

/* renamed from: X.78s  reason: invalid class name */
public final class AnonymousClass78s {
    public ExtendedImageUrl A00;
    public final Object A01;
    public final AnonymousClass0YY A02;

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof AnonymousClass78s) && super.equals(obj) && C04220Ms.A0I(this.A01, ((AnonymousClass78s) obj).A01));
    }

    public AnonymousClass78s(BKU bku) {
        IDxRImplShape189S0000000_2_I2 iDxRImplShape189S0000000_2_I2 = new IDxRImplShape189S0000000_2_I2(bku, 16);
        this.A01 = bku;
        this.A02 = iDxRImplShape189S0000000_2_I2;
    }

    public final int hashCode() {
        return C18230wP.A05(this.A01);
    }

    public AnonymousClass78s(ImageInfo imageInfo) {
        IDxRImplShape189S0000000_2_I2 iDxRImplShape189S0000000_2_I2 = new IDxRImplShape189S0000000_2_I2(imageInfo, 15);
        this.A01 = imageInfo;
        this.A02 = iDxRImplShape189S0000000_2_I2;
    }
}
