package androidx.compose.ui.draw;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C104136bI;
import X.C115286uo;
import X.C123307Wk;
import X.C146878n1;
import X.C18190wL;
import X.C18210wN;
import X.C86104wH;
import X.C86164wN;
import androidx.compose.ui.Alignment;

public final class PainterModifierNodeElement extends C123307Wk {
    public final float A00;
    public final Alignment A01;
    public final C104136bI A02;
    public final C115286uo A03;
    public final C146878n1 A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PainterModifierNodeElement) {
                PainterModifierNodeElement painterModifierNodeElement = (PainterModifierNodeElement) obj;
                if (!C04220Ms.A0I(this.A03, painterModifierNodeElement.A03) || !C04220Ms.A0I(this.A01, painterModifierNodeElement.A01) || !C04220Ms.A0I(this.A04, painterModifierNodeElement.A04) || Float.compare(this.A00, painterModifierNodeElement.A00) != 0 || !C04220Ms.A0I(this.A02, painterModifierNodeElement.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86104wH.A05(AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A05(this.A01, (C18210wN.A04(this.A03) + 1) * 31)), this.A00) + AnonymousClass0wJ.A03(this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PainterModifierNodeElement(painter=");
        A0s.append(this.A03);
        C86164wN.A1M(A0s, ", sizeToIntrinsics=");
        A0s.append(", alignment=");
        A0s.append(this.A01);
        A0s.append(", contentScale=");
        A0s.append(this.A04);
        A0s.append(", alpha=");
        A0s.append(this.A00);
        A0s.append(", colorFilter=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public PainterModifierNodeElement(Alignment alignment, C104136bI r2, C115286uo r3, C146878n1 r4, float f) {
        this.A03 = r3;
        this.A01 = alignment;
        this.A04 = r4;
        this.A00 = f;
        this.A02 = r2;
    }
}
