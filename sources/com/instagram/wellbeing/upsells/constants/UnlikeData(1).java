package com.instagram.wellbeing.upsells.constants;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass6WA;
import X.AnonymousClass87l;
import X.AnonymousClass8sP;
import X.C04220Ms;
import X.C18190wL;
import kotlinx.serialization.Serializable;

@Serializable
public final class UnlikeData extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final long A00;
    public final String A01;
    public final String A02;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return AnonymousClass87l.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UnlikeData) {
                UnlikeData unlikeData = (UnlikeData) obj;
                if (this.A00 != unlikeData.A00 || !C04220Ms.A0I(this.A02, unlikeData.A02) || !C04220Ms.A0I(this.A01, unlikeData.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A02, C18190wL.A02(this.A00) * 31) + AnonymousClass0wJ.A06(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("UnlikeData(timestamp=");
        A0s.append(this.A00);
        A0s.append(", mediaId=");
        A0s.append(this.A02);
        A0s.append(", authorId=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public UnlikeData(long j, String str, String str2) {
        this.A00 = j;
        this.A02 = str;
        this.A01 = str2;
    }

    public /* synthetic */ UnlikeData(int i, String str, String str2, long j) {
        if (7 != (i & 7)) {
            AnonymousClass6WA.A00(AnonymousClass87l.A01, i, 7);
            throw null;
        }
        this.A00 = j;
        this.A02 = str;
        this.A01 = str2;
    }
}
