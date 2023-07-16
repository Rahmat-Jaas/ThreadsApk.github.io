package X;

import com.facebookpay.common.models.ErrorDialogContent;

/* renamed from: X.88a  reason: invalid class name */
public final class AnonymousClass88a extends RuntimeException {
    public final ErrorDialogContent A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass88a) && C04220Ms.A0I(this.A00, ((AnonymousClass88a) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("ECPErrorDialogException(errorDialogContent="));
    }

    public AnonymousClass88a(ErrorDialogContent errorDialogContent) {
        this.A00 = errorDialogContent;
    }
}
