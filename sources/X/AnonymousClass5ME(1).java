package X;

import com.instagram.model.shopping.Product;

/* renamed from: X.5ME  reason: invalid class name */
public final class AnonymousClass5ME extends AnonymousClass0Sf implements C41882MfV {
    public final Product A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5ME) && C04220Ms.A0I(this.A00, ((AnonymousClass5ME) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C04220Ms.A0B(obj, 0);
        return equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A00.A00.A0j;
        C04220Ms.A06(str);
        return str;
    }

    public AnonymousClass5ME(Product product) {
        this.A00 = product;
    }
}
