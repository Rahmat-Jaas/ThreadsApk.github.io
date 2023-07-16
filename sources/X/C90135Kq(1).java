package X;

import com.instagram.api.schemas.AudioBrowserPlaylistType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.5Kq  reason: invalid class name and case insensitive filesystem */
public final class C90135Kq extends AnonymousClass0Sf implements C27954Ew4 {
    public final AudioBrowserPlaylistType A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C90135Kq(AudioBrowserPlaylistType audioBrowserPlaylistType, ImageUrl imageUrl, String str, String str2, List list) {
        C18190wL.A1S(str, 2, str2);
        this.A01 = imageUrl;
        this.A02 = str;
        this.A00 = audioBrowserPlaylistType;
        this.A04 = list;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90135Kq) {
                C90135Kq r5 = (C90135Kq) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ImageUrl AnO() {
        return this.A01;
    }

    public final AudioBrowserPlaylistType B20() {
        return this.A00;
    }

    public final List B2y() {
        return this.A04;
    }

    public final String BH2() {
        return this.A03;
    }

    public final String getId() {
        return this.A02;
    }

    public final int hashCode() {
        int A032 = AnonymousClass0wJ.A03(this.A01) * 31;
        return C18210wN.A05(this.A03, (((AnonymousClass0wJ.A07(this.A02, A032) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A04)) * 31);
    }
}
