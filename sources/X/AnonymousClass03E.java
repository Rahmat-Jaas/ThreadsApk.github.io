package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.03E  reason: invalid class name */
public final class AnonymousClass03E implements C004001v {
    public final int A00;
    public final int A01;
    public final ClipData A02;
    public final Uri A03;
    public final Bundle A04;

    public final ContentInfo BMJ() {
        return null;
    }

    public final String toString() {
        String str;
        String valueOf;
        String A0S;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.A02.getDescription());
        sb.append(", source=");
        int i = this.A01;
        if (i == 1) {
            str = "SOURCE_CLIPBOARD";
        } else if (i != 2) {
            str = "SOURCE_DRAG_AND_DROP";
        } else {
            str = "SOURCE_INPUT_METHOD";
        }
        sb.append(str);
        sb.append(", flags=");
        int i2 = this.A00;
        if ((i2 & 1) != 0) {
            valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
        } else {
            valueOf = String.valueOf(i2);
        }
        sb.append(valueOf);
        Uri uri = this.A03;
        String str2 = "";
        if (uri == null) {
            A0S = str2;
        } else {
            A0S = AnonymousClass00U.A0S(", hasLinkUri(", ")", uri.toString().length());
        }
        sb.append(A0S);
        if (this.A04 != null) {
            str2 = ", hasExtras";
        }
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public AnonymousClass03E(C007403f r6) {
        ClipData clipData = r6.A02;
        clipData.getClass();
        this.A02 = clipData;
        int i = r6.A01;
        C002801h.A01(i, 0, "source", 5);
        this.A01 = i;
        int i2 = r6.A00;
        if ((i2 & 1) == i2) {
            this.A00 = i2;
            this.A03 = r6.A03;
            this.A04 = r6.A04;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0h("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed"));
    }

    public final ClipData AXc() {
        return this.A02;
    }

    public final int Ait() {
        return this.A00;
    }

    public final int BCm() {
        return this.A01;
    }
}
