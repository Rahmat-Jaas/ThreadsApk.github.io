package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.debug.devoptions.igds.IgdsBottomSheetExamplesFragment;

/* renamed from: X.6sw  reason: invalid class name and case insensitive filesystem */
public final class C114256sw {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C114256sw) || i != ((C114256sw) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 1) {
            return ServerW3CShippingAddressConstants.DEFAULT;
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        return IgdsBottomSheetExamplesFragment.DONE_TEXT;
    }

    public /* synthetic */ C114256sw(int i) {
        this.A00 = i;
    }
}
