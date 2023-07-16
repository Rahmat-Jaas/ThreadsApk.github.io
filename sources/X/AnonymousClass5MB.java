package X;

import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.List;

/* renamed from: X.5MB  reason: invalid class name */
public final class AnonymousClass5MB extends AnonymousClass0Sf implements C33932HxG {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;
    public final ClipsTextAlignment A0B;
    public final ClipsTextEmphasisMode A0C;
    public final ClipsTextFormatType A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;

    public final AnonymousClass5MB D3Q() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MB) {
                AnonymousClass5MB r5 = (AnonymousClass5MB) obj;
                if (!(this.A0B == r5.A0B && C04220Ms.A0I(this.A0G, r5.A0G) && Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A02, r5.A02) == 0 && C04220Ms.A0I(this.A0E, r5.A0E) && this.A09 == r5.A09 && Float.compare(this.A03, r5.A03) == 0 && Float.compare(this.A04, r5.A04) == 0 && Float.compare(this.A05, r5.A05) == 0 && Float.compare(this.A06, r5.A06) == 0 && Float.compare(this.A07, r5.A07) == 0 && C04220Ms.A0I(this.A0F, r5.A0F) && this.A0C == r5.A0C && this.A0D == r5.A0D && Float.compare(this.A08, r5.A08) == 0 && this.A0A == r5.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ClipsTextAlignment AQ7() {
        return this.A0B;
    }

    public final List AYJ() {
        return this.A0G;
    }

    public final float Afp() {
        return this.A00;
    }

    public final float AjL() {
        return this.A01;
    }

    public final float Amg() {
        return this.A02;
    }

    public final float AyQ() {
        return this.A03;
    }

    public final float AyR() {
        return this.A04;
    }

    public final float B8L() {
        return this.A05;
    }

    public final float B8m() {
        return this.A06;
    }

    public final float BDQ() {
        return this.A07;
    }

    public final String BFt() {
        return this.A0F;
    }

    public final ClipsTextEmphasisMode BFw() {
        return this.A0C;
    }

    public final ClipsTextFormatType BG0() {
        return this.A0D;
    }

    public final float BM8() {
        return this.A08;
    }

    public final int BMn() {
        return this.A0A;
    }

    public final int BRK() {
        return this.A09;
    }

    public final String getId() {
        return this.A0E;
    }

    public final int hashCode() {
        return C86104wH.A05(AnonymousClass0wJ.A05(this.A0D, AnonymousClass0wJ.A05(this.A0C, AnonymousClass0wJ.A07(this.A0F, C86104wH.A05(C86104wH.A05(C86104wH.A05(C86104wH.A05(C86104wH.A05((AnonymousClass0wJ.A07(this.A0E, C86104wH.A05(C86104wH.A05(C86104wH.A05(AnonymousClass0wJ.A05(this.A0G, C18210wN.A04(this.A0B)), this.A00), this.A01), this.A02)) + this.A09) * 31, this.A03), this.A04), this.A05), this.A06), this.A07)))), this.A08) + this.A0A;
    }

    public AnonymousClass5MB(ClipsTextAlignment clipsTextAlignment, ClipsTextEmphasisMode clipsTextEmphasisMode, ClipsTextFormatType clipsTextFormatType, String str, String str2, List list, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, int i2) {
        AnonymousClass0wJ.A1O(clipsTextAlignment, list);
        C86124wJ.A1A(6, str, str2, clipsTextEmphasisMode);
        C04220Ms.A0B(clipsTextFormatType, 15);
        this.A0B = clipsTextAlignment;
        this.A0G = list;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A0E = str;
        this.A09 = i;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A07 = f8;
        this.A0F = str2;
        this.A0C = clipsTextEmphasisMode;
        this.A0D = clipsTextFormatType;
        this.A08 = f9;
        this.A0A = i2;
    }
}
